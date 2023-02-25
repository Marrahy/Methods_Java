/*Realiza un programa que nos pida números enteros hasta que se introduzca el 0,
diciéndonos, para cada número introducido si es primo o no. Hay que recordar que un
número es primo si es divisible por si mismo y por 1. El 1 no es primo por convenio. Se
debe crear una función que pasándole un número entero devuelva si es primo o no. */

import java.util.Scanner;

public class UD5_ej17 {
    static Scanner in;
    
    public static int getValue() {
        System.out.print("Introduce un número: ");
        int value = in.nextInt();
        return value;
    }

    public static int getPrime(int value) {
        if (value % 2 != 0 && value % 3 != 0) {
            System.out.println("Este número es primo");
        }
        else {
            System.out.println("Este número no es primo");
        }
        return value;
    }

    public static void getValueTillZero(int value) {
        while (value != 0) {
            getPrime(getValue());
        }
    }
    public static void main(String[] args) {
        in = new Scanner(System.in);
        getValueTillZero(getValue());
    }
}
