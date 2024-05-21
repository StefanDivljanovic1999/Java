import labis.cvorovi.CvorStabla;
import labis.exception.LabisException;
import labis.stabla.ABinarnoStablo;

public class stabla1 extends ABinarnoStablo {
 public int broj(CvorStabla k) {
	 if(k==null) {
		 return 0;
	 }
	 return 1 +broj(k.levo)+broj(k.desno);
 }
 
 public int zbir(CvorStabla k) {
	 if(k==null) {
		 return 0;
	 }
	 return k.podatak+zbir(k.levo)+zbir(k.desno);
 }
 
 public int zbir_parnih(CvorStabla k) {
	 if(k==null) {
		 return 0;
	 }
	 if(k.podatak%2==0) {
		 return k.podatak+zbir_parnih(k.levo)+zbir_parnih(k.desno);
	 }
	 return zbir_parnih(k.levo)+zbir_parnih(k.desno);
 }
 
 public int proizvod_pozitivnih_trocifrenih(CvorStabla k) {
	 if(k==null) {
		 return 1;
	 }
	 if(k.podatak>=100 && k.podatak<=999  && k.podatak>0) {
		 return k.podatak * proizvod_pozitivnih_trocifrenih(k.levo)*proizvod_pozitivnih_trocifrenih(k.desno);
	 }
	 return proizvod_pozitivnih_trocifrenih(k.levo)*proizvod_pozitivnih_trocifrenih(k.desno);
 }
 
 public int broj_neparnih_listova(CvorStabla k) {
	 if(k==null) {
		 return 0;
	 }
	 if(k.podatak%2!=0 && k.levo== null && k.desno==null) {
		 return 1 + broj_neparnih_listova(k.levo)+broj_neparnih_listova(k.desno);
	 }
	 return broj_neparnih_listova(k.levo)+broj_neparnih_listova(k.desno);
 }
 
 public int zbirNegativnihPolulistova(CvorStabla k) {
	 if(k==null) {
		 return 0;
	 }
	 if(k.podatak<0 && ((k.levo==null)!=(k.desno==null))) {
		 return k.podatak+zbirNegativnihPolulistova(k.levo)+zbirNegativnihPolulistova(k.desno);
	 }
	 return zbirNegativnihPolulistova(k.levo)+zbirNegativnihPolulistova(k.desno);
 }
 
 public int proizvod_un_cvorova_oba_deteta_listovi(CvorStabla k) {
	 if(k==null) {
		 return 1;
	 }
	 if((k.levo!=null &&k.desno!=null) && (k.levo.levo==null && k.levo.desno==null) && (k.desno.levo==null && k.desno.desno==null)) {
		 return k.podatak*proizvod_un_cvorova_oba_deteta_listovi(k.levo)*proizvod_un_cvorova_oba_deteta_listovi(k.desno);
	 }
	 return proizvod_un_cvorova_oba_deteta_listovi(k.levo)*proizvod_un_cvorova_oba_deteta_listovi(k.desno);
 }
 
 public int proizvod_prostih(CvorStabla k)  {
	 if(k==null) {
		return 1;
	 }
	if(prost(k.podatak)) {
		return k.podatak*proizvod_prostih(k.levo)*proizvod_prostih(k.desno);
	}
return proizvod_prostih(k.levo)*proizvod_prostih(k.desno);
 }
 
 public boolean prost(int broj) {
	 int brojac=0;
	 for (int i = 1; i <=broj; i++) {
		if(broj%i==0) {
			brojac++;
		}
	}
	 if(brojac==2) {
		 return true;
	 }
	return false;
	 
 }
 
 public int zbir_deljivih_bar_jednim_detetom(CvorStabla k) {
	 if(k==null) {
		 return 0;
	 }
	 if((k.levo!= null && k.podatak%k.levo.podatak==0) ||(k.desno!=null && k.podatak%k.desno.podatak==0)) {
		 return  k.podatak+zbir_deljivih_bar_jednim_detetom(k.levo)+zbir_deljivih_bar_jednim_detetom(k.desno);
	 }
	 return zbir_deljivih_bar_jednim_detetom(k.levo)+zbir_deljivih_bar_jednim_detetom(k.desno);
 }
 
