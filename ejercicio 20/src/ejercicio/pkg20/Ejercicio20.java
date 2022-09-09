package ejercicio.pkg20;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner leer = new Scanner(System.in);
        cargarMatriz(matriz, leer);
        mostrarMatriz(matriz);
        esMagica(matriz);
    }

    public static void cargarMatriz(int[][] matriz, Scanner leer) {
        System.out.println("Ingrese los numeros para la matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("posición: [" + i + "," + j + "]");
                matriz[i][j] = leer.nextInt();
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        System.out.println("La matriz es: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
    }

    public static void esMagica(int[][] matriz) {
        int referencia = matriz[0][0] + matriz[0][1] + matriz[0][2];
        int suma = 0;
        boolean ban = true;
        for (int i = 0; i < 3; i++) {
            suma = 0;
            for (int j = 0; j < 3; j++) {
                suma += matriz[i][j];
            }
            if (suma != referencia) {
                ban = false;
                break;
            } else {
                System.out.println("La suma de la fila " + (i + 1) + " es: " + suma);
            }
        }
        if (ban == true) {
            for (int j = 0; j < 3; j++) {
                suma = 0;
                for (int i = 0; i < 3; i++) {
                    suma += matriz[i][j];
                }
                if (suma != referencia) {
                    ban = false;
                    break;
                } else {
                    System.out.println("La suma de la columna " + (j + 1) + " es: " + suma);
                }
            }
            if (ban == true) {
                suma = 0;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (i == j) {
                            suma += matriz[i][j];
                        }
                    }
                }
                if (suma == referencia) {
                    System.out.println("La suma de la diagonal Principal es: " + suma);
                    suma = 0;
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (i + j == 2) {
                                suma += matriz[i][j];
                            }
                        }
                    }
                    if (suma == referencia) {
                        System.out.println("La suma de la diagonal Secundaria es: " + suma);
                        System.out.println("Felicidades la Matriz es Mágica!");
                    } else {
                        System.out.println("La Matriz no es Mágica");
                    }
                } else {
                    System.out.println("La Matriz no es Mágica");
                }
            }
        } else {
            System.out.println("La Matriz no es Mágica");
        }
    }

}
