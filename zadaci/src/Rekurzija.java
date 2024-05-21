import labis.cvorovi.CvorJSListe;
import labis.exception.LabisException;

public class Rekurzija {

	public void ispisiR(int a, int b) {
		if(a>b) {
			return;
		}
		System.out.print(" "+ a);
		ispisiR(a+1, b);
	}
	
	public int faktorijel(int broj) {
		int rezultat=1;
		for (int i = 1; i <=broj; i++) {
			rezultat*=i;
		}
		return rezultat;
	}
	
	public int faktorijelR(int broj) throws LabisException {
		if(broj==0) {
			return 1;
		}
		return broj*faktorijelR(broj-1);
	}
	
	public int zbirR(CvorJSListe prvi) {
		if(prvi==null) {
			return 0;
		}
		return prvi.podatak+zbirR(prvi.sledeci);
	}
	
	public void ispisi_u_rikverc(CvorJSListe prvi) {
		CvorJSListe rikverc=null;
	   while(prvi!=null) {
		   rikverc= new CvorJSListe(prvi.podatak, rikverc);
		   prvi=prvi.sledeci;
	   }
	   ispisi(rikverc);
	}
	
	public void ispisi(CvorJSListe prvi) {
		CvorJSListe pom=prvi;
		while(pom!=null) {
			System.out.print(" " +pom.podatak);
			pom=pom.sledeci;
		}
	}
	
	public void ispisiR(CvorJSListe prvi) {
		if(prvi==null) {
			return;
		}
		System.out.print(" " +prvi.podatak);
		ispisiR(prvi.sledeci);
	}
	
	public void ispisi_u_rikvercR(CvorJSListe prvi) {
	
		CvorJSListe pom=null;
		while(prvi!=null) {
			pom= new CvorJSListe(prvi.podatak, pom);
			prvi=prvi.sledeci;
		}
		ispisi(pom);
	}
	
	public int proizvod_neparnih_el_liste(CvorJSListe prvi) {
	if(prvi==null) {
		return 1;
	}
	return 0;
	
	}
	
	public void ubaci_u_niz(int niz[], int el, int i) {
		if(i<niz.length) {
			niz[i++]=el;
			
		}
	
	}
	
	public void ispisi_niz(int niz[],int k) {
		for (int i = 0; i < k; i++) {
			System.out.print(" "+niz[i]);
		}
	}
	
	public void ispisiR(int niz[], int brojac) {
		if(brojac==niz.length) {
			return;
		}
		System.out.print(" " +niz[brojac]);
		ispisiR(niz, brojac+2);
	}
}
