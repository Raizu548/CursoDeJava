package PracticaParaParcial2;

public class Estudiante extends Persona{

    // Constructor
    public Estudiante(String nombre, String apellido, int legajo) {
        super(nombre, apellido, legajo);
    }

    // Metodo del padre
    @Override
    public void modificarDatos(String nombre, String apellido, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
