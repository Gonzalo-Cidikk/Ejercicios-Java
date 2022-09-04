package ejercicio.pkg2.bucles;

import java.util.Scanner;

public class Ejercicio2Bucles {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();
        String salir = "";
        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija Opción:");
            int opcion = leer.nextInt();
            while (opcion < 1 || opcion > 5) {
                System.out.println("La opción elegida no esta dentro de los parametros");
                System.out.println("Vuelva a ingresar la opción");
                opcion = leer.nextInt();
            }
            switch (opcion) {
                case 1:
                    System.out.println("La suma de los numeros es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta de los numeros es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion de los numeros es: " + (num1 * num2));
                    break;
                case 4:
                    double dividir = num1 / num2;
                    System.out.println("La divicion del numero " + num1 + " por el " + num2 + " es:" + dividir);
                    break;
                case 5:
                    System.out.println("Estas seguro de que deseas Salir? (s/n)");
                    salir = leer.next();
                    break;
            }
        } while (!salir.equalsIgnoreCase("s"));
        System.out.println("Gracias! vuelva pronto!");
    }

}
