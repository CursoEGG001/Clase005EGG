/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg005;

/**
 *
 * @author pc
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        // Configurar la salida en UTF-8
        System.setProperty("file.encoding", "UTF-8");

        // Crear un vector con los primeros 100 números enteros
        int[] numeros = new int[100];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        // Mostrar los números en orden descendente
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
