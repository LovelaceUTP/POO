package dev.Lovelace.EventPro.Controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import dev.Lovelace.EventPro.Modelo.Usuario;
import dev.Lovelace.EventPro.Servicio.UsuarioServicio;

@RestController
@RequestMapping("/usuarios")
public class UsuarioControlador {

	private final UsuarioServicio usuarioServicio;

	@Autowired
	public UsuarioControlador(UsuarioServicio usuarioServicio) {
		this.usuarioServicio = usuarioServicio;
	}

	@GetMapping("/{id}")
	public ResponseEntity<Usuario> obtenerUsuario(@PathVariable Long id) {
		try {
			Usuario usuario = usuarioServicio.obtenerUsuario(id);
			return usuario != null ? ResponseEntity.ok(usuario) : ResponseEntity.notFound().build();
		} catch (RuntimeException e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@PutMapping
	public ResponseEntity<Void> actualizarUsuario(@RequestBody Usuario usuario) {
		try {
			usuarioServicio.actualizarUsuario(usuario);
			return ResponseEntity.noContent().build();
		} catch (RuntimeException e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}