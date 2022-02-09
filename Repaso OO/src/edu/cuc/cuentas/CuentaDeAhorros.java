/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cuc.cuentas;

import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author invitado
 */
public class CuentaDeAhorros {

    //Atributos
    private int numeroCuenta;
    private String titularCuenta;
    private double saldoCuenta = 0;

    //Constructor
    public CuentaDeAhorros(int numeroCuenta, String titularCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.titularCuenta = titularCuenta;
    }

    //Getters y Setters
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitularCuenta() {
        return titularCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setTitularCuenta(String titularCuenta) {
        this.titularCuenta = titularCuenta;
    }

    //toString
    @Override
    public String toString() {
        return "CuentaDeAhorros{" + "numeroCuenta=" + numeroCuenta + ", titularCuenta=" + titularCuenta + ", saldoCuenta=" + saldoCuenta + '}';
    }

    //Equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.numeroCuenta;
        hash = 53 * hash + Objects.hashCode(this.titularCuenta);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.saldoCuenta) ^ (Double.doubleToLongBits(this.saldoCuenta) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CuentaDeAhorros other = (CuentaDeAhorros) obj;
        if (this.numeroCuenta != other.numeroCuenta) {
            return false;
        }
        return true;
    }

    //Consignar
    public void consignar(double montoAConsignar) {
        if (montoAConsignar > 0) {
            //Incrementar saldo
            this.saldoCuenta += montoAConsignar;
        }
    }

    //Retirar
    public void retirar() {
        float numeroDeCuenta = Float.parseFloat(JOptionPane.showInputDialog("Digite Su Numero De Cuenta"));
        double montoARetirar = Double.parseDouble(JOptionPane.showInputDialog("Digite El Monto A Retirar"));
        if (this.numeroCuenta == numeroDeCuenta) {
            if (saldoCuenta < montoARetirar) {
                JOptionPane.showMessageDialog(null, "Tu Saldo Es Insuficiente");
            } else {
                this.saldoCuenta = this.saldoCuenta - montoARetirar;
                JOptionPane.showMessageDialog(null, "Retiro Exitos");
                System.out.println("Tu Saldo Actual Es De: " + this.saldoCuenta);
            }
        } else {
            JOptionPane.showMessageDialog(null, "El Numero De Cuenta No Coicide");
        }
    }
    //Transferencia
    public void transferecia() {
        JOptionPane.showMessageDialog(null, "Iniciando Transferencia...");
        float numeroDeCuenta = Float.parseFloat(JOptionPane.showInputDialog("Digite Su Numero De Cuenta"));

        if (this.numeroCuenta == numeroDeCuenta) {
            JOptionPane.showMessageDialog(null, "Cuenta Encontrada");
            
            double montoDeTransferencia = Double.parseDouble(JOptionPane.showInputDialog("Cuanto Desea Transferir")); // cantidad de transferencia
            if (montoDeTransferencia > 0) {
                if (montoDeTransferencia <= this.saldoCuenta) {
                    System.out.println("¡Transferencia exitosa! El balance es $" + (this.saldoCuenta - montoDeTransferencia));
                } else {
                    System.out.println("Lo siento, ¡asegúrate de tener suficiente saldo en la tarjeta!");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "La Cuenta No Existe");
        }
    }

}
