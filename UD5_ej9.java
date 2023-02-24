/*Realiza un programa que pida introducir tres valores enteros y nos diga cuál de ellos es el
más elevado. Impleméntalo creando únicamente una función a la que le pasemos dos
valores (no tres) y nos devuelva el máximo de los dos valores. */

import java.util.Scanner;
import java.lang.Math;

public class UD5_ej9 {
    
    public static int getValue() {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce primer valor: ");
        int value = in.nextInt();
        in.close();
        return value;
    }

    public static int maxOfThreeValue() {
        int value1 = getValue();
        int value2 = getValue();
        int value3 = getValue();

        int max_value = Math.max(value1, Math.max(value2, value3));
        System.out.println("El valor más elevado es: " + max_value);
        return max_value;
    }

    public static int maxOfTwoValue() {
        int value1 = getValue();
        int value2 = getValue();

        int max_value = Math.max(value1, value2);
        System.out.println("El valor más elevado es: " + max_value);
        return max_value;
    }
    public static void main(String[] args) {
        maxOfThreeValue();
        maxOfTwoValue();
    }
}
