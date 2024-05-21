import labis.cvorovi.CvorJSListe;
import labis.liste.AJSLista;

public class jun2019 extends AJSLista{
	int niz[]= new int[20];
	int brojac=0;
	public void dodaj_u_niz(int el) {
		if(brojac<=niz.length) {
			niz[brojac++]=el;
		}
	}
	
	public void ispisi_niz() {
		for (int i = 0; i <brojac; i++) {
			System.out.print(" " +niz[i]);
		}
	}
	
	public void ispisi_niz1(int n[], int b) {
		for (int i = 0; i <b; i++) {
			System.out.print(" "+n[i]);
		}
	}
	
	public void prepakuj_niz(int k) {
		int j=0;
		int noviNiz[]= new int[niz.length];
		for (int i = brojac-k; i < brojac; i++) {
			//i=0;
			noviNiz[j++]=niz[i];
		}

		for (int i = 0; i <brojac-k; i++) {
	      noviNiz[j++]=niz[i];
		}
		ispisi_niz1(noviNiz, brojac);
	}
	
	
	
	public void dodaj_na_pocetak(int broj) {
		prvi= new CvorJSListe(broj, prvi);
	}
	
	public void ispisi() {
		CvorJSListe pom=prvi;
		while(pom!=null) {
			System.out.print(" "+pom.podatak);
			pom=pom.sledeci;
		}
	}
	
	public int zbir_liste() {
		CvorJSListe pom=prvi;
		int zbir=0;
		while(pom!=null) {
			zbir+=pom.podatak;
			pom=pom.sledeci;
		}
		return zbir;
	}
	
	public void izbaci_iz_liste(int p) {
		CvorJSListe pom=prvi;
		if(prvi.podatak==p) {
			prvi=prvi.sledeci;
			return;
		}
		if(prvi==null) {
			return;
		}
		if(!postoji(p)) {
			System.out.println("Element ne postoji u listi!");
			return;
		}
		
		while(pom.sledeci.podatak!=p) {
			pom=pom.sledeci;
		}
		pom.sledeci=pom.sledeci.sledeci;
	}
	
	public boolean postoji(int el) {
	CvorJSListe pom=prvi;
	while(pom!=null) {
		if(pom.podatak==el) {
			return true;
		}
		pom=pom.sledeci;
	}
	return false;
	}
	
	public void izbaci_kvadrat_manji_od_zbira() {
		CvorJSListe pom=prvi;
		int zbir= zbir_liste();
		while(pom!=null) {
			if(pom.podatak*pom.podatak<zbir) {
			
			izbaci_iz_liste(pom.podatak);
			}
			pom=pom.sledeci;
		}
	}
	
	
}
