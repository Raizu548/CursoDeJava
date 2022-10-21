package InterfcesGraficas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrimerVentana extends JFrame {

    private JPanel panelPrincipal;
    private JLabel TextoPrincipal;
    private JTextField textoEscrito;
    private JButton copiarYPegarButton;
    private JButton limpiarButton;
    private JTextField TextoPegado;

    public PrimerVentana(){
        setSize(640,640);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panelPrincipal);

        copiarYPegarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nuevoTexto = textoEscrito.getText();
                TextoPegado.setText(nuevoTexto);
            }
        });

        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextoPegado.setText("");
                textoEscrito.setText("");
            }
        });


    }

}
