/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase.pkg005;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;

/**
 *
 * @author pc
 */
public class Clase005 {

    public static void main(String[] args) {
        // Configurar la salida en UTF-8 y español de Argentina
        Locale.setDefault(new Locale("es", "AR"));
        System.setProperty("file.encoding", "UTF-8");

        // Crear la lista de nombres con caracteres Unicode
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("María");
        nombres.add("José");
        nombres.add("François");
        nombres.add("日本語");
        nombres.add("한글");

        // Mostrar la lista de nombres en la salida
        System.out.println("Los nombres son:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
