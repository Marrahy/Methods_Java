/*Escribe un programa que pida un valor entero en millas y muestre su equivalente en
kilómetros. Recuerda que una milla son 1,60934 kilómetros. */

import java.util.Scanner;

public class UD5_ej5 {
    
    public static int inputUser() {

        Scanner in = new Scanner(System.in);
        System.out.print("Introduce un valor entero en millas: ");
        int millas = in.nextInt();
        return millas;
    }

    public static double convertToKm() {

        int millas = inputUser();
        double mToKm = millas * 1.60934;
        return mToKm;
    }
    public static void main(String[] args) {
        
        System.out.println(convertToKm() + "km");
    }
}
