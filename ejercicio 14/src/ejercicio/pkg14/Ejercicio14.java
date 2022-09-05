package ejercicio.pkg14;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Euros a convertir");
        double euros = leer.nextDouble();
        System.out.println("A que moneda los desea convertir?");
        System.out.println("- Dolares");
        System.out.println("- Yenes");
        System.out.println("- Libras");
        System.out.println("Ingrese opción:");
        String opcion = leer.next();
        opcion = opcion.toLowerCase();
        convertirEuros(euros, opcion);
    }

    public static void convertirEuros(double euros, String opcion) {
        double convercion = 0;
        switch (opcion) {
            case "dolares":
                convercion = euros * 1.28611;
                break;
            case "yenes":
                convercion = euros * 129.852;
                break;
            case "libras":
                convercion = euros * 0.86;
                break;
            default:
                System.out.println("El nombre ingresado de la moneda es Incorrecto");
                System.out.println("Vuelva a intentarlo");
        }
        if (0 != convercion) {
            System.out.println(euros + " Euros equivalen a " + convercion + " " + opcion);
        }
    }

}
