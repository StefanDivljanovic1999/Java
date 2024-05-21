import labis.cvorovi.CvorJSListe;
import labis.liste.AJSLista;

public class ajs extends AJSLista {
 public void dodaj(int p) {
	 prvi= new CvorJSListe(p, prvi);
 }
 
 public void ispisi() {
	 CvorJSListe pom=prvi;
	 while(pom!=null) {
		 System.out.print(" " +pom.podatak);
		 pom=pom.sledeci;
	 }
 }
 
 public void drugi(int k) {
	 CvorJSListe spori=prvi;
	CvorJSListe brzi=prvi.sledeci;
	System.out.println("Parovi:");
	while(spori.sledeci!=null) {
		while(brzi!=null) {
			if(spori.podatak+brzi.podatak>k)
		System.out.println(spori.podatak+" " +brzi.podatak);
		brzi=brzi.sledeci;
		}
	
		spori=spori.sledeci;
		brzi=spori.sledeci;
	}
 } 
 
 public int zbir_js() {
	 int zbir=0;
	 CvorJSListe pom=prvi;
	 while(pom!=null) {
		 zbir+=pom.podatak;
		 pom=pom.sledeci;
	 }
	 return zbir;
 }
 
 public void izbaci_podatak(int p) {
	 if(prvi==null) {
		 System.out.println("Prazna lista!!!");
		 return;
	 }
	 if(prvi.podatak==p) {
		 prvi=prvi.sledeci;
		 return;
	 }
	 CvorJSListe pom=prvi;
	 while(pom.sledeci.podatak!=p) {
		 pom=pom.sledeci;
		  }
	 pom.sledeci=pom.sledeci.sledeci;
 }
 
 public void izbaci_kv_veci_od_zbira() {
	 CvorJSListe pom=prvi;
	 while(pom!=null) {
		if(pom.podatak*pom.podatak>zbir_js()) {
			izbaci_podatak(pom.podatak);
		}
		 pom=pom.sledeci;
	 }
 }
}
