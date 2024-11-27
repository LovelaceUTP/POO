package dev.Lovelace.EventPro.Repositorio;

import java.sql.SQLException;

import dev.Lovelace.EventPro.Modelo.Usuario;

public interface UsuarioRepositorio {
  void agregarUsuario(Usuario usuario) throws SQLException;
  Usuario obtenerUsuarioPorId(Long id) throws SQLException;
  boolean validarCredenciales(String personalID, String contrasenia) throws SQLException;
  void actualizarUsuario(Usuario usuario) throws SQLException; // Added method
}