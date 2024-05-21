import labis.cvorovi.CvorDSListe;
import labis.cvorovi.CvorJSListe;
import labis.liste.AJSLista;

public class liste1 extends DSLista {
	public void ubaci_na_pocetak(int p) {
		if(prvi==null) {
			prvi=new CvorDSListe(p, null, null);
			} else {
		prvi= new CvorDSListe(p, null, prvi);
	}
	}
	public void ispisi_listu() {
		CvorDSListe pom= prvi;
		while(pom!=null) {
			System.out.print(" "+pom.podatak);
			pom=pom.sledeci;
		}
	}
	
	public int najveci_element() {
		CvorDSListe pom= prvi;
		int max=Integer.MIN_VALUE;
		while(pom!=null) {
			if(pom.podatak>max) {
				max=pom.podatak;
			}
			pom=pom.sledeci;
		}
		return max;
	}
	public int broj_ponavljanja(int el) {
		CvorDSListe pom= prvi;
		int brojac=0;
		while(pom!=null) {
			if(pom.podatak==el) {
				brojac++;
			}
			pom=pom.sledeci;
		}
		return brojac;
	}

	public void izbacivanje_najveceg_elementa() {
		
		CvorDSListe pom= prvi;
		
		while(pom.sledeci.podatak!=najveci_element()) {
			pom=pom.sledeci;
		}
		int tmp= pom.podatak;
		pom.sledeci=pom.sledeci.sledeci;
		
	
	}
}
