package PracticaParaParcial4;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

public class BaseDatos implements Serializable {
    ArrayList<Cliente> clientes = new ArrayList<>();

    public void mostrarClientes(){
        for (Cliente c: clientes) {
            System.out.println(c.mostrar_informe());
        }
    }

    public Cliente obtenerCliente(int index){
        return clientes.get(index);
    }

    public void eliminarCliente(Cliente cliente){
        clientes.remove(cliente);
    }

}
