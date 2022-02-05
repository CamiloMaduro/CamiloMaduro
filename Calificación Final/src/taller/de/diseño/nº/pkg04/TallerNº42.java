package taller.de.diseño.nº.pkg04;



import java.util.Scanner;

public class TallerNº42 {

    public static void main(String[] args) {

        System.out.println("***************************");
        System.out.println("*   Calificación Final    *");
        System.out.println("***************************");
        
        Scanner Sr = new Scanner(System.in);
        System.out.println("¡Hola! Soy La Aplicación Que Te Ayudar A Sacar Tu Calificaón Final");
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Indroduce Tu Nombre");
        String Nombre = Sr.nextLine();
        System.out.println("\n----------------------\n");
        System.out.println("Primera Nota");
        double Nota1 = Sr.nextDouble();
        System.out.println("Segunda Nota");
        double Nota2 = Sr.nextDouble();
        System.out.println("Tercera Nota");
        double Nota3 = Sr.nextDouble();
        
        if (Nota1>Nota2 && Nota2>Nota3) {
            double Promedio1 = (Nota1 + Nota2) / 2;
            System.out.println(" "+Nombre+ " Tu Promedio es: "+Promedio1);
            }
        else if (Nota2>Nota3 && Nota3>Nota1) {
            double Promedio2 = (Nota2 + Nota3) / 2;
            System.out.println(" "+Nombre+ " Tu Promedio Es: "+Promedio2);
        }
        else if (Nota3>Nota2 && Nota2>Nota1) {
            double Promedio3 = (Nota3 + Nota2) / 2;
            System.out.println(" "+Nombre+ " Tu promedio Es: "+Promedio3);
        }
        
    }    
}    
    
    

