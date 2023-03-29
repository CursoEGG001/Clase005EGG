/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg005;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author pc
 */
public class EExtras04 {

    public static void main(String[] args) {
        // Creamos una lista de alumnos con sus nombres y apellidos
        List<String> alumnos = new ArrayList<>();
        alumnos.add("Juan Pérez");
        alumnos.add("María Gómez");
        alumnos.add("Pedro López");
        alumnos.add("Luisa Fernández");
        alumnos.add("Ana Martínez");
        alumnos.add("Jorge García");
        alumnos.add("Laura Díaz");
        alumnos.add("Carlos Ruiz");
        alumnos.add("Lucía Sánchez");
        alumnos.add("Federico Torres");

        // Creamos un mapa para almacenar las notas de los alumnos
        Map<String, Double[]> notas = new HashMap<>();

        // Generamos las notas aleatoriamente para cada alumno y las almacenamos en el mapa
        Random random = new Random();
        for (String alumno : alumnos) {
            Double[] notasAlumno = new Double[4];
            notasAlumno[0] = 1.0 + (10.0 - 1.0) * random.nextDouble(); // primer trabajo práctico evaluativo
            notasAlumno[1] = 1.0 + (10.0 - 1.0) * random.nextDouble(); // segundo trabajo práctico evaluativo
            notasAlumno[2] = 1.0 + (10.0 - 1.0) * random.nextDouble(); // primer integrador
            notasAlumno[3] = 1.0 + (10.0 - 1.0) * random.nextDouble(); // segundo integrador
            notas.put(alumno, notasAlumno);
        }

        // Calculamos el promedio de las notas de cada alumno y los almacenamos en un arreglo
        Double[] promedios = new Double[alumnos.size()];
        int aprobados = 0;
        int desaprobados = 0;
        for (int i = 0; i < alumnos.size(); i++) {
            Double[] notasAlumno = notas.get(alumnos.get(i));
            Double promedio = 0.1 * notasAlumno[0] + 0.15 * notasAlumno[1] + 0.25 * notasAlumno[2] + 0.5 * notasAlumno[3];
            promedios[i] = promedio;
            if (promedio >= 7.0) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }

        // Mostramos por pantalla la cantidad de aprobados y desaprobados
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);
    }
}
