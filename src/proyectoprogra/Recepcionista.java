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
public class Recepcionista extends EmpleadoComun {

    private double bono;
    private double seguro;

    public Recepcionista(double bono, double seguro, int numHoras, double costoHora, String nombre, String apellido, String identificacion, int edad) {
        super(numHoras, costoHora, nombre, apellido, identificacion, edad);
        this.bono = bono;
        this.seguro = seguro;
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

    public double calcularSueldo() {
        double sueldo = 0;
        sueldo = super.getNumHoras() * super.getCostoHora() + this.getBono() - this.getSeguro();
        if (super.getEdad() >= 70) {
            sueldo = super.getNumHoras() * super.getCostoHora() + this.getBono() - this.getSeguro() + 100;
        }
        return sueldo;
    }

    @Override
    public String toString() {
        return "***********************************RECEPCIONISTA***************************************\n\n" +super.toString() + "\nBono:" + bono + "\nSeguro=" + seguro;
    }

}
