package modelito;

import modelito.dc.FactoryDc;
import modelito.marvel.FactoryMarvel;
import modelito.osito.FactoryOsito;



public class Modelo {
	Abstractfactory factory =null;
	
	Inicio i=factory.getInicio();
	Nudo n=factory.getNudo();
	Desenlace d=factory.getDesenlace();
	Imagenes img=factory.getImagenes();
	
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
	

}
