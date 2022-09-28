package PracticaParaParcial3;

public class Empleado extends Persona {

    public Empleado(String nombre, String apellido, int dni, double sueldoBasico) {
        super(nombre, apellido, dni, sueldoBasico);
    }

    @Override
    public void subirSueldo(double incremento) {
        sueldoBasico+= incremento;
    }

    public double verSueldo(){
        return sueldoBasico;
    }

}
