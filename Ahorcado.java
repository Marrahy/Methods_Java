import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
public class Ahorcado {
    static Scanner in = new Scanner(System.in);
    static Character[] hyphen = hideWord();
    static Character[] useLetters = new Character[25];
    static int lifePoints = 5;
    static int lettersCount = 0;

    public static String randWords() {      //Elige la palabra random\\
        String[] ahorcadoWords = {"Agrio", "Perro", "Payaso", "Calvo", "Lampara"};
        String word = ahorcadoWords[(int) (Math.random() * (5 - 1)) + 1];
        return word;        //Devuelve una palabra\\
    }

    public static Character[] hideWord() {      //Crea una array de caracteres y los rellena con guiones en base a la longitud de la palabra seleccionada en randWords\\
        String word = randWords();
        Character[] hidedWord = new Character[word.length()];
        for (int i = 0; i < word.length(); i++) {
            hidedWord[i] = '-';
        }
        return hidedWord;       //Devuelve una array con guiones\\
    }

    public static char usrChar() {      //El usuario escoge una letra\\
        System.out.print("Introduce una letra: ");
        useLetters[lettersCount] = in.next().charAt(0);
        lettersCount++;
        return in.next().charAt(0);
    }

    public static void wordIteration(String word) {     //Itera sobre las posiciones de la palabra seleccionada para compararla con la letra introducida por el usuario\\
        char letter = usrChar();
        boolean notFound = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {             //Si la letra coincide, la letra sobreescribe el guíon por el que la iteracion ha encontrado la letra de la palabra
                hyphen[i] = letter;
                System.out.println("La letra está dentro de la palabra! :D");
                notFound = true;
            }
        }
        if (!notFound) {
            System.out.println("La letra no está en la palabra!, pierdes una vida D:");
            lifePoints--;
        }
    }

    public static boolean hyphenIteration() {      //Itera sobre la array de guiones para ver si quedan o no guiones, si quedan, devuelve false, quiere decir que el programa seguira pidiendo caracteres al usuario, en cambio si no quedan guiones, devuelve true, que quiere decir que el usuario ha ganado
        for (int i = 0; i < hyphen.length; i++) {
            if (hyphen[i] != '-') {
                return true;
            }
        }
        return false;
    }

    public static void checkStatusGame(int lifePoints) {
        boolean check = hyphenIteration();
        if (check) {
            System.out.println("Has ganado! :D");
            System.exit(0);
        }
        else if (lifePoints == 0) {
            System.out.println("Has perdido! D:");
            System.exit(0);
        }
    }

    public static void printHyphen() {
        for (int i = 0; i < hyphen.length; i++) {
            System.out.print(hyphen[i] + " ");
        }
    }

    public static void printUsedLetters() {
        for (int i = 0; i < lettersCount; i++) {
            System.out.print(useLetters[i] + " ");
        }
    }

    public static void ahorcado() {
        System.out.println("El ahorcado");
        System.out.print("Palabra: ");
        printHyphen();
        System.out.println("");
        System.out.println("Vidas: " + lifePoints);
        System.out.print("Letras usadas: ");
        System.out.println("");
        printUsedLetters();
        String randWord = randWords();
        wordIteration(randWord);

    }

    public static void main(String[] args) {
        while(true) {
            ahorcado();
            checkStatusGame(lifePoints);
        }
    }
}
