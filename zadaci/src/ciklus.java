import labis.cvorovi.CvorJSListe;
import labis.liste.AJSLista;

public class ciklus extends AJSLista {
public void ispisi() {
	CvorJSListe pom=prvi;
	while(pom.sledeci!=prvi) {
		System.out.print(" " +pom.podatak);
		pom=pom.sledeci;
	}
}
	public void ubaci_prvi(int p) {
	if(prvi==null) {
		prvi= new CvorJSListe(p, null);
		prvi.sledeci=prvi;
		return;
	}
	CvorJSListe poslednji=prvi;
	while(poslednji.sledeci!=prvi) {
		poslednji=poslednji.sledeci;
	}
	prvi= new CvorJSListe(p, prvi);
	poslednji.sledeci=prvi;
	}
public int izbaci_poslednji() {
	if(prvi==null) {
		return -1;
	}
	CvorJSListe pom=prvi;
	while(pom.sledeci.sledeci!=null) {
		pom=pom.sledeci;
	}
	int p= pom.sledeci.sledeci.podatak;
	pom.sledeci=prvi;
	return p;
}
}
