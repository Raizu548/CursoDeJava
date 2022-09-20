package TrabajoPracticoGrupal;

import java.util.ArrayList;
import java.util.Iterator;

public class Materia implements Informacion {
    // Atributos
    private String nombre;
    private Profesor titular;
    private ArrayList<Estudiante> coleccionEstudiantes = new ArrayList<>();


    // Constructor
    public Materia(String nombre, Profesor profesor){
        this.nombre = nombre;
        this.titular = profesor;
    }

    // Metodos de interface
    @java.lang.Override
    public int verCantidad() {
        return coleccionEstudiantes.size();
    }

    @java.lang.Override
    public String listarContenido() {
        return "Materia: " + nombre+ " \nTitular: "+ titular.toString() + "\n Estudiantes: \n" + coleccionEstudiantes;
    }

    // Metodos
    public void agregarEstudiante(Estudiante estudiante){
        coleccionEstudiantes.add(estudiante);
    }

    public void modificarTitular(Profesor profesor){
        this.titular = profesor;
    }

    public void eliminarEstudiante(int legajo){

        Iterator<Estudiante> estudianteIterato = coleccionEstudiantes.iterator();

        while (estudianteIterato.hasNext()){
            Estudiante estudiante = estudianteIterato.next();
            if (estudiante.equals(legajo)){
                estudianteIterato.remove();
            }
        }
    }

}
