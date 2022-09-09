package ejercicio.pkg19;

public class Ejercicio19 {

    public static void main(String[] args) {
        int[][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        esAsimetrica(matriz);
    }

    public static void esAsimetrica(int[][] matriz) {
        boolean ban = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] + matriz[j][i] != 0) {
                    ban = true;
                }
                if (ban == true) {
                    break;
                }
            }
            if (ban == true) {
                break;
            }
        }
        if (ban == true) {
            System.out.println("La matriz no es Antisimetrica");
        } else {
            System.out.println("La matriz es Antisemetrica");
        }
    }

}
