package ejercicio.de.practica.pkgdo.pkgwhile;

import java.util.Scanner;

public class EjercicioDePracticaDoWhile {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contador, numero, suma;
        contador = 0;
        suma = 0;
        do {
            System.out.println("Ingrese un numero (Si es 0 la ejecucuion finaliza!)");
            numero = leer.nextInt();
            if (numero == 0) {
                break;
            } else if (numero > 0) {
                suma = suma + numero;
            }
            contador = contador + 1;
        } while (contador < 20);
        if (numero == 0) {
            System.out.println("Se capturo el numero 0!");
            System.out.println("La suma de los otros numeros es: " + suma);
        } else {
            System.out.println("No se capturo el numero 0 :( ");
            System.out.println("Pero la suma del resto de los numeros es: " + suma);
        }
    }

}
