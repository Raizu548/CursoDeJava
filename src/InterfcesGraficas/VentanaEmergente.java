package InterfcesGraficas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaEmergente extends JFrame {
    private JButton cancelarButton;
    private JButton aceptarButton;
    private JLabel Label1;
    private JPanel PanelEmergente;
    private JTextField textFieldPais;
    private JTextField textFieldCapital;
    private JLabel Label2;


    public VentanaEmergente(Pais paisRecibido){
        setSize(400,200);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setContentPane(PanelEmergente);

        textFieldPais.setText(paisRecibido.getNombre());
        textFieldCapital.setText(paisRecibido.getCapital());

        // Acctiones de Boton
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paisRecibido.setNombre(textFieldPais.getText());
                paisRecibido.setCapital(textFieldCapital.getText());
                System.out.println(paisRecibido.toString());

                dispose();
            }
        });
    }
}
