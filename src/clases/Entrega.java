/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Date;

/**
 *
 * @author furai
 */
public class Entrega {
    private int idEntrega;
    private String codigo;
    private Date fecha;
    private String observacion;
    private Cliente cliente;

    public Entrega() {
    }

    public Entrega(int idEntrega, String codigo, Date fecha, String observacion, Cliente cliente) {
        this.idEntrega = idEntrega;
        this.codigo = codigo;
        this.fecha = fecha;
        this.observacion = observacion;
        this.cliente = cliente;
    }

    public int getIdEntrega() {
        return idEntrega;
    }

    public void setIdEntrega(int idEntrega) {
        this.idEntrega = idEntrega;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Entrega{" + "idEntrega=" + idEntrega + ", codigo=" + codigo + ", fecha=" + fecha + ", observacion=" + observacion + ", cliente=" + cliente + '}';
    }
    

}
