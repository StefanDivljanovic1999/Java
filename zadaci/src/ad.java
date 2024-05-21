import java.util.Iterator;

import labis.cvorovi.CvorDSListe;
import labis.exception.LabisException;
import labis.liste.ADSLista;


public class ad extends ADSLista {
	int niz[]= new int[7];
	int brojac=0;
 public void dodaj_na_pocetak(int p) {
	 prvi= new CvorDSListe(p, null, prvi);
 }
 
 public void dodaj_na_kraj(int p) {
	 if(prvi==null) {
		 dodaj_na_pocetak(p);
		 return;
	 }
	 CvorDSListe pom=prvi;
	 while(pom.sledeci!=null) {
		 pom=pom.sledeci;
	 }
	 pom.sledeci= new CvorDSListe(p, pom, null);
 }
 
 public void ispisi() {
	 CvorDSListe pom=prvi;
	 while(pom!=null) {
		 System.out.print(" " +pom.podatak);
		 pom=pom.sledeci;
	 }
 }
 
 public int zbir_parnih() {
	 CvorDSListe pom=prvi;
	 int zbir=0;
	 if(prvi==null) {
		 return 0;
	 }
	 while(pom!=null) {
		 if(pom.podatak%2==0) {
			 zbir+=pom.podatak;
		 }
		 pom=pom.sledeci;
	 }
	return zbir;
 }
 
 public int broj_parnih_elemenata() {
	 if(prvi==null) {
		 return 0;
	 }
	 CvorDSListe pom=prvi;
	 int brojac=0;
	 while(pom!=null) {
		 if(pom.podatak%2==0) {
			 brojac++;
		 }
		 pom=pom.sledeci;
	 }
	return brojac;
 }
 
 public double prosek_parnih() throws LabisException {
	 if(prvi==null) {
		 return 0;
	 }
	 if(broj_parnih_elemenata()!=0) {
	 return (double)zbir_parnih()/broj_parnih_elemenata();
	 } else {
		 throw new LabisException("Nema parnih elemenata!");
	 }
 }
 /*Svaki element u nizu zameniti proizvodom svojih suseda!*/
 
 public void dodaj_u_niz(int el)  {
	 if(niz.length>brojac) {
		 niz[brojac]=el;
		 brojac++;
	 }
 }
 public void ispisi_niz() {
	 for (int i = 0; i <brojac; i++) {
		System.out.print(" " +niz[i]);
	}
 }
 
 public void treci_A() {
	 int novi_Niz[]= new int[niz.length];
	 int i = 0;
	 if(i==0) {
		 novi_Niz[i]=niz[i]*niz[i+1];
	 }
	
	 
	 for ( i = 1; i < novi_Niz.length-1; i++) {
		novi_Niz[i]=niz[i-1]*niz[i+1];
	}
	 while(i!=niz.length-1) {
		 
		 i++;
	 }
	novi_Niz[i]=niz[i]*niz[i-1];
	
	 for (int j = 0; j < novi_Niz.length; j++) {
		System.out.print(" "+novi_Niz[j]);
	}
 }
 
 public void premesti_s_kraja_na_pocetak(int k) {
	 if(k>niz.length || niz.length==0) {
		 System.out.println("Greska!!!");
		 return;
	 }
	 int noviNiz[]= new int[niz.length];
	 for (int i = 0; i <k; i++) {
		noviNiz[i]=niz[niz.length-k+i];
	}
	 for (int i = k; i < niz.length; i++) {
		noviNiz[i]=niz[i-k];
	}
	 
	 for (int i = 0; i < noviNiz.length; i++) {
		 
		System.out.print(" "+noviNiz[i]);
	}
 }
 
 public void rotiraj_k(int k) {
	 CvorDSListe novaLista=null;
	 CvorDSListe pom=prvi;
	 int niz1[]= new int[k];
	 int br=0;
	 
	 for (int i = 0; i < k; i++) {
		niz1[br++]=pom.podatak;
		pom=pom.sledeci;
	}
	 iz_niza_u_listu( novaLista, niz1, br);
	 ispisi_l(novaLista);
	
 }
 
 public void ispisi_niz(int[] niz1,int brojac) {
	for (int i = 0; i < brojac; i++) {
		System.out.print(" " +niz1[i]);
	}
 }
 
 public void iz_niza_u_listu(CvorDSListe pom, int niz2[], int br) {
	for (int i = 0; i < br; i++) {
	  dodaj_na_p(pom, niz[i]);
	}
 }	
 public void ispisi_l(CvorDSListe k) {
  	CvorDSListe pom=k;
  	while(pom!=null) {
  		System.out.print(" "+pom.podatak);
  		pom=pom.sledeci;
  	}

 }
 public void dodaj_na_p(CvorDSListe pom, int p) {
	 pom= new CvorDSListe(p, null, pom);
 }
}
