package modelito;

import modelito.dc.FactoryDc;
import modelito.marvel.FactoryMarvel;
import modelito.osito.FactoryOsito;



public class Modelo {
	Abstractfactory factory =null;
	
	
	public Abstractfactory dc() {
		factory=new FactoryDc();
		return factory;
	}
	public Abstractfactory mv() {
		factory=new FactoryMarvel();
		return factory;
	}
	public Abstractfactory Osito() {
		factory=new FactoryOsito();
		return factory;
	}

	 public Inicio getInicio() {
	        return factory.getInicio();
	    }

	    public Nudo getNudo() {
	        return factory.getNudo();
	    }

	    public Desenlace getDesenlace() {
	        return factory.getDesenlace();
	    }

	    public Imagenes getImagenes() {
	        return factory.getImagenes();
	    }
}
