import java.util.Iterator;

import labis.cvorovi.CvorDSListe;
import labis.liste.ADSLista;

public class priprema3 extends ADSLista {
  public void dodaj_na_pocetak(int p) {
	  
	  prvi= new CvorDSListe(p, null, prvi);
  }
  
  public void ispisi() {
	  CvorDSListe pom=prvi;
	  while(pom!=null) {
		  System.out.print(" " +pom.podatak);
		  pom=pom.sledeci;
	  }
  }
  
  public void invertuj_po_intervalima(int k) {
	  CvorDSListe pom1=prvi;
	  CvorDSListe pom2=prvi;
	  
	  while(pom1!=null) {
		  pom2=pom1;
	  
	  
	for (int i = 0; i <k-1 && pom2.sledeci!=null; i++) {
		pom2=pom2.sledeci;
	}
	 CvorDSListe l=pom1;
	 CvorDSListe d=pom2;
	
	 
	 while(!(l==d || d.sledeci==l)) {
		 int tmp=l.podatak;
		 l.podatak=d.podatak;
		 d.podatak=tmp;
	 
		 l=l.sledeci;
		 d=d.prethodni;
	 }
	 pom1=pom2.sledeci;  
  }
	  
  }
  
  public void inv_po_inter(int k) {
	  CvorDSListe pom=prvi;
	  while(pom!=null) {
	for (int i = 0; i < k; i++) {
	     
		}
	System.out.println();
	  }
  }
  
  public void invertuj_listu() {
	 
	  CvorDSListe pom=prvi;
	  prvi=null;
	 while(pom!=null) {
		 prvi= new CvorDSListe(pom.podatak, null, prvi);
		 pom=pom.sledeci;
	 }
	  
	  
  }
  
  public void k_element(int k) {
	  CvorDSListe pom=prvi;
	  int i=0;
	  while(i!=k) {
		  pom=pom.sledeci;
		  i++;
	  }
	  System.out.println(pom.podatak);
  }
}
