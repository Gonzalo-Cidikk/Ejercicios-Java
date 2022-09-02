package ejercicio.de.practica.pkgfor;

import java.util.Scanner;

public class EjercicioDePracticaFor {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contador, num;
        contador = 0;
        do {
            do {
                System.out.println("Ingrese un numero (entre 1 y 20)");
                num = leer.nextInt();
            } while (num < 1 || num > 20);
            System.out.println("");
            System.out.print(num + " ");
            for (int i = 0; i < num; i++) {
                System.out.print("*");
            }
            System.out.println("");
            contador = contador + 1;
        } while (contador < 4);
    }

}
