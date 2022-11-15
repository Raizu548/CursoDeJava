package PracticaParaParcial4;

import java.io.Serializable;

public class Activo implements Informe, Serializable {
    private String nombre;
    private double monto;


    public Activo(String nombre, double monto) {
        this.nombre = nombre;
        this.monto = monto;
    }

    // Getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String mostrar_informe() {
        return "--- Activo ---\nNombre: "+nombre+"  |  Monto: $"+monto;
    }
}
