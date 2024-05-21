import labis.cvorovi.CvorDSListe;
import labis.cvorovi.CvorJSListe;
import labis.exception.LabisException;
import labis.liste.AJSLista;

public class ProbniKolokvijum extends AJSLista {
	
	public void ubaci_na_pocetak(int p) {
		 if(prvi==null) {
		  prvi= new CvorJSListe(p, null);
		  return;
	  }
	  prvi= new CvorJSListe(p, prvi);
	}
	
	public void ispisi() {
		CvorJSListe pom=prvi;
		while(pom!=null) {
			System.out.print(" " +pom.podatak);
			pom=pom.sledeci;
		}
	}
	
	public void ubaci_na_kraj(int p) {
	
		if(prvi==null) {
			prvi= new CvorJSListe(p, null);
			return;
		}
		CvorJSListe pom=prvi;
	while(pom.sledeci!=null) {
		pom=pom.sledeci;
	}
      CvorJSListe novi= new CvorJSListe(p, null);
      pom.sledeci=novi;
	}
	
	public void ubaciPrePrvogKojiNijeVeci(int p) {
		CvorJSListe pom=prvi;
		if(prvi==null) {
		 ubaci_na_pocetak(p);
		}
		while(pom.sledeci.podatak>p) {
			pom=pom.sledeci;
		}
		if(pom.podatak==prvi.podatak) {
			ubaci_na_pocetak(p);
			return;
		}
		pom.sledeci= new CvorJSListe(p, pom.sledeci);
	}
	
	public int broj_Elemenata() {
		CvorJSListe pom=prvi;
		int brojac=0;
		while(pom!=null) {
			brojac++;
			pom=pom.sledeci;
		}
		return brojac;
	}
	
	public int srednji_Element() {
		CvorJSListe pom=prvi;
		int i=0;
		while(i!=broj_Elemenata()/2) {
			pom=pom.sledeci;
			i++;
		}
		return pom.podatak;
	}
	
	public int izbaci_srednji_element() throws LabisException {
		if(prvi==null || broj_Elemenata()<=2) {
			System.out.println("Greska!");
			return -1;
		}
		
		
		
		CvorJSListe pom=prvi;
		while(pom.sledeci.podatak!=srednji_Element()) {
			pom=pom.sledeci;
		}
		int c= pom.sledeci.podatak;
		pom.sledeci=pom.sledeci.sledeci;
		return c;
	}
}
