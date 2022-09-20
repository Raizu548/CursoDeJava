package TrabajoPracticoGrupal;

public class Estudiante extends Persona {
    @Override
    public void modificarDatos(){}

    public Estudiante (String nombre,String apellido,int legajo)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "Estudiante{"+"nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo=" + legajo +"}";
    }
    
}
