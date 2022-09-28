package TrabajoPracticoGrupal;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Facultad facultad = new Facultad("UTN");

        // Variables
        int opcion = 0, legajo, antiguedad;
        boolean salir = false;
        String nombre,nombreCarrera,nombreProfesor,nombreMateria, apellido;


        do {

            do {
                System.out.println(" --------------------- MENU ---------------------");
                System.out.println("1- Agregar Carrera");
                System.out.println("2- Eliminar Carrera");
                System.out.println("3- Agregar Materia a una Carrera");
                System.out.println("4- Buscar y eliminar Materia de una Carrera"); // Se busca y si existe preguntamos para eliminar
                System.out.println("5- Agregar estudiante");
                System.out.println("6- Elimar estudiante");
                System.out.println("7- Expulsar estudiante de la facultad.");
                System.out.println("8- Editar Profesor");
                System.out.println("9- Mostrar Informacion");
                System.out.println("10- Salir");

                try {
                    opcion = sc.nextInt();
                    salir = true;
                } catch (InputMismatchException e){
                    System.out.println("ERROR! SOLO NUMEROS!");
                }
                sc.nextLine(); // Anti bucle

            } while (!salir);
            salir = false;

            switch (opcion){
                case 1:
                    System.out.println(" ----- Agregar Carrera -----");
                    System.out.println("Nombre de la carrera: ");
                    nombre = sc.nextLine();

                    if (!facultad.existe(nombre)){
                        facultad.agregarCarrera(new Carrera(nombre));
                    }
                    break;
                case 2:
                    System.out.println(" ----- Eliminar Carrera -----");
                    System.out.println("Carreras: \n" + facultad.listarContenido());
                    System.out.println("Nombre de la carrera: ");
                    nombre = sc.nextLine();

                    if (facultad.existe(nombre)){
                        System.out.println("Existe");
                        facultad.eliminarCarrera(nombre);
                    }
                    break;
                case 3:
                    System.out.println(" ------ Agregar Materia ------");
                    System.out.println("Nombre de la materia: ");
                    nombre = sc.nextLine();

                    System.out.println("Carreras: " + facultad.listarContenido());
                    System.out.println("Escriba el nombre de la carrera a la que quiere añadir: ");
                    nombreCarrera = sc.nextLine();

                    if (facultad.existe(nombreCarrera)){
                        System.out.println("---- Añadir profesor ----");
                        System.out.println("Nombre: ");
                        nombreProfesor = sc.nextLine();
                        System.out.println("Apellido: ");
                        apellido = sc.nextLine();
                        System.out.println("Legajo: ");
                        legajo = sc.nextInt();
                        System.out.println("Antiguedad: ");
                        antiguedad = sc.nextInt();
                        sc.nextLine(); // Evita el bug

                        Profesor profesor = new Profesor(nombreProfesor,apellido,legajo,antiguedad);
                        Carrera carrera = facultad.obtenerCarrera(nombreCarrera);
                        carrera.agregarMateria(new Materia(nombre, profesor));
                    } else {
                        System.out.println("LA CARRERA NO EXISTE!");
                    }
                    break;
                case 4:
                    System.out.println("------ Buscar Materia en una Carrera -------");
                    System.out.println("Nombre de la materia: ");
                    nombre = sc.nextLine();

                    System.out.println("Carreras: " + facultad.listarContenido());
                    System.out.println("Escriba el nombre de la carrera a la que quiere añadir: ");
                    nombreCarrera = sc.nextLine();

                    if (facultad.existe(nombreCarrera)){
                        Carrera carrera = facultad.obtenerCarrera(nombreCarrera);

                        if (carrera.encontrarMateria(nombre)){
                            System.out.println("¿Deseas eliminar la materia?");
                            System.out.println("1- Si.      2- No.");
                            opcion = sc.nextInt();
                            sc.nextLine(); // Evita el bug

                            if (opcion == 1) carrera.eliminarMateria(nombre);

                        } else {
                            System.out.println("LA MATERIA NO EXISTE!");
                        }

                    } else {
                        System.out.println("LA CARRERA NO EXISTE!");
                    }
                    break;
                case 5:
                    System.out.println(" ----- Agregar Estudiante ------ ");
                    System.out.println("Nombre: ");
                    nombre = sc.nextLine();
                    System.out.println("Apellido: ");
                    apellido = sc.nextLine();
                    System.out.println("Legajo: ");
                    legajo = sc.nextInt();
                    sc.nextLine(); // Evita el bug

                    System.out.println("Carreras: " + facultad.listarContenido());
                    System.out.println("Escriba el nombre de la carrera a la que quiere añadir: ");
                    nombreCarrera = sc.nextLine();

                    if (facultad.existe(nombreCarrera)){
                        Carrera carrera = facultad.obtenerCarrera(nombreCarrera);

                        System.out.println("A que materia desea añadir el estudiante: ");
                        System.out.println(carrera.listarContenido());
                        nombreMateria = sc.nextLine();

                        if (carrera.encontrarMateria(nombreMateria)){
                            Materia materia = carrera.obtenerMateria(nombreMateria);
                            materia.agregarEstudiante(new Estudiante(nombre,apellido,legajo));
                        } else {
                            System.out.println("ERROR! MATERIA NO ENCONTRADA!");
                        }

                    } else {
                        System.out.println("ERROR CARRERA NO ENCONTRADA!");
                    }
                    break;
                case 6:
                    System.out.println(" ----- Eliminar Estudiante de una materia ------ ");
                    System.out.println("Legajo: ");
                    legajo = sc.nextInt();
                    sc.nextLine(); // Evita el bug

                    System.out.println("Carreras: " + facultad.listarContenido());
                    System.out.println("Escriba el nombre de la carrera a la que quiere añadir: ");
                    nombreCarrera = sc.nextLine();

                    if (facultad.existe(nombreCarrera)){
                        Carrera carrera = facultad.obtenerCarrera(nombreCarrera);

                        System.out.println("A que materia desea añadir el estudiante: ");
                        System.out.println(carrera.listarContenido());
                        nombreMateria = sc.nextLine();

                        if (carrera.encontrarMateria(nombreMateria)){
                            Materia materia = carrera.obtenerMateria(nombreMateria);
                            materia.eliminarEstudiante(legajo);
                        } else {
                            System.out.println("ERROR! MATERIA NO ENCONTRADA!");
                        }

                    } else {
                        System.out.println("ERROR CARRERA NO ENCONTRADA!");
                    }
                    break;
                case 7:
                    System.out.println("----- Expulsar estudiante -----");
                    System.out.println("Nombre: ");
                    nombre = sc.nextLine();
                    System.out.println("Apellido: ");
                    apellido = sc.nextLine();
                    System.out.println("Legajo: ");
                    legajo = sc.nextInt();
                    sc.nextLine(); // Evita el bug

                    facultad.eliminarEstudiante(new Estudiante(nombre,apellido,legajo));
                    System.out.println("Se expulso al estudiante satisfactoriamente!");
                    break;
                case 8:
                    System.out.println(" ----- Modificar datos de un Profesor ----- ");
                    System.out.println("Nombre del Profesor: ");
                    nombreProfesor = sc.nextLine();
                    System.out.println("Apellido: ");
                    apellido = sc.nextLine();
                    System.out.println("Legajo: ");
                    legajo = sc.nextInt();
                    System.out.println("Antiguedad: ");
                    antiguedad = sc.nextInt();
                    sc.nextLine(); // Evita el bug

                    System.out.println("Carreras: " + facultad.listarContenido());
                    System.out.println("Escriba el nombre de la carrera a la que quiere añadir: ");
                    nombreCarrera = sc.nextLine();

                    if (facultad.existe(nombreCarrera)){
                        Carrera carrera = facultad.obtenerCarrera(nombreCarrera);

                        System.out.println("A que materia desea cambiar de Profesor: ");
                        System.out.println(carrera.listarContenido());
                        nombreMateria = sc.nextLine();

                        if (carrera.encontrarMateria(nombreMateria)){
                            Materia materia = carrera.obtenerMateria(nombreMateria);
                            materia.modificarTitular(new Profesor(nombreProfesor,apellido,legajo,antiguedad));
                        } else {
                            System.out.println("ERROR MATERIA NO ENCONTRADA");
                        }

                    } else {
                        System.out.println("ERROR CARRERA NO ENCONTRADO");
                    }
                    break;
                case 9:
                    System.out.println(facultad.toString());
                    break;
                default:
                    salir = true;
                    break;
            }

        } while (!salir);


    }

}
