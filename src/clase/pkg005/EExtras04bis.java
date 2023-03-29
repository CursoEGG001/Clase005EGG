/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg005;

import java.util.Scanner;

/**
 *
 * Los profesores del curso de programación de Egg necesitan llevar un registro
 * de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
 * aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4
 * notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las
 * ponderaciones de cada nota son: Primer trabajo práctico evaluativo 10%
 * Segundo trabajo práctico evaluativo 15% Primer Integrador 25% Segundo
 * integrador 50% Una vez cargadas las notas, se calcula el promedio y se guarda
 * en el arreglo. Al final delprograma los profesores necesitan obtener por
 * pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta que solo
 * aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.
 */
public class EExtras04bis {

    public static void main(String[] args) {
        double[] notas = new double[10];
        String[] alumno = new String[10];

        CargaAlumno(alumno, notas);
        MuestraAprobados(alumno, notas);
        MuestraDesaprobados(alumno, notas);
    }

    public static void CargaAlumno(String[] nombre, double[] numero) {

       double num;
        String info;

        Scanner carga = new Scanner(System.in);
        for (int i = 0; i < numero.length; i++) {
            System.out.println("[" + (i + 1) + "]Ingrese el nombre de alumno:");

            info = carga.next();
            System.out.println("Ingrese nota Primer trabajo:");
            num = carga.nextInt() *  0.1;
            System.out.println("Ingrese nota Segundo trabajo:");
            num += carga.nextInt() * 0.15;
            System.out.println("Ingrese nota Integrador 1:");
            num += carga.nextInt() * 0.25;
            System.out.println("Ingrese nota Integrador 2:");
            num += carga.nextInt() * 0.5;

            nombre[i] = info;
            numero[i] = num;
        }
    }

    public static void MuestraAprobados(String[] nombre, double[] numero) {
        int contador = 0;

        for (int i = 0; i < numero.length; i++) {
            if (numero[i] >= 7) {
                contador++;
            }

        }
        System.out.println("Aprobados: " + contador);
    }

    public static void MuestraDesaprobados(String[] nombre, double[] numero) {
        int contador = 0;

        for (int i = 0; i < numero.length; i++) {
            if (numero[i] < 7) {
                contador++;
            }

        }
        System.out.println("Desprobados: " + contador);
    }
}
