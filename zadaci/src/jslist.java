import labis.cvorovi.CvorJSListe;
import labis.exception.LabisException;
import labis.liste.AJSLista;

public class jslist extends AJSLista {
 
	public void dodaj_u_listu(int p) {
		prvi= new CvorJSListe(p, prvi);
	}
	public void ispisi_listu() {
		CvorJSListe pom=prvi;
		System.out.println("Elementi liste su: ");
		while(pom!=null) {
			System.out.print(" " +pom.podatak);
			pom=pom.sledeci;
		}
	}
	public int broj_parova_vecih_od_K(int k) {
		int br=0;
		CvorJSListe pom=prvi;
		CvorJSListe pom1= prvi.sledeci;
		while(pom.sledeci!=null) {
			while(pom1!=null) {
				if(pom.podatak+pom1.podatak>k) {
					br++;
				
				}
				pom1=pom1.sledeci;
			}
			pom=pom.sledeci;
			pom1=pom.sledeci;
		}
		return br;
	}
	public int max_zbir_temperatura(CvorJSListe l1,CvorJSListe l2) throws LabisException {
		if(l1==null || l2==null) {
			throw new LabisException("Prazna lista!!!");
		}
		
		int max_zbir=Integer.MIN_VALUE;
		while(l1!=null) {
			while(l2!=null) {
				if(l1.podatak+l2.podatak>max_zbir) {
					max_zbir=l1.podatak+l2.podatak;
				}
				l2=l2.sledeci;
				l1=l1.sledeci;
			}
			
		}
		return max_zbir;
	}
	public void ubaci_na_kraj(int p) {
		if(prvi==null) {
			dodaj_u_listu(p);
			return;
		}
	 CvorJSListe pom=prvi;
	 while(pom.sledeci!=null) {
		 pom=pom.sledeci;
	 }
		pom.sledeci= new CvorJSListe(p, null);
	}
	public int min_liste() {
		CvorJSListe pom=prvi;
		int min=Integer.MAX_VALUE;
		while(pom!=null) {
			if(min>pom.podatak) {
				min=pom.podatak;
			}
			pom=pom.sledeci;
		}
		return min;
	}
	public void ubaci_posle_prvog_manjeg(int p) {
		if(prvi==null) {
			System.out.println("Prazna lista!!!");
			return;
		}
		if(min_liste()>p) {
			ubaci_na_kraj(p);
			return;
		}
		CvorJSListe pom=prvi;
		while(pom.podatak>p) {
			pom=pom.sledeci;
		}
		pom.sledeci= new CvorJSListe(p, pom.sledeci);
	}
	public void ispisi_vecu_polovinu(int p) {
		CvorJSListe pom=prvi;
	CvorJSListe pom1=null;
	CvorJSListe pom2=null;
	while(pom.podatak!=p) {
		pom1= new CvorJSListe(pom.podatak, pom1);
		pom=pom.sledeci;
	}
	pom=pom.sledeci;
	while(pom!=null) {
		pom2= new CvorJSListe(pom.podatak, pom2);
		pom=pom.sledeci;
	}
	ispisi_List(pom2);
	ispisi_List(pom1);
	}
	public int zbir_liste(CvorJSListe p) {
		CvorJSListe pom=p;
		int suma=0;
		while(pom!=null) {
			suma+=pom.podatak;
			pom=pom.sledeci;
		}
		return suma;
	}
	public void ispisi_List(CvorJSListe p) {
		CvorJSListe pom=p;
		while(pom!=null) {
			System.out.print(" " +pom.podatak);
			pom=pom.sledeci;
		}
	}
}
