package modelito.marvel;

import modelito.Abstractfactory;

import modelito.Desenlace;
import modelito.Imagenes;
import modelito.Inicio;
import modelito.Nudo;

public class FactoryMarvel extends Abstractfactory{
	@Override
	public Inicio getInicio() {
		// TODO Auto-generated method stub
		return new MarvelInicio();
	}@Override
	public Nudo getNudo() {
		// TODO Auto-generated method stub
		return new MarvelNudo();
	}@Override
	public Desenlace getDesenlace() {
		// TODO Auto-generated method stub
		return new MarvelDesenlace();
	}@Override
	public Imagenes getImagenes() {
		// TODO Auto-generated method stub
		return new MarvelImagenes();
	}

}
