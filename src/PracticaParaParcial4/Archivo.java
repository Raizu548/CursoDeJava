package PracticaParaParcial4;

import java.io.*;

public class Archivo {

    public static BaseDatos cargarDatos(String direccion){

        try {

            ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream(direccion));

            BaseDatos baseEntrada = (BaseDatos) flujoEntrada.readObject();

            return baseEntrada;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;

    }

    public static void GuardarDatos(BaseDatos datos, String direccion){

        try {
            ObjectOutputStream flujoSalida = new ObjectOutputStream(new FileOutputStream(direccion));

            flujoSalida.writeObject(datos);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
