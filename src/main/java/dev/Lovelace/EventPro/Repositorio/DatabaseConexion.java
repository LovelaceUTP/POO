package dev.Lovelace.EventPro.Repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConexion {
  private static final String URL = "jdbc:sqlite:Repositorio/Database/EventPro.db";
    private static Connection connection;

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            connection = DriverManager.getConnection(URL);
        }
        return connection;
    }
}
