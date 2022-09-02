package ejercicio.practica.arreglos;

import java.util.Scanner;

public class EjercicioPracticaArreglos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] vectorNombres = new String[5];
        int[] vectorEdades = new int[5];
        int[][] matrizNumeros = new int[3][3];
        vectorNombres[0] = "Gonzalo";
        vectorNombres[1] = "Nicolas";
        vectorNombres[2] = "Fernando";
        vectorNombres[3] = "Silvina";
        vectorNombres[4] = "Mariana";
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese la edad de " + vectorNombres[i]);
            vectorEdades[i] = leer.nextInt();
        }
        mostrarVector(vectorEdades, vectorNombres);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese un valor para [" + i + "," + j + "]");
                matrizNumeros[i][j] = leer.nextInt();
            }
        }
        mostrarMatriz(matrizNumeros);
    }

    public static void mostrarVector(int[] vectorEdades, String[] vectorNombres) {
        for (int i = 0; i < 5; i++) {
            System.out.println("La edad de " + vectorNombres[i] + " es " + vectorEdades[i] + ".");
        }
    }

    public static void mostrarMatriz(int[][] matrizNumeros) {
        System.out.println("La Matriz es:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizNumeros[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
