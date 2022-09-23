package PracticaParaParcial2;

public class Profesor extends Persona {
    // Constructor
    public Profesor(String nombre, String apellido, int legajo) {
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
