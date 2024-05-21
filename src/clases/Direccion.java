/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author furai
 */
public class Direccion {
    private int idDireccion;
    private String Codigo;
    private String calle1;
    private String calle2;
    private String referencia;
    private int actual;

    public Direccion() {
    }

    public Direccion(int idDireccion, String Codigo, String calle1, String calle2, String referencia, int actual) {
        this.idDireccion = idDireccion;
        this.Codigo = Codigo;
        this.calle1 = calle1;
        this.calle2 = calle2;
        this.referencia = referencia;
        this.actual = actual;
    }

    public int getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(int idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getCalle1() {
        return calle1;
    }

    public void setCalle1(String calle1) {
        this.calle1 = calle1;
    }

    public String getCalle2() {
        return calle2;
    }

    public void setCalle2(String calle2) {
        this.calle2 = calle2;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getActual() {
        return actual;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }

    @Override
    public String toString() {
        return "Direccion{" + "idDireccion=" + idDireccion + ", Codigo=" + Codigo + ", calle1=" + calle1 + ", calle2=" + calle2 + ", referencia=" + referencia + ", actual=" + actual + '}';
    }
}
