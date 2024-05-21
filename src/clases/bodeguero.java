/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import clases.Empleados;
import java.util.ArrayList;

/**
 *
 * @author furai
 */
public class bodeguero extends Empleados {
    private int idBodeguero;
    private String local;

    public bodeguero() {
    }

    public bodeguero(int idBodeguero, String local) {
        this.idBodeguero = idBodeguero;
        this.local = local;
    }

    public bodeguero(int idBodeguero, String local, int idEmpleados, String ciudad, ArrayList<Entrega> listEntrega) {
        super(idEmpleados, ciudad, listEntrega);
        this.idBodeguero = idBodeguero;
        this.local = local;
    }

    public bodeguero(int idBodeguero, String local, int idEmpleados, String ciudad, ArrayList<Entrega> listEntrega, int idPerso, String Cedula, String Apellidos, String Nombre, String mail) {
        super(idEmpleados, ciudad, listEntrega, idPerso, Cedula, Apellidos, Nombre, mail);
        this.idBodeguero = idBodeguero;
        this.local = local;
    }

    public int getIdBodeguero() {
        return idBodeguero;
    }

    public void setIdBodeguero(int idBodeguero) {
        this.idBodeguero = idBodeguero;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "bodeguero{" + "idBodeguero=" + idBodeguero + ", local=" + local + '}';
    }

}
