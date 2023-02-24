/*Escribe un programa que pida cinco precios y muestre por pantalla el precio de venta de
cada uno tras aplicarle un 21% de IVA. */

import java.util.Scanner;

public class UD5_ej6 {
    
    public static double inpUserPrices() {

        Scanner in = new Scanner(System.in);

        double price = 0;
            
        System.out.print("Introduce un precio: ");
        price = in.nextDouble();
        return price;
    }
    public static double ivaApplied() {

        double iva = 0;
            
        double price = inpUserPrices();

        iva = price * 0.21;    
        return iva;
    }
    public static void main(String[] args) {
        

        for (int i = 1; i < 6; i++) {
         
            System.out.println("El iva del precio " + i + " es: " + ivaApplied());
        }
    }
}
