package dev.Lovelace.EventPro.Modelo;

public class Contacto {

  private int idContacto;
  private int personalID;
  private String fiscalID;
  private String nombres;
  private String apellidos;
  private String telefono;
  private String correo;
  private String detalle;

  public Contacto(int idContacto, int personalID, String fiscalID, String nombres, String apellidos, String telefono,
      String correo, String detalle) {
    this.idContacto = idContacto;
    this.personalID = personalID;
    this.fiscalID = fiscalID;
    this.nombres = nombres;
    this.apellidos = apellidos;
    this.telefono = telefono;
    this.correo = correo;
    this.detalle = detalle;

  }

  public Contacto(int idContacto) {

  }
}
