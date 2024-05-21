import java.util.Iterator;

import labis.cvorovi.CvorDSListe;
import labis.liste.ADSLista;

public class cas2Ds extends ADSLista {

	public void dodaj_na_pocetak(int p) {
	prvi= new CvorDSListe(p, null, prvi);
	}
	
	public void dodaj_na_kraj_liste(int p) {
		CvorDSListe pom= prvi;
		if(prvi==null) {
			prvi= new CvorDSListe(p, null, null);
			return;
		}
		while(pom.sledeci!=null) {
			pom=pom.sledeci;
		}
		CvorDSListe novi= new CvorDSListe(p, pom, null);
		pom.sledeci=novi;
	}
	
	public void ispisi() {
		CvorDSListe pom=prvi;
		while(pom!=null) {
			System.out.print(" "+pom.podatak);
			pom=pom.sledeci;
		}
	}
	public int najveci_element_liste(CvorDSListe c) {
		int max= Integer.MIN_VALUE;
	while(c!=null) {
		if(c.podatak>max) {
			max= c.podatak;
		}
		c=c.sledeci;
	}
	return max;
	}
	
	public void dodaj_na_pocetak_liste(CvorDSListe c, int el) {
		c= new CvorDSListe(el, null, c);
		
	}
	
	public void ispisi_listu(CvorDSListe c) {
		while(c!=null) {
			System.out.print(" "+c.podatak);
			c=c.sledeci;
		}
	}
	
	public void najveci_element_na_pocetku() {
       CvorDSListe pom=prvi;
       if(prvi==null || prvi.podatak==najveci_element_liste(prvi)) {
    	   return;
       }
     
       while(pom.sledeci.podatak!=najveci_element_liste(pom)) {
    	   pom=pom.sledeci;
       }
       CvorDSListe max= pom.sledeci;
     pom.sledeci=pom.sledeci.sledeci;
     pom.sledeci.prethodni=pom;
     
     
     System.out.println("Najveci element liste je: " +max.podatak);
     max= new CvorDSListe(max.podatak, null, prvi);
     prvi=max;
	}
	
	public int zbir_elemenata() {
	 int suma=0;
	 while(prvi!=null) {
		 suma+=prvi.podatak;
		 prvi=prvi.sledeci;
	 }
	return suma;
		
	}
	
	public void polovina_koja_ima_veci_zbir() {
		CvorDSListe pom=prvi;
		
	}
	
	public void veciZbir(CvorDSListe p) {
		CvorDSListe pom = p;
		int zbir1 = 0;
		int zbir2 = 0;
		while (pom != null) {
		zbir1 = zbir1 + pom.podatak;
		pom = pom.sledeci;
		System.out.println("Zbir1 : " +zbir1);
		}
		pom = p;
		while (pom != null) {
		zbir2 = zbir2 + pom.podatak;
		pom = pom.prethodni;
		System.out.println("Zbir2 : " +zbir2);

		}
		if (zbir1 > zbir2) {
		pom = p.sledeci;
		while (pom != null) {
		System.out.print(" "+pom.podatak);
		pom = pom.sledeci;
		}
		
		} else {
		pom = p.prethodni;
		while (pom != null) {
		System.out.print(" "+pom.podatak);
		pom = pom.prethodni;
		
		}
		}
		}
}
