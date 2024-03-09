package controlador;

import vista.View;
import modelito.Modelo;


public class Listener{
	private View vista;
	private Modelo modelo;
	
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	
	public Listener() {
		vista.getDICI().addActionListener(e -> dc());
		vista.getMARVEL().addActionListener(e -> mv());
		vista.getOSITO().addActionListener(e -> Osito());
		
	}
	
	public void setView(View vista) {
		this.vista = vista;
	}
	
	private void dc() {
		modelo.dc();
	}
	private void mv() {
		modelo.mv();
	}
	private void Osito() {
		modelo.Osito();
	}
	

}
