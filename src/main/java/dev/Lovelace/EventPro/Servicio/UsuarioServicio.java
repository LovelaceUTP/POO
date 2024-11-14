package dev.Lovelace.EventPro.Servicio;

import dev.Lovelace.EventPro.Modelo.Usuario;
import dev.Lovelace.EventPro.Repositorio.UsuarioRepositorio;
import java.sql.SQLException;

public class UsuarioServicio {
  
  private UsuarioRepositorio usuarioRepositorio = new UsuarioRepositorio() {};

    public void registrarUsuario(Usuario usuario) {
        try {
            usuarioRepositorio.agregarUsuario(usuario);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Usuario obtenerUsuario(Long id) {
        try {
            return usuarioRepositorio.obtenerUsuarioPorId(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
  
}
