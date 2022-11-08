package InterfcesGraficas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.util.ArrayList;

public class Ventana extends JFrame{

    static ArrayList<Pais> pais = new ArrayList<>();
    Archivo archivo = new Archivo();
    private DefaultListModel<Pais> modeloPersona = new DefaultListModel<>();
    private DefaultTableModel modeloPais = new DefaultTableModel();
    private String[] columna = {"Nombre", "Capital"};

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
        modeloPais.setColumnIdentifiers(columna);
        listaPersonas.setModel(modeloPersona);
        tablePaises.setModel(modeloPais);
        mostrarLista();
        mostrarTabla();


        botonGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String nombre = textFieldNombre.getText();
                String capital = textFieldCapital.getText();
                pais.add(new Pais(nombre,capital));
                textFieldNombre.setText("");

                // Mostrar en la lista
                mostrarLista();
                mostrarTabla();
            }
        });

        botonEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println(listaPersonas.getSelectedIndex());
                System.out.println(tablePaises.getSelectedRow());

                if (tablePaises.getSelectedRow() != -1){
                    String paisin = pais.get(tablePaises.getSelectedRow()).toString();
                }
                /*
                if (listaPersonas.getSelectedIndex() != -1){
                    pais.remove(listaPersonas.getSelectedIndex());
                    mostrarLista();
                    mostrarTabla();
                }

                 */
            }
        });

        tablePaises.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println(tablePaises.getSelectedRow());
                Pais paisSelecionado = pais.get(tablePaises.getSelectedRow());

                textFieldNombre.setText(paisSelecionado.getNombre());
                textFieldCapital.setText(paisSelecionado.getCapital());
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

        for (Pais p:pais) {
            String[] datos = {p.getNombre(),p.getCapital()};
            System.out.println(datos[0]+ " " + datos[1]);
            modeloPais.addRow(datos);
        }
    }

}
