/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author osbor
 */
public class Principal {

    static ArrayList<Empleado> empleado = new ArrayList<Empleado>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        tipoEmpleado();
        mostrar();
    }

    public static void tipoEmpleado() {
        int opcion;
        char otro;

        do {
            do {
                System.out.println("Ingrese tipo de EMPLEADO");
                System.out.println("[1].Adaministrativo:");
                System.out.println("[2].Comun:");
                System.out.println("Opcion:");
                opcion = sc.nextInt();
            } while (opcion < 1 || opcion > 2);
            switch (opcion) {
                case 1:
                    Administrativo();
                    break;
                case 2:
                    comun();
                    break;
            }
            System.out.println("Ejecutar programa otra vez: (S/N)");
            otro = sc.next().charAt(0);
            System.out.println("");
        } while (otro == 's' || otro == 'S');

    }

    public static void Administrativo() {
        int opcion, edad, numHoras;
        char otro;
        double costoHora, bono, seguro;
        String nombre, apellido, identificacion;
        do {
            do {
                System.out.println("Ingrese tipo de EMPLEADO");
                System.out.println("[1].Presidente:");
                System.out.println("[2].Vicepresidente:");
                System.out.println("Opcion:");
                opcion = sc.nextInt();
            } while (opcion < 1 || opcion > 2);
            switch (opcion) {
                case 1:
                    sc.nextLine();
                    System.out.println("Ingrese nombre:");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese apellido:");
                    apellido = sc.nextLine();
                    System.out.println("Ingrese identificacion:");
                    identificacion = sc.nextLine();
                    System.out.println("Ingrese edad");
                    edad = sc.nextInt();
                    System.out.println("Ingrese horas trabjadas:");
                    numHoras = sc.nextInt();
                    System.out.println("Ingrese costo de hora:");
                    costoHora = sc.nextDouble();
                    System.out.println("Ingrese bono:");
                    bono = sc.nextDouble();
                    System.out.println("Ingrese seguro:");
                    seguro = sc.nextDouble();
                    Presidente presidente = new Presidente(bono, seguro, numHoras, costoHora, nombre, apellido, identificacion, edad);
                    empleado.add(presidente);
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Ingrese nombre:");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese apellido:");
                    apellido = sc.nextLine();
                    System.out.println("Ingrese identificacion:");
                    identificacion = sc.nextLine();
                    System.out.println("Ingrese edad");
                    edad = sc.nextInt();
                    System.out.println("Ingrese horas trabjadas:");
                    numHoras = sc.nextInt();
                    System.out.println("Ingrese costo de hora:");
                    costoHora = sc.nextDouble();
                    System.out.println("Ingrese bono:");
                    bono = sc.nextDouble();
                    System.out.println("Ingrese seguro:");
                    seguro = sc.nextDouble();
                    VicePresidete vicepresidete = new VicePresidete(bono, seguro, numHoras, costoHora, nombre, apellido, identificacion, edad);
                    empleado.add(vicepresidete);
                    break;
            }
            System.out.println("Ingresar otro empleado: (S/N)");
            otro = sc.next().charAt(0);
            System.out.println("");
        } while (otro == 's' || otro == 'S');
    }

    public static void comun() {
        int opcion, edad, numHoras, tipo;
        char otro;
        double costoHora, bono, seguro;
        String nombre, apellido, identificacion;
        do {
            do {
                System.out.println("Ingrese tipo de EMPLEADO");
                System.out.println("[1].Azafata:");
                System.out.println("[2].Piloto:");
                System.out.println("[3].Recepcionista");
                System.out.println("Opcion:");
                opcion = sc.nextInt();
            } while (opcion < 1 || opcion > 3);
            switch (opcion) {
                case 1:
                    sc.nextLine();
                    System.out.println("Ingrese nombre:");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese apellido:");
                    apellido = sc.nextLine();
                    System.out.println("Ingrese identificacion:");
                    identificacion = sc.nextLine();
                    System.out.println("Ingrese edad");
                    edad = sc.nextInt();
                    System.out.println("Ingrese horas trabjadas:");
                    numHoras = sc.nextInt();
                    System.out.println("Ingrese costo de hora:");
                    costoHora = sc.nextDouble();
                    System.out.println("Ingrese bono:");
                    bono = sc.nextDouble();
                    System.out.println("Ingrese seguro:");
                    seguro = sc.nextDouble();
                    System.out.println("Digite:\n[1].Privada\n[2].Turista\n[3].Comercial");
                    tipo = sc.nextInt();
                    Azafata azafata = new Azafata(bono, seguro, tipo, numHoras, costoHora, nombre, apellido, identificacion, edad);
                    empleado.add(azafata);
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Ingrese nombre:");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese apellido:");
                    apellido = sc.nextLine();
                    System.out.println("Ingrese identificacion:");
                    identificacion = sc.nextLine();
                    System.out.println("Ingrese edad");
                    edad = sc.nextInt();
                    System.out.println("Ingrese horas trabjadas:");
                    numHoras = sc.nextInt();
                    System.out.println("Ingrese costo de hora:");
                    costoHora = sc.nextDouble();
                    System.out.println("Ingrese bono:");
                    bono = sc.nextDouble();
                    System.out.println("Ingrese seguro:");
                    seguro = sc.nextDouble();
                    System.out.println("Digite\n[1].Piloto\n[2].Copiloto");
                    tipo = sc.nextInt();
                    Piloto piloto = new Piloto(bono, seguro, tipo, numHoras, costoHora, nombre, apellido, identificacion, edad);
                    empleado.add(piloto);
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Ingrese nombre:");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese apellido:");
                    apellido = sc.nextLine();
                    System.out.println("Ingrese identificacion:");
                    identificacion = sc.nextLine();
                    System.out.println("Ingrese edad");
                    edad = sc.nextInt();
                    System.out.println("Ingrese horas trabjadas:");
                    numHoras = sc.nextInt();
                    System.out.println("Ingrese costo de hora:");
                    costoHora = sc.nextDouble();
                    System.out.println("Ingrese bono:");
                    bono = sc.nextDouble();
                    System.out.println("Ingrese seguro:");
                    seguro = sc.nextDouble();
                    Recepcionista recepcionista = new Recepcionista(bono, seguro, numHoras, costoHora, nombre, apellido, identificacion, edad);
                    empleado.add(recepcionista);

                    break;
            }
            System.out.println("Ingresar otro empleado: (S/N)");
            otro = sc.next().charAt(0);
            System.out.println("");
        } while (otro == 's' || otro == 'S');
    }

    public static void mostrar() {
        System.out.println("*********************************REGISTRO DE EMPLEADOS*********************************\n\n");
        for (Empleado empleados : empleado) {
            System.out.println("*********************************************EMPLEADO****************************************");
            System.out.println(empleados.toString());
            System.out.println("Sueldo a Pagar:\t$" + empleados.calcularSueldo());
            System.out.println("");

        }
    }
}
