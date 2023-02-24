/*Realiza un programa que lea una fecha introduciendo el día, mes y año por separado y
nos diga si la fecha es correcta o no. Supondremos que todos los meses tienen 30 días.
Se debe crear una función donde le pasemos los datos y devuelva si es correcta o no. */

import java.util.Scanner;

public class UD5_ej10 {
    static Scanner in;

    public static int getValue() {
        int value = in.nextInt();
        return value;
    }

    public static int day() {
        System.out.print("Introduce el día: ");
        int day = getValue();
        if (day < 30 && day > 0) {
            System.out.println("Día: " + day);
        }
        else {
            System.out.println("Valor erróneo, introduce un nuevo valor");
            day();
        }
        return day;
    }

    public static int month() {
        System.out.print("Introduce el mes: ");
        int month =  getValue();
        if (month <= 12 && month > 0) {
            System.out.println("Mes: " + month);
        }
        else {
            System.out.println("Valor erróneo, introduce un nuevo valor");
            month();
        }
        return month;
    }

    public static int year() {
        System.out.print("Introduce el año: ");
        int year = getValue();
        if (year >= 0 && year <= 9999) {
            System.out.println("Año: " + year);
        }
        else {
            System.out.println("Valor erróneo, introduce un nuevo valor");
            year();
        }
        return year;
    }
    public static void main(String[] args) {
        in = new Scanner(System.in);
        System.out.println("Estamos a: " + day() + "/" + month() + "/" + year());
        in.close();
    }
}
