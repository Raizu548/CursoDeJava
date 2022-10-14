package Archivos;

import java.io.FileReader;
import java.io.FileWriter;

public class Archivo {

    public void escribir(String texto){

        String nuevoTexto = guardarTexto();
        nuevoTexto += texto;

        try {
            FileWriter escritura = new FileWriter("D:\\Luis\\TSP\\Laboratorio de programacion 2\\Ronda 2\\prueba.txt");

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
            entrada = new FileReader("D:\\Luis\\TSP\\Laboratorio de programacion 2\\Ronda 2\\prueba.txt");

            int caracter = entrada.read();
            char letra = (char)caracter;

            while (caracter != -1){
                System.out.print(letra);
                caracter = entrada.read();
                letra = (char)caracter;
            }

            entrada.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void limpiar(){
        //String nuevoTexto = "";
        try {
            FileWriter escritura = new FileWriter("D:\\Luis\\TSP\\Laboratorio de programacion 2\\Ronda 2\\prueba.txt");

            escritura.write("");

            escritura.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private String guardarTexto(){
        String nuevoTexto = "";

        try {
            FileReader entrada = new FileReader("D:\\Luis\\TSP\\Laboratorio de programacion 2\\Ronda 2\\prueba.txt");

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
