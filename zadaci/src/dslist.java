import labis.cvorovi.CvorDSListe;
import labis.liste.ADSLista;

public class dslist extends ADSLista {
	public void dodaj_na_pocetak(int p) {
		if(prvi==null) {
			prvi= new CvorDSListe(p, null, null);
			return;
		}
		prvi.prethodni= new CvorDSListe(p, null, prvi);
		prvi=prvi.prethodni;
	}
	public void ispisi() {
		CvorDSListe pom=prvi;
		while(pom!=null) {
			System.out.print(" " +pom.podatak);
			pom=pom.sledeci;
		}
	}
	public void izbaci_prvi() {
		if(prvi==null) {
			System.out.println("Lista je prazna!!!");
			return;
		}
		if(prvi.sledeci==null) {
			prvi=null;
			return;
		}
	  prvi=prvi.sledeci;
	  prvi.prethodni=null;
	}
	public void izbaci(int p) {
		CvorDSListe pom=prvi;
		CvorDSListe poslednji=prvi;
		
		if(prvi==null) {
			System.out.println("Prazna lista");
			return;
		}
		if(prvi.podatak==p) {
			izbaci_prvi();
			return;
		}
		while(poslednji.sledeci!=null) {
			poslednji=poslednji.sledeci;
		}
		if(poslednji.podatak==p) {
			izbaci_zadnji();
			return;
		}
		
		while(pom.sledeci.podatak!=p) {
			pom=pom.sledeci;
		}
		
		pom.sledeci=pom.sledeci.sledeci;
		pom.sledeci.prethodni=pom;
	}
	public void izbaci_zadnji() {
		if(prvi==null) {
			System.out.println("Prazna lista!!!");
			return;
		}
		if(prvi.sledeci==null) {
			prvi=null;
			return;
		}
		CvorDSListe pom=prvi;
		while(pom.sledeci!=null) {
			pom=pom.sledeci;
		}
		pom.prethodni.sledeci=null;
	}
	public void izbaci_deljive_zbirom_suseda() {
		CvorDSListe pom=prvi;
		
		if(pom.prethodni==null && pom.sledeci.podatak%pom.podatak==0) {
			izbaci_prvi();
		}
		
		
		while(pom!=null) {
			if(pom.prethodni!=null && pom.sledeci!=null &&
			(pom.prethodni.podatak+pom.sledeci.podatak)%pom.podatak==0) {
				System.out.print(" " +pom.podatak);
			}
			if(pom.sledeci==null && pom.prethodni.podatak%pom.podatak==0) {
				System.out.print(" "+pom.podatak);
			}	
			pom=pom.sledeci;
		}
	

		
	}
	public void ubaci_nakon_prvog_veceg(int p) {
		CvorDSListe pom=prvi;
		while(pom.podatak<p) {
			pom=pom.sledeci;
		}
		pom.sledeci= new CvorDSListe(p, pom, pom.sledeci);
		
	}
	public void izbaci_neki(int p) {
	 CvorDSListe pom=prvi;
	 while(pom.sledeci.podatak!=p ) {
		 pom=pom.sledeci;
	 }
	pom.sledeci=pom.sledeci.sledeci;
	pom.sledeci.sledeci.prethodni=pom;
	}
	public void ubaci_izmedju_dva_negativna(int p) {
		CvorDSListe pom=prvi;
		
		while(!(pom.podatak<0 && pom.sledeci.podatak<0)) {
			pom=pom.sledeci;
		}
		
		
		pom.sledeci= new CvorDSListe(p, pom, pom.sledeci);
		pom.sledeci.prethodni=pom;
	}
    public void izbaci_svaki_treci() {
    
    	
     
    }
    public int br_elemenata() {
    	int br=0;
    	CvorDSListe pom=prvi;
    	while(pom!=null) {
    		br++;
    		pom=pom.sledeci;
    	}
		return br;
    }
    public int vratiSumuPosleP(CvorDSListe p) {
		int sumaPosle =0;
		CvorDSListe pom = p.sledeci;
		while(pom!=null) {
			sumaPosle+=pom.podatak;
			pom=pom.sledeci;
		}
		return sumaPosle;
	}
	public void ispisiVecuPolovinuBezP(CvorDSListe p) {
		if(prvi == null || p == null) {
			return;
		}
		if(vratiSumuPreP(p)>vratiSumuPosleP(p)) {
			CvorDSListe pom = prvi;
			while(pom!=p)
			{
				System.out.print("  "+pom.podatak+"  ");
				pom=pom.sledeci;
			}
		}
		if(vratiSumuPosleP(p)>vratiSumuPreP(p)) {
			CvorDSListe pom =p.sledeci;
			while(pom!=null) {
				System.out.print("  "+pom.podatak+"  ");
				pom=pom.sledeci;
			}
		}
		
		
	}
	public int vratiSumuPreP(CvorDSListe p) {
		int sumaPre =0;
		CvorDSListe pom = prvi;
		while(pom!=p) {
			sumaPre+=pom.podatak;
			pom=pom.sledeci;
			
		}
		return sumaPre;
	}
	public void izbaci_neparne() {
		CvorDSListe pom=prvi;
		while(pom!=null) {
			if( pom.sledeci.podatak%2!=0  ) {
				izbaci(pom.podatak);
			}
			pom=pom.sledeci;
		}
		
	}
	public void ubaci_pretposlednji(int p) {
		if(prvi==null) {
			System.out.println("Prazna lista!!!");
			return;
		}
		if(prvi.sledeci==null) {
			prvi.sledeci= new CvorDSListe(p, prvi, null);
			return;
		}
		;
		CvorDSListe pom=prvi;
		while(pom.sledeci.sledeci!=null) {
			pom=pom.sledeci;
		}
		pom.sledeci= new CvorDSListe(p, pom, pom.sledeci);
		
	}
	public void izbaci_drugi_treci() {
		
		prvi.sledeci=prvi.sledeci.sledeci;
		prvi.sledeci.prethodni=prvi;
		
		prvi.sledeci=prvi.sledeci.sledeci;
		prvi.sledeci.prethodni=prvi;
	}
	public void izbaci_cvor(CvorDSListe c) {
		if(prvi==null || c==null) {
			System.out.println("Ili je lista prazna ili je c null");
			return;
		}
		if(!postoji(c)) {
			System.out.println("Element ne postoji u listi!!!");
			return;
		}
		
		CvorDSListe pom=prvi;
		while(pom.sledeci.podatak!=c.podatak) {
			pom=pom.sledeci;
		}
		pom.sledeci=pom.sledeci.sledeci;
		pom.sledeci.prethodni=pom;
	}
	public boolean postoji(CvorDSListe c) {
		CvorDSListe pom=prvi;
		while(pom!=null) {
			if(pom.podatak==c.podatak) {
				return true;
			}
			pom=pom.sledeci;
		}
		return false;
	}
	public void deljivi_prethodnicima() {
		CvorDSListe pom=prvi;
		if(prvi==null || prvi.sledeci==null) {
			System.out.println("Lista nema dovoljno elemenata!!!");
			return;
		}
		
		while(pom!=null ) {
			if(pom.prethodni!=null && pom.podatak%pom.prethodni.podatak==0)
			System.out.print(" "+pom.podatak);
			pom=pom.sledeci;
		}
		
	}
	public void izbaci_parne() {
		
		CvorDSListe pom=prvi;
		while(pom!=null ) {
			if( pom.podatak %2==0) {
				izbaci(pom.podatak);
			}
			pom=pom.sledeci;
		}
	
	}
	public double prosek_pozitivnih() {
		CvorDSListe pom=prvi;
		int brojac=0;
		int zbir=0;
		while(pom!=null) {
			if(pom.podatak%2==0) {
				zbir+=pom.podatak;
				brojac++;
			}
			pom=pom.sledeci;
		}
		return (double) (zbir)/brojac;
	}
	public void izbaci_svaki_drugi() {
		CvorDSListe pom=prvi;
		int i=1;
		while(pom!=null) {
			if(i%2==0) {
				izbaci(pom.podatak);
			}
			pom=pom.sledeci;
			i++;
		}
	}
}

