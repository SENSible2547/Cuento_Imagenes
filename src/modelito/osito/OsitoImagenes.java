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
		imagen.add("https://cdn-3.expansion.mx/dims4/default/b32d1ad/2147483647/strip/true/crop/624x328+0+12/resize/1200x630!/quality/90/?url=https:%2F%2Fcherry-brightspot.s3.amazonaws.com%2Fmedia%2F2012%2F06%2F01%2Flos-ositos-cariositos-cgi.jpg") ;
		//564x684
		imagen.add("https://1.bp.blogspot.com/-AKSuPhW8nkk/WRbz-OiGJsI/AAAAAAAAAb4/cqqOiqGJeFc2BMB0Q_RSkCvv-XtaC-HCwCLcB/s1600/OSITO.png") ;
		//630x720
		return imagen;
	}
	
}

