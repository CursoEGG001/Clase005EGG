/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg005;

/**
 *
 * @author pc
 */
import java.util.Locale;
import java.util.Scanner;
import java.nio.charset.StandardCharsets;

public class guia02 {

    public static void main(String[] args) {
        // Configurar la salida en UTF-8 y español de Argentina
        Locale.setDefault(new Locale("es", "AR"));
        System.setProperty("file.encoding", "UTF-8");

        String[] equipo = new String[5];
        Scanner info = new Scanner(System.in).useDelimiter("\n");

        // Alojar los nombres en el vector Equipo
        for (int i = 0; i < equipo.length; i++) {
            System.out.print("Ingrese el nombre del compañero " + (i + 1) + ": ");
            equipo[i] = info.next();
        }

        // Mostrar los nombres del equipo
        System.out.println("\nLos compañeros de equipo son:");
        for (int i = 0; i < equipo.length; i++) {
            System.out.println((i + 1) + ". " + equipo[i]);
        }
    }
}
