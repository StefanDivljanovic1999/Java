import labis.cvorovi.CvorDSListe;
import labis.exception.LabisException;
import labis.liste.ADSLista;

public class ads extends ADSLista {
	 
	 public void ispisi() {
		 CvorDSListe pom=prvi;
			while(pom!=null) {
				System.out.print(" " +pom.podatak);
				pom=pom.sledeci;
				}
	 }
	 
	 public int max() {
		 CvorDSListe pom=prvi;
		 int max= Integer.MIN_VALUE;
		 while(pom!=null) {
			 if(pom.podatak>max) {
				 max=pom.podatak;
			 }
			 pom=pom.sledeci;
		 }
		return max;
	 }
	 
	 public void ubaci_na_pocetak(int p) {
		if(prvi==null) {
			prvi= new CvorDSListe(p, null, null);
			return;
		}
		prvi= new CvorDSListe(p, null, prvi);
	 }
	 
	 public void ubaci_posle_najveceg(int p) {
		 CvorDSListe pom=prvi;
		
		while(pom.podatak!=max()) {
			pom=pom.sledeci;
		}
       pom.sledeci= new CvorDSListe(p, pom, pom.sledeci);
	 }
	 
	 public void ubaci_apsolutne() {
		 CvorDSListe pom=prvi;
		 while(pom!=null) {
			 if(pom.podatak<0) {
				 pom.sledeci= new CvorDSListe(Math.abs(pom.podatak), pom, pom.sledeci);
			 }
		pom=pom.sledeci;
		 }
	 }
	
	 public void ubaci_posle_prvog_veceg(int p) {
		
		 CvorDSListe pom=prvi;
		 
		 if(prvi==null) {
			 ubaci_na_pocetak(p);
			 return;
		 }
		 if(p>=max()) {
			 ubaci_na_kraj(p);
		 } else {
		 while(pom.podatak<p) {
			 pom=pom.sledeci;
		 	}
		 }
		 
		pom.sledeci=new CvorDSListe(p, pom, pom.sledeci);
		
	 }
	 public void ubaci_na_kraj(int p) {
		 CvorDSListe pom=prvi;
		 if(prvi==null) {
			 prvi= new CvorDSListe(p, null, null);
			 return;
		 }
		 while(pom.sledeci!=null) {
			 pom=pom.sledeci;
		 }
		pom.sledeci= new CvorDSListe(p, pom, null);
	 }
	 
	 public void ubaci_ispred_prvog_veceg(int p) {
			
		 CvorDSListe pom=prvi;
		 
		 if(prvi==null) {
			 ubaci_na_pocetak(p);
			 return;
		 }
		 if(p>=max()) {
			 ubaci_na_kraj(p);
		 } else {
		 while(pom.sledeci.podatak<p) {
			 pom=pom.sledeci;
		 	}
		 }
		 
		pom.sledeci=new CvorDSListe(p, pom, pom.sledeci);
		
	 }
	 
	 public int zbir_elemenata_liste() {
		 int zbir=0;
		 CvorDSListe pom=prvi;
		 while(pom!=null) {
			 zbir+=pom.podatak;
			 pom=pom.sledeci;
		 }
		return zbir;
	 }
	 
	 public void izbaci_deljive_sa_zbirom() {
		 CvorDSListe pom=prvi;
		 while(pom!=null) {
			 if(zbir_elemenata_liste()%pom.podatak==0) {
				 System.out.println(" " +pom.podatak);
			 }
			 pom=pom.sledeci;
		 }
	 }
	 
	 public int zbir_posle_el(int p) {
		 CvorDSListe pom=prvi;
		 int zbir=0;
		 if(postoji_u_listi(p)==false) {
			 System.out.println("Element se ne nalazi na listi!!!");
			 
		 }
		 
		 
		 while(pom.podatak!=p) {
			 pom=pom.sledeci;
		 }
		 while(pom!=null) {
			 if(pom.sledeci!=null)
			 zbir+=pom.sledeci.podatak;
			 pom=pom.sledeci;
		 }
		return zbir;
		
	 }
	 
	 public boolean postoji_u_listi(int p) {
		 CvorDSListe pom=prvi;
		 while(pom!=null) {
			 if(pom.podatak==p) {
				 return true;
			 }
			 pom=pom.sledeci;
		 }
		return false;
	 }
	 
