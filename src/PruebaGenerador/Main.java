package PruebaGenerador;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Archivo archivo = new Archivo();
        Almacen almacen;
        boolean salir = false;
        int opcion = 0;
        String nombre;

        if (archivo.leer() == null){
            almacen = new Almacen();
        } else {
            almacen = archivo.leer();
        }

        do {
            System.out.println(" --------------------------------- ");
            System.out.println("1- Agregar. \n2- Listar. \n3- Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese nombre: ");
                    nombre = sc.nextLine();
                    if (!almacen.existe(nombre)){
                        almacen.agregarProducto(nombre);
                    } else {
                        System.out.println("El producto ya existe");
                    }
                    break;
                case 2:
                    almacen.listarProducto();
                    break;
                default:
                    salir = true;
                    break;
            }

        } while (!salir);


        archivo.escribir(almacen);



    }
}
