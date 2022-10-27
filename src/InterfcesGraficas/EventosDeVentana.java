package InterfcesGraficas;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventosDeVentana implements WindowListener {
    private Archivo archivo = new Archivo();

    @Override
    public void windowOpened(WindowEvent windowEvent) {
        //Ventana.personas.addAll(archivo.lectura());
        System.out.println("Ventana Iniciando");
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        archivo.escribir(Ventana.pais);
        System.out.println("Ventana Cerrandose");
    }

    @Override
    public void windowClosed(WindowEvent windowEvent) {

    }

    @Override
    public void windowIconified(WindowEvent windowEvent) {

    }

    @Override
    public void windowDeiconified(WindowEvent windowEvent) {

    }

    @Override
    public void windowActivated(WindowEvent windowEvent) {

    }

    @Override
    public void windowDeactivated(WindowEvent windowEvent) {

    }
}
