/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author furai
 */
public class Cliente extends Persona{
    
    private int idCliente;
    private Direccion direccion;

    public Cliente() {
    }

    public Cliente(int idCliente, Direccion direccion) {
        this.idCliente = idCliente;
        this.direccion = direccion;
    }

    public Cliente(int idCliente, Direccion direccion, int idPerso, String Cedula, String Apellidos, String Nombre, String mail) {
        super(idPerso, Cedula, Apellidos, Nombre, mail);
        this.idCliente = idCliente;
        this.direccion = direccion;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", direccion=" + direccion + '}';
    }
}
