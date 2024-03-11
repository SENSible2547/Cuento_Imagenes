package vista;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controlador.Listener;


public class View extends JFrame{
	
	private Listener listener;
	
	public JLabel label1=new JLabel();
	public JLabel label2=new JLabel();
	public JLabel label3=new JLabel();
//	public JLabel labelImagenes=new JLabel();
	
	public JButton DICI=new JButton("DC"); 
	public JButton MARVEL=new JButton("Marvel");  
	public JButton OSITO=new JButton("Osito");
	
	public void actualizarDatos(String inicio, String nudo, String desenlace, ArrayList<String> imagenes) {
		label1.setText("Inicio: " + inicio);
        label2.setText("Nudo: " + nudo);
        label3.setText("Desenlace: " + desenlace);
        // Suponiendo que tienes un JLabel para mostrar imágenes
        // Si tienes una clase específica para mostrar imágenes, debes adaptarlo aquí
        
//        labelImagenes.setIcon(new ImageIcon(imagenes));
		
	}
	
	public View(Listener control) {
		this.listener=control;
		init();
		JPanel panel = new JPanel();
		JLabel label1,label2,label3,DICI,MARVEL, OSITO;
		
		
		
		
	    this.setVisible(true);
		
	}
	public void init() {
		this.setSize(1500, 800);
		this.setLayout(null);

	}
	
	public Listener getListener() {
		return listener;
	}
	
	/**
	 * @return the dc
	 */
	public JButton getDICI() {
		return DICI;
	}

	/**
	 * @return the mv
	 */
	public JButton getMARVEL() {
		return MARVEL;
	}
	
	/**
	 * @return the osito
	 */
	public JButton getOSITO() {
		return OSITO;
	}
	

	
	
	

}
