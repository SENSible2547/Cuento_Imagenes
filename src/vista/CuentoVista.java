package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class CuentoVista extends JFrame {
    private JButton btnMarvel = new JButton("MARVEL");
    private JButton btnDc = new JButton("DC");
    private JButton btnOsito = new JButton("Osito");
    private JTextArea txtInicio = new JTextArea(5, 20);
    private JTextArea txtNudo = new JTextArea(5, 20);
    private JTextArea txtDesenlace = new JTextArea(5, 20);
    private JPanel panelImagenes = new JPanel(new FlowLayout()); 
    
    public CuentoVista() {
        super("Cuentos de Fábrica");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panelNorte = new JPanel();
        panelNorte.add(btnMarvel);
        panelNorte.add(btnDc);
        panelNorte.add(btnOsito);

        JPanel panelCentro = new JPanel();
        panelCentro.setLayout(new GridLayout(3, 1));
        panelCentro.add(new JScrollPane(txtInicio));
        panelCentro.add(new JScrollPane(txtNudo));
        panelCentro.add(new JScrollPane(txtDesenlace));

        add(panelNorte, BorderLayout.NORTH);
        add(panelCentro, BorderLayout.CENTER);
        add(panelImagenes, BorderLayout.SOUTH);

        txtInicio.setEditable(false);
        txtNudo.setEditable(false);
        txtDesenlace.setEditable(false);
    }

    public void setInicio(String inicio) {
        txtInicio.setText(inicio);
    }

    public void setNudo(String nudo) {
        txtNudo.setText(nudo);
    }

    public void setDesenlace(String desenlace) {
        txtDesenlace.setText(desenlace);
    }

    public void setImagenes(ArrayList<String> urls) {
        panelImagenes.removeAll(); // Remueve todas las imágenes anteriores antes de agregar las nuevas

        for (String url : urls) {
            try {
                ImageIcon imagen = new ImageIcon(new URL(url));
                Image image = imagen.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
                JLabel lblImagen = new JLabel(new ImageIcon(image));
                panelImagenes.add(lblImagen);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        panelImagenes.revalidate();
        panelImagenes.repaint();
    }

    public void addMarvelButtonListener(ActionListener listenForMarvelButton) {
        btnMarvel.addActionListener(listenForMarvelButton);
    }

    public void addDcButtonListener(ActionListener listenForDcButton) {
        btnDc.addActionListener(listenForDcButton);
    }

    public void addOsitoButtonListener(ActionListener listenForOsitoButton) {
        btnOsito.addActionListener(listenForOsitoButton);
    }
   
}
