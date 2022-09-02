package ejercicio.pkg4.bucles;

import java.util.Scanner;

public class Ejercicio4Bucles {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño de cuadrado: ");
        int num = leer.nextInt();
        
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i == 1 || i == num || j == num || j == 1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
}

    
