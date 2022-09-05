package ejercicio.pkg11.funciones;

import java.util.Scanner;

public class Ejercicio11Funciones {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero entero positivo");
        int num1 = leer.nextInt();
        while (num1 < 1) {
            System.out.println("Ingrese nuevamente el numero");
            num1 = leer.nextInt();
        }
        System.out.println("Ingrese el segundo numero entero positivo");
        int num2 = leer.nextInt();
        while (num2 < 1) {
            System.out.println("Ingrese nuevamente el numero");
            num2 = leer.nextInt();
        }
        menu(num1, num2, leer);
    }

    public static void menu(int num1, int num2,Scanner leer) {
        String salir = "";
        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija Opcion:");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    opcion1(num1, num2);
                    break;
                case 2:
                    opcion2(num1, num2);
                    break;
                case 3:
                    opcion3(num1, num2);
                    break;
                case 4:
                    opcion4(num1, num2);
                    break;
                case 5:
                    salir = opcion5(leer);
                    break;

                default:
                    System.out.println("Opcion fuera de los parametros");
                    System.out.println("Intentelo nuevamente!");
            }
        } while (!salir.equalsIgnoreCase("s"));

    }

    public static void opcion1(int num1, int num2) {
        System.out.println("La suma de " + num1 + " mas el numero " + num2 + " es " + (num1 + num2));
    }

    public static void opcion2(int num1, int num2) {
        System.out.println("La resta de " + num1 + " menos el numero " + num2 + " es " + (num1 - num2));
    }

    public static void opcion3(int num1, int num2) {
        System.out.println("La Multiplicaion de " + num1 + " por el numero " + num2 + " es " + (num1 * num2));
    }

    public static void opcion4(int num1, int num2) {
        double resultado = num1 / num2;
        System.out.println("La divicion de " + num1 + " por el numero " + num2 + " es " + resultado);
    }

    public static String opcion5(Scanner leer) {
        System.out.println("Esta seguro que desea salir del programa? (S/N)");
        String respuesta = leer.next();
        return respuesta;
    }
}
