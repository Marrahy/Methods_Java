import java.util.Scanner;

public class calc {
    
    public static void imprimeMenu() {      //Imprime el menú de la calculadora\\

        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Multiplicación");
        System.out.println("4.- División");
        System.out.println("5.- Área rectángulo");
        System.out.println("6.- Área triángulo equilátero");
        System.out.println("7.- Área círculo");
        System.out.println("8.- Seno, Cose, Tangente");
        System.out.println("9.- Salir");
    }
    public static int opcionElegida() {     //Input del usuario que elige el caso a ejecutar\\

        Scanner in = new Scanner(System.in);

        System.out.print("Introduce la opción deseada: ");
        int opcion = in.nextInt();

        return opcion;
    }
    public static double suma() {       //Función que suma "a + b"\\

        double a = pideNumero();
        double b = pideNumero();
        return a+b;
    }
    public static double resta() {      //Función que resta "a - b"\\

        double a = pideNumero();
        double b = pideNumero();
        return a-b;
    }
    public static double mult() {       //Función que multiplica "a * b"\\

        double a = pideNumero();
        double b = pideNumero();
        return a*b;
    }
    public static double div () {       //Función que divide "a / b"\\

        double a = pideNumero();
        double b = pideNumero();
        return a/b;
    }
    public static double areaRectangulo() {

        double a = pideNumero();
        double b = pideNumero();
        return a * b;
    }
    public static double areaTrianguloEquilatero() {

        double a = pideNumero();
        double b = pideNumero();
        return (a * b) / 2;
    }
    public static double areaCirculo () {       //Función que calcula el área de un circulo con radio "a"\\

        double a = pideNumero();
        return Math.PI * Math.pow(a, a);
    }
    public static void seno() {     //Función que calcula el seno de "a"\\

        double a = pideNumero();
        System.out.println("El seno, coseno y la tangente del triángulo es: " + Math.sin(a) + ", " + Math.cos(a) + ", " + Math.tan(a));
    }
    public static double coseno() {     //Función que calcula el coseno de "a"\\

        double a = pideNumero();
        return Math.cos(a);
    }
    public static double tangente() {       //Función que calcula la tangente de "a"\\

        double a = pideNumero();
        return Math.tan(a);
    }
    public static double pideNumero() {     //Input del usuario\\

        Scanner in = new Scanner(System.in);

        System.out.print("Introduce número: ");
        double numero = in.nextDouble();
        return numero;
    }
    public static void casos () {       //Switch case de los casos\\

        switch (opcionElegida()) {

            case 1:
                System.out.println("La suma es: " + suma());
            break;
            
            case 2:
                System.out.println("La resta es: " + resta());
            break;

            case 3:
                System.out.println("La multipliación es: " + mult());
            break;

            case 4:
                System.out.println("La división es: " + div());
            break;

            case 5:
                System.out.println("El área del rectángulo es: " + areaRectangulo());
            break;

            case 6:
                System.out.println("El área del triángulo equilátero es: " + areaTrianguloEquilatero());
            break;

            case 7:
                System.out.println("El área del círculo es: " + areaCirculo());
            break;

            case 8:
                seno();
            break;
            
            case 9:
                System.out.println("Pasta la vista");
            break;

            default:
        }
    }
    public static void main(String[] args) {
        
        imprimeMenu();
        casos();
    }
}