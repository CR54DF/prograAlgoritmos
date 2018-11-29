/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra;

/**
 *
 * @author osbor
 */
public class Azafata extends EmpleadoComun {

    private double bono;
    private double seguro;
    private int tipo;

    public Azafata(double bono, double seguro, int tipo, int numHoras, double costoHora, String nombre, String apellido, String identificacion, int edad) {
        super(numHoras, costoHora, nombre, apellido, identificacion, edad);
        this.bono = bono;
        this.seguro = seguro;
        this.tipo = tipo;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    public double getSeguro() {
        return seguro;
    }

    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double calcularSueldo() {
        double sueldo = 0;
        if (tipo == 1) {
            sueldo = super.getNumHoras() * super.getCostoHora() + this.getBono() - this.getSeguro() * 0.50;
        } else if (tipo == 2) {
            sueldo = super.getNumHoras() * super.getCostoHora() + this.getBono() - this.getSeguro() * 0.20;
        } else if (tipo == 3) {
            sueldo = super.getNumHoras() * super.getCostoHora() + this.getBono() - this.getSeguro() * 0.10;
        }
        return sueldo;
    }

    @Override
    public String toString() {
        return "*********************************ZAFATA*************************************\n\n" + super.toString() + "\nBono:" + bono + "\nSeguro:" + seguro + "\nTipo:" + tipo;
    }

}
