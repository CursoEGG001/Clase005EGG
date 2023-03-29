/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg005;

/**
 * Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
 * comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
 * elementos).
 */
public class EExtras02 {

    public static void main(String[] args) {
        int[] vector1 = {1, 2, 3, 4};
        int[] vector2 = {1, 2, 3, 4};
        if (sonIguales(vector1, vector2)) {
            System.out.println("Los vectores son iguales.");
        } else {
            System.out.println("Los vectores no son iguales.");
        }
    }

    public static boolean sonIguales(int[] vector1, int[] vector2) {
        if (vector1.length != vector2.length) {
            return false;
        }
        for (int i = 0; i < vector1.length; i++) {
            if (vector1[i] != vector2[i]) {
                return false;
            }
        }
        return true;
    }
}
