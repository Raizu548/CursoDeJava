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

    public void encontrarMateria(String nombre){
        for (Materia materia: coleccionMaterias)
        {
            if (materia.equals(nombre)){
                System.out.println("¿Desea eliminar?");
            }
        }


    }


    @Override
    public int verCantidad() {
        return coleccionMaterias.size();
    }

    @Override
    public String listarContenido() {
        return "Carrera: " + nombre +"\n" + coleccionMaterias;
    }

    // toString().
    @Override
    public String toString() {
        return "Carrera: " +
                  nombre + " "+
                "| Materias: " + coleccionMaterias;
    }
}
