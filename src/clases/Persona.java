/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author furai
 */
public class Persona {
    private int idPerso;
    private String Cedula;
    private String Apellidos;
    private String Nombre;
    private String mail;

    public Persona() {
    }

    public Persona(int idPerso, String Cedula, String Apellidos, String Nombre, String mail) {
        this.idPerso = idPerso;
        this.Cedula = Cedula;
        this.Apellidos = Apellidos;
        this.Nombre = Nombre;
        this.mail = mail;
    }

    public int getIdPerso() {
        return idPerso;
    }

    public void setIdPerso(int idPerso) {
        this.idPerso = idPerso;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPerso=" + idPerso + ", Cedula=" + Cedula + ", Apellidos=" + Apellidos + ", Nombre=" + Nombre + ", mail=" + mail + '}';
    }
    
}
