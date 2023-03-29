/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg005;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author pc
 */
public class EExtras04 {

    public static void main(String[] args) {
        Random rnd = new Random();

        String[] nombres = {"Juan", "Maria", "Luis", "Ana", "Pedro", "Lucia", "Pablo", "Laura", "Diego", "Carla"};
        String[] apellidos = {"Garcia", "Lopez", "Fernandez", "Perez", "Rodriguez", "Sanchez", "Martinez", "Gonzalez", "Romero", "Alvarez"};

        HashMap<String, ArrayList<Double>> notasAlumnos = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            String nombre = nombres[rnd.nextInt(nombres.length)];
            String apellido = apellidos[rnd.nextInt(apellidos.length)];
            String nombreCompleto = nombre + " " + apellido;

            ArrayList<Double> notas = new ArrayList<>();

            // Notas de los trabajos prácticos evaluativos
            double tp1 = 1 + rnd.nextDouble() * 9;
            double tp2 = 1 + rnd.nextDouble() * 9;

            notas.add(tp1*0.10);
            notas.add(tp2*0.15);

            // Notas de los integradores
            double int1 = 1 + rnd.nextDouble() * 9;
            double int2 = 1 + rnd.nextDouble() * 9;
            notas.add(int1*0.25);
            notas.add(int2*0.50);

            // Promedio de las notas
            double promedio = notas.stream().mapToDouble(Double::doubleValue).sum() ;
            notas.add(promedio);

            notasAlumnos.put(nombreCompleto, notas);
            System.out.println(nombreCompleto + ": " + notas);
        }

        // Conteo de aprobados y desaprobados
        int aprobados = 0;
        int desaprobados = 0;

        for (ArrayList<Double> notas : notasAlumnos.values()) {
            double promedio = notas.get(4);
            if (promedio >= 7) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }

        // Impresión de resultados
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Desaprobados: " + desaprobados);
    }

}
