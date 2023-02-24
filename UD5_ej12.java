/*Realiza un programa que dado un valor en kilómetros nos lo traduce a millas. El
programa debe tener una función que reciba como parámetro una cantidad en kilómetros
y nos la devuelva en millas. */

import java.util.Scanner;

public class UD5_ej12 {
    static Scanner in;

    public static double getValue() {
        double value = in.nextDouble();
        return value;
    }

    public static double kmToMill() {
        System.out.print("Introduce los km a convertir: ");
        double km = getValue();
        double mill = 0;
        if (km >= 0.0 && km <= 1000000) {
            mill = km * 1.60934;
            System.out.println("Los " + km + "km" + " en millas son: " + mill + " millas");
        }
        else {
            System.out.println("Introduce un valor dentro de margen 0.0 / 1.000.000");
            kmToMill();
        }
        return mill;
    }
    public static void main(String[] args) {
        in = new Scanner(System.in);
        kmToMill();
    }
}
