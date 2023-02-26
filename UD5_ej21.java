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
        System.out.println("3.Volumen");
        System.out.print("Elige una opción: ");
        return in.nextInt();
    }

    public static double pideRadio() {
        System.out.print("Introduce el radio: ");
        return in.nextDouble();
    }

    public static double circunferencia(double r) {
        double circunferencia = 0.0;
        circunferencia = 2 * Math.PI * r;
        return circunferencia;
    }

    public static double area(double r) {
        double area = 0.0;
        area = Math.PI * Math.pow(r, 2);
        return area;
    }

    public static double volumen(double r) {
        double volumen = 0.0;
        volumen = (4 / 3) * Math.PI * Math.pow(r, 3);
        return volumen;
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        int opcion = menu();
        switch (opcion) {
            case 1: {
                double radio = pideRadio();
                double circunferencia = circunferencia(radio);
                System.out.println("La circunferencia: " + circunferencia);
            }
            break;
            case 2: {
                double radio = pideRadio();
                double area = area(radio);
                System.out.println("El área es: " + area);
            }
            break;
            case 3: {
                double radio = pideRadio();
                double volumen = volumen(radio);
                System.out.println("El volumen de la esfera es: " + volumen);
            }
            break;
        }
    }
}