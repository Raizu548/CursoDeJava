package TrabajoPracticoGrupal;

public class Profesor extends Persona {

    private double basico = 50000;
    private int antiguedad;


    public Profesor(String nombre,String apellido,int legajo,int antiguedad)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.antiguedad =antiguedad;
    }

    @Override
    public void modificarDatos(){}

    public double calcularSueldo()
    {
        return basico +(basico*0.10)*antiguedad;
    }

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
