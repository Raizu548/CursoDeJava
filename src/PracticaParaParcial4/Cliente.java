package PracticaParaParcial4;

import java.io.Serializable;
import java.util.ArrayList;

public class Cliente extends Persona implements Serializable {
    private ArrayList<Activo> activos = new ArrayList<>();

    // Constructor
    public Cliente (String nombre, String apellido, int dni, String direccion){
        super(nombre, apellido, dni, direccion);
    }

    // Getters and Setters
    public ArrayList<Activo> getActivos() {
        return activos;
    }

    public void setActivos(ArrayList<Activo> activos) {
        this.activos = activos;
    }

    // Metodos
    public void agregarActivo(Activo nuevoActivo){
        activos.add(nuevoActivo);
    }

    public void mostrarActivos(){
        for (Activo a: activos) {
            System.out.println(a.mostrar_informe() + "\n");
        }
    }

}
