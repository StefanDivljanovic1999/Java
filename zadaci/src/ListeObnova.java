import labis.cvorovi.CvorJSListe;
import labis.liste.AJSLista;

public class ListeObnova extends AJSLista {

	public void dodaj_na_pocetak(int el) {
		prvi= new CvorJSListe(el, prvi);
	}
	
	public void ispisi_listu() {
		CvorJSListe pom=prvi;
		while(pom!=null) {
			System.out.print(" " +pom.podatak);
			pom=pom.sledeci;
			}
	}

	public void dodaj_na_kraj(int p) {
		if(prvi==null) {
			dodaj_na_pocetak(p);
			return;
		}
	CvorJSListe pom=prvi;
	while(pom.sledeci!=null) {
		pom=pom.sledeci;
	}
	pom.sledeci=new CvorJSListe(p, null);
}

	public void izbaci_prvi() {
		if(prvi==null) {
			return;
		}
		prvi=prvi.sledeci;
	}

	public void izbaci_poslednji() {
		if(prvi==null) {
			return;
		}
		if(prvi.sledeci==null) {
			prvi=null;
			return;
		}
		CvorJSListe pom=prvi;
		while(pom.sledeci.sledeci!=null) {
			pom=pom.sledeci;
		}
		pom.sledeci=pom.sledeci.sledeci;
	}

	public void ubaci_pretposlednji(int p) {
		if(prvi==null) {
			dodaj_na_pocetak(p);
			return;
		}
		if(prvi.sledeci==null) {
			dodaj_na_kraj(p);
			return;
		}
		CvorJSListe pom=prvi;
		while(pom.sledeci.sledeci!=null) {
			pom=pom.sledeci;
		}
		pom.sledeci=new CvorJSListe(p, pom.sledeci);
	}
	
	public void zameni_prvi_i_poslednji() {
		CvorJSListe pom=prvi;
		while(pom.sledeci.sledeci!=null) {
			pom=pom.sledeci;
		}
		pom.sledeci.sledeci=prvi.sledeci;
		CvorJSListe tmp=prvi;
		prvi=pom.sledeci;
		pom.sledeci=tmp;
		tmp.sledeci=null;
	}

	public int max() {
		CvorJSListe pom=prvi;
		int max= Integer.MIN_VALUE;
		while(pom!=null) {
			if(pom.podatak>max) {
				max=pom.podatak;
			}
			pom=pom.sledeci;
		}
		return max;
	}

	public void izbaci_max() {
		CvorJSListe pom=prvi;
		if(prvi.podatak==max()) {
			izbaci_prvi();
			return;
		}
	
		while(pom.sledeci.podatak!=max()) {
			pom=pom.sledeci;
		}
		pom.sledeci=pom.sledeci.sledeci;
	}

	public void izbaci_neki(int p) {
		CvorJSListe pom=prvi;
		if(prvi==null) {
			System.out.println("Lista je prazna!!!");
			return;
		}
		do {
		
		if(prvi.podatak==p) {
			izbaci_prvi();
		
		}
		while(pom.sledeci.podatak!=p) {
			pom=pom.sledeci;
		}
		pom.sledeci=pom.sledeci.sledeci;
		} while(broj_ponavljanja(p)!=0);
	}
	
	public int broj_ponavljanja(int p) {
		int br=0;
		CvorJSListe pom=prvi;
		while(pom!=null) {
			if(pom.podatak==p) {
				br++;
			}
			pom=pom.sledeci;
		}
		return br;
	}
} 

