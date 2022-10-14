package PracticaParaParcial3;

public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected int dni;
    protected double sueldoBasico;

    public Persona(String nombre, String apellido, int dni, double sueldoBasico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sueldoBasico = sueldoBasico;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public void modificarDatos(String nombre, String apellido, int dni, double sueldoBasico){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sueldoBasico = sueldoBasico;
    }

    public abstract void subirSueldo(double incremento);

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", sueldoBasico=" + sueldoBasico +
                '}';
    }
}
