package modelito.osito;

import modelito.Abstractfactory;
import modelito.Desenlace;
import modelito.Imagenes;
import modelito.Inicio;
import modelito.Nudo;

public class FactoryOsito extends Abstractfactory{
	@Override
	public Inicio getInicio() {
		// TODO Auto-generated method stub
		return new OsitoInicio();
	}@Override
	public Nudo getNudo() {
		// TODO Auto-generated method stub
		return new OsitoNudo();
	}@Override
	public Desenlace getDesenlace() {
		// TODO Auto-generated method stub
		return new OsitoDesenlace();
	}@Override
	public Imagenes getImagenes() {
		// TODO Auto-generated method stub
		return new OsitoImagenes();
	}

}
