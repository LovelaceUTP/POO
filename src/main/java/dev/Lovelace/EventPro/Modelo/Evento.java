package dev.Lovelace.EventPro.Modelo;

public class Evento {

  private int idEvento;
  private int idUsuario;
  private String nombre;
  private boolean estado;
  private int capacidad;
  private String ubicacion;
  private String fechaHora;
  private double duraccion;
  private String detalle;



  public Evento(int idEvento, int idUsuario, String nombre, boolean estado, int capacidad, String ubicacion, String fechaHora, double duracion, String detalle){
    this.idEvento = idEvento;
    this.idUsuario = idUsuario;
    this.nombre = nombre;
    this.estado = estado;
    this.capacidad = capacidad;
    this.ubicacion = ubicacion;
    this.fechaHora = fechaHora;
    this.duraccion = duracion;
    this.detalle = detalle;
  }
  public Evento(int idEvento, int idUsuario){
    this.idEvento = idEvento;
    this.idUsuario = idUsuario;
  }

  

}
