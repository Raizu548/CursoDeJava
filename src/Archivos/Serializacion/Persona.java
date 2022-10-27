package Archivos.Serializacion;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + nombre +" " +apellido + '}';
    }
}