package org.utl.dsm.zarape.model;

public class Ciudad {
    private int idCiudad;
    private String nombre;
    private int idEstado;
    private String nombreEstado;

    public Ciudad(int idCiudad, String nombre, int idEstado, String nombreEstado) {
        this.idCiudad = idCiudad;
        this.nombre = nombre;
        this.idEstado = idEstado;
        this.nombreEstado = nombreEstado;
    }

    public Ciudad() {
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

   

    
}