 public int broj_polulistova_vecih_od_deteta(CvorStabla k) {
	 if(k==null) {
		 return 0;
	 }
	 if((k.levo==null && k.desno!=null && k.podatak>k.desno.podatak) ||
			 (k.levo!=null && k.desno==null && k.podatak>k.levo.podatak)) {
		 return 1+ broj_polulistova_vecih_od_deteta(k.levo)+ broj_polulistova_vecih_od_deteta(k.desno);
	 }
	 return broj_polulistova_vecih_od_deteta(k.levo)+ broj_polulistova_vecih_od_deteta(k.desno);
 }
 public boolean da_li_postoji(CvorStabla k,int p) {
	 if(k==null) {
		 return false;
	 }
	 if(k.podatak==p) {
		 return true;
	 }
	 if(da_li_postoji(k.levo, p)) {
		 return true;
	 }
	 if(da_li_postoji(k.desno, p)) {
		 return true;
	 }
	 return false;
 }
 
 public boolean postoji(CvorStabla k, CvorStabla p) {
	 if(k==null || p==null) {
		 return false;
	 }
	 if(k==p) {
		 return true;
	 }
	 if(postoji(k.levo, p)) {
		 return true;
	 }
	 if(postoji(k.desno, p)) {
		 return true;
	 }
	 return false;
 }
 
 public boolean neparan_list(CvorStabla k) {
	 if(k==null) {
		 return false;
	 }
	 if((k.levo==null && k.desno==null) && k.podatak%2!=0) {
		 return true;
	 }
	 if(neparan_list(k.levo)) {
		 return true;
	 }
	 return neparan_list(k.desno);
 }
 
 public boolean svaki_polul_parno_dete(CvorStabla k) {
	 if(k==null) {
		 return true;
	 }
	 if((k.levo!=null  && k.desno==null && k.levo.levo.podatak%2!=0 ) ||
	 (k.levo==null  && k.desno!=null && k.desno.desno.podatak%2!=0 )	) {
		  return false;
			  }
	 return svaki_polul_parno_dete(k.levo) && svaki_polul_parno_dete(k.desno);
 }
 public boolean svi_pozitivni(CvorStabla k) {
	 if(k==null) {
		 return true;
	 }
	 if(k.podatak%2!=0 || k.levo.podatak%2!=0 || k.desno.podatak%2!=0) {
		 return false;
	 }
	 return svi_pozitivni(k.levo) && svi_pozitivni(k.desno);
 }
 
 public boolean svi_listovi_deljivi_roditeljem(CvorStabla k) {
	 if(k==null) {
		 return true;
	 }
	 if((k.levo!=null && k.levo.levo==null && k.levo.desno==null && k.levo.podatak%k.podatak!=0) ||
		(k.desno!=null && k.desno.levo==null && k.desno.desno==null && k.desno.podatak%k.podatak!=0)	 ) {
		 return false;
	 }
	 return svi_listovi_deljivi_roditeljem(k.levo) && svi_listovi_deljivi_roditeljem(k.desno);
 }
 
 public boolean svi_unutrasnji_deljivi_korenom(CvorStabla k) {
	 if(k==null) {
		 return true;
	 }
	 if((k.levo!=null && k.desno!=null) && k.podatak%koren.podatak!=0) {
		 return false;
	 }
	 return svi_unutrasnji_deljivi_korenom(k.levo) && svi_unutrasnji_deljivi_korenom(k.desno);
 }
 
 public int max(CvorStabla k) {
  if(k==null) {
	  return Integer.MIN_VALUE;
  }
  return Math.max(k.podatak, Math.max(k.levo.podatak, k.desno.podatak));
 }
 
 public CvorStabla min(CvorStabla k) {
	
	 if(k==null) {
		 return null;
	 }
	 CvorStabla min=k;
	 CvorStabla l=min(k.levo);
	 CvorStabla d=min(k.desno);
	 if(l!=null && l.podatak<min.podatak) {
		 min=l;
	 }
	 if(d!=null && d.podatak<min.podatak) {
		 min=d;
	 }
	 return min;
 }
 
 public CvorStabla minPozitivan(CvorStabla k) {
	 CvorStabla min=null;
	 if(k==null) {
		 return null;
	 }
	 if(k.podatak>0) {
		 min=k;
	 }
	 CvorStabla l= minPozitivan(k.levo);
	 CvorStabla d= minPozitivan(k.desno);
	 if(l!=null && l.podatak<min.podatak) {
		 min=l;
	 }
	 if(d!=null && d.podatak<min.podatak) {
		 min=d;
	 }
	 return min;
 }
 
 
}
