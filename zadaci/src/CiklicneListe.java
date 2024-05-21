
import labis.cvorovi.CvorDSListe;
import labis.cvorovi.CvorJSListe;
import labis.liste.AJSLista;

public class CiklicneListe extends AJSLista {



	public void ispisi() {
		if(prvi==null) {
			return ;
		}
		CvorJSListe pom=prvi;
		while(pom.sledeci!=prvi) {
			System.out.print(" " +pom.podatak);
			pom=pom.sledeci;
		}
		System.out.print(" "+pom.podatak);
	}
	
	public CvorJSListe vratiPoslednji() {
		if(prvi==null) {
			return null;
		}
		CvorJSListe pom=prvi;
		while(pom.sledeci!=prvi) {
			pom=pom.sledeci;
		}
		return pom;
	}
	
	public void ubaci_prvi(int p) {
		if(prvi==null) {
			prvi= new CvorJSListe(p, prvi);
			prvi.sledeci=prvi;
			return;
			}
		CvorJSListe pom=prvi;
		while(pom.sledeci!=prvi) {
			pom=pom.sledeci;
		}
		prvi= new CvorJSListe(p, prvi);
		pom.sledeci=prvi;
	}
	
	public int izbaci_poslednji() {
		CvorJSListe pom=prvi;
		while(pom.sledeci.sledeci!=prvi) {
			pom=pom.sledeci;
		}
		pom.sledeci=pom.sledeci.sledeci;
		return pom.podatak;
	}
}
