/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg005;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Ejercicio06 {

    public static void main(String[] args) {

        int[][] cuadrado = new int[3][3];
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        // Leer el cuadrado desde el teclado
        System.out.println("Introduzca los valores del cuadrado (números del 1 al 9):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + i + "][" + j + "]:");
                cuadrado[i][j] = scanner.nextInt();
                if (cuadrado[i][j] < 1 || cuadrado[i][j] > 9) {
                    System.out.println("Error: el número debe estar entre 1 y 9.");
                    return;
                }
            }
        }

        // Comprobar si el cuadrado es mágico
        if (esCuadradoMagico(cuadrado)) {
            System.out.println("El cuadrado es mágico.");
        } else {
            System.out.println("El cuadrado no es mágico.");
        }
    }

    public static boolean esCuadradoMagico(int[][] cuadrado) {
        int sumaDiagonal1 = 0;
        int sumaDiagonal2 = 0;
        for (int i = 0; i < 3; i++) {
            sumaDiagonal1 += cuadrado[i][i];
            sumaDiagonal2 += cuadrado[i][2 - i];
        }
        if (sumaDiagonal1 != sumaDiagonal2) {
            return false;
        }

        for (int i = 0; i < 3; i++) {
            int sumaFila = 0;
            int sumaColumna = 0;
            for (int j = 0; j < 3; j++) {
                sumaFila += cuadrado[i][j];
                sumaColumna += cuadrado[j][i];
            }
            if (sumaFila != sumaDiagonal1 || sumaColumna != sumaDiagonal1) {
                return false;
            }
        }

        return true;
    }
}
