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

    // Getter and Setter.


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getTitular() {
        return titular;
    }

    public void setTitular(Profesor titular) {
        this.titular = titular;
    }

    public ArrayList<Estudiante> getColeccionEstudiantes() {
        return coleccionEstudiantes;
    }

    public void setColeccionEstudiantes(ArrayList<Estudiante> coleccionEstudiantes) {
        this.coleccionEstudiantes = coleccionEstudiantes;
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

    // Decidimos cambiar el parametro de nombre por legajo dado que consideramos que es mejor para la buscqueda
    public void eliminarEstudiante(int legajo){

        Iterator<Estudiante> estudianteIterato = coleccionEstudiantes.iterator();

        while (estudianteIterato.hasNext()){
            Estudiante estudiante = estudianteIterato.next();
            if (estudiante.equals(legajo)){
                estudianteIterato.remove();
            }
        }
    }


    public boolean equals(String nombre) {
        return this.nombre == nombre;
    }


    @Override
    public String toString() {
        return "Materia: " +
                 nombre + " " +
                "| Titular: " + titular +
                " Estudiantes: " + coleccionEstudiantes;
    }
}
