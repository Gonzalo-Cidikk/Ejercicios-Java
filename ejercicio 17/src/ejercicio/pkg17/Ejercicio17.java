package ejercicio.pkg17;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int N = leer.nextInt();
        int[] vectorEnteros = new int[N];
        llenarVector(vectorEnteros, N, leer);
        MostrarVector(vectorEnteros, N);
        contarUnidades(vectorEnteros, N);
    }

    public static void llenarVector(int[] vectorEnteros, int N, Scanner leer) {
        System.out.println("");
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese el numero para la posición [" + i + "]");
            vectorEnteros[i] = leer.nextInt();
        }
    }

    public static void MostrarVector(int[] vectorEnteros, int N) {
        System.out.println("En el vector: ");
        for (int i = 0; i < N; i++) {
            System.out.print("[" + vectorEnteros[i] + "] ");
        }
        System.out.println("");
    }

    public static void contarUnidades(int[] vectorEnteros, int N) {
        System.out.println("");
        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
        for (int i = 0; i < N; i++) {
            if (vectorEnteros[i] >= 10000) {
                cont5++;
            } else if (vectorEnteros[i] >= 1000) {
                cont4++;
            } else if (vectorEnteros[i] >= 100) {
                cont3++;
            } else if (vectorEnteros[i] >= 10) {
                cont2++;
            } else {
                cont1++;
            }
        }
        System.out.println("Hay " + cont5 + " numero/s con 5 cifras o más!");
        System.out.println("Hay " + cont4 + " numero/s con 4 cifras");
        System.out.println("Hay " + cont3 + " numero/s con 3 cifras");
        System.out.println("Hay " + cont2 + " numero/s con 2 cifras");
        System.out.println("Hay " + cont1 + " numero/s con 1 cifra");
    }

}
