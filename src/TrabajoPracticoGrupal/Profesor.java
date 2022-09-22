package TrabajoPracticoGrupal;

public class Profesor extends Persona {
    // Atributos
    private double basico = 50000;
    private int antiguedad;

    // Constructor
    public Profesor(String nombre,String apellido,int legajo,int antiguedad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.antiguedad =antiguedad;
    }

    // Getters and Setters
    public double getBasico() {
        return basico;
    }

    public void setBasico(double basico) {
        this.basico = basico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    // Metodo heredado
    public void modificarDatos(String nombre, String apellido, int legajo,double basico, int antiguedad ) {
        if (!nombre.equals("0")) this.nombre = nombre;
        if (!apellido.equals("0")) this.apellido = apellido;
        if (legajo != 0) this.legajo = legajo;
        if (antiguedad != 0) this.antiguedad = antiguedad;
        if (basico != 0) this.basico = basico;
    }

    // Metodos
    public double calcularSueldo()
    {
        return basico +(basico*0.10)*antiguedad;
    }
    
    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo=" + legajo +
                ", basico=" + basico +
                ", antiguedad=" + antiguedad +
                '}';
    }
}
