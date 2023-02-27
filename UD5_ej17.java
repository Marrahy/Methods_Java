/*Realiza un programa que nos pida números enteros hasta que se introduzca el 0,
diciéndonos, para cada número introducido si es primo o no. Hay que recordar que un
número es primo si es divisible por si mismo y por 1. El 1 no es primo por convenio. Se
debe crear una función que pasándole un número entero devuelva si es primo o no. */

import java.util.Scanner;

public class UD5_ej17 {
    static Scanner in;
    
    public static int getValue() {
        System.out.print("Introduce un número: ");
        return in.nextInt();
    }

    public static boolean isPrime(int value) {
        if (value == 1)
            return false;
        return value % 2 != 0 && value % 3 != 0;
    }

    public static void getPrime(int value) {
        if (isPrime(value))
            System.out.println("Es primo");
        else
            System.out.println("No es primo");
    }

    public static void getValueTillZero() {
        int value = getValue();
        while (value != 0) {
            if (value < 0){
                System.out.println("Introduce un valor mayor que 0");
            }
            else {
                getPrime(value);
            }
            value = getValue();    
        }
    }
    public static void main(String[] args) {
        in = new Scanner(System.in);
        getValueTillZero();
    }
}
