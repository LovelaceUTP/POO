package dev.Lovelace.EventPro.Repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dev.Lovelace.EventPro.Modelo.Usuario;
import dev.Lovelace.EventPro.Util.DatabaseConnection;

public class UsuarioRepositorioImpl implements UsuarioRepositorio {

  @Override
  public void agregarUsuario(Usuario usuario) throws SQLException {
    String sql = "INSERT INTO usuarios (personalID, fiscalID, nombres, apellidos, cargo, telefono, correo, contraseña) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    try (Connection conn = DatabaseConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql)) {
    // ... (Existing code remains the same) ...
    } catch (SQLException e) {
      throw new SQLException("Error adding user: " + e.getMessage(), e); //Improved error handling
    }
  }

  @Override
  public Usuario obtenerUsuarioPorId(Long id) throws SQLException {
    String sql = "SELECT * FROM usuarios WHERE idUsuario = ?";
    try (Connection conn = DatabaseConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql)) {
    // ... (Existing code remains the same) ...
    } catch (SQLException e) {
      throw new SQLException("Error getting user: " + e.getMessage(), e); //Improved error handling
    }
    return null;
  }

  @Override
  public boolean validarCredenciales(String personalID, String contrasenia) throws SQLException {
    String sql = "SELECT idUsuario FROM usuarios WHERE personalID = ? AND contrasenia = ?";
    try (Connection conn = DatabaseConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql)) {
    // ... (Existing code remains the same) ...
    } catch (SQLException e) {
      throw new SQLException("Error validating credentials: " + e.getMessage(), e); //Improved error handling
    }
    return false;
  }

  @Override
  public void actualizarUsuario(Usuario usuario) throws SQLException {
    String sql = "UPDATE usuarios SET personalID=?, fiscalID=?, nombres=?, apellidos=?, cargo=?, telefono=?, correo=?, contraseña=? WHERE idUsuario=?";
    try (Connection conn = DatabaseConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql)) {
      stmt.setString(1, usuario.getPersonalID());
      stmt.setString(2, usuario.getFiscalID());
      stmt.setString(3, usuario.getNombres());
      stmt.setString(4, usuario.getApellidos());
      stmt.setString(5, usuario.getCargo());
      stmt.setString(6, usuario.getTelefono());
      stmt.setString(7, usuario.getCorreo());
      stmt.setString(8, usuario.getContraseña());
      stmt.setInt(9, usuario.getIdUsuario());
      stmt.executeUpdate();
    } catch (SQLException e) {
      throw new SQLException("Error updating user: " + e.getMessage(), e); //Improved error handling
    }
  }
}