/*Realiza un programa que permita comprobar si una terna de valores enteros (3 valores)
se ajusta a la ecuación de Pitágoras: x ² + y ² = z ². El programa solicita al usuario los
valores x, y, z. Se deberá crear una función a la que se le pase x, y, z y devuelva si son
iguales o no. */

import java.util.Scanner;

public class UD5_ej19 {
    static Scanner in;

    public static int getValue() {
        System.out.print("Introduce un valor: ");
        return in.nextInt();
    }

    public static boolean checkPythagoras() {
        int x = getValue();
        int y = getValue();
        int z = getValue();
        return (Math.pow(x, 2) + Math.pow(y, 2) == Math.pow(z, 2));
    }

    public static void printIfIsEqual() {
        if (checkPythagoras())
            System.out.println("Son iguales");
        else
            System.out.println("No son iguales");
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        printIfIsEqual();
    }
}
