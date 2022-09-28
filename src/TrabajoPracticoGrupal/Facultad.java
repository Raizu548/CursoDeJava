package TrabajoPracticoGrupal;

import java.util.ArrayList;
import java.util.Iterator;

public class Facultad implements Informacion {

    //Atributos
    private String nombre;

    private ArrayList<Carrera> coleccionCarreras = new ArrayList<>();

    //Constructor

    public Facultad(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Carrera> getColeccionMaterias() {
        return coleccionCarreras;
    }

    public void setColeccionMaterias(ArrayList<Carrera> coleccionCarreras) {
        this.coleccionCarreras = coleccionCarreras;
    }

    //Métodos

    public void agregarCarrera(Carrera carrera){
        coleccionCarreras.add(carrera);
    }
    public void eliminarCarrera(Carrera nombre){

        coleccionCarreras.removeIf(carrera -> carrera.equals(nombre));
    }

    public void eliminarEstudiante(Estudiante estudianteEliminar){

        for (Carrera carrera: coleccionCarreras) {

            for (Materia materia: carrera.getColeccionMaterias()) {

                materia.eliminarEstudiante(estudianteEliminar.legajo);
            }
        }
    }

    @Override
    public int verCantidad() {
        return coleccionCarreras.size();
    }

    @Override
    public String listarContenido() {
        return "Facultad: " + nombre +"\n" + coleccionCarreras;
    }

    // toString().
    @Override
    public String toString() {
        return "Facultad{" +
                "nombre='" + nombre + '\'' +
                ", coleccionCarreras=" + coleccionCarreras +
                '}';
    }
}
