import java.io.EOFException;
import java.util.Iterator;

import javax.security.auth.callback.Callback;

import labis.cvorovi.CvorStabla;
import labis.stabla.ABinarnoStablo;

public class stabla extends ABinarnoStablo {

	public int broj(CvorStabla k) {
		if(k==null) {
			return 0;
		}
		return 1+broj(k.levo)+broj(k.desno);
	}
	
	public int zbir_stabla(CvorStabla k) {
		if(k==null) {
			return 0;
		}
		return k.podatak+ zbir_stabla(k.levo)+zbir_stabla(k.desno);
	}
	
	public int zbir_parnih_elemenata(CvorStabla k) {
		if(k==null) {
			return 0;
		}
		if(k.podatak%2==0) {
			return k.podatak+zbir_parnih_elemenata(k.desno)+zbir_parnih_elemenata(k.desno);
		}
		return zbir_parnih_elemenata(k.desno)+zbir_parnih_elemenata(k.levo);
	}
	
	public int proizvod_pozitivnih_troicfrenih(CvorStabla k) {
		if(k==null) {
			return 1;
		}
		if(k.podatak>=100 && k.podatak<=999) {
			return k.podatak*proizvod_pozitivnih_troicfrenih(k.desno)*proizvod_pozitivnih_troicfrenih(k.levo);
		}
		return proizvod_pozitivnih_troicfrenih(k.levo)*proizvod_pozitivnih_troicfrenih(k.desno);
	}
	
	public int broj_neparnih_listova(CvorStabla k) {
		if(k==null) {
			return 0;
		}
		if(k.podatak%2==0 && k.levo==null && k.desno==null) {
			return 1+broj_neparnih_listova(k.levo)+broj_neparnih_listova(k.desno);
		}
		return broj_neparnih_listova(k.levo)+broj_neparnih_listova(k.desno);
	}
	
	public int broj_negativnih_polulistova(CvorStabla k) {
		if(k==null) {
			return 0;
		}
		
		if(k.podatak<0 && ((k.levo==null) !=(k.desno==null))) {
			return k.podatak+broj_negativnih_polulistova(k.levo)+broj_negativnih_polulistova(k.desno);
		}
		return broj_negativnih_polulistova(k.levo)+broj_negativnih_polulistova(k.desno);
	}
	
	public int proizvod_polulistova_sa_dva_lista(CvorStabla k) {
		if(k==null) {
			return 1;
		}
		if(k.levo!=null && k.desno!=null && k.levo.levo==null && k.levo.desno==null && k.desno.levo==null && k.desno.levo==null) {
			return k.podatak* proizvod_polulistova_sa_dva_lista(k.levo)*proizvod_polulistova_sa_dva_lista(k.desno);
		}
		return proizvod_polulistova_sa_dva_lista(k.levo)*proizvod_polulistova_sa_dva_lista(k.desno);
	}
	
	public int prosek(CvorStabla k) {
		return zbir_stabla(k)/broj(k);
	}
	
	public int br_del(int broj) {
		int brojac=0;
		for (int i = 1; i <=broj; i++) {
			if(broj%i==0) {
				brojac++;
			}
		}
		return brojac;
	}
	
	public boolean prost(int broj) {
		if(br_del(broj)==2) {
			return true;
		}
		return false;
	}
	
	public int proizvod_prostih(CvorStabla k) {
		if(k==null) {
			return 1;
		}
		if(prost(k.podatak)) {
	return k.podatak*proizvod_prostih(k.levo)*proizvod_prostih(k.desno);	
		}
		
		return proizvod_prostih(k.levo)*proizvod_prostih(k.desno);
	}
	
	public int zbir_svih_cvorova_deljivih_bar_sa_jednim_detetom(CvorStabla k) {
		if(k==null) {
			return 0;
		}
		
		if(( k.desno!=null && k.podatak%k.desno.podatak==0) || (k.levo!=null && k.podatak%k.levo.podatak==0)) {
			return k.podatak+zbir_svih_cvorova_deljivih_bar_sa_jednim_detetom(k.levo)+zbir_parnih_elemenata(k.desno);
		}
		return zbir_svih_cvorova_deljivih_bar_sa_jednim_detetom(k.levo)+zbir_parnih_elemenata(k.desno);
	}
	
	public int polulistovi_veci_od_svoje_dece(CvorStabla k) {
		if(k==null) {
			return 0;
		}
		if(((k.levo==null) != (k.desno==null)) && (k.podatak>k.levo.podatak || k.podatak>k.desno.podatak)) {
			return 1+ polulistovi_veci_od_svoje_dece(k.desno)+polulistovi_veci_od_svoje_dece(k.levo);
		}
		return polulistovi_veci_od_svoje_dece(k.desno)+polulistovi_veci_od_svoje_dece(k.levo);
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
	
	public boolean postoji_li_neparan_list(CvorStabla k) {
		if(k==null) {
			return false;
		}
		if(k.podatak%2!=0 && k.levo==null && k.desno==null) {
			return true;
		}
		if(postoji_li_neparan_list(k.desno)) {
			return true;
		}
		return postoji_li_neparan_list(k.levo);
	}
	
	public boolean svaki_polulist_ima_parno_dete(CvorStabla k) {
		if(k==null) {
			return true;
		}
		if((k.levo!=null && k.desno==null && k.levo.podatak%2!=0) || (k.desno!=null && k.desno.podatak%2!=0 && k.levo==null) ) {
			return false;
		}
		return svaki_polulist_ima_parno_dete(k.levo) && svaki_polulist_ima_parno_dete(k.desno);
	}
	
	public boolean svi_pozitivni(CvorStabla k) {
		if(k==null) {
			return true;
		}
		if(k.podatak<=0) {
			return false;
		}
		return svi_pozitivni(k.levo)&& svi_pozitivni(k.desno);
	}
	
	public boolean svako_dete_deljivo_sa_roditeljem(CvorStabla k) {
		if(k==null) {
			return true;
		}
		if(k.levo.podatak%k.podatak!=0 || k.desno.podatak%k.podatak!=0) {
			return false;
		}
		return svako_dete_deljivo_sa_roditeljem(k.levo)&& svako_dete_deljivo_sa_roditeljem(k.desno);
	}
	
	public int neparan_br_listova(CvorStabla k) {
		
		if(k==null) {
			return 0;
		}
		if(k.podatak%2!=0 && k.levo==null && k.desno==null) {
			return k.podatak+ neparan_br_listova(k.levo)+neparan_br_listova(k.desno);
		}
		return neparan_br_listova(k.levo)+neparan_br_listova(k.desno);
	}
	
	public int max_cvor(CvorStabla k) {
		
		if(k==null) {
			return Integer.MIN_VALUE;
		}
		return Math.max(k.podatak, Math.max(max_cvor(k.levo), max_cvor(k.desno)));
	}


}
