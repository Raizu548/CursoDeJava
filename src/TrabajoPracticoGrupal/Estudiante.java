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
    public void modificarDatos(String nombre, String apellido, int legajo) {
        if (!nombre.equals("0")) this.nombre = nombre;
        if (!apellido.equals("0")) this.apellido = apellido;
        if (legajo != 0) this.legajo = legajo;
    }

    // Metodo
    @Override
    public String toString() {
        return "Nombre del Estudiante: " + nombre + " " +
                " / Apellido: " + apellido + " " +
                " / legajo: " + legajo +"\n";
    }

    public boolean equals(int legajo) {
        return this.legajo == legajo;
    }

}
