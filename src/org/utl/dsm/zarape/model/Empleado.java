/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.dsm.zarape.model;

public class Empleado {
    private int idEmpleado;
    private Sucursal sucursal;
    private Persona persona;
    private Usuario usuario;
    private int activo;

    // Constructor
    public Empleado(int idEmpleado, Sucursal sucursal, Persona persona, Usuario usuario, int activo) {
        this.idEmpleado = idEmpleado;
        this.sucursal = sucursal;
        this.persona = persona;
        this.usuario = usuario;
        this.activo = activo;
    }

    // Getters y Setters
    // (Implementación de todos los getters y setters)

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
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

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }
    
}
