/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.dsm.zarape.model;

public class Alimento {
    private int idAlimento;
    private Producto producto;

    // Constructor
    public Alimento(int idAlimento, Producto producto) {
        this.idAlimento = idAlimento;
        this.producto = producto;
    }

    // Getters y Setters
    // (Implementación de todos los getters y setters)

    public int getIdAlimento() {
        return idAlimento;
    }

    public void setIdAlimento(int idAlimento) {
        this.idAlimento = idAlimento;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
}

