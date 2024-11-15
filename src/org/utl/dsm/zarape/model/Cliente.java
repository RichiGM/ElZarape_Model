/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.dsm.zarape.model;

public class Cliente {
    private int idCliente;
    private Persona persona;
    private Usuario usuario;
    private boolean activo;

    // Constructor
    public Cliente(int idCliente, Persona persona, Usuario usuario, boolean activo) {
        this.idCliente = idCliente;
        this.persona = persona;
        this.usuario = usuario;
        this.activo = activo;
    }

    // Getters y Setters
    // (Implementación de todos los getters y setters)

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
}

