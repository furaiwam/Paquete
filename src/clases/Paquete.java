/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author furai
 */
public class Paquete {
    private int idpad;
    private String codigo;
    private String descripcion;
    private int peso;
    private int alto;
    private Estado estado;

    public Paquete() {
    }

    public Paquete(int idpad, String codigo, String descripcion, int peso, int alto, Estado estado) {
        this.idpad = idpad;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.peso = peso;
        this.alto = alto;
        this.estado = estado;
    }

    public int getIdpad() {
        return idpad;
    }

    public void setIdpad(int idpad) {
        this.idpad = idpad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Paquete{" + "idpad=" + idpad + ", codigo=" + codigo + ", descripcion=" + descripcion + ", peso=" + peso + ", alto=" + alto + ", estado=" + estado + '}';
    }
    
    
    
}
