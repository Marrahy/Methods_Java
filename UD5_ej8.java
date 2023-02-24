/*Escribe un programa que pida un valor N entero y luego muestre: el sumatorio des 1 a N,
el productorio de 1 a N y el valor intermedio entre 1 y N. */

import java.util.Scanner;
import java.lang.Math;

public class UD5_ej8 {

    public static int getValue() {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce un valor entero: ");
        int n = in.nextInt();
        return n;
    }
    
    public static int sum1aN(int n) {
        int totalSum = 0;
        for (int i = 1; i < n; i++) {
            totalSum += i;
        }
        return totalSum;
    }

    public static int producto1aN(int n) {
        int totalProd = 1;
        for (int i = 1; i < n+1; i++) {
            totalProd *= i;
        }
        return totalProd;
    }

    public static double intermedio1aN(int n) {
        return Math.round(n / 2);
    }

    public static void main(String[] args) {
        int res = getValue();
        System.out.println("La suma de enteros es: " + sum1aN(res));
        System.out.println("La multiplicación de enteros es: " + producto1aN(res));
        System.out.println("El intermedio de n es: " + intermedio1aN(res));
    }
}