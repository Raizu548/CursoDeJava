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

    public ArrayList<Carrera> getColeccionCarreras() {
        return coleccionCarreras;
    }

    public boolean existe(String nombre){
        for (Carrera carrera: coleccionCarreras) {
            if (carrera.getNombre().equals(nombre)){
                return true;
            }
        }
        return false;
    }

    public void setColeccionMaterias(ArrayList<Carrera> coleccionCarreras) {
        this.coleccionCarreras = coleccionCarreras;
    }

    //Métodos

    public void agregarCarrera(Carrera carrera){
        coleccionCarreras.add(carrera);
    }
    public void eliminarCarrera(String nombre){

        coleccionCarreras.removeIf(carrera -> carrera.getNombre().equals(nombre));
    }

    public void eliminarEstudiante(Estudiante estudianteEliminar){

        for (Carrera carrera: coleccionCarreras) {

            for (Materia materia: carrera.getColeccionMaterias()) {

                materia.eliminarEstudiante(estudianteEliminar.legajo);
            }
        }
    }

    // Añadimos este metodo para poder obtener un objeto de tipo carrera. Creemos que es necesario para nuestra logica.
    public Carrera obtenerCarrera(String nombre){
        for (Carrera carrera: coleccionCarreras) {
            if (carrera.getNombre().equals(nombre)){
                return carrera;
            }
        }
        return null;
    }

    @Override
    public int verCantidad() {
        return coleccionCarreras.size();
    }

    @Override
    public String listarContenido() {
        String contenido = "";
        for (Carrera carrera: coleccionCarreras) {
            contenido += carrera.getNombre() + "\n";
        }

        return contenido;
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
