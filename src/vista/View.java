package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controlador.Listener;


public class View extends JFrame{
	
	private Listener listener;
	
	public JLabel label1=new JLabel();
	public JLabel label2=new JLabel();
	public JLabel label3=new JLabel();
	
	public JButton DICI=new JButton("DC"); 
	public JButton MARVEL=new JButton("Marvel");  
	public JButton OSITO=new JButton("Osito");

	
	public View(Listener control) {
		this.listener=control;
		init();
		
		
		
		
		
		
		this.add(DICI);
	    this.add(MARVEL);
	    this.add(OSITO);
	    this.add(label1);
	    this.add(label2);
	    this.add(label3);
	    this.setVisible(true);
		
	}
	public void init() {
		this.setSize(400, 400);
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
