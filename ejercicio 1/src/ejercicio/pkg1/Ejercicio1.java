
package ejercicio.pkg1;

import java.util.Scanner;


public class Ejercicio1 {

   
    public static void main(String[] args) {
        System.out.println("Ingrese dos numeros");
        Scanner leer = new Scanner(System.in);
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int suma = num1 + num2;
        if (num1 == num2){
            System.out.println("La suma de los dos numeros "+num1+" es: "+suma);
        }else{
            System.out.println("La suma de los numeros "+num1+" y "+num2+" es de: "+suma);

        }
        
    }
    
}
