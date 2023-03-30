/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg005;

import java.util.Random;
import java.util.Scanner;

/**
 * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
 * a medida que el usuario las va ingresando, construya una “sopa de letras para
 * niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en
 * orden horizontal en una fila que será seleccionada de manera aleatoria. Una
 * vez concluida la ubicación de las palabras, rellene los espacios no
 * utilizados con un número aleatorio del 0 al 9. Finalmente imprima por
 * pantalla la sopa de letras creada.
 */
public class EExtras06 {

    public static void main(String[] args) {
        int size = 20;
        char[][] wordSearch = new char[size][size];
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        // El usuario pone 5 palabras
        for (int i = 0; i < 5; i++) {
            System.out.print("Pon una palabra (3 a 5 caracteres): ");
            String word = scanner.nextLine();

            // Validamos la longitud
            if (word.length() < 3 || word.length() > 5) {
                System.out.println("¡Invalida!");
                i--;
                continue;
            }

            // Pone la palabra en una fila y columna al azar
            int row = rand.nextInt(size);
            int shiftplace = rand.nextInt( size - word.length() );
            for (int j = 0; j < word.length(); j++) {
                wordSearch[row][j+shiftplace] = word.charAt(j);
            }
        }

        // Rellena los espacios con números al azar
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (wordSearch[i][j] == '\u0000') {
                    wordSearch[i][j] = (char) ('0' + rand.nextInt(10));
                }
            }
        }

        // Muestra la Sopa de letras
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("[" + wordSearch[i][j] + "] ");
            }
            System.out.println();
        }
    }
}
