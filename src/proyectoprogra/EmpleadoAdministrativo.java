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
public abstract class EmpleadoAdministrativo extends Empleado {

    private int numHoras;
    private double costoHora;

    public EmpleadoAdministrativo(int numHoras, double costoHora, String nombre, String apellido, String identificacion, int edad) {
        super(nombre, apellido, identificacion, edad);
        this.numHoras = numHoras;
        this.costoHora = costoHora;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public double getCostoHora() {
        return costoHora;
    }

    public void setCostoHora(double costoHora) {
        this.costoHora = costoHora;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHoras Trabajadas:" + numHoras + "\nCosto Hora:" + costoHora;
    }

    public abstract double calcularSueldo();
}
