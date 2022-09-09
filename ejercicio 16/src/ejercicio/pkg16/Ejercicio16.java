package ejercicio.pkg16;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño que va a tener el vector");
        int N = leer.nextInt();
        int[] vectorAleatorio = new int[N];
        generarVector(vectorAleatorio, N);
        System.out.println("Ingrese un numero a buscar");
        int buscar = leer.nextInt();
        buscarNumero(buscar, vectorAleatorio, N);
    }

    public static void generarVector( int[] vecotrAleatorio, int N) {    
        for (int i = 0; i < N; i++) {
            vecotrAleatorio[i] = (int)(Math.random()*10);
            System.out.print(vecotrAleatorio[i]+" ");
        }
        System.out.println("");
    }
    
    public static void buscarNumero(int buscar, int[] vectorAleatorio, int N){
        for (int i = 0; i < N; i++) {
            if (vectorAleatorio[i] == buscar){
                System.out.println("El numero se encontró en la posición " + i);
            }
        }
    }

}
