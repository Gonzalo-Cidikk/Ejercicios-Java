
package ejercicio.pkg1.bucles;

import java.util.Scanner;

public class Ejercicio1Bucles {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un limite");
        int limite = leer.nextInt();
        int suma = 0;
        do {
            System.out.println("Ingrese un numero a sumar");
            int num = leer.nextInt();
            suma += num;
        } while (suma <= limite);
        System.out.println("La suma total es: " + suma);
    }

}
