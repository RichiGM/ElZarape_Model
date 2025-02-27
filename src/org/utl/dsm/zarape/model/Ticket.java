package org.utl.dsm.zarape.model;

import java.util.Date;
import java.util.List;

public class Ticket {
    private int idTicket;
    private String ticket;
    private Date fecha;
    private String pagado;
    private int idCliente;
    private int idSucursal;
    private int estatus;
    private List<DetalleTicket> detalles;

    // Constructor
    public Ticket(int idTicket, String ticket, Date fecha, String pagado, int idCliente, int idSucursal, int estatus) {
        this.idTicket = idTicket;
        this.ticket = ticket;
        this.fecha = fecha;
        this.pagado = pagado;
        this.idCliente = idCliente;
        this.idSucursal = idSucursal;
        this.estatus = estatus;
    }

    // Getters y Setters
    public int getIdTicket() { return idTicket; }
    public void setIdTicket(int idTicket) { this.idTicket = idTicket; }

    public String getTicket() { return ticket; }
    public void setTicket(String ticket) { this.ticket = ticket; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

    public String getPagado() { return pagado; }
    public void setPagado(String pagado) { this.pagado = pagado; }

    public int getIdCliente() { return idCliente; }
    public void setIdCliente(int idCliente) { this.idCliente = idCliente; }

    public int getIdSucursal() { return idSucursal; }
    public void setIdSucursal(int idSucursal) { this.idSucursal = idSucursal; }

    public int getEstatus() { return estatus; }
    public void setEstatus(int estatus) { this.estatus = estatus; }

    public List<DetalleTicket> getDetalles() { return detalles; }
    public void setDetalles(List<DetalleTicket> detalles) { this.detalles = detalles; }
}
