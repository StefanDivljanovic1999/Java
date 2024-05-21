import labis.cvorovi.CvorDSListe;
import labis.cvorovi.CvorJSListe;
import labis.liste.ADSLista;
import labis.liste.AJSLista;

public class Trening extends AJSLista{
int niz[]= new int[14];
int brojac=0;
	public void dodaj_na_kraj(int el) {
		if(prvi==null) {
			prvi= new CvorJSListe(el, prvi);
			return;
		}
		CvorJSListe pom=prvi;
		while(pom.sledeci!=null) {
			pom=pom.sledeci;
		}
		pom.sledeci= new CvorJSListe(el,  null);
	}
	
	public void ispisi() {
		CvorJSListe pom=prvi;
		while(pom!=null) {
			System.out.print(" " +pom.podatak);
			pom=pom.sledeci;
		}
	}
	
	public void izbaci_pre_tog_elementa(int br) {
		if(prvi==null) {
			System.out.println("Prazna lista!!!");
			return;
		}
	 CvorJSListe pom=prvi;
	 if(br==pom.sledeci.podatak) {
		 prvi=prvi.sledeci;
		 return;
	 }
	 if(pom.podatak==br) {
		 System.out.println("Element u zagradi mora biti barem 2. na listi!!!");
		 return;
	 }
	 if(pom.sledeci.sledeci.podatak==br) {
		 prvi.sledeci=prvi.sledeci.sledeci;
		 return;
	 }
	 while(pom.sledeci.sledeci.podatak!=br) {
		 pom=pom.sledeci;
	 }
	 
	 pom.sledeci=pom.sledeci.sledeci;
	}
	
	
	
	public int br_el() {
		int brojac=0;
		CvorJSListe pom=prvi;
		while(pom!=null) {
			brojac++;
			pom=pom.sledeci;
		}
		return brojac;
	}
	
	public void dodaj_u_niz(int el) {
		if(brojac<niz.length) {
			niz[brojac++]=el;
		}
	}
	
	public void ispisi_niz() {
		System.out.println("Elementi niza: ");
		for (int i = 0; i <brojac; i++) {
			System.out.print(" " +niz[i]);
		}
	}
	
	public void negativni_na_pocetku() {
		int noviNiz[]= new int[niz.length];
		int br=0;
		for (int i = 0; i < niz.length; i++) {
			if(niz[i]<0) {
				noviNiz[br++]=niz[i];
				
			} else {
				i++;
			}
			
		}
		for (int i = br; i <brojac; i++) {
			if(niz[i]>0)
			noviNiz[br++]=niz[i];
		}
		for (int i = 0; i <br; i++) {
			System.out.print(" "+noviNiz[i]);
		}
	}
}
