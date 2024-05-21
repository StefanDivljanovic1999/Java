import labis.cvorovi.CvorDSListe;
import labis.cvorovi.CvorJSListe;
import labis.exception.LabisException;
import labis.liste.AJSLista;
import labis.cvorovi.CvorDSListe;
public class cas2 extends AJSLista {

	public void ubaci_na_pocetak(int p) {
		CvorJSListe novi= new CvorJSListe(p, prvi);
		prvi= novi;
	}
	
	public void ispisi_listu() {
		CvorJSListe pom= prvi;
		while(pom!=null) {
			System.out.print(" "+pom.podatak);
			pom=pom.sledeci;
		}
	}
	
	public void ubaci_na_kraj(int p) {
		if(prvi==null) {
			prvi= new CvorJSListe(p, prvi);
			return;
			}
		CvorJSListe pom= prvi;
		CvorJSListe novi= new CvorJSListe(p, null);
		while(pom.sledeci!=null) {
			pom=pom.sledeci;
		}
		pom.sledeci= novi;
	
	}
	
	int broj_ponavljanja(int el) {
		int broj_ponavljanja=0;
		CvorJSListe pom=prvi;
		while(pom!=null) {
			if(pom.podatak==el) {
				broj_ponavljanja++;
			}
			pom=pom.sledeci;
		}
		return broj_ponavljanja;
	}
	
	public void izbaci_prvi() {
		
		prvi=prvi.sledeci;
		}
	public void izbaci_element(int el) throws LabisException {
		if(broj_ponavljanja(el)==0) {
			throw new LabisException("Broj se ne nalazi u listi!");
		} else {
		do {
		CvorJSListe pom=prvi;
		if(prvi.podatak==el) {
		izbaci_prvi();
		continue;
		}
		while(pom.sledeci.podatak!=el) {
		  pom=pom.sledeci;
		}
		
		pom.sledeci=pom.sledeci.sledeci;
		} while(broj_ponavljanja(el)!=0);
	}
	}
	
	public boolean da_li_postoji(int el) {
		CvorJSListe pom= prvi;
		while(pom!=null) {
			if(pom.podatak==el) {
				return true;
			}
			pom=pom.sledeci;
		}
		return false;
	}
	
	public boolean postoji(CvorJSListe c, int el) {
		while(c!=null) {
		if(c.podatak==el) {
			return true;
			}
			c=c.sledeci;
		}
		return false;
	}
	
	public void unija_dve_liste(CvorJSListe c1, CvorJSListe c2) throws LabisException {
		if(c1==null || c2==null) {
			throw new LabisException("Greska!");
		}
		CvorJSListe trecalista=null;
		
		while(c1!=null) {
			if(!(postoji(trecalista, c1.podatak))) {
				trecalista= new CvorJSListe(c1.podatak, trecalista);
			}
			c1=c1.sledeci;
		}
		
		while(c2!=null) {
			if(!(postoji(trecalista, c2.podatak))) {
				trecalista= new CvorJSListe(c2.podatak, trecalista);
			}
			c2=c2.sledeci;
		}
		
		while(trecalista!=null) {
			System.out.print(" "+trecalista.podatak);
			trecalista= trecalista.sledeci;
			
		}
	}
	
	void ubaci_na_pocetak_2(int el, CvorJSListe lista) {
		lista= new CvorJSListe(el, lista);
	}
	
	void ispisi_listu_2(CvorJSListe lista) {
		while(lista!=null) {
			System.out.print(" "+lista.podatak);
			lista=lista.sledeci;
		}
	}
	int br_p(CvorJSListe lista, int el) {
		int br=0;
		while(lista!=null) {
			if(lista.podatak==el) {
				br++;
			}
			lista=lista.sledeci;
		}
		return br;
	}
	public void presek_dve_liste(CvorJSListe c1, CvorJSListe c2) throws LabisException {
		if(c1==null || c2==null) {
			throw new LabisException("Jedna od listi je prazna!");
		}
		CvorJSListe treca= null;
		
		while(c1!=null) {
			if(!(postoji(treca,c1.podatak)) && postoji(c2, c1.podatak)) {
				treca= new CvorJSListe(c1.podatak, treca);
			}
			c1=c1.sledeci;
		}
		
		/*while(c2!=null) {
			if(!(postoji(treca,c2.podatak))) {
				treca= new CvorJSListe(c2.podatak, treca);
			}
			c2=c2.sledeci;
		}*/
		ispisi_listu_2(treca);
	}
	
	public void invertuj_listu(CvorJSListe c) {
		CvorJSListe c2= null;
		while(c!=null) {
			c2= new CvorJSListe(c.podatak, c2);
			c=c.sledeci;
		}
		ispisi_listu_2(c2);
	}
	
	
}
