/*Realiza un programa que escriba la tabla de multiplicar de un número introducido por
teclado. Para ello implementa una función que reciba como parámetro un número entero
y muestre por pantalla la tabla de multiplicar de dicho número */

import java.util.Scanner;

public class UD5_ej11 {
    static Scanner in;

    public static int getValue() {
        int value = in.nextInt();
        return value;
    }

    public static int getMultTable() {
        int mult = getValue();
        for (int i = 1; i < 11; i++) {
            int result = mult * i;
            System.out.println(mult + " x " + i + " = " + result);
        }
        return mult;
    }
    
    public static void main(String[] args) {
        in = new Scanner(System.in);
        System.out.print("Introduce el multiplicador: ");
        getMultTable();
    }
}
