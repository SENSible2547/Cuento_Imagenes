package modelito.marvel;

import java.util.ArrayList;

import modelito.Imagenes;

public class MarvelImagenes extends Imagenes{
	public ArrayList<String> getTipo() {
		// TODO Auto-generated method stub
		ArrayList<String> imagen =new ArrayList<String>();
		imagen.add("https://casacolombianadelcomic.com/gestion/uploads/product/147/9789877246001.jpg") ;
		//426x600
		imagen.add("https://www.yourdecoration.com/cdn/shop/products/pyramid-pp32684-marvel-comics-here-come-the-heroes-poster-61x91-5cm_80a67bd7-3e99-4da2-a1e4-ce179a010354_500x.jpg?v=1697505658") ;
		//500x750
		imagen.add("https://m.media-amazon.com/images/I/61KFLylOgPL.jpg") ;
		//325x500
		return imagen;
	}

}
