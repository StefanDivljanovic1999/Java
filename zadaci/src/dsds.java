import labis.cvorovi.CvorDSListe;
import labis.exception.LabisException;
import labis.liste.ADSLista;

public class dsds extends ADSLista {

	public void ispisi_listu() {
		while(prvi!=null) {
			System.out.print(" " +prvi.podatak);
			prvi=prvi.sledeci;
		}
	}
	
	public int izbaci_neki(CvorDSListe neki) throws LabisException {
		if(neki==null || prvi==null) {
			throw new LabisException("Greska!");
		}
		if(neki==prvi) {
			prvi=prvi.sledeci;
		}
		CvorDSListe pom=prvi;
		while(pom!=neki) {
			pom=pom.sledeci;
		}
		pom.sledeci= pom.sledeci.sledeci;
		pom.sledeci.prethodni=pom;
		return neki.podatak;
	}
	
	public void ubaci_element_na_pocetak(int el) {
		prvi= new CvorDSListe(el, null, prvi);
	}
	
	public void ubaci_element_na_kraj(int el) {
		if(prvi==null) {
			prvi= new CvorDSListe(el, null, null);
			return;
		}
		CvorDSListe pom= prvi;
		while(pom.sledeci!=null) {
			pom=pom.sledeci;
		}
		pom.sledeci= new CvorDSListe(el, pom, null);
	}
	
	public int br_ponavljanja(int el) {
		int br=0;
		while(prvi!=null) {
			if(prvi.podatak==el) {
				br++;
			}
			prvi=prvi.sledeci;
		}
		return br;
	}
	
	public void min_element() {
	CvorDSListe pom=prvi;
	int min= Integer.MAX_VALUE;
	while(pom!=null) {
		if(pom.podatak<min) {
		min=pom.podatak;
		}
		pom=pom.sledeci;
		
	}
	System.out.println(pom.podatak);
		
	}
	public void izbaci_zadnji_min() {
		CvorDSListe pom=prvi;
		/*while(pom.sledeci.podatak<=min_element()) {
			pom=pom.sledeci;
		}*/
		pom.sledeci=pom.sledeci.sledeci;
		pom.sledeci.prethodni=pom;
	}
}
