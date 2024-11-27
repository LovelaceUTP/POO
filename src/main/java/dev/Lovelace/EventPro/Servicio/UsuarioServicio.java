package dev.Lovelace.EventPro.Servicio;

import dev.Lovelace.EventPro.Modelo.Usuario;
import dev.Lovelace.EventPro.Repositorio.UsuarioRepositorio;
import java.sql.SQLException;

public class UsuarioServicio {

  private final UsuarioRepositorio usuarioRepositorio;

  public UsuarioServicio(UsuarioRepositorio usuarioRepositorio) {
    this.usuarioRepositorio = usuarioRepositorio;
  }

  public void registrarUsuario(Usuario usuario) {
    try {
      usuarioRepositorio.agregarUsuario(usuario);
    } catch (SQLException e) {
      throw new RuntimeException("Error registering user: " + e.getMessage(), e); //Improved error handling
    }
  }

  public Usuario obtenerUsuario(Long id) {
    try {
      return usuarioRepositorio.obtenerUsuarioPorId(id);
    } catch (SQLException e) {
      throw new RuntimeException("Error getting user: " + e.getMessage(), e); //Improved error handling
    }
  }

  public void actualizarUsuario(Usuario usuario) {
    try {
      usuarioRepositorio.actualizarUsuario(usuario);
    } catch (SQLException e) {
      throw new RuntimeException("Error updating user: " + e.getMessage(), e); //Improved error handling
    }
  }

  public boolean validarCredenciales(String personalID, String contrasenia) {
    try {
      return usuarioRepositorio.validarCredenciales(personalID, contrasenia);
    } catch (SQLException e) {
      throw new RuntimeException("Error validating credentials: " + e.getMessage(), e); //Improved error handling
    }
  }
}
