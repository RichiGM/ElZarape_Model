package org.utl.dsm.zarape.model;

public class DetalleTicket {
    private int idTicket;
    private int cantidad;
    private double precio;
    private int idCombo;
    private int idProducto;

    // Constructor
    public DetalleTicket(int idTicket, int cantidad, double precio, int idCombo, int idProducto) {
        this.idTicket = idTicket;
        this.cantidad = cantidad;
        this.precio = precio;
        this.idCombo = idCombo;
        this.idProducto = idProducto;
    }

    // Getters y Setters
    public int getIdTicket() { return idTicket; }
    public void setIdTicket(int idTicket) { this.idTicket = idTicket; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public int getIdCombo() { return idCombo; }
    public void setIdCombo(int idCombo) { this.idCombo = idCombo; }

    public int getIdProducto() { return idProducto; }
    public void setIdProducto(int idProducto) { this.idProducto = idProducto; }
}
