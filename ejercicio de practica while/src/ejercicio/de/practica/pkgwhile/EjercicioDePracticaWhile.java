package ejercicio.de.practica.pkgwhile;

import java.util.Scanner;

public class EjercicioDePracticaWhile {

    public static void main(String[] args) {
        System.out.println("Ingrese una nota entre 0 y 10");
        Scanner leer = new Scanner(System.in);
        int nota = leer.nextInt();
        while (nota < 0 || nota > 10) {
            System.out.println("La nota Ingresada no se encuentra dentro de los parametros");
            System.out.println("Ingrese la nota nuevamente");
            nota = leer.nextInt();
        }
        System.out.println("Se a guardado la nota " + nota);
    }

}
