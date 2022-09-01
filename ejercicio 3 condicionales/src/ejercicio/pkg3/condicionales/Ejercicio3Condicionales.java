
package ejercicio.pkg3.condicionales;

import java.util.Scanner;


public class Ejercicio3Condicionales {

   
    public static void main(String[] args) {
        System.out.println("Ingrese una frase de 8 de longitud");
        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();
        if (frase.length()==8){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
            
    }
    
}
