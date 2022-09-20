package TrabajoPracticoGrupal;

public class Estudiante extends Persona {

    // Constructor
    public Estudiante (String nombre,String apellido,int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    // Metodo del padre
    @Override
    public void modificarDatos(){}

    // Metodo
    @Override
    public String toString() {
        return "Estudiante{"+"nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo=" + legajo +"}\n";
    }

    public boolean equals(int legajo) {
        return this.legajo == legajo;
    }

}
