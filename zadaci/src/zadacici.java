import labis.cvorovi.CvorJSListe;
import labis.exception.LabisException;
import labis.liste.AJSLista;

public class zadacici extends AJSLista {
	int najmanji_element() {
		CvorJSListe pom=prvi;
		int min= Integer.MAX_VALUE;
		while(pom!=null) {
			if(pom.podatak<min) {
				min=pom.podatak;
			}
			pom=pom.sledeci;
		}
		return min;
	}
	void izbaci_sa_kraja() {
		CvorJSListe pom= prvi;
		while(pom.sledeci.sledeci!=null) {
			pom=pom.sledeci;
		}
		pom.sledeci=null;
	}
	void izbaci_element_posle_najmanjeg() throws LabisException {
		if(prvi==null) {
			throw new LabisException();
		}
		CvorJSListe pom= prvi;
		
		while(pom.podatak!=najmanji_element()) {
			
			pom=pom.sledeci;
			
		}
		 if(pom.sledeci!=null) {
		pom.sledeci=pom.sledeci.sledeci;
		 } else {
			izbaci_sa_kraja();;
		 }
	}
	
	void dodaj_na_pocetak(int p) {
		CvorJSListe novi= new CvorJSListe(p, prvi);
		prvi=novi;
	}
	
	void ispisi_listu() {
		CvorJSListe pom=prvi;
		while (pom!=null) {
	System.out.print(" "+pom.podatak);
			pom=pom.sledeci;
			}
	}
	
	void invertuj_listu() {
		CvorJSListe pom=prvi;
		while(pom!=null) {
			
		}
	}
	
	int brojac=0;
	int niz[]= new int[100];
	void ubaci_u_niz(int p) {
		if(brojac<niz.length)
		niz[brojac++]=p;
	}
	void ispisi_niz() {
		for (int i = 0; i < brojac; i++) {
			System.out.print(" "+niz[i]);
		}
	}
	void pretvori_iz_liste_u_niz() {
		CvorJSListe pom= prvi;
		while(pom!=null) {
			ubaci_u_niz(pom.podatak);
			pom=pom.sledeci;
		}
	}
	
}
