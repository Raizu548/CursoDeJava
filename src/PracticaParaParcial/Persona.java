package PracticaParaParcial;

public abstract class Persona implements Informaciones {
    // Atributos
    protected String nombre;
    protected double dni;

    // Constrictor
    public Persona(String nombre, double dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDni() {
        return dni;
    }

    public void setDni(double dni) {
        this.dni = dni;
    }

    // Metodos de interface
    @Override
    public String getNameClase() {
        return "Persona";
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                '}';
    }
}
