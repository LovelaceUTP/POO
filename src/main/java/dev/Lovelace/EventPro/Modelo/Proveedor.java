package dev.Lovelace.EventPro.Modelo;

public class Proveedor {

  private int idProveedor;
  private String fiscalID;
  private String nombre;
  private String direccion;
  private String telefono;
  private String correo;

  

  public Proveedor(int idProveedor, String fiscalID, String nombre, String direccion, String telefono, String correo) {
    this.idProveedor = idProveedor;
    this.fiscalID = fiscalID;
    this.nombre = nombre;
    this.direccion = direccion;
    this.telefono = telefono;
    this.correo = correo;
  }
  public Proveedor(int idProveedor) {
    this.idProveedor = idProveedor;
  }
  
}



