package Archivos.Serializacion;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opciones = 0;
        boolean salir = false;
        ArrayList<Persona> personas = new ArrayList<>();
        File file = new File("archivoSerializable.txt");


        do {
            System.out.println("1- Cargar. \n2- Mostrar \n3- Salir");
            opciones = sc.nextInt();
            sc.nextLine();

            switch (opciones){
                case 1: // Escritura
                    personas.add(new Persona("Luis","Ferreyra"));
                    personas.add(new Persona("Mauricio","Ferreyra"));

                    try {

                        ObjectOutputStream flujoSalida = new ObjectOutputStream(new FileOutputStream(file));

                        flujoSalida.writeObject(personas);
                    } catch (IOException e){
                        e.printStackTrace();
                    }
                    break;
                case 2: // Lectura

                    try {
                        ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream(file));

                        ArrayList<Persona> personaEntrada = (ArrayList<Persona>) flujoEntrada.readObject();

                        for (Persona e: personaEntrada){
                            System.out.println(e.toString());
                        }
                    } catch (IOException | ClassNotFoundException e){
                        e.printStackTrace();
                    }
                    break;

                default:
                    salir = true;
                    break;
            }

        } while (!salir);
    }
}
