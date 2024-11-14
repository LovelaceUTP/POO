package dev.Lovelace.EventPro.Repositorio;

import dev.Lovelace.EventPro.Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface UsuarioRepositorio {

  public void agregarUsuario(Usuario usuario) throws SQLException {
    
    public void agregarUsuario(Usuario usuario) throws SQLException {
        String sql = "INSERT INTO usuarios (nombre, email, telefono) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, usuario.getNombre());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getTelefono());
            stmt.executeUpdate();
        }
    }

    public Usuario obtenerUsuarioPorId(Long id) throws SQLException {
        String sql = "SELECT * FROM usuarios WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Usuario(rs.getLong("id"), rs.getString("nombre"), rs.getString("email"), rs.getString("telefono"));
            }
        }
        return null;
    }
    
    // Métodos adicionales como actualizarUsuario y eliminarUsuario
    
    
}