/*Realiza un programa que calcule el porcentaje de descuento que nos han hecho al
comprar algo. Se debe solicitar la cantidad sin descuento y la cantidad con el descuento
aplicado. Se debe crear una función a la que le pasemos ambos valores y nos devuelva
el descuento. */

import java.util.Scanner;

public class UD5_ej13 {
    static Scanner in;

    public static double getValue() {
        System.out.print("Introduce el precio sin descuento: ");
        double price = in.nextDouble();
        return price;
    }

    public static double calcDiscount() {
        double priceWithOutDisc = getValue();
        double priceWithDisc = getValue();
        double discount = (priceWithDisc * 100) / priceWithOutDisc;
        System.out.println("Descuento total: " + discount + "%");
        return discount;
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        calcDiscount();
    }
}
