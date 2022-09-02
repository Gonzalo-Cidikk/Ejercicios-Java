package ejercicios.de.practica;

import java.util.Scanner;

public class EjerciciosDePractica {

    public static void main(String[] args) {
        System.out.println("Ingrese 2 numeros");
        Scanner leer = new Scanner(System.in);
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        if (num1 > 25 && num2 > 25) {
            System.out.println("Los dos numeros son mayores a 25");
        } else if (num1 > 25) {
            System.out.println("Solo el numero 1 es mayor a 25");
        } else if (num2 > 25) {
            System.out.println("Solo el numero 2 es mayor a 25");
        } else {
            System.out.println("Ninguno de los dos numeros es mayor a 25");
        }
    }

}
