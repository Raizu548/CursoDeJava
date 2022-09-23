package PracticaParaParcial2;


import java.util.LinkedList;

public class Carrera {
    // Atributos
    private String nombre;
    private LinkedList<Materia> coleccionMateria = new LinkedList<>();

    public Carrera(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarMateria(Materia materia){
        coleccionMateria.add(materia);
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "nombre='" + nombre + '\'' +
                ", coleccionMateria=" + coleccionMateria +
                '}';
    }
}
