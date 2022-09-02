
package ejercicio.pkg2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println("Ingrese su nombre");
        Scanner leer = new Scanner(System.in);
        String nombre = leer.nextLine();
        System.out.println("Hola " + nombre + " te damos la bienvenida!");
    }

}
