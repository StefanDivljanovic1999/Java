import labis.cvorovi.CvorDSListe;
import labis.liste.ADSLista;

public class dsl extends ADSLista {

	public void ubaci_element_na_pocetak(int el) {
		prvi= new CvorDSListe(el, null, prvi);
	}
	
	public void ispisi_listu() {
		CvorDSListe pom=prvi;
		while(pom!=null) {
			System.out.print(" " +pom.podatak);
			pom=pom.sledeci;
		}
	}
	
	public int min_liste() {
		CvorDSListe pom=prvi;
		int min=Integer.MAX_VALUE;
		while(pom!=null) {
			if(pom.podatak<min) {
				min=pom.podatak;
			}
			pom=pom.sledeci;
		}
		return min;
	}
	
	public void izbac_zadnji_min() {
		CvorDSListe pom=prvi;
	while(pom.sledeci.podatak!=min_liste()) {
		pom=pom.sledeci;
	}
	
	pom.sledeci=pom.sledeci.sledeci;
	pom.sledeci.prethodni=pom;
	
	
	}
}
