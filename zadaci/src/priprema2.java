import labis.cvorovi.CvorJSListe;
import labis.liste.AJSLista;

public class priprema2 extends AJSLista {
int niz[]= new int[50];
int brojac=0;

public void dodaj_u_niz(int el) {
	if(brojac<niz.length) {
		niz[brojac++]=el;
	}
}

public void ispisi_niz() {
	for (int i = 0; i <brojac; i++) {
		System.out.print(" " +niz[i]);
	}
}
	public int najmanji_podniz(int broj) {
		int i=0;
		int j=0;
		int min= niz.length+1;
		int suma=niz[0];
		while(j<niz.length && i<niz.length) {
			if(suma>broj) {
				if(j-i+1<min) 
					min=j-i+1;
					suma-=niz[i];
				i++;
			}else {
					j++;
					suma+=niz[j];
				}
			}
		
		return min;
	}
	
	public int zbir_liste() {
		int zbir=0;
		CvorJSListe pom=prvi;
		while(pom!=null) {
			zbir+=pom.podatak;
			pom=pom.sledeci;
		}
		return zbir;
	}
	
	public void ubaci_na_kraj(int el) {
		CvorJSListe pom=prvi;
		if(prvi==null) {
			prvi= new CvorJSListe(el, prvi);
			return;
		}
		while(pom.sledeci!=null) {
			pom=pom.sledeci;
		}
		pom.sledeci= new CvorJSListe(el, null);
	}
	
	public void ispisi() {
		CvorJSListe pom=prvi;
		while(pom!=null) {
			System.out.print(" " +pom.podatak);
			pom=pom.sledeci;
		}
	}
	
	public void izbaci_element(int p) {
		if(prvi==null || !postoji(p)) {
			System.out.println("Prazna lista!");
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
	
	public boolean postoji(int p) {
		CvorJSListe pom=prvi;
		while(pom!=null) {
			if(pom.podatak==p) {
				return true;
			}
			pom=pom.sledeci;
		}
		return false;
	}
	
	public void izbaci_kv_el_manji_od_zbira() {
		CvorJSListe pom=prvi;
		while(pom!=null) {
			if(pom.podatak*pom.podatak<zbir_liste()) {
				izbaci_element(pom.podatak);
			}
			pom=pom.sledeci;
		}
	}
	
	public void sortiraj_niz() {
		for (int i = 0; i < brojac-1; i++) {
			for (int j = i+1; j <brojac; j++) {
				if(niz[i]>niz[j]) {
				int c=niz[i];
				niz[i]=niz[j];
				niz[j]=c;
				}
			}
		}
	}
	
	public void ubaci_u_neopadajuci_niz(int p) {
		int i=0;
		while(niz[i]<p) {
			i++;
		}
		
	}
	
	public void ubaci_na_neko_mesto(int p,int pozicija) {
	for (int i = brojac; i>pozicija; i--) {
		niz[i]=niz[i-1];
	}
	niz[pozicija]=p;
	brojac++;
	}
	
	public void isp(int niz[]) {
		for (int i = 0; i < niz.length; i++) {
			System.out.print(" " +niz[i]);
		}
	}
	
	public void napravi_neopadajucu(CvorJSListe l1, CvorJSListe l2) {
		CvorJSListe l3=null;
		while(l1!=null) {
			l3= new CvorJSListe(l1.podatak, l3);
			l1=l1.sledeci;
		}
		while(l2!=null) {
			if(l2.podatak>l3.podatak) {
				l3=new CvorJSListe(l2.podatak, l3);
				//l3=l3.sledeci;
				l2=l2.sledeci;
			} /*else {
				l3=l3.sledeci;
			}*/
			
		}
		isp_l(l3);
		
	}
	
	public void isp_l(CvorJSListe p) {
		CvorJSListe pom=p;
		while(pom!=null) {
			System.out.print(" " +pom.podatak);
			pom=pom.sledeci;
		}
	}
	
	/*public CvorDSListe JednaOpadDrugaRastURastucu(CvorDSListe prvi1, CvorDSListe prvi2) {
		CvorDSListe pom1 = vratiZadnji(prvi1);
		CvorDSListe pom2 = prvi2;
		CvorDSListe novi = null;
		while (pom1 != null && pom2 != null) {
			if (pom2.podatak < pom1.podatak) {
				if (novi == null)
					novi = new CvorDSListe(pom2.podatak, vratiZadnji(novi), vratiZadnji(novi));
				else {
					vratiZadnji(novi).sledeci = new CvorDSListe(pom2.podatak, vratiZadnji(novi), null);

				}
				pom2 = pom2.sledeci;
			} else {
				if (novi == null)
					novi = new CvorDSListe(pom1.podatak, vratiZadnji(novi), vratiZadnji(novi));
				else {
					vratiZadnji(novi).sledeci = new CvorDSListe(pom1.podatak, vratiZadnji(novi), null);

				}
				pom1 = pom1.prethodni;

			}
		}
		if (pom1 == null) {
			while (pom2 != null) {
				if (novi == null)
					novi = new CvorDSListe(pom2.podatak, vratiZadnji(novi), vratiZadnji(novi));
				else {
					vratiZadnji(novi).sledeci = new CvorDSListe(pom2.podatak, vratiZadnji(novi), null);

				}
				pom2 = pom2.sledeci;
			}

		}
		if (pom2 == null) {

			while (pom1 != null) {
				if (novi == null)
					novi = new CvorDSListe(pom1.podatak, vratiZadnji(novi), vratiZadnji(novi));
				else {
					vratiZadnji(novi).sledeci = new CvorDSListe(pom1.podatak, vratiZadnji(novi), null);

				}
				pom1 = pom1.prethodni;

			}

		}
		return novi;

	}*/
	
	public void invertuj_po_intervalima(int k) {
		CvorJSListe pom=prvi;
		CvorJSListe druga=null;
		while(pom!=null) {
			druga= new CvorJSListe(pom.podatak, druga);
			pom=pom.sledeci;
		}
		isp_l(druga);
	}
}


