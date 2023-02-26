/*El NIF (o letra asociada a un DNI) se obtiene de la siguiente manera: Se divide el número
de DNI entre 23 y el resto es codificado por una letra según la siguiente equivalencia:
0: "T", 1: "R", 2: "W", 3: "A", 4: "G", 5: "M", 6: "Y", 7: "F", 8: "P", 9: "D",10:"X", 11: "B", 12:
"N", 13: "J", 14: "Z", 15: "S", 16: "Q", 17: "V", 18: "H", 19: "L", 20: "C", 21: "K", 22: "E".
Escribe un programa que pida el DNI y muestre por pantalla la letra asociada. Para ello
se deberá crear una función a la que se le pase el número y devuelva la letra.
Ejemplo: para el DNI 56321122 el NIF es ‘X’.*/

import java.util.Scanner;

public class UD5_ej18 {
    static Scanner in;

    public static int getDni() {
        System.out.print("Introduce tu número del DNI: ");
        return in.nextInt();
    }

    public static char assignLetter(int dni) {
        int res = dni % 23;
        char[] dniLetters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B','N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return dniLetters[res];
    }

    public static void dniGenerator() {
        int dni = getDni();
        char letter = assignLetter(dni);
        System.out.println("Tu DNI es: " + dni + letter);
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        dniGenerator();
    }
}