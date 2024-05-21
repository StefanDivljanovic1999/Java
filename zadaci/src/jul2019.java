import labis.cvorovi.CvorJSListe;
import labis.liste.AJSLista;

public class jul2019 extends AJSLista {
int niz[]= new int[20];
int brojac=0;
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
	
	public void parovi_veci_od_K(int k) {
		CvorJSListe spora=prvi;
		CvorJSListe brza=prvi.sledeci;
	  while(spora.sledeci!=null) {
		  while(brza!=null) {
			  if(spora.podatak+brza.podatak>k) {
			  System.out.println(spora.podatak+" " +brza.podatak);
			  }
			  brza=brza.sledeci;
			  
		  }
		 spora=spora.sledeci;
		 brza=spora.sledeci;
	  }
	}
	
	public int broj_elemenata_liste() {
		int brojac=0;
		while(prvi!=null) {
			brojac++;
			prvi=prvi.sledeci;
		}
		return brojac;
	}
	
	public double prosek_parnih_elemenata() {
		int zbir=0;
		int brojac=0;
		CvorJSListe pom=prvi;
		while(pom!=null) {
			if(pom.podatak%2==0) {
				brojac++;
				zbir+=pom.podatak;
			}
			pom=pom.sledeci;
		}
		return (double)zbir/brojac;
	}
	
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
	
	public void zameni_proizvodom_suseda() {
		int i=0;
		int noviNiz[]= new int[niz.length];
		
		if(i==0) {
			noviNiz[i]=niz[i]*niz[i+1];
		}
		
		
		
		for (i = 1; i <brojac-1; i++) {
			noviNiz[i]=niz[i-1]*niz[i+1];
		}
	   if(i==brojac-1) {
		   noviNiz[i]=niz[brojac-1]*niz[brojac-2];
	   }
		ispisi_niz1(noviNiz, brojac);
	}
	
	public void ispisi_niz1(int n[], int b) {
		for (int i = 0; i <b; i++) {
			System.out.print(" "+n[i]);
		}
	}
	
	
}
