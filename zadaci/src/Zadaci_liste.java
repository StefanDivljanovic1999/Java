import labis.cvorovi.CvorDSListe;
import labis.cvorovi.CvorJSListe;
import labis.liste.AJSLista;
import labis.liste.ADSLista;

public class Zadaci_liste extends AJSLista{

	public void ubaci_u_listu(int el,CvorJSListe prva) {
		prva= new CvorJSListe(el, prva);
		ispisi(prva);
	}
	
	public void ispisi(CvorJSListe prva) {
		CvorJSListe pom=prva;
		while(pom!=null) {
			System.out.print(" " +pom.podatak);
			pom=pom.sledeci;
		}
	}
	
	public boolean postoji(CvorJSListe prva, int el) {
		CvorJSListe pom=prva;
		while(pom!=null) {
			if(pom.podatak==el) {
				return true;
			}
			pom=pom.sledeci;
		}
		return false;
	}
	
	public CvorJSListe presek(CvorJSListe prva, CvorJSListe druga) {
		CvorJSListe treca=null;
		CvorJSListe pom= prva;
		while(pom!=null) {
			if(postoji(druga, pom.podatak)==true) {
				ubaci_u_listu(pom.podatak, treca);
			}
			pom=pom.sledeci;
		}
		
		return treca;
	}

	public CvorJSListe invertuj(CvorJSListe p1) {
		CvorJSListe p2=null;
		while(p1!=null) {
			p2= new CvorJSListe(p1.podatak, p2);
			p1=p1.sledeci;
		}
		
		return p2;
		
		
	}
	
	public void invertuj_povezivanjem() {
		CvorJSListe pom=prvi;
		CvorJSListe p=null;
		while(pom!=null) {
			prvi=pom;
			pom=pom.sledeci;
			prvi.sledeci=p;
			p=prvi;
		}
	}
	
	public void ubaci_na_pocetak(int p) {
		prvi= new CvorJSListe(p, prvi);
	}
	
	public void ispisi() {
		CvorJSListe pom=prvi;
		while(pom!=null) {
			System.out.print(" " +pom.podatak);
			pom=pom.sledeci;
		}
	}
	
	public CvorJSListe vratiZadnji(CvorJSListe prvi) {
		if (prvi == null) {
			return null;
		}
		CvorJSListe pom = prvi;
		while (pom.sledeci != null) {

			pom = pom.sledeci;
		}
		return pom;
	}
	
	public CvorJSListe vratiOd2RastucaRastucu(CvorJSListe prvi1, CvorJSListe prvi2) {

		CvorJSListe pom1 = prvi1;
		CvorJSListe pom2 = prvi2;
		CvorJSListe prvi3 = null;
		while (pom1 != null && pom2 != null) {
			if (pom1.podatak < pom2.podatak) {
				if (prvi3 == null)
					prvi3 = new CvorJSListe(pom1.podatak, null);
				else
					vratiZadnji(prvi3).sledeci = new CvorJSListe(pom1.podatak, null);
				pom1 = pom1.sledeci;
			} else {
				if (prvi3 == null)
					prvi3 = new CvorJSListe(pom2.podatak, null);
				else
					vratiZadnji(prvi3).sledeci = new CvorJSListe(pom2.podatak, null);
				pom2 = pom2.sledeci;
			}
		}
		while (pom1 != null) {
			if (prvi3 == null)
				prvi3 = new CvorJSListe(pom1.podatak, null);
			else
				vratiZadnji(prvi3).sledeci = new CvorJSListe(pom1.podatak, null);
			pom1 = pom1.sledeci;
		}
		while (pom2 != null) {
			if (prvi3 == null)
				prvi3 = new CvorJSListe(pom2.podatak, null);
			else
				vratiZadnji(prvi3).sledeci = new CvorJSListe(pom2.podatak, null);
			pom2 = pom2.sledeci;
		}
		return prvi3;
	}
	
	public void SortirajListuRastuce() {
		
	CvorJSListe pom=prvi;
	CvorJSListe pom1= pom.sledeci;
	
		while(pom.sledeci!=null) {
			while(pom1!=null) {
				if(pom.podatak<pom1.podatak) {
					int c= pom.podatak;
					pom.podatak=pom1.podatak;
					pom1.podatak=c;
				}
				
				pom1=pom1.sledeci;
			}
			
			pom=pom.sledeci;
			pom1=pom.sledeci;
		}
	//	ispisi();
	}
	
	public void ispisi_polovinu_sa_vecim_zbirom() {
		CvorJSListe pom=prvi;
		
		if(prvi==null) {
			System.out.println("Lista je prazna!!!");
			return;
		}
		
		int zbir1=0;
		int zbir2=0;
		while(pom.podatak!=element_na_polovini()) {
			zbir1+=pom.podatak;
			pom=pom.sledeci;
		}
		
		while(pom!=null && pom.sledeci!=null) {
			zbir2+=pom.sledeci.podatak;
			pom=pom.sledeci;
		}
		System.out.println("Zbir prve polovine je: " +zbir1);
		System.out.println("Zbir druge polovine je: " +zbir2);
		
		CvorJSListe pom1=prvi;
		CvorJSListe pom2=prvi;
		if(zbir1>zbir2) {
			while(pom1.podatak!=element_na_polovini()) {
				System.out.print(" " +pom1.podatak);
				pom1=pom1.sledeci;
			}
		}
		if(zbir1<zbir2) {
			while(pom2.podatak!=element_na_polovini()) {
				pom2=pom2.sledeci;
			}
			
			while(pom2!=null && pom2.sledeci!=null) {
				System.out.print(" " +pom2.sledeci.podatak);
				pom2=pom2.sledeci;
			}
		}
			
		
	}
	
	public int broj_elemenata() {
		CvorJSListe pom=prvi;
		int brojac=0;

		while(pom!=null) {
			brojac++;
		pom=pom.sledeci;
		}
		return brojac;
		
	}
	
	public int element_na_polovini() {
		CvorJSListe pom=prvi;
		int i=0;
		while(i!=broj_elemenata()/2) {
			pom=pom.sledeci;
			i++;
		}
		return pom.podatak;
	}
}
