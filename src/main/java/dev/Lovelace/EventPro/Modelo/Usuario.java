package dev.Lovelace.EventPro.Modelo;

public class Usuario {
  private int idUsuario;
  private String personalID;
  private String fiscalID;
  private String nombres;
  private String apellidos;
  private String cargo;
  private String telefono;
  private String correo;
  private String contraseña;

  public Usuario(
  int idUsuario, 
  String personalID,
  String fiscalID,
  String nombres,
  String apellidos, 
  String cargo, 
  String telefono, 
  String correo, 
  String contraseña) {
    this.idUsuario = idUsuario;
    this.personalID = personalID;
    this.fiscalID = fiscalID;
    this.nombres = nombres;
    this.apellidos = apellidos;
    this.cargo = cargo;
    this.telefono = telefono;
    this.correo = correo;
    this.contraseña = contraseña;
  }

  public Usuario(int idUsuario) {
    this.idUsuario = idUsuario;
  }

  public Usuario() {

  }

  // Getters y Setters
  public int getIdUsuario() {
    return idUsuario;
  }

  public void setIdUsuario(int idUsuario) {
    this.idUsuario = idUsuario;
  }

  public String getPersonalID() {
    return personalID;
  }

  public void setPersonalID(String personalID) {
    this.personalID = personalID;
  }

  public String getFiscalID() {
    return fiscalID;
  }

  public void setFiscalID(String fiscalID) {
    this.fiscalID = fiscalID;
  }

  public String getNombres() {
    return nombres;
  }

  public void setNombres(String nombres) {
    this.nombres = nombres;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public String getCargo() {
    return cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getCorreo() {
    return correo;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }

  public String getContraseña() {
    return contraseña;
  }

  public void setContraseña(String contraseña) {
    this.contraseña = contraseña;
  }

}
