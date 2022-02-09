/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cuc.cuentas;

import java.util.Calendar;

/**
 *
 * @author invitado
 */
public class PruebaCuentas {

    public static void main(String[] args) {
        CuentaDeAhorros cuenta01 = new CuentaDeAhorros(123, "Maria");
        CuentaDeAhorros cuenta02 = new CuentaDeAhorros(345, "Pedro");
        CuentaDeAhorros cuenta03 = new CuentaDeAhorros(321, "Luis");
        System.out.println("Cuenta 01: " + cuenta01);
        System.out.println("Cuenta 02: " + cuenta02);
        System.out.println("Iguales? " + cuenta01.equals(cuenta02));
        System.out.println("Iguales? " + cuenta01.equals(cuenta03));
        //Consignar
        cuenta01.consignar(100000);
        cuenta02.consignar(-1000);
        cuenta03.consignar(250000);
        System.out.println("Cuenta 01: " + cuenta01);
        System.out.println("Cuenta 02: " + cuenta02);
        System.out.println("Cuenta 03: " + cuenta03);

        //Retirar
        cuenta01.retirar();


        //Transferencia
        cuenta01.transferecia();

    }
}
