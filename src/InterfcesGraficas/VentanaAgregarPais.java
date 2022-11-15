package InterfcesGraficas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaAgregarPais extends JFrame {
    private JTextField textFieldNombre;
    private JTextField textFieldCapital;
    private JButton cancelarButton;
    private JButton aceptarButton;
    private JLabel labelTitulo;
    private JLabel labelNombre;
    private JLabel lableCapital;
    private JPanel PanelAgregarPais;

    public VentanaAgregarPais(){
        setSize(400,200);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setContentPane(PanelAgregarPais);


        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nombre = textFieldNombre.getText();
                String capital = textFieldCapital.getText();

                Ventana.limpiarTabla();
                Ventana.pais.add(new Pais(nombre,capital));
                Ventana.mostrarTabla();

                dispose();
            }
        });

        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();
            }
        });
    }
}
