package ejercicio.de.practica.pkgswitch;

import java.util.Scanner;

public class EjercicioDePracticaSwitch {

    public static void main(String[] args) {
        System.out.println("Hola! ingrese el tipo de motor que busca");
        System.out.println("1: Bomba de Agua");
        System.out.println("2: Bomba de Gasolina");
        System.out.println("3: Bomba de Hormigón");
        System.out.println("4: Bomba de Pasta Alimenticia");
        Scanner leer = new Scanner(System.in);
        int opciones = leer.nextInt();
        switch (opciones) {
            case 1:
                System.out.println("La bomba es una bomba de Agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de Gasolina");
                break;
            case 3:
                System.out.println("La bomba es un bomba de Hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de Pasta Alimenticia");
                break;
            default:
                System.out.println("No existe un valor valido para ese tipo de Bomba");
        }

    }

}
