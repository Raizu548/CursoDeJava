package Archivos;

import java.io.FileReader;

public class Lectura {

    public static void leer(){
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
}
