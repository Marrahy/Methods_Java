import java.util.Scanner;
import java.lang.Math;
public class Ahorcado {
    static Scanner in;

    public static void randWords() {
        String[] ahorcadoWords = {"Agrio", "Perro", "Payaso", "Calvo", "Lampara"};
        for (int i = 0; i < ahorcadoWords.length; i++) {
            int rand = (int)Math.random() * (;
        }
    }
    public static Character getChar() {
        System.out.println("Introduce la letra: ");
        char letter = in.next().charAt(0);
        return letter;
    }
    public static


    public static void main(String[] args) {

    }
}
