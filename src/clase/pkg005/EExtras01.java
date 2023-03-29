/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg005;

/**
 *Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.
 */
public class EExtras01 {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        
        // Llenar el vector con los 100 primeros números enteros
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i+1;
        }
        
        // Mostrar el vector en orden descendente
        for (int i = numeros.length-1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}