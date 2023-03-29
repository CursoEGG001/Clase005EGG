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
public class EExtras07 {

    public static void main(String[] args) {
        int n;

        Scanner info = new Scanner(System.in);
        System.out.println("Elige el número de iteraciones para Fibonacci:");
        n = info.nextInt();
        int[] fibonacci = new int[n];
        // Fill the vector with the first N numbers of the Fibonacci sequence
        for (int i = 0; i < n; i++) {
            fibonacci[i] = fib(i);
        }

        // Display the vector
        for (int i = 0; i < n; i++) {
            System.out.print(" " + fibonacci[i]);
        }
    }

    // Recursive function to calculate the Nth number of the Fibonacci sequence
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
