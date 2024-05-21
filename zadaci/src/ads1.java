import labis.cvorovi.CvorDSListe;
import labis.liste.ADSLista;

public class ads1 extends ADSLista{
  public void dodaj_na_pocetak(int p) {
	  prvi= new CvorDSListe(p, null, prvi);
  }
  
  public void ispisi() {
	  while(prvi!=null) {
		  System.out.print(" " +prvi.podatak);
		  prvi=prvi.sledeci;
	  }
  }
  
  public void rotiraj_k(int k) {
	  CvorDSListe pom=prvi;
	  CvorDSListe novaLista=null;
	  int niz[]= new int[k];
	  int br=0;
	  boolean kraj=false;
	  while(!kraj) {
	  for (int i = 0; i <k; i++) {
		niz[br++]=pom.podatak;
		pom=pom.sledeci;
		if(pom==null) {
			kraj=true;
			break;
		}
	  }
	
	 napravi_listu_od_niza(novaLista, niz, br);
	 br=0;
	  }
  }
  
  public void napravi_listu_od_niza(CvorDSListe list, int niz[], int brojac) {
	  for (int i = brojac-1; i>=0; i--) {
		dod(list, niz[i]);
	}
	  
  }
  
  public void ispisi_listu(CvorDSListe pom) {
	  while(pom!=null) {
		  System.out.print(" "+pom.podatak);
		  pom=pom.sledeci;
	  }
  }

  public void dod(CvorDSListe pom, int p) {
	  pom= new CvorDSListe(p, null, pom);
	  ispisi_listu(pom);
  }

  public void ubaci_izmedju_dva_negativna(int p) {
	  CvorDSListe pom=prvi;
	  boolean kraj=false;
	  while(!kraj) {
	while(pom.podatak>0 ) {
		pom=pom.sledeci;
	}
	if(pom.sledeci.podatak<0) {
		pom.sledeci= new CvorDSListe(p, pom, pom.sledeci);
	kraj=true;
		break;
	}
	else {
		pom=pom.sledeci;
	}
	  }
	  
  }
  int niz[]= new int[7];
  int brojac=0;
  public void dodaj_u_niz(int p) {
	  if(brojac<niz.length) {
		  niz[brojac++]= p;
	  }
  }
  
  public void ispis_niza() {
for (int i = 0; i < brojac; i++) {
	System.out.print(" "+niz[i]);
}

}
  public void max_razlika() {
	  int max_razl= Integer.MIN_VALUE;
	  int niz1[]= new int[5000];
	  int br=0;
	  for (int i = 0; i < niz.length-1; i++) {
		  for (int j = i+1; j < niz.length; j++) {
			
			  niz1[br++]=niz[j]-niz[i];
			}
			
		}
	 for (int i = 0; i < br; i++) {
		if(max_razl<niz1[i]) {
			max_razl=niz1[i];
		}
		
	}
	 System.out.println(max_razl);	
	}
  public void max_razlika_suseda() {
	  for (int i = 0; i < niz.length-1; i++) {
		for (int j = i+1; j < niz.length; j++) {
		
			System.out.println(niz[i] + " " +niz[j]);
		}
	}
  }
  
  public void quiz(int i) {
	  if(i>1) {
		  quiz(i/2);
		  System.out.println("*");
		  quiz(i/3);
	  }
	  System.out.println("*");
  }
}
