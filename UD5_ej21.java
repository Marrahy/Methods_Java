/*Escribe un programa que muestre un menú con 2 opciones: “1.Circunferencia” y “2.Área”.
En ambas se le pedirá al usuario que introduzca un radio y luego se le mostrará el cálculo
oportuno. Implementa las funciones:
int menu() // Muestra el menú y devuelve el número elegido
double pideRadio() // Pide que se introduzca el radio y lo devuelve
double circunferencia(double r) // Calcula la circunferencia y la devuelve
double area(double r) // Calcula el área y la devuelve
Modifica el programa añadiendo otra opción llamada “Volumen”, permitiendo que el
usuario también pueda solicitar el cálculo del volumen. Añade la función:
double volumen(double r) // Calcula el volumen y lo devuelve
Modifica el programa añadiendo otra opción llamada “Todas” en la que se pida el radio
una sola vez y se muestren los tres cálculos posibles (circunferencia, área y volumen).
Modifica el programa anterior de modo que el proceso se repita una y otra vez (mostrar
menú -> realizar el cálculo -> volver a mostrar menú). Añade una opción más llamada
“Salir” que terminará el programa si es elegida.*/

import java.util.Scanner;
import java.lang.Math;

public class UD5_ej21 {
    static Scanner in;

    public static int menu() {
        System.out.println("1.Circunferencia");
        System.out.println("2.Área");
        System.out.print("Elige una opción: ");
        return in.nextInt();
    }

    public static double getRadio() {
        System.out.print("Introduce el radio: ");
        return in.nextDouble();
    }

    public static void option() {
        if (menu() == 1)
            getCircunference();
        else
            getArea();
    }

    public static void getCircunference() {
        double circunference = 0.0;
        double radio = getRadio();
        circunference = 2 * Math.PI * radio;
        System.out.println("La circunferencia del cícrulo es: " + circunference);
    }

    public static void getArea() {
        double area = 0.0;
        double radio = getRadio();
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del cícrulo es: " + area);
    }
    public static void main(String[] args) {
        in = new Scanner(System.in);
        option();
    }
}