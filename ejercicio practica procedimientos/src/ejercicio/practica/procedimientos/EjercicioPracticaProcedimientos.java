package ejercicio.practica.procedimientos;

import java.util.Scanner;

public class EjercicioPracticaProcedimientos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros para comparar si el primero es multiplo del segundo");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        esMultiplo(num1,num2);
    }

    public static void esMultiplo(int num1, int num2) {
        if (num2 % num1 == 0) {
            System.out.println(num1 + " es multiplo de " + num2);
        } else {
            System.out.println(num1 + " NO es multiplo de " + num2);
        }
    }
}
