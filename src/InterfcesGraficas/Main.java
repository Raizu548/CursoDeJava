package InterfcesGraficas;

import javax.swing.*;

public class Main {

    public static void main(String[] args){
        Ventana ventana = new Ventana();

        ventana.addWindowListener(new EventosDeVentana());
    }
}
