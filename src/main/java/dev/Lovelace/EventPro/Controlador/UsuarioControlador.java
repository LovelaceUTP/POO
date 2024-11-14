package dev.Lovelace.EventPro.Controlador;

import dev.Lovelace.EventPro.Modelo.Usuario;
import dev.Lovelace.EventPro.Servicio.UsuarioServicio;

public class UsuarioControlador {
  private UsuarioServicio usuarioServicio = new UsuarioServicio();

    public void agregarUsuario(String nombre, String email, String telefono) {
        Usuario usuario = new Usuario(null, nombre, email, telefono);
        usuarioServicio.registrarUsuario(usuario);
    }

    public Usuario obtenerUsuario(Long id) {
        return usuarioServicio.obtenerUsuario(id);
    }
}
