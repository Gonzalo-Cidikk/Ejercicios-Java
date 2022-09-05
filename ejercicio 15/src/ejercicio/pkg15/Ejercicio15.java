package ejercicio.pkg15;

public class Ejercicio15 {

    public static void main(String[] args) {

        int[] vectorNumeros = new int[100];
        for (int i = 0; i < 100; i++) {
            vectorNumeros[i] = i + 1;
        }
        mostrarVector(vectorNumeros);
    }

    public static void mostrarVector(int[] vectorNumeros) {
        for (int i = 99; i > -1; i--) {
            System.out.print(vectorNumeros[i] + ", ");
        }
    }

}
