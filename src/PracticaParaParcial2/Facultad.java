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

    public void agregarCarrera(Carrera nuevaCarrera){
        coleccionCarrreras.add(nuevaCarrera);
    }

    public void eliminarCarrera(String nombreCarrera){
        Iterator<Carrera> carreraIterator = coleccionCarrreras.iterator();

        while (carreraIterator.hasNext()){
            Carrera carrera = carreraIterator.next();
            if (carrera.getNombre().equals(nombreCarrera)){
                carreraIterator.remove();
            }
        }
    }

    @Override
    public String toString() {
        return "Facultad{" +
                "nombre='" + nombre + '\'' +
                ", coleccionCarrreras=" + coleccionCarrreras +
                '}';
    }
}
