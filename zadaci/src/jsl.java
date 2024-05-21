import labis.cvorovi.CvorJSListe;
import labis.liste.AJSLista;

public class jsl extends AJSLista {
 public void dodaj_na_pocetak(int p) {
	 prvi= new CvorJSListe(p, prvi);
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
	 pom.sledeci= new CvorJSListe(p, null);
 }
 
 public void ispisi() {
	 CvorJSListe pom=prvi;
	 System.out.println("Elementi liste: ");
	 while(pom!=null) {
		 System.out.print(" " +pom.podatak);
		 pom=pom.sledeci;
	 }
	 System.out.println();
 }
 
 public void UbaciPrePrvogManjeg(int p) {
 CvorJSListe pom=prvi;
 if(prvi==null) {
	 return;
 }
 if(prvi.podatak<p) {
	 dodaj_na_pocetak(p);
	 return;
 }
 if(min()>p) {
	 dodaj_na_kraj(p);
	 return;
 }
 while(pom.sledeci.podatak>p) {
	 pom=pom.sledeci;
 }
 pom.sledeci= new CvorJSListe(p, pom.sledeci);
 }
 
 public int min() {
	 CvorJSListe pom=prvi;
	 int min=Integer.MAX_VALUE;
	 while(pom!=null) {
		 if(pom.podatak<min) {
			 min=pom.podatak;
		 }
		 pom=pom.sledeci;
	 }
	return min;
 }
 
 public int brojEl() {
	 int br=0;
	 CvorJSListe pom=prvi;
	  while(pom!=null) {
		  br++;
		  pom=pom.sledeci;
	  }
	return br;
 }
 
 public int srednji() {
	 CvorJSListe pom=prvi;
	 int i=0;
	 while(i!=brojEl()/2-1) {
		 pom=pom.sledeci;
		 i++;
	 }
	return pom.podatak;
	 
	
 }
 public boolean permutacija(int niz[], int niz1[]) {
	return false;
	 
 }
 
 public int brojEl(int niz[], int br) {
	 int brjac=0;
	 for (int i = 0; i < br; i++) {
		brjac++;
	}
	return brjac;
 }

 
 public int brPonavljanja(int niz, int br ) {
	return br;
	 
 }
}
