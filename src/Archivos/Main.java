package Archivos;


import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String texto;
        boolean salir = false;
        Archivo archivo = new Archivo();

        do {
            System.out.println("1-"); // Completar menu
        } while (!salir);



        System.out.println("Escribir texto");
        texto = sc.nextLine();

        archivo.escribir(texto);

        archivo.leer();
        archivo.limpiar();
        archivo.leer();

    }
}
