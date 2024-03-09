package modelito.osito;

import java.util.ArrayList;

import modelito.Imagenes;

public class OsitoImagenes extends Imagenes{
	@Override
	public ArrayList<String> getTipo() {
		// TODO Auto-generated method stub
		ArrayList<String> imagen =new ArrayList<String>();
		imagen.add("https://i.pinimg.com/564x/53/35/67/533567c73e88191b5d5594fd73231ed9.jpg") ;
		//482x640
		imagen.add("https://www.yourdecoration.com/cdn/shop/products/pyramid-pp32684-marvel-comics-here-come-the-heroes-poster-61x91-5cm_80a67bd7-3e99-4da2-a1e4-ce179a010354_500x.jpg?v=1697505658") ;
		//564x684
		imagen.add("https://1.bp.blogspot.com/-AKSuPhW8nkk/WRbz-OiGJsI/AAAAAAAAAb4/cqqOiqGJeFc2BMB0Q_RSkCvv-XtaC-HCwCLcB/s1600/OSITO.png") ;
		//630x720
		return imagen;
	}
	
}

