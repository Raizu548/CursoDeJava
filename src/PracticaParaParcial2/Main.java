package PracticaParaParcial2;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        LinkedList<Estudiante> coleccionEstudiantes = new LinkedList<>();
        String nombre, apellido;
        int legajo = 0;
        int opcion;
        boolean salir = false;

        System.out.println("Nombre de la facultad: ");
        nombre = sc.nextLine();
        Facultad facultad = new Facultad(nombre);


        System.out.println("--- Creando Carrera ---- ");
        System.out.println("Nombre de la Carrera: ");
        nombre = sc.nextLine();
        Carrera carrera = new Carrera(nombre);
        facultad.agregarCarrera(carrera);
        facultad.listarCarrera();

        System.out.println("Crear unh profesor");
        System.out.println("Nombre del profesor: ");
        nombre = sc.nextLine();
        System.out.println("Apellido del profesor: ");
        apellido = sc.nextLine();
        legajo = cargarLegajo();

        Profesor profesor = new Profesor(nombre,apellido,legajo);

        System.out.println("---- Crear materia para la carrera ----");
        System.out.println("Nombre: ");
        nombre = sc.nextLine();
        System.out.println("Asignando profesor creado...");
        Materia materia = new Materia(nombre,profesor);

        carrera.agregarMateria(materia);

        System.out.println(" --- Crear grupo de estudiantes ---");

        do {
            System.out.println("Nombre del estudiante: ");
            nombre = sc.nextLine();
            System.out.println("Nombre del Apellido: ");
            apellido = sc.nextLine();
            legajo = cargarLegajo();

            materia.agregarEstudiante(new Estudiante(nombre,apellido,legajo));

            System.out.println("Desea agregar otro estudiante?\n1- Si     2- No");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion >= 2){
                salir = true;
            }

        } while (!salir);

        System.out.println(facultad.toString());

    }


    static int cargarLegajo(){
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int legajo = 0;

        do {

            System.out.println("Ingrese el nro de legajo: ");
            try {
                legajo = Integer.parseInt(sc.nextLine());
                salir = true;
            } catch (NumberFormatException e){
                System.out.println("ERROR DEBE DE INGRESAR SOLO NUMEROS");
            }

        } while (!salir);

        return legajo;

    }
}
