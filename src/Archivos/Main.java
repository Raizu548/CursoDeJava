package Archivos;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String texto;
        boolean salir = false;
        int opcion;
        Archivo archivo = new Archivo();

        do {

            try {
                System.out.println("1- Leer archivo.");
                System.out.println("2- Escribir archivo.");
                System.out.println("3- Limpiar archivo.");
                System.out.println("4- Salir.");
                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion){
                    case 1:
                        archivo.leer();
                        break;
                    case 2:
                        System.out.println("Añadir: ");
                        texto = sc.nextLine();
                        archivo.escribir(texto);
                        break;
                    case 3:
                        archivo.limpiar();
                        break;
                    default:
                        salir = true;
                }

            } catch (InputMismatchException e){
                System.out.println("ERROR!");
            }

        } while (!salir);

    }
}
