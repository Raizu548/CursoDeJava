package PracticaParaParcial2;

import java.util.Iterator;
import java.util.LinkedList;

public class Materia {

    private String nombre;
    private Profesor titular;
    LinkedList<Estudiante> listaEstudiante = new LinkedList<>();

    public Materia(String nombre, Profesor titular) {
        this.nombre = nombre;
        this.titular = titular;
    }

    public void agregarEstudiante(Estudiante estudianteNuevo){
        listaEstudiante.add(estudianteNuevo);
    }

    public void eliminarEstudiante(int legajo){

        Iterator<Estudiante> estudianteIterator = listaEstudiante.iterator();

        while (estudianteIterator.hasNext()){
            Estudiante estudiante = estudianteIterator.next();
            if (estudiante.getLegajo() == legajo){
                estudianteIterator.remove();
            }
        }
    }

    public void listarEstudiantes(){
        for (Estudiante estudiante: listaEstudiante) {
            estudiante.toString();
        }
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", titular=" + titular +
                ", listaEstudiante=" + listaEstudiante +
                '}';
    }


}
