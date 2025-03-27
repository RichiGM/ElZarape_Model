package org.utl.dsm.zarape.model;

import java.util.ArrayList;
import java.util.List;

public class Comanda {
    private int idComanda;
    private int idTicket;
    private String estatus; // Cambiamos a String para mapear los valores
    private String fecha; // Para almacenar la fecha del ticket
    private List<DetalleTicket> detalles;

    // Constructor
    public Comanda(int idComanda, int idTicket, String estatus, String fecha) {
        this.idComanda = idComanda;
        this.idTicket = idTicket;
        this.estatus = estatus;
        this.fecha = fecha;
        this.detalles = new ArrayList<>();
    }

    // Getters y setters
    public int getIdComanda() {
        return idComanda;
    }

    public void setIdComanda(int idComanda) {
        this.idComanda = idComanda;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public List<DetalleTicket> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleTicket> detalles) {
        this.detalles = detalles;
    }
}