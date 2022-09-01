
package ejercicio.pkg2.condicionales;

import java.util.Scanner;


public class Ejercicio2Condicionales {

    
    public static void main(String[] args) {
        System.out.println("Ingrese la frase eureka");
        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();
        frase = frase.toLowerCase();
        if (frase.equals("eureka")){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }
    
}
