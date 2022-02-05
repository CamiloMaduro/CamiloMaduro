package Recursos;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TMB {

    private int filas;
    private int columnas;
    private String matriz1[][];

    public TMB() {
        this.filas = 0;
        this.columnas = 0;
        matriz1 = new String[filas][columnas];
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public String[][] getMatriz1() {
        return matriz1;
    }

    public void setMatriz1() {
        this.matriz1 = new String[this.filas][this.columnas];
    }

    public void llenarMatriz(JTable x) {
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < (matriz1[0].length - 1); j++) {
                matriz1[i][j] = x.getValueAt(i, j).toString();
            }
        }
        JOptionPane.showMessageDialog(null, "Matriz Llenada Exitosamente ...");
        for (int i = 0; i < matriz1.length; i++) {
            matriz1[i][7] = "" + (10 * Double.parseDouble(matriz1[i][4]) + (6.25*Double.parseDouble(matriz1[i][5])) - (5 * Double.parseDouble(matriz1[i][6])) + 5);
        }
    }

    public DefaultTableModel mostrarMatriz() {
        GeneracionModelo resultado = new GeneracionModelo();
        resultado.setFilas(matriz1.length);
        resultado.setColumnas(matriz1.length);
        DefaultTableModel respuesta = resultado.generarModeloEspecifico();

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                respuesta.setValueAt(matriz1[i][j], i, j);
            }
        }
        return respuesta;
    }
}
