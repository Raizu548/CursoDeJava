package InterfcesGraficas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Ventana extends JFrame{

    static ArrayList<Pais> pais = new ArrayList<>();
    Archivo archivo = new Archivo();
    private DefaultListModel<Pais> modeloPersona = new DefaultListModel<>();
    private DefaultTableModel modeloPais = new DefaultTableModel();

    private JPanel panelPrincipal;
    private JLabel labelTextNombre;
    private JTextField textFieldNombre;
    private JButton botonGuardar;
    private JTextArea textArea;
    private JList listaPersonas;
    private JButton botonEliminar;
    private JLabel labelTextCapital;
    private JTextField textFieldCapital;
    private JTable tablePaises;


    public Ventana(){
        setSize(600,400);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panelPrincipal);

        pais.addAll(archivo.lectura());
        listaPersonas.setModel(modeloPersona);
        mostrarLista();
        //mostrarTabla();


        botonGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String nombre = textFieldNombre.getText();
                String capital = textFieldCapital.getText();
                pais.add(new Pais(nombre,capital));
                textFieldNombre.setText("");

                // Mostrar en la lista
                mostrarLista();
                //mostrarTabla();
            }
        });

        botonEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println(listaPersonas.getSelectedIndex());

                if (listaPersonas.getSelectedIndex() != -1){
                    pais.remove(listaPersonas.getSelectedIndex());
                    mostrarLista();
                }
            }
        });
    }



    // Metodo privado
    public void mostrarLista(){
        System.out.println("Mostrar Lista");
        modeloPersona.removeAllElements();
        for (Pais pais : Ventana.pais) {
            modeloPersona.addElement(pais);
            System.out.println(pais.toString());
        }
        System.out.println("----");
    }

    public void mostrarTabla(){

        int i = 0;
        for (Pais pais: pais){
            modeloPais.setValueAt(pais.getNombre(),i,1);
            modeloPais.setValueAt(pais.getCapital(),i,2);
            i++;
        }
    }

}
