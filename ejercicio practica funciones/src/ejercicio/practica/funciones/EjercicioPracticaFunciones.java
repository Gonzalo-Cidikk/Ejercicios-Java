
package ejercicio.practica.funciones;

import java.util.Scanner;

public class EjercicioPracticaFunciones {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase para codificar");
        String frase = leer.nextLine();
        frase = frase.toLowerCase();
        String retorno = codificarFrase(frase);
        System.out.println("La frase codificada es: " + retorno);
    }

    public static String codificarFrase(String frase) {
        String nuevaFrase = " ";

        for (int i = 0; i < frase.length(); i++) {
            String nuevaPalabra = frase.substring(i, i + 1);
            switch (nuevaPalabra) {
                case "a":
                    nuevaPalabra = "@";
                    nuevaFrase = nuevaFrase.concat(nuevaPalabra);
                    break;
                case "e":
                    nuevaPalabra = "#";
                    nuevaFrase = nuevaFrase.concat(nuevaPalabra);
                    break;
                case "i":
                    nuevaPalabra = "$";
                    nuevaFrase = nuevaFrase.concat(nuevaPalabra);
                    break;
                case "o":
                    nuevaPalabra = "%";
                    nuevaFrase = nuevaFrase.concat(nuevaPalabra);
                    break;
                case "u":
                    nuevaPalabra = "*";
                    nuevaFrase = nuevaFrase.concat(nuevaPalabra);
                    break;
                default:
                    nuevaFrase = nuevaFrase.concat(nuevaPalabra);
            }
        }
        return nuevaFrase;
    }
}
