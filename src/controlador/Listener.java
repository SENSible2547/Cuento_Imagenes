package controlador;

import vista.View;

import java.util.ArrayList;

import modelito.Desenlace;
import modelito.Imagenes;
import modelito.Inicio;
import modelito.Modelo;
import modelito.Nudo;


public class Listener{
	private View vista;
	private Modelo modelo;
	
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	public void setView(View vista) {
		this.vista = vista;
	}
	
	public Listener() {
		vista.getDICI().addActionListener(e -> dc());
		vista.getMARVEL().addActionListener(e -> mv());
		vista.getOSITO().addActionListener(e -> Osito());
		
	}
	
	
	
	private void dc() {
		Inicio inicio = modelo.getInicio();
        Nudo nudo = modelo.getNudo();
        Desenlace desenlace = modelo.getDesenlace();
        Imagenes imagenes = modelo.getImagenes();

        String datosInicio = inicio.getTipo();
        String datosNudo = nudo.getTipo();
        String datosDesenlace = desenlace.getTipo();
        ArrayList<String> datosImagenes = imagenes.getTipo();

        vista.actualizarDatos(datosInicio, datosNudo, datosDesenlace, datosImagenes);
	}
	private void mv() {
		modelo.mv();
	}
	private void Osito() {
		modelo.Osito();
	}
	

}
