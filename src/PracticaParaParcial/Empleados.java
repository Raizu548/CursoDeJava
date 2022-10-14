package PracticaParaParcial;

public class Empleados extends Persona {
    private double sueldo;

    // Constructor
    public Empleados(String nombre, double dni, double sueldo) {
        super(nombre, dni);
        this.sueldo = sueldo;
    }

    // Getter and Setter
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // Metodos del padre

    @Override
    public String getNameClase() {
        return "Empleados";
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "sueldo=" + sueldo +
                ", nombre='" + nombre + '\'' +
                ", dni=" + dni +
                '}';
    }
}
