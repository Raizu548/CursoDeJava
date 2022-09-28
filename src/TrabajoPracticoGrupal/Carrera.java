package TrabajoPracticoGrupal;

import java.util.ArrayList;
import java.util.Iterator;

public class Carrera implements Informacion {

    private String nombre;

    private ArrayList<Materia> coleccionMaterias = new ArrayList<>();

    //Constructor.

    public Carrera(String nombre) {
        this.nombre = nombre;
    }

    // Getter and Setter.

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Materia> getColeccionMaterias() {
        return coleccionMaterias;
    }

    public void setColeccionMaterias(ArrayList<Materia> coleccionMaterias) {
        this.coleccionMaterias = coleccionMaterias;
    }

    //Métodos.
    public void agregarMateria(Materia materia){
        coleccionMaterias.add(materia);
    }

    public void eliminarMateria(String nombre){

        Iterator<Materia> materiaIterator = coleccionMaterias.iterator();

        while (materiaIterator.hasNext()){
            Materia materia = materiaIterator.next();
            if (materia.equals(nombre)){
                materiaIterator.remove();
            }
        }
    }

    // Consideramos que era mejor que retorne un booleano para la logica que tenemos pensado plantear.
    public boolean encontrarMateria(String nombre){
        for (Materia materia: coleccionMaterias)
        {
            if (materia.getNombre().equals(nombre)){
                return true;
            }
        }
        return false;
    }

    // Añadimos este metodo para poder obtener un objeto de tipo carrera. Creemos que es necesario para nuestra logica.
    public Materia obtenerMateria(String nombre){

        for (Materia materia: coleccionMaterias) {
            if (materia.getNombre().equals(nombre)){
                return materia;
            }
        }
        return null;
    }

    @Override
    public int verCantidad() {
        return coleccionMaterias.size();
    }

    @Override
    public String listarContenido() {
        String contenido = "";
        for (Materia materia: coleccionMaterias) {
            contenido += materia.getNombre() + "\n";
        }
        return contenido;
    }

    // toString().
    @Override
    public String toString() {
        return "Carrera{" +
                "nombre='" + nombre + '\'' +
                ", coleccionMaterias=" + coleccionMaterias +
                '}';
    }
}
