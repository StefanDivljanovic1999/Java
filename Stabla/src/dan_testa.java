import labis.cvorovi.CvorStabla;
import labis.stabla.ABinarnoStablo;

public class dan_testa extends ABinarnoStablo {
public int visina(CvorStabla k) {
	if(k==null) {
		return 0;
	}
	return 1+ Math.max(visina(k.levo), visina(k.desno));
}
public void ispisi(CvorStabla k) {
	if(k==null) {
		return;
	}
	System.out.print( " " +k.podatak);
	ispisi(k.levo);
	ispisi(k.desno);
}
public int nivo(CvorStabla k, CvorStabla c) {
	if(k==null || c==null || !postoji(k, c)) {
		return 0;
	}
	if(postoji(k.levo, c)) {
		return 1+ nivo(k.levo, c);
	}
	return 1+ nivo(k.desno, c);
	
}
public boolean postoji(CvorStabla k, CvorStabla c) {
	if(k==null) {
		return false;
	}
	if(k==c) {
		return true;
	}
	return postoji(k.levo, c) || postoji(k.desno, c);
	
}
public int min_vrednost_na_neparnim_nivoima(CvorStabla k) {
	if(k==null) {
		return 0;
	}
	return 1;
}
public int min(CvorStabla k) {
	if(k==null) {
		return Integer.MAX_VALUE;
	}
	return Math.min(k.podatak, 0)
}

}
