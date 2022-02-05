package taller.de.diseño.nº.pkg04;



import java.util.Scanner;

public class TalllerNº4 {

    public static void main(String[] args) {

        System.out.println(" \n****************************************************\n");
        System.out.println("*  Bienvenido Al Sistema De Gratificación De Navidad  *");
        System.out.println(" \n****************************************************\n");
        Scanner Sr = new Scanner (System.in);
        System.out.println("Nombre Del Trabajdor");
        String Nombres = Sr.nextLine();
        System.out.print("\n---------------------\n");
        System.out.println("Número De Horas Extras Trabajadas");
        int horasExtras = Sr.nextInt();
        System.out.print("\n---------------------\n");
        System.out.println("Número De Horas Ausentes Del Trabajo");
        int horasAusentes = Sr.nextInt();
        
        int Proceso = horasExtras-(horasAusentes - 2/3);
         
        if (Proceso <= 10) {
            System.out.println(""+Nombres+ " El Bono Que Resiviras Es De: 100 Dolares");
        }
        else if (Proceso > 11 && Proceso < 20) {
        System.out.println(""+Nombres+ " El Bono Que Resiviras Es De: 200 Dolares");
        }
        else if (Proceso > 21 && Proceso < 30) {
        System.out.println(""+Nombres+ " El Bono Que Resiviras Es De: 300 Dolares");        
        }
        else if (Proceso > 31 && Proceso < 40) {
            System.out.println(""+Nombres+ " El Bono Que Resiviras Es De: 400 Dolares");
        }
        else if (Proceso > 41) {
            System.out.println(""+Nombres+ " El Bono Que Resiviras Es De: 500 Dolares");
        }
        }
    }
  