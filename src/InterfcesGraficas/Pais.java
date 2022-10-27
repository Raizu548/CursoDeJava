package InterfcesGraficas;

import java.io.Serializable;

public class Pais implements Serializable {
    private String nombre;
    private String capital;

    public Pais(String nombre, String capital){
        this.nombre = nombre;
        this.capital = capital;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCapital() {
        return capital;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
