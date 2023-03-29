/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg005;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class guia01 {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("es", "AR"));
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de compañeros de equipo: ");
        int cantidad = sc.nextInt();

        String[] equipo = new String[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre del compañero " + (i + 1) + ": ");
            equipo[i] = sc.next();
        }

        System.out.println("Los nombres de tus compañeros de equipo son:");

        for (int i = 0; i < cantidad; i++) {
            System.out.println(equipo[i]);
        }
    }
}
