package PracticaParaParcial3;

import java.util.Iterator;
import java.util.LinkedList;

public class Personal {
    LinkedList<Persona> listaPersona = new LinkedList<>();

    public Personal(){}

    public void listarPersonas(){
        for (Persona persona: listaPersona) {
            System.out.println(persona.toString());
        }
    }

    public void addPersona(Persona persona){
        listaPersona.add(persona);
    }

    public void eliminarPersona(int dniEliminar){

        listaPersona.removeIf(persona -> persona.getDni() == dniEliminar);

    }

    public void modificarPersona(int nroDni){

    }

}
