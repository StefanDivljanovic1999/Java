import labis.cvorovi.CvorDSListe;
import labis.liste.ADSLista;

public class invertuj_po_k_jun_19 extends ADSLista {
 
	public void ispisi(CvorDSListe p) {
	 CvorDSListe pom=p;
	 while(pom!=null) {
		 System.out.print(" " +pom.podatak);
		 pom=pom.sledeci;
	 }
 } 
 
	public CvorDSListe invertujLIstu(CvorDSListe cvor) {
		CvorDSListe c = null;
		while (cvor != null) {
		c = new CvorDSListe(cvor.podatak, null, c);
		if (c.sledeci != null)
		c.sledeci.prethodni = c;
		cvor = cvor.sledeci;
		}
		return c;
		}
	
	public CvorDSListe invertuj_po_K(CvorDSListe p1,int k) {
		CvorDSListe p2=null;
		int i=0;
       
		for (i = 0; i < k; i++) {
			p2= new CvorDSListe(p1.podatak, null, p2);
			p1=p1.sledeci;
		}
		
        
		
		return p2;
		
	}
	
	public void ubaci_posle_prvog_manjeg(CvorDSListe p1, int el) {
		if(p1==null) {
			return;
		}
		 if(el==min_element(p1)) {
ubaci_na_kraj_liste(p1, el);
		 }
		CvorDSListe pom=p1;
		while(pom.podatak>el) {
			pom=pom.sledeci;
		}
		pom.sledeci= new CvorDSListe(el, pom, pom.sledeci);
	}
	
	public int min_element(CvorDSListe p1) {
		int min= Integer.MAX_VALUE;
	    CvorDSListe pom=p1;
	    while(pom!=null) {
	    	if(pom.podatak<min) {
	    		min=pom.podatak;
	    	}
	    	pom=pom.sledeci;
	    }
		return min;
	}
	
	public void ubaci_na_kraj_liste(CvorDSListe p1, int el) {
		if(p1==null) {
			p1= new CvorDSListe(el, null, p1);
			//return;
		}
		
		CvorDSListe pom=p1;
		
		while(pom.sledeci!=null) {
			pom=pom.sledeci;
		}
		pom.sledeci= new CvorDSListe(el, pom, null);
	}
	
	public void ubaci_izmedju_dva_negativna(CvorDSListe p1, int l) {
		CvorDSListe pom=p1;
		
		if(pom==null) {
			System.out.println("Lista je prazna!!!");
			return;
		}
		
		if(!komsije_negativni(p1)) {
			ubaci_na_kraj_liste(p1, l);
			return;
		}
		
				while((pom.podatak>0 || pom.sledeci.podatak>0)) {
			pom=pom.sledeci;
		}
		
		pom.sledeci= new CvorDSListe(l, pom, pom.sledeci);
		
		 
		
	}
	
	public boolean komsije_negativni(CvorDSListe p1) {
		CvorDSListe pom=p1;
		CvorDSListe pom1=p1.sledeci;
		int brojac=0;
		while(pom.sledeci!=null) {
			while(pom1!=null) {
				if(pom.podatak<0 && pom1.podatak<0)
			 brojac++;
				pom1=pom1.sledeci;
				pom=pom.sledeci;
				
			}
		}
		if(brojac>0) {
			return true;
		}
		return false;
		
		
	}
	
	public void izbaci_sve_manje_od_el(CvorDSListe p1, int el) {
		CvorDSListe pom=p1;
		while(pom!=null) {
			if(pom.podatak<el) {
				izbaci_el(p1, pom.podatak);
			}
			pom=pom.sledeci;
		}
	}
	
	public void izbaci_el(CvorDSListe p1, int el) {
		CvorDSListe pom=p1;
		if(p1==null) {
			System.out.println("Prazna lista!!!");
			return;
		}
		if(!postoji(p1, el)) {
			System.out.println("Element se ne nalazi na listi!!!");
			return;
		}
	   
		while(pom.sledeci.podatak!=el) {
			pom=pom.sledeci;
		}
		pom.sledeci=pom.sledeci.sledeci;
	}
	
	public boolean postoji(CvorDSListe p1, int el) {
		CvorDSListe pom=p1;
		while(pom!=null) {
			if(pom.podatak==el) {
				return true;
			}
			pom=pom.sledeci;
		}
		return false;
		
	}
	
	public void izbaci_prvi(CvorDSListe p1) {
		if(p1==null) {
			System.out.println("Prazna lista!!!");
			return;
		}
		if(p1.sledeci==null) {
			p1=null;
			return;
		}
		p1.sledeci.prethodni=null;
		prvi=prvi.sledeci;
	}
}
