
package ejercicio4;

import java.util.Scanner;


public class Ejercicio4 {

   
    public static void main(String[] args) {
        System.out.println("Ingrese los grados");
        Scanner leer = new Scanner(System.in);
        float grados = leer.nextFloat();
        float f = 32 + (9*grados/5); 
        System.out.println("Los grados son: " + grados+ " y combertidos a fahrenheit son "+ f);
           
    }
    
}
