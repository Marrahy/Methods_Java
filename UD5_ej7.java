import java.util.Scanner;

public class UD5_ej7 {

    public static double getRectangleDimension(String dimension, Scanner input) {
        System.out.print("Introduce el " + dimension + " del rectángulo: ");
        return input.nextDouble();
    }

    public static double getRectangleArea(double height, double width) {
        return height * width;
    }

    public static double getRectanglePerimeter(double height, double width) {
        return 2 * (height + width);
    }

    public static void printRectangleProperties(double height, double width) {
        System.out.println("El área del rectángulo es: " + getRectangleArea(height, width));
        System.out.println("El perímetro del rectángulo es: " + getRectanglePerimeter(height, width));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double width = getRectangleDimension("ancho", input);
        double height = getRectangleDimension("alto", input);
        printRectangleProperties(height, width);
    }
}
