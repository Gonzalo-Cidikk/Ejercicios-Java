package retornar.matriz;

import java.util.Scanner;

public class RetornarMatriz {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[2][2];
        generarMatriz(matriz, leer);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void generarMatriz(int[][] matriz, Scanner leer) {

        System.out.println("Generar matriz");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
    }

}
