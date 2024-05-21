/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author furai
 */
public class Repartidor  extends  Empleados{
    private int idRepartidor;
    private int zona;

    public Repartidor() {
    }

    public Repartidor(int idRepartidor, int zona) {
        this.idRepartidor = idRepartidor;
        this.zona = zona;
    }

    public Repartidor(int idRepartidor, int zona, int idEmpleados, String ciudad, ArrayList<Entrega> listEntrega) {
        super(idEmpleados, ciudad, listEntrega);
        this.idRepartidor = idRepartidor;
        this.zona = zona;
    }

    public Repartidor(int idRepartidor, int zona, int idEmpleados, String ciudad, ArrayList<Entrega> listEntrega, int idPerso, String Cedula, String Apellidos, String Nombre, String mail) {
        super(idEmpleados, ciudad, listEntrega, idPerso, Cedula, Apellidos, Nombre, mail);
        this.idRepartidor = idRepartidor;
        this.zona = zona;
    }

    public int getIdRepartidor() {
        return idRepartidor;
    }

    public void setIdRepartidor(int idRepartidor) {
        this.idRepartidor = idRepartidor;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "Repartidor{" + "idRepartidor=" + idRepartidor + ", zona=" + zona + '}';
    }
    

 }

    