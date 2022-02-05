package Recursos;

import javax.swing.table.DefaultTableModel;

public class GeneracionModelo {
    private int filas;
    private int columnas;
    private DefaultTableModel modelo;
    
    public GeneracionModelo(){
        this.filas = 0;
        this.columnas = 0;
        modelo = new DefaultTableModel();
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

    public DefaultTableModel getModelo() {
        return modelo;
    }

    public void setModelo(DefaultTableModel modelo) {
        this.modelo = modelo;
    }
    public DefaultTableModel generarModeloEspecifico(){
        modelo.setRowCount(this.filas);
        modelo.setColumnCount(this.columnas);
        String names[]=new String [8];
        names[0] = "ID";
        names[1] = "Nombre";
        names[2] = "Tipo de Identificacion";
        names[3] = "Numero De Identificacion";
        names[4] = "Peso(KG)";
        names[5] = "Altura (CM)";
        names[6] = "Edad (AÑOS)";
        names[7] = "TMB";
        modelo.setColumnIdentifiers(names);
        return modelo;
    }
}
