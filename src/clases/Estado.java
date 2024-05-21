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
public class Estado {
    private int idEst;
    private String estados;
    private String observacion;
    private Date fecha;

    public Estado() {
    }

    public Estado(int idEst, String estados, String observacion, Date fecha) {
        this.idEst = idEst;
        this.estados = estados;
        this.observacion = observacion;
        this.fecha = fecha;
    }

    public int getIdEst() {
        return idEst;
    }

    public void setIdEst(int idEst) {
        this.idEst = idEst;
    }

    public String getEstados() {
        return estados;
    }

    public void setEstados(String estados) {
        this.estados = estados;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Estados{" + "idEst=" + idEst + ", estados=" + estados + ", observacion=" + observacion + ", fecha=" + fecha + '}';
    } 
    
}
