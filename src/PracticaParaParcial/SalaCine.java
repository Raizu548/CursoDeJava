package PracticaParaParcial;

import java.util.ArrayList;

public class SalaCine {
    private String nombre;
    private int capacidad;
    private Pelicula pelicula;
    ArrayList<Espectadores> listaEspectadores = new ArrayList<>();

    public SalaCine(){}

    public SalaCine(String nombre, int capacidad, Pelicula pelicula) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.pelicula = pelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public ArrayList<Espectadores> getListaEspectadores() {

        if(listaEspectadores != null){
            return listaEspectadores;
        }
        else {
            System.out.println("SIN ESPECTADORES CARGADOS");
        }

        return null;
    }

    public void setListaEspectadores(ArrayList<Espectadores> listaEspectadores) {
        this.listaEspectadores = listaEspectadores;
    }
}
