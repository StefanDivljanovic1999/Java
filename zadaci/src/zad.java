import java.util.List;

import labis.cvorovi.CvorJSListe;
import labis.liste.AJSLista;
public class zad  extends AJSLista{
void ubaci_na_pretposlednje_mesto(int p) {
	CvorJSListe pom= prvi;
	while(pom.sledeci.sledeci!=null) {
		pom=pom.sledeci;
	}
	
	pom.sledeci= new CvorJSListe(p, pom.sledeci); 
   
}
public void ubaci_prvi(int p) {
	/*CvorJSListe novi= new CvorJSListe(p, prvi);
	prvi=novi;*/
	prvi= new CvorJSListe(p, prvi);
	
}
void ispisi_listu() {
	
	CvorJSListe pom= prvi;
while(pom!=null) {
	System.out.print(" "+pom.podatak);
	pom=pom.sledeci;
	
}
}
void zameni_mesta_prvom_i_poslednjem() {
CvorJSListe pom= prvi;
CvorJSListe tmp= prvi;
while(pom.sledeci.sledeci!=null) {
	pom=pom.sledeci;
}
pom.sledeci.sledeci=prvi.sledeci;
prvi=pom.sledeci;
pom.sledeci=tmp;
tmp.sledeci=null;
}
void zbir_liste() {
	int zbir=0;
	CvorJSListe pom= prvi;
	while(pom!=null) {
		zbir+=pom.podatak;	
		pom=pom.sledeci;
		
	}
	
	System.out.println("Zbir elemenata liste je: "+zbir);
}

void proizvod_parnih() {
	int proizvod=1;
	CvorJSListe pom= prvi;
	while(pom!=null) {
		if(pom.podatak%2==0) {
		proizvod*=pom.podatak;
		}
		pom=pom.sledeci;
	}
	System.out.println("\nProizvod parnih brojeva u listi je: "+proizvod);
}
void sortiranje_liste() {
	
		}
}