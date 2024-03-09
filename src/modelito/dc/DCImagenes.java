package modelito.dc;

import java.util.ArrayList;

import modelito.Imagenes;

public class DCImagenes extends Imagenes{
	@Override
	public ArrayList<String> getTipo() {
		// TODO Auto-generated method stub
		ArrayList<String> imagen =new ArrayList<String>();
		imagen.add("https://cdn.agilitycms.com/stickeryou/ProductLandingPages/FeaturedImages/DCComics_720x720_20210108172248_0.jpg?format=auto&w=372&h=372&d=20242024") ;
		//372x372
		imagen.add("https://www.akiracomics.com/imagenes/poridentidad?identidad=8c292853-11f4-408e-a869-0bda5f2b382d&ancho=850&alto=") ;
		//850x500
		imagen.add("https://static.wikia.nocookie.net/comicdc/images/1/18/Justice_League_Vol_2_1.jpg/revision/latest?cb=20130515000341&path-prefix=es") ;
		//418x640
		return imagen;
	}

}
