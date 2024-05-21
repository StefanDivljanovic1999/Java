import labis.cvorovi.CvorStabla;
import labis.exception.LabisException;
import labis.stabla.ABinarnoStablo;

public class Dan_pre extends ABinarnoStablo {
public void ispisi(CvorStabla k) {
	if(k==null) {
		return;
	}
	System.out.print(" "+k.podatak);
	ispisi(k.levo);
	ispisi(k.desno);
}
public int visina(CvorStabla k) {
	if(k==null) {
		return 0;
	}
	
	return 1+Math.max(visina(k.levo), visina(k.desno));
}
public int nivo(CvorStabla k, CvorStabla c) {
	if(k==null || c== null || !postoji(k, c)) {
		return 0;
	}
	if(k==c) {
		return 1;
	}
	if(postoji(k.levo, c)) {
		return 1+nivo(k.levo, c);
	}
	return 1+nivo(k.desno, c);
}
public boolean postoji(CvorStabla k, CvorStabla c) {
	if(k==null || c==null) {
		return false;
	}
	if(k==c) {
		return true;
	}
	return postoji(k.levo, c)|| postoji(k.desno, c);
}
public int broj_cvorova_u_intervalu(CvorStabla k, int dg, int gg) throws LabisException {
	if(k==null) {
		return 0;
	}
	if(dg>gg) {
		throw new LabisException("Pogresan interval");
	}
	if(k.podatak>dg && k.podatak<gg) {
		return 1+ broj_cvorova_u_intervalu(k.levo, dg, gg)
		+broj_cvorova_u_intervalu(k.desno, dg, gg);
	}
	return broj_cvorova_u_intervalu(k.levo, dg, gg)
			+broj_cvorova_u_intervalu(k.desno, dg, gg);
}
public int proizvod_zajednickih_predatka(CvorStabla k, CvorStabla c1, CvorStabla c2) {
	if(k==null || c1==null || c2==null || !postoji(k, c1) || !postoji(k.desno, c2)) {
		return 1;
	}
	if(postoji(k.levo, c2) && postoji(k.levo, c1)) {
		return k.podatak*proizvod_zajednickih_predatka(k.levo, c1, c2);
	}
	else if(postoji( k.desno, c2) && postoji(k.desno, c1)) {
		return k.podatak*proizvod_zajednickih_predatka(k.desno, c1, c2);
	} else {
		return k.podatak;
	}
}
public int broj_el_na_nivou(CvorStabla k, int nivo , int br) {
	
	if(k==null ) {
		return 0;
	}
	int l= broj_el_na_nivou(k.levo, nivo+1, br);
	int d= broj_el_na_nivou(k.desno, nivo+1, br);
	if(nivo==br && k.levo!=null && k.desno!=null) {
		return k.podatak+l+d;
	}
	return l+d;
}
public int broj_podstabala_vecih_od_br(CvorStabla k, int br) {
	if(k==null) {
		return 0;
	}
	if(zbir(k)>br) {
		return 1+ broj_podstabala_vecih_od_br(k.levo, br)+broj_podstabala_vecih_od_br(k.desno, br);
	}
	return broj_podstabala_vecih_od_br(k.levo, br)+broj_podstabala_vecih_od_br(k.desno, br);
}
public int zbir(CvorStabla k) {
	if(k==null) {
		return 0;
	}
	return k.podatak+zbir(k.levo)+zbir(k.desno);
}
public int razlika(CvorStabla k) {
	if(k==null) {
		return 0;
	}
	return k.podatak-razlika(k.levo)-razlika(k.desno);
}
public int max_razlika_zbira_levog_i_desnog_podstabla(CvorStabla k) {
	if(k==null) {
		return 0;
	}
	
	int l= max_razlika_zbira_levog_i_desnog_podstabla(k.levo);
	int  d= max_razlika_zbira_levog_i_desnog_podstabla(k.desno);
	int trenutna=Integer.MIN_VALUE;
	int max= Integer.MIN_VALUE;
	trenutna=l-d;
	if(trenutna>max) {
		max=trenutna
;	}
	return max;
	
}
public int max_razlika_izmedju_roditelja_i_cvora(CvorStabla k) {
	if(k==null) {
		return 0;
	}
	int trenutnaRazlikaL=Integer.MIN_VALUE;
	int trenutnaRazlikaD=Integer.MIN_VALUE;
	
	int l= max_razlika_izmedju_roditelja_i_cvora(k.levo);
	int d= max_razlika_izmedju_roditelja_i_cvora(k.desno);
	
	if(k.levo!=null) {
		trenutnaRazlikaL= k.podatak-k.levo.podatak;
	}
	if( k.desno!=null) {
		trenutnaRazlikaD= k.podatak-k.desno.podatak;
	}
	
	
	return Math.max(Math.max(trenutnaRazlikaD, trenutnaRazlikaL) , Math.max(l, d));
}
public int max_zbir_od_korena_do_lista(CvorStabla k) {
	if(k==null) {
		return 0;
	}
	if(k.levo==null && k.desno==null) {
		return k.podatak;
	}
	int l;
	int d;
	if(k.levo!=null) {
		l= max_zbir_od_korena_do_lista(k.levo);
	}
	if(k.desno!=null) {
		d= max_zbir_od_korena_do_lista(k.desno);
	}
	l=max_zbir_od_korena_do_lista(k.levo);
	d= max_zbir_od_korena_do_lista(k.desno);
	return k.podatak+ Math.max(l, d);
}
public void ispisi_od_korena_do_lista(CvorStabla k, CvorStabla c) {
	if(k==null || c==null || !postoji(k, c)) {
		return;
	}
	System.out.print(" "+k.podatak);
	ispisi_od_korena_do_lista(k.levo, c);
	ispisi_od_korena_do_lista(k.desno, c);
	if(k==c) {
		return;
	}
	
}
public void ispisi_cvorove_na_nivou(CvorStabla k, int nivo, int br) {
	
	
	if(k==null) {
		return;
	}
	if(nivo==br) {
		System.out.print(" "+k.podatak);
	
	}
	ispisi_cvorove_na_nivou(k.levo, nivo+1,br);
	ispisi_cvorove_na_nivou(k.desno, nivo+1,br);
}
public void ispisi_polul_na_nivou(CvorStabla k, int nivo, int br) {
	if(k==null) {
		return;
	}
	if(nivo==br && (k.levo==null)!=(k.desno==null)) {
		System.out.print(" "+k.podatak);
	}
	ispisi_polul_na_nivou(k.levo, nivo+1, br);
	ispisi_polul_na_nivou(k.desno, nivo+1, br);
}
public void ispisi_parne_na_putu(CvorStabla k, CvorStabla c) {
	if(k==null || c==null || !postoji(k, c)) {
		return;
	}
	if(k==c) {
		if(c.podatak%2==0) {
			System.out.print(" "+c.podatak);
		}
		return;
	}
	if(k.podatak%2==0) {
		System.out.print(" "+k.podatak);
	}
	
	ispisi_parne_na_putu(k.levo, c);
	ispisi_parne_na_putu(k.desno, c);
}

}
