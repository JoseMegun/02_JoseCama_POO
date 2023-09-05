package pkg02_josecama;

import java.util.Scanner;

//Estudiante: Jose Megun Cama La Madrid

public class persona {
    
//atributos
    String nombre;
    int edad;
    
//metodos
    public void hablar(){
        System.out.println(nombre + " de " + edad + " años dice hola");
    }
    
    public void orden(){
        System.out.println(nombre + " de " + edad + " años levanto la mano");
    }
    
    public void preguntar() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingresa el nombre: ");
    nombre = scanner.nextLine();

    System.out.print("Ingresa la edad: ");
    edad = scanner.nextInt();
}

    public static void main(String[] args) {
        persona persona = new persona();
        persona.preguntar();
        persona.hablar();
        persona.orden();
    }
    
}