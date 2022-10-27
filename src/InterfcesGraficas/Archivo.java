package InterfcesGraficas;

import java.io.*;
import java.util.ArrayList;

public class Archivo {
    private File ruta = new File("archivoPaises.txt");

    public ArrayList<Pais> lectura(){

        try {
            ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream(ruta));

            ArrayList<Pais> listaObjeto = (ArrayList<Pais>) flujoEntrada.readObject();

            return listaObjeto;

        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

        return null;
    }

    public void escribir(ArrayList<Pais> pais){
        try {
            ObjectOutputStream flujoSalida = new ObjectOutputStream(new FileOutputStream(ruta));

            flujoSalida.writeObject(pais);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