	 public void izbaci_deljive_nakon_zbira() {
		 CvorDSListe pom=prvi;
		 while(pom!=null) {
		if(zbir_posle_el(pom.podatak)%pom.podatak==0) {
			izbaci_element(pom.podatak);
		}
			 pom=pom.sledeci;
		 }
	 }
	 
	 public void izbaci_elemente_deljive_sa_el(int el) {
	 CvorDSListe pom=prvi;
	while(pom!=null) {
		if(pom.podatak%el==0 ) {
			izbaci_element(pom.podatak);
		}
		pom=pom.sledeci;
	}
	 }
	 
	 int broj_deljivih_sa_brojem(int broj) {
		 int brojac=0;
		 CvorDSListe pom=prvi;
		 while(pom!=null) {
			 if(pom.podatak%broj==0 && pom.sledeci!=null) {
				 brojac++;
			 }
			 pom=pom.sledeci;
		 }
		return brojac;
	 }
	 
	 public void izbaci_element(int podatak) {
		 CvorDSListe pom=prvi;
		 
		if(prvi.podatak==podatak) {
			prvi=prvi.sledeci;
			return;
		}
		 
		 while(pom.sledeci.podatak!=podatak) {
			pom=pom.sledeci;
		 }
		 
		
		 
		 pom.sledeci=pom.sledeci.sledeci;
	
	 }

	 public void ubaci_pre_prvog_deljivog(int el) {
		 CvorDSListe pom=prvi;
		 if(prvi==null) {
			 prvi= new CvorDSListe(el, null, null);
			 return;
		 }
		while( pom.sledeci!=null && pom.sledeci.podatak%el!=0) {
			pom=pom.sledeci;
		}
		
		pom.sledeci= new CvorDSListe(el, pom, pom.sledeci);
				
		
	 }
	 
	 public void sortiraj_listu(int p) {
		 if(prvi == null || prvi.podatak>=p) {
				prvi = new CvorDSListe(p, null, prvi);
				if(prvi.sledeci!=null)
					prvi.sledeci.prethodni = prvi;
				return;
			}
			CvorDSListe pom = prvi;
			//stajemo kada je pom.sledeci == null || pom.sledeci.podatak>=p
			while(pom.sledeci!=null && pom.sledeci.podatak<p) 
				pom=pom.sledeci;
			
			pom.sledeci = new CvorDSListe(p, pom, pom.sledeci);
			if(pom.sledeci.sledeci!=null) {
				pom.sledeci.sledeci.prethodni = pom.sledeci;
			}
			
	 } 
	 
	 public void izbaci_sve_neparne() {
		 CvorDSListe pom=prvi;
		 while(pom!=null) {
			 if(pom.podatak%2!=0) {
				 izbaci_element(pom.podatak);
			 }
			 pom=pom.sledeci;
		 }
	 }
	 
	 public void zbir_dva_prethodna_veca_od_zbira_dva_sledeca() throws LabisException {
		CvorDSListe pom=prvi;
		
		while(pom!=null) {
			if(zbir_dva_prethodnika(pom.podatak)>zbir_dva_sledbenika(pom.podatak) && pom.prethodni!=null && pom.prethodni.prethodni!=null) {
				System.out.println(pom.podatak);
			}
			pom=pom.sledeci;
		}
			
		}
	 
	 
	 public int zbir_dva_prethodnika(int p) throws LabisException {
		 if(!postoji_u_listi(p)) {
			throw new LabisException("Nema ga na listi!!!");
			
		 }
		 CvorDSListe pom=prvi;
	 
		 while(pom.podatak!=p) {
		 pom=pom.sledeci;
		 }
		 if(prvi.podatak==p) {
		 return 0;
		 }
		 else	if(prvi.sledeci.podatak==pom.podatak ) {
		 return prvi.podatak;
		} else {
		return pom.prethodni.prethodni.podatak+pom.prethodni.podatak;
	 }
	 }
	 public int zbir_dva_sledbenika(int p) throws LabisException {
		 if(!postoji_u_listi(p)) {
				throw new LabisException("Nema ga na listi!!!");
				 }
		 CvorDSListe pom=prvi;
	while(pom.podatak!=p) {
		pom=pom.sledeci;
	}
	
	if(pom.sledeci==null) {
		return 0;
	}
	if(pom.sledeci.sledeci==null && pom.podatak==p) {
		 return pom.sledeci.podatak;
		}
	
	return pom.sledeci.podatak+pom.sledeci.sledeci.podatak;
	 }
	 
}