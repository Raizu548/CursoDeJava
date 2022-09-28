package PracticaParaParcial2;

import java.util.Iterator;
import java.util.LinkedList;

public class Facultad {
    // Atributos
    private String nombre;
    private LinkedList<Carrera> coleccionCarrreras = new LinkedList<>();

    public Facultad(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Carrera> getColeccionCarrreras() {
        return coleccionCarrreras;
    }

    public void setColeccionCarrreras(LinkedList<Carrera> coleccionCarrreras) {
        this.coleccionCarrreras = coleccionCarrreras;
    }

    public void agregarCarrera(Carrera nuevaCarrera){
        coleccionCarrreras.add(nuevaCarrera);
    }

    public boolean eliminarCarrera(String nombreCarrera){
        Iterator<Carrera> carreraIterator = coleccionCarrreras.iterator();

        while (carreraIterator.hasNext()){
            Carrera carrera = carreraIterator.next();
            if (carrera.getNombre().equals(nombreCarrera)){
                carreraIterator.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Facultad{" +
                "nombre='" + nombre + '\'' +
                ", coleccionCarrreras=" + coleccionCarrreras +
                '}';
    }

    public void listarCarrera(){
        int i = 0;
        for (Carrera carrera: coleccionCarrreras) {
            i++;
            System.out.println(i + coleccionCarrreras.get(i-1).toString());
        }
    }

    public int cantidadCarrera(){
        return coleccionCarrreras.size();
    }
}
