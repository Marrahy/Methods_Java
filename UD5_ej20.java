/*Escribe un programa que imprima las tablas de multiplicar del 1 al 10. Implementa una
función que reciba un número entero como parámetro e imprima su tabla de multiplicar.*/

import java.util.Scanner;

public class UD5_ej20 {
    static Scanner in;

    public static int getValue() {

        System.out.print("Introduce un valor: ");
        return in.nextInt();
    }

    public static void multTable() {
        int mult = getValue();
        for (int i = 1; i < 11; i++) {
            System.out.println(mult + " x " + i + " = " + (mult * i));
        }
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        multTable();
    }
}