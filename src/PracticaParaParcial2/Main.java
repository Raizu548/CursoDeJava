package PracticaParaParcial2;

import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nombre;

        System.out.println("Creando una Facultad");
        System.out.println("Nombre de la Facultad: ");
        nombre = sc.nextLine();
        Facultad facultad = new Facultad(nombre);

        
    }
}
