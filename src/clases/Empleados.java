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
public class Empleados extends Persona {
    private int idEmpleados;
    private String ciudad;
    private ArrayList<Entrega> listEntrega;

    
    public Empleados() {
    }

    public Empleados(int idEmpleados, String ciudad, ArrayList<Entrega> listEntrega) {
        this.idEmpleados = idEmpleados;
        this.ciudad = ciudad;
        this.listEntrega = listEntrega;
    }

    public Empleados(int idEmpleados, String ciudad, ArrayList<Entrega> listEntrega, int idPerso, String Cedula, String Apellidos, String Nombre, String mail) {
        super(idPerso, Cedula, Apellidos, Nombre, mail);
        this.idEmpleados = idEmpleados;
        this.ciudad = ciudad;
        this.listEntrega = listEntrega;
    }

    public int getIdEmpleados() {
        return idEmpleados;
    }

    public void setIdEmpleados(int idEmpleados) {
        this.idEmpleados = idEmpleados;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public ArrayList<Entrega> getListEntrega() {
        return listEntrega;
    }

    public void setListEntrega(ArrayList<Entrega> listEntrega) {
        this.listEntrega = listEntrega;
    }

    @Override
    public String toString() {
        return "Empleados{" + "idEmpleados=" + idEmpleados + ", ciudad=" + ciudad + ", listEntrega=" + listEntrega + '}';
    }
    
}
