package PracticaParaParcial3;

public class Jefe extends Persona {
    private double porcentaje;

    public Jefe(String nombre, String apellido, int dni, double sueldoBasico, double porcentaje) {
        super(nombre, apellido, dni, (sueldoBasico) + sueldoBasico*(porcentaje/100));
        this.porcentaje = porcentaje;
    }

    @Override
    public void subirSueldo(double incremento) {
        sueldoBasico += incremento;
    }

    public double verSueldo(){
        return sueldoBasico;
    }

    @Override
    public String toString() {
        return "Jefe{" +
                "porcentaje=" + porcentaje +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", sueldoBasico=" + sueldoBasico +
                '}';
    }
}
