package ejercicio.pkg18;

public class Ejercicio18 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        generarMatriz(matriz);
        System.out.println("----------------");
        mostrarMatrizTrazpuesta(matriz);
    }

    public static void generarMatriz(int[][] matriz) {
        System.out.println("La Matriz original es: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
    }

    public static void mostrarMatrizTrazpuesta(int[][] matriz) {
        System.out.println("La matriz Trazpuesta es: ");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matriz[j][i] + "] ");
            }
            System.out.println("");
        }
    }

}
