package PruebaGenerador;

import java.io.Serializable;
import java.util.Locale;

public class Producto implements Serializable {

    private int id;
    private String nombre;

    public Producto(String nombre, int id){
        this.nombre = nombre;
        this.id = id;
    }

    public boolean comparar(String nombre){
        return nombre.toLowerCase().equals(this.nombre.toLowerCase());
    }

    @Override
    public String toString() {
        return "id: "+ id +" Nombre: " + nombre;
    }
}
