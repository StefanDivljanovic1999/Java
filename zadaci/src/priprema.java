import labis.cvorovi.CvorDSListe;
import labis.cvorovi.CvorJSListe;
import labis.exception.LabisException;
import labis.liste.ADSLista;
import labis.liste.AJSLista;

public class priprema extends AJSLista {
	int niz[]= new int[30];
	int brojac=0;
	
	public int zbir_max_dve_dnevne_temperature(CvorJSListe l1, CvorJSListe l2) throws LabisException {
		CvorJSListe pom=l1;
		CvorJSListe pom1=l2;
		CvorJSListe lista=null;
		int max= Integer.MIN_VALUE;
		
		if(broj_el_JS(l1)!=broj_el_JS(l2)) {
			throw new LabisException("Broj elemenata obe liste mora biti jednak!!!");
		}
		
		while(pom!=null &&pom1!=null) {
			
			lista= new CvorJSListe(pom.podatak+pom1.podatak, lista);
			pom=pom.sledeci;
			pom1=pom1.sledeci;
		}
		
		while(lista!=null) {
			if(lista.podatak>max) {
				max=lista.podatak;
			}
			lista=lista.sledeci;
		}
		return max;
		
			}
	
	public void ispisi_JS(CvorJSListe pom) {
		while(pom!=null) {
			System.out.print(" " +pom.podatak);
		pom=pom.sledeci;
		}
	}
	
	public int broj_el_JS(CvorJSListe pom) {
		int brojac=0;
		while(pom!=null) {
			brojac++;
			pom=pom.sledeci;
		}
		return brojac;
	}
	
	public void izbaci_treci(CvorJSListe pom) {
	 
	}
	
	public void izbaci_svaki_treci(CvorJSListe pom) {
	int i=1;
		while(pom!=null && pom.sledeci!=null) {
			if(i%3==1) {
				pom.sledeci=pom.sledeci.sledeci;
			}
			i++;
			pom=pom.sledeci;
		}
	
	}
	
	public void ubaci_u_niz(int el) {
		
			niz[brojac]=el;
			brojac++;
		
		
	}
	
	public void ispisi_niz() {
		for (int i = 0; i <brojac; i++) {
			System.out.print(" " +niz[brojac]);
		}
	}
}