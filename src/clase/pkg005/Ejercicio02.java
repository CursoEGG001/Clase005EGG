/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg005;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        // Configurar la salida en UTF-8
        System.setProperty("file.encoding", "UTF-8");

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner dato = new Scanner(System.in);

        // Solicitar al usuario el tamaño del vector y el número a buscar
        System.out.print("Ingrese el tamaño del vector: ");
        int n = dato.nextInt();

        System.out.print("Ingrese el número a buscar: ");
        int numeroBuscado = dato.nextInt();

        // Crear un vector de tamaño n con valores aleatorios
        int[] vector = new int[n];
        Random rand = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(100);
        }

        // Buscar el número en el vector
        for (int i = 0; i < 100; i++) {

            if (vector[i]==numeroBuscado) {
                System.out.println("\nEl número " + numeroBuscado + " se encuentra en la posición " + i + " del vector.");
            }
        }
    }
}
