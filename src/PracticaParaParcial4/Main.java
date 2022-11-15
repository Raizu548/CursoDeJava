package PracticaParaParcial4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BaseDatos baseDatos;

        String direccionFile = "ArchivoPracticaParcial4.txt";

        String nombre, apellido, direccion;
        int dni;


        // Carga el archivo
        if (Archivo.cargarDatos(direccionFile) == null){
            baseDatos = new BaseDatos();
        } else {
            baseDatos = Archivo.cargarDatos(direccionFile);
        }



        // cargar clientes

        // contemplar casos de ingresar texto en ves de solo numeros

        // cargar lista de activos

    }
}
