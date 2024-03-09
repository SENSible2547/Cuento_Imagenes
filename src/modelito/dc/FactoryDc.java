package modelito.dc;

import modelito.Abstractfactory;
import modelito.Desenlace;
import modelito.Imagenes;
import modelito.Inicio;
import modelito.Nudo;

public class FactoryDc extends Abstractfactory{
	@Override
	public Inicio getInicio() {
		// TODO Auto-generated method stub
		return new DCInicio();
	}@Override
	public Nudo getNudo() {
		// TODO Auto-generated method stub
		return new DCNudo();
	}@Override
	public Desenlace getDesenlace() {
		// TODO Auto-generated method stub
		return new DCDesenlace();
	}@Override
	public Imagenes getImagenes() {
		// TODO Auto-generated method stub
		return new DCImagenes();
	}

}
