package hola_mundo;

import java.util.Scanner;

public class Hola_Mundo {

    public static void main(String[] args) {
        //Se crea una variable Scanner que se utiliza para leer datos del usuario
        Scanner leer = new Scanner(System.in);
        //Se crea una variable de tipo cadena que se utiliza para leer datos del usuario
        String nombre, apellido;
        //Se pide que se ingrese el Nombre del usuario
        System.out.println("Ingresa tu nombre");
        //Leemos el nombre de la persona en la variable nombre
        nombre = leer.next();
        //
        System.out.println("Ingrese tu apellido");
        //
        apellido = leer.next();
        //Mostramos por pantalla el mensaje de Hola mundo! con el nombre de la persona
        System.out.println("Hola Mundo! soy " + nombre + " " + apellido + " y estoy programando en java!");
    }

}
