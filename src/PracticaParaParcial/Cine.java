package PracticaParaParcial;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cine {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int capacidad, silla, opcion;
        String nombre;
        double dni;
        char fila;
        ArrayList<Espectadores> listaEspectadores = new ArrayList<>();
        Pelicula pelicula = new Pelicula("Terminator");
        SalaCine salaCine = new SalaCine();

        // Cargar sala
        System.out.println("---- Crear sala de Cine ---");
        System.out.println("- Nombre de la sala: ");
        salaCine.setNombre(sc.nextLine());

        do {
            sc.nextLine();
            try {
                System.out.println("- Capacidad maxima: ");

                capacidad = sc.nextInt();

                salaCine.setCapacidad(capacidad);
                salir = true;
            } catch (InputMismatchException e){
                System.out.println("ERROR! DEBE DE INGRESAR UN NUMERO");
            }

        } while (!salir);

        System.out.println("- Pelicula: "+ pelicula.getNombre());
        salaCine.setPelicula(pelicula);

        // Cargar espectadores


        salir = false;
        do {
            System.out.println("- Añadir espectador.\n 1- si \n 2- no");

            try {
                opcion = sc.nextInt();
                sc.nextLine();
                if (opcion == 1) {
                    System.out.println(" ---- Añadiendo espectador ----");
                    System.out.println("Ingrese el nombre: ");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese el DNI: ");
                    dni = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese fila de Asiento con un caracter: ");
                    fila = sc.next().charAt(0);
                    System.out.println("Ingrese el numero de asiento: ");
                    silla = sc.nextInt();
                    sc.nextLine();

                    listaEspectadores.add(new Espectadores(nombre, dni, fila, silla));
                    System.out.println("Se agrego el espectador!");
                } else salir =true;
            }catch (InputMismatchException e){
                System.out.println("ERROR! DEBE DE INGRESAR UN NUMERO");
            }

        } while (!salir);

        // Cargar espectadores en la sala
        System.out.println("Cargar espectadores en la sala");
        if (listaEspectadores.size() <= salaCine.getCapacidad()){
            salaCine.setListaEspectadores(listaEspectadores);
        } else {
            System.out.println("No hay capasidad");
        }

    }

}
