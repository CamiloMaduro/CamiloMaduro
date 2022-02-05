package recursos;

import javax.swing.JOptionPane;
import recursos.*;
import vista.FrmTriangulo;

public class AreaDeFiguras {

    private int triangulo;
    private int base;
    private int altura;
    private int baseRec;
    private int alturaRec;
    private int radio;
    private int lado1cua;
    private int lado2cua;
    private int rectangulo;
    private int cuadrado;
    private int circulo;

    public AreaDeFiguras() {
        this.triangulo = triangulo;
        this.base = base;
        this.altura = altura;
        this.baseRec = baseRec;
        this.alturaRec = alturaRec;
        this.radio = radio;
        this.lado1cua = lado1cua;
        this.lado2cua = lado2cua;
        this.rectangulo = rectangulo;
        this.cuadrado = cuadrado;
        this.circulo = circulo;
    }

    public int getTriangulo() {
        return triangulo;
    }

    public void setTriangulo(int triangulo) {
        this.triangulo = triangulo;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBaseRec() {
        return baseRec;
    }

    public void setBaseRec(int baseRec) {
        this.baseRec = baseRec;
    }

    public int getAlturaRec() {
        return alturaRec;
    }

    public void setAlturaRec(int alturaRec) {
        this.alturaRec = alturaRec;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getLado1cua() {
        return lado1cua;
    }

    public void setLado1cua(int lado1cua) {
        this.lado1cua = lado1cua;
    }

    public int getLado2cua() {
        return lado2cua;
    }

    public void setLado2cua(int lado2cua) {
        this.lado2cua = lado2cua;
    }

    public int getRectangulo() {
        return rectangulo;
    }

    public void setRectangulo(int rectangulo) {
        this.rectangulo = rectangulo;
    }

    public int getCuadrado() {
        return cuadrado;
    }

    public void setCuadrado(int cuadrado) {
        this.cuadrado = cuadrado;
    }

    public int getCirculo() {
        return circulo;
    }

    public void setCirculo(int circulo) {
        this.circulo = circulo;
    }

    public void areaTriangulo() {
        double operacion = 0;
        operacion = this.base * this.altura / 2;
        JOptionPane.showMessageDialog(null, "El Area Del Triangulo Es " + operacion);
    }

    public void areaRectangulo() {
        double operacion = 0;
        operacion = this.baseRec * this.alturaRec;
        JOptionPane.showMessageDialog(null, "El Area Del Rectangulo Es " + operacion);
    }

    public void areaCirculo() {
        double operacion = 0;
        operacion = Math.PI * Math.pow(radio, 2);
        JOptionPane.showMessageDialog(null, "El Area Del Circulo Es " + operacion);
    }
        public void areaCuadrado() {
        double operacion = 0;
        operacion = lado1cua * lado2cua;
        JOptionPane.showMessageDialog(null, "El Area Del Cuadrado Es " + operacion);
    }
}
