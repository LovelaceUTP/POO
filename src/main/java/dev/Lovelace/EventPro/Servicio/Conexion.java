package dev.Lovelace.EventPro.Servicio;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
  
  Connection conectar = null;
    
    String usuario = "mag";
    String contraseña = "root";
    String bd = "Alt";
    String ip = "localhost";
    String puerto = "1433";
    
    public Connection establecerConexion(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String cadena = "jdbc:sqlserver://"+ip+":"+puerto+";"+"databaseName="+bd+";"+
                    "encrypt=true;trustServerCertificate=true";
            
            conectar = DriverManager.getConnection(cadena,usuario,contraseña);
            //JOptionPane.showMessageDialog(null, "Se conecto correctamente a la base de datos");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "NO Se conecto correctamente a la base de datos");
        }
        return conectar;
    }
}
