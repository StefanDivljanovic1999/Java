import labis.cvorovi.CvorDSListe;
import labis.cvorovi.CvorJSListe;
import labis.liste.AJSLista;

public class obn extends AJSLista {
	int niz[]= new int[1000];
	int brojac=0;
 public void dodaj_na_pocetak(int el) {
	 
	prvi= new CvorJSListe(el, prvi);
	 
 }
 
 public void dodaj_na_kraj(int el) {
	 if(prvi==null) {
		 dodaj_na_pocetak(el);
		 return;
	 }
	 CvorJSListe pom= prvi;
	 while(pom.sledeci!=null) {
		 pom=pom.sledeci;
	 }
	 
	CvorJSListe novi= new CvorJSListe(el, null);
	pom.sledeci=novi;
 }
 
 public int broj_vecih_od_prvog() {
	 int brojac=0;
	 CvorJSListe pom=prvi;
	 while(pom!=null) {
		 if(prvi.podatak<pom.podatak) {
			 brojac++;
		 }
		 pom=pom.sledeci;
		 
	 }
	return brojac;
 }
 int broj_ponavljanja(int el) {
	 CvorJSListe pom=prvi;
	 int brojac=0;
	 while(pom!=null) {
		 if(pom.podatak==el) {
			 brojac++;
		 }
		 pom=pom.sledeci;
	 }
	return brojac;
 }
 
 public void izbaci_min_element() {
	 int min= Integer.MAX_VALUE;
	 CvorJSListe pom=prvi;
	 do {
	 while(pom!=null) {
		 if(pom.podatak<min) {
			 min=pom.podatak;
		 }
		 pom=pom.sledeci;
	 }
	
	 
	 CvorJSListe pom1= prvi;
	 while(pom1.sledeci.podatak!=min) {
		 pom1=pom1.sledeci;
	 }
	 pom1.sledeci=pom1.sledeci.sledeci;
	 } while(broj_ponavljanja(min)!=0);
		 
	 
 }
 
 public void izbaci_posle_min() {
	 CvorJSListe pom=prvi;
	 int min=Integer.MAX_VALUE;
	
	 while(pom!=null) {
		 if(pom.podatak<min) {
			 min=pom.podatak;
		 }
		 pom=pom.sledeci;
	 }
	 CvorJSListe p= prvi;
	 while(p.podatak!=min) {
		 p=p.sledeci;
	 }
	 p.sledeci=p.sledeci.sledeci;
	
 }
 
 public void invertuj_listu() {
	 CvorJSListe pom=prvi;
	 CvorJSListe druga=null;
	 while(pom!=null) {
	 druga= new CvorJSListe(pom.podatak, druga);
	 pom=pom.sledeci;
	 }
	 ispis_liste(druga);
	
 }
 
 public void ispisi_listu() {
	 CvorJSListe pom= prvi;
	 while(pom!=null) {
		 System.out.print(" " +pom.podatak);
		 pom=pom.sledeci;
	 }
 }
 
 public void ispis_liste(CvorJSListe lista) {
	 while(lista!=null) {
		 System.out.print(" "+lista.podatak);
		 lista=lista.sledeci;
	 }
 }
 
 public void dodaj_u_niz(int el) {
	 if(niz.length>brojac) {
	niz[brojac++]=el;
	 }
 }
 
 public void ispisi_niz() {
	 for (int i = 0; i <brojac; i++) {
		System.out.print(" "+niz[i]);
	}
 }
 
 public void napravi_niz_od_liste() {
	 
	 CvorJSListe pom=prvi;
	while(pom!=null) {
		dodaj_u_niz(pom.podatak);
		pom=pom.sledeci;
	}
	ispisi_niz();
 }
 
 public int da_li_postoji(int element, CvorJSListe pom) {
	 while(pom!=null) {
		 if(pom.podatak==element) {
			 return 1;
		 }
		 pom=pom.sledeci;
	 }
	 
	return 0;
	 
 }
 
 public void presek_dve_liste(CvorJSListe lista1, CvorJSListe lista2) {
	 CvorJSListe pom=lista1;
	 
	 CvorJSListe lista3= null;
	 
	 while(pom!=null) {
		 if(da_li_postoji(pom.podatak, lista2)==1 && da_li_postoji(pom.podatak, lista3)==0) {
		lista3= new CvorJSListe(pom.podatak, lista3);
		 }
		 pom=pom.sledeci;
	 }
	 ispis_liste(lista3);
	 
 }
 
 public int max_element(CvorJSListe glava) {
	 CvorJSListe pom=glava;
	 int max= Integer.MIN_VALUE;
	 while(pom!=null) {
		 if(pom.podatak>max) {
			 max=pom.podatak;
		 }
		 pom=pom.sledeci;
	 }
	return max;
 }
 
 public void najveci_element_na_pocetku(CvorJSListe glava) {
	 CvorJSListe pom=glava;
	 while(pom.sledeci.podatak!=max_element(glava)) {
		 pom=pom.sledeci;
	 }
	 pom.sledeci=pom.sledeci.sledeci;
	 System.out.println("a");
	 CvorJSListe pom1=glava;
	 while(pom1.podatak!=max_element(glava)) {
		 pom1=pom1.sledeci;
	 }
	pom1= new CvorJSListe(pom1.podatak, pom1);
	 ispis_liste(pom1);
 }
 
 public void prvo_mesto() {
	 CvorJSListe pom=prvi;
	 while(pom.sledeci.podatak!=max_element(prvi)) {
		 pom=pom.sledeci;
	 }
	 
	pom.sledeci=pom.sledeci.sledeci;
	
	
 }public void prebaciMaxElement(CvorDSListe poslednji) {
	 CvorDSListe max = poslednji;
	 CvorDSListe pom = poslednji;
	 while (pom.prethodni != null) {
	 pom = pom.prethodni;
	 if (pom.podatak > max.podatak) {
	 max = pom;
	 }
	 }
	 if(max.prethodni == null)
	 return;
	 max.prethodni.sledeci = max.sledeci;
	 if(max.sledeci != null)
	 max.sledeci.prethodni = max.prethodni;
	 max.prethodni = null;
	 max.sledeci = pom;
	 pom.prethodni = max;
	 }
 public static boolean daLiJePalindromDS(CvorDSListe p) {
		 if (p == null) {
		 return false;
		 }
		 CvorDSListe pom = p;
		 while (pom.sledeci != null) {
		 pom = pom.sledeci;
		 }
		 while (p != pom && p.prethodni != pom) {
		 if (p.podatak == ' ') {
		 p = p.sledeci;
		 }
		 if (pom.podatak == ' ') {
		 pom = pom.prethodni;
		 }
		 if (p.podatak == pom.podatak) {
		 p = p.sledeci;
		 pom = pom.prethodni;
		 } else {
		 return false;
		 }
		 }
		 return true;
		 }
 
 public void maksimalni_na_prvo_mesto(CvorJSListe l) {
	 CvorJSListe pom=l;
	 while(pom.sledeci.podatak!= max_element(l)) {
		
		 pom=pom.sledeci;
	 }
	 pom.sledeci=pom.sledeci.sledeci;
	 
	 CvorJSListe pom1=l;
	 while(pom1.podatak!= max_element(l)) {
			pom1=pom1.sledeci;
 }
l.sledeci.podatak=pom1.podatak;		


}
 

}