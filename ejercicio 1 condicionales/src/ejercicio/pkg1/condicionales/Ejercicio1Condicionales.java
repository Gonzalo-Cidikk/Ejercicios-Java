
package ejercicio.pkg1.condicionales;

import java.util.Scanner;


public class Ejercicio1Condicionales {

   
    public static void main(String[] args) {
        System.out.println("Ingrese un numero para determinar si es par o impar");
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        if (num%2 == 0){
            System.out.println("El numero es Par!");
        }else{
            System.out.println("El numero es Impar");
        }
    }
    
}
