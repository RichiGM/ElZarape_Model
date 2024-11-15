/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.dsm.zarape.model;

public class Bebida {
    private int idBebida;
    private Producto producto;

    // Constructor
    public Bebida(int idBebida, Producto producto) {
        this.idBebida = idBebida;
        this.producto = producto;
    }

    // Getters y Setters
    // (Implementación de todos los getters y setters)

    public int getIdBebida() {
        return idBebida;
    }

    public void setIdBebida(int idBebida) {
        this.idBebida = idBebida;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
}
