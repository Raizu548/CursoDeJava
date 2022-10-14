package Archivos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Archivo {

    public void escribir(String texto){

        // Crea un referencia a archivo para comprobar si la direccion que busco existe
        File file = new File("archivo.txt");

        String nuevoTexto = "";
        // Si existe traigo lo que tiene adentro y le sumo lo nuevo.
        if (file.exists()){
            nuevoTexto += guardarTexto();
        }

        nuevoTexto += texto;

        try {
            FileWriter escritura = new FileWriter("archivo.txt");

            for (int i=0; i < nuevoTexto.length(); i++){
                escritura.write(nuevoTexto.charAt(i));
            }

            escritura.write("\n");

            escritura.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void leer(){
        FileReader entrada = null;
        try {
            //entrada = new FileReader("D:\\Luis\\TSP\\Laboratorio de programacion 2\\Ronda 2\\prueba.txt");
            entrada = new FileReader("archivo.txt");

            int caracter = entrada.read();
            char letra = (char)caracter;

            while (caracter != -1){
                System.out.print(letra);
                caracter = entrada.read();
                letra = (char)caracter;
            }

            entrada.close();
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("El archivo no existe, debe de escribirlo para crearlo.");
        }
    }

    // Este metodo limpia el archivo dejandolo en blanco
    public void limpiar(){
        try {
            FileWriter escritura = new FileWriter("archivo.txt");

            escritura.write("");

            escritura.close();
        } catch (Exception e){
            System.out.println("El archivo no existe aun!");
        }
    }

    // Con este metodo podemos traer lo que tenia el archivo guardado sin borrarlo al escribir algo nuevo
    private String guardarTexto(){
        String nuevoTexto = "";

        try {
            FileReader entrada = new FileReader("archivo.txt");

            int caracter = entrada.read();
            char letra = (char)caracter;

            while (caracter != -1){
                nuevoTexto += letra;
                caracter = entrada.read();
                letra = (char)caracter;

            }
            entrada.close();
        } catch (Exception e){
            e.printStackTrace();
        }

        return nuevoTexto;
    }

}
