package ejercicio.pkg4.condicionales;

import java.util.Scanner;

public class Ejercicio4Condicionales {

    public static void main(String[] args) {
        System.out.println("Ingrese una frase que empiece por A");
        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();
        frase = frase.toUpperCase();
        if ((frase.substring(0, 1).equals("A"))) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }

}
