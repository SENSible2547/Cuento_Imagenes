package modelito;

import modelito.dc.FactoryDc;
import modelito.marvel.FactoryMarvel;
import modelito.osito.FactoryOsito;

public class Modelo {
    private Abstractfactory factory;

    public Modelo() {
     
    }

    public void setFactory(Abstractfactory factory) {
        this.factory = factory;
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

    // Métodos para configurar la fábrica específica
    public void dc() {
        setFactory(new FactoryDc());
    }

    public void mv() {
        setFactory(new FactoryMarvel());
    }

    public void Osito() {
        setFactory(new FactoryOsito());
    }
}
