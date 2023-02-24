/*Escribe una función que muestre por pantalla un triángulo como el del ejemplo. Deberá
recibir dos parámetros: el carácter que se desea imprimir y el número de líneas del
triángulo. */

import java.util.Scanner;

public class UD5_ej14 {
    static Scanner in;

    public static int getValue() {
        System.out.print("Introduce el número de líneas de la piramide: ");
        int numLinea = in.nextInt();
        return numLinea;
    }

    public static Character getChar() {
        System.out.print("Introduce el tipo de carácter con el que quieras hacer la piramide: ");
        String input = in.next();
        char character = input.charAt(0);
        return character;
    }

    public static void printPyramid() {
        char character = getChar();
        int numLinea = getValue();
        int printEsp = numLinea;
        int printChar = 1;
        for (int i = 0; i < numLinea; i++) {
            for (int j = 0; j < printEsp; j++) {
                    System.out.print(' ');
            }
            for (int k = 0; k < printChar; k++) {
                System.out.print(character);
            }
            System.out.println();
            printEsp--;
            printChar+=2;
        }
    }
    public static void main(String[] args) {
        in = new Scanner(System.in);
        printPyramid();
    }
}