package InterfcesGraficas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.util.ArrayList;

public class Ventana extends JFrame{

    static ArrayList<Pais> pais = new ArrayList<>();
    Archivo archivo = new Archivo();
    private DefaultListModel<Pais> modeloPersona = new DefaultListModel<>();
    private static DefaultTableModel modeloPais = new DefaultTableModel();
    private String[] columna = {"Nombre", "Capital"};



    private JPanel panelPrincipal;
    private JButton botonGuardar;
    private JTextArea textArea;
    private JList listaPersonas;
    private JButton botonEliminar;
    private JTable tablePaises;
    private JButton extraButton;
    private JLabel label1;


    public Ventana(){
        setSize(600,400);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panelPrincipal);

        if (archivo.lectura() == null){
            pais = new ArrayList<>();
        } else {
            pais.addAll(archivo.lectura());
        }

        System.out.println("Se crea la ventana principal");
        modeloPais.setColumnIdentifiers(columna);
        listaPersonas.setModel(modeloPersona);
        tablePaises.setModel(modeloPais);
        mostrarLista();
        mostrarTabla();


        botonGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                VentanaAgregarPais nuevaVentana = new VentanaAgregarPais();

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

                if (tablePaises.getSelectedRow() != -1){
                    pais.remove(tablePaises.getSelectedRow());
                    limpiarTabla();
                    mostrarLista();
                    mostrarTabla();
                    System.out.println("Borrado");
                }


            }
        });

        tablePaises.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println(tablePaises.getSelectedRow());
                Pais paisSelecionado = pais.get(tablePaises.getSelectedRow());

                //textFieldNombre.setText(paisSelecionado.getNombre());
                //textFieldCapital.setText(paisSelecionado.getCapital());
            }
        });

        extraButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (tablePaises.getSelectedRow() != -1){
                    Pais paisSeleccionado = pais.get(tablePaises.getSelectedRow());

                    VentanaEmergente ventanaEmergente = new VentanaEmergente(paisSeleccionado);
                } else {
                    JOptionPane.showMessageDialog(null,"Debe selecionar un elemento de la tabla!");
                }


            }
        });


        tablePaises.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("Tabla clicked");
                //extraButton.setEnabled(true);
            }
        });

        panelPrincipal.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("Panel clicked");
                //extraButton.setEnabled(false);
                tablePaises.clearSelection();
            }
        });

    }



    // Metodos
    private void mostrarLista(){
        System.out.println("Mostrar Lista");
        modeloPersona.removeAllElements();
        for (Pais pais : Ventana.pais) {
            modeloPersona.addElement(pais);
            //System.out.println(pais.toString());
        }
        System.out.println("----");
    }

    public static void mostrarTabla(){

        for (Pais p:pais) {
            String[] datos = {p.getNombre(),p.getCapital()};
            //System.out.println(datos[0]+ " " + datos[1]);
            modeloPais.addRow(datos);
        }
    }

    public static void limpiarTabla(){
        for (int i = 0; i < pais.size(); i++){
            modeloPais.removeRow(0);
        }
    }

    public static void actualizarTabla(){
        for (int i = 0; i < pais.size(); i++){
            modeloPais.removeRow(0);
        }

        mostrarTabla();
    }

}
