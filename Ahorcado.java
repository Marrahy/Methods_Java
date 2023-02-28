import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
public class Ahorcado {

    static Scanner in = new Scanner(System.in);
    static String word = getRandWords().toLowerCase();
    static String hyphenWordLength = getHyphenWordLength();
    static char[] usedLetters = new char[25];
    static boolean win = false;
    static boolean gameOver = false;
    static boolean checkPassed = false;
    static int lifePoints = 5;
    static int hyphenCount = word.length();


    public static String getRandWords() {                                           //Elige la palabra random\\
        String[] ahorcadoWords = {"Agrio", "Perro", "Tecla", "Calvo", "Cajas"};
        return ahorcadoWords[(int) (Math.random() * (5 - 1)) + 1];                  //Devuelve una palabra\\
    }
    public static String getHyphenWordLength() {                                    //Crea una string de guiones con el numero de letras que tenga la variable "word"\\
        String hyphenWordLength = "";
        char hyphen = '-';
        for (int i = 0; i < word.length(); i++) {
            hyphenWordLength += hyphen;                                              //Añade un guion por loop en la string "hyphenWordLength"\\
        }
        System.out.printf(hyphenWordLength);
        return hyphenWordLength;                                                      //Devuelve una string con guiones\\
    }
    public static char getUsrChar() {
        System.out.print("Introduce una letra: ");
        char usrLetter = in.next().charAt(0);
        return usrLetter;
    }
    public static void checkLetter(char usrLetter) {                                    //Checkea si la letra ya se ha utilizado\\
        for (int i = 0; i < usedLetters.length; i++) {
            if (usedLetters[i] == usrLetter) {                                          //Si la letra esta en la array de "usedLetters" imprime un aviso\\
                System.out.println("Esta letra ya ha sido utilizada, prueba con otra.");
                break;
            }
            else {
                if (usedLetters[i] == '\u0000') {                                            //Si la letra no esta en la array añade la letra propuesta a "usedLetters"\\
                    usedLetters[i] = usrLetter;
                    checkPassed = true;
                    break;
                }
            }
        }
    }

    public static void checkLetterInWord(char usrLetter) {                              //Añade las letras propuestas por el usuario a la array de guiones si esta en la palabra\\
        char[] updatedHyphenString = hyphenWordLength.toCharArray();                    //Convierto la String de hyphenWordLength a una array de caracteres para poder sustituir el guion por el caracter propuesto por el usuario\\
        for (int i = 0; i < word.length(); i++) {
            if (usrLetter == word.charAt(i)) {
                System.out.println("Has acertado! :D");                              //Si el caracter propuesto es igual al caracter de la palabra de la posicion i, sustituye en la array de guiones el guion de updatedHyphenString de i por la letra propuesta\\
                updatedHyphenString[i] = usrLetter;
                hyphenCount--;
                if (hyphenCount == 0) {                                                 //Si el contador de guiones llega a 0, quiere decir que todas las letras han sido descubiertas, el jugador gana la partida\\
                    System.out.println("Has ganado :D");
                    System.out.println("La palabra es: " + word);
                    System.exit(0);
                }
                if (i == word.length() - 1)
                    break;
            }
            if (i == word.length() - 1) {                                               //Si el jugador falla al proponer una letra, pierde una vida\\
                System.out.println("Esa letra no está en la palabra!, has perdido una vida D:");
                lifePoints--;                                                           //A lifePoints se le resta 1 vida\\
                System.out.println("Te quedan: " + lifePoints + " vidas.");
                if (lifePoints == 0) {                                                  //Si lifePoints llega a 0, el juego termina\\
                    gameOver = true;
                    System.out.println("Has perdido todas las vidas D:");
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
                break;
            }
        }
        System.out.println(hyphenWordLength = String.valueOf(updatedHyphenString));
        checkPassed = false;     //Revierto la array a String y la imprimo\\
    }

    public static void ahorcado() {
        System.out.println();
        char usrchar = getUsrChar();
        checkLetter(usrchar);
        while (checkPassed) {
            checkLetterInWord(usrchar);
        }
        System.out.print(Arrays.toString(usedLetters));

    }

    public static void main(String[] args) {
        while (!win || !gameOver) {
            ahorcado();
        }
    }
}