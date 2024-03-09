package main;

import controlador.Listener;
import modelito.Modelo;
import vista.View;

public class Main {
	public static void main(String[] args) {
		Modelo m=new Modelo();
		Listener ls=new Listener();
		View v=new View(ls);
		ls.setView(v);
		ls.setModelo(m);
	}
	
	

}
