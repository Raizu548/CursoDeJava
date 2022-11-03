package PruebaGenerador;

import java.io.Serializable;
import java.util.ArrayList;

public class Almacen implements Serializable {

    private ArrayList<Producto> listaProducto = new ArrayList<>();
    private GeneradorID generadorID = new GeneradorID(0);

    public void agregarProducto(String nombre){
        listaProducto.add(new Producto(nombre, generadorID.generarID()));
    }

    public boolean existe(String nombre){
        for (Producto p: listaProducto) {
            if (p.comparar(nombre)) return true;
        }
        return false;
    }

    public void listarProducto(){
        for (Producto p: listaProducto) {
            System.out.println(p.toString());
        }
    }

}
