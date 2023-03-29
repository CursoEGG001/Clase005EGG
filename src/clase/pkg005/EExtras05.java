/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg005;

import java.util.Random;

/**
 *
 * @author pc
 */
public class EExtras05 {

    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        int[][] matrix = new int[n][m];
        Random rand = new Random();
        int sum = 0;

        // Rellena la matriz con números al azar
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = rand.nextInt(100);
                sum += matrix[i][j];
            }
        }

        // Muestra la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Muestra la suma de los elementos de la matriz
        System.out.println("Suma de elementos: " + sum);
    }
}
