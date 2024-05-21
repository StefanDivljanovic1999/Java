import labis.cvorovi.CvorStabla;
import labis.stabla.ABinarnoStablo;

public class stabla3 extends ABinarnoStablo{
 
	public boolean postoji(CvorStabla k, int p) {
		if(k==null) {
			return false;
		}
		if(k.podatak==p) {
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
	
	public boolean postoji2(CvorStabla k, CvorStabla c) {
		if(k==null || c==null) {
			return false;
		}
		if(k==c) {
			return true;
		}
		if(postoji2(k.levo, c)) {
			return true;
		}
		if(postoji2(k.desno, c)) {
			return true;
		}
		return false;
	}
	
	public boolean postojiNeparanList(CvorStabla k) {
		if(k==null) {
			return false;
		}
		if(k.levo==null && k.desno==null && k.podatak%2!=0) {
			return true;
		}
		if(postojiNeparanList(k.levo)) {
			return true;
		}
		if(postojiNeparanList(k.desno)) {
			return true;
		}
		return false;
	}
	
	public boolean sviPozitivni(CvorStabla k) {
		if(k==null) {
			return true;
		}
		if(k.podatak<=0) {
			return false;
		}
		return sviPozitivni(k.levo)&&sviPozitivni(k.desno);
	}
	
	public CvorStabla roditelj(CvorStabla k, CvorStabla c) {
		if(k==null || c==null || k==c) {
			return null;
		}
		if(k.levo==c || k.desno==c) {
			return k;
		}
		CvorStabla l= roditelj(k.levo, c);
		CvorStabla d= roditelj(k.desno, c);
		if(l!=null) {
			return l;
		}
		return d;
	}
	
	public int visina(CvorStabla k) {
		if(k==null) {
			return 0;
		}
		return 1+Math.max(visina(k.levo), visina(k.desno));
	}
	
	public int nivo(CvorStabla k, CvorStabla c) {
		if(k==null || k==c || !postoji2(k, c)) {
			return 0;
		}
		if(k.levo==c || k.desno==c) {
			return 1;
		}
		if(postoji2(k.levo, c)) {
			return 1+nivo(k.levo, c);
		}
		
			return 1+nivo(k.desno, c); 
			
	}
	
	public CvorStabla maxPolulist(CvorStabla k) {
		if(k==null) {
			return null;
		}
		CvorStabla max=null;
		CvorStabla l=maxPolulist(k.levo);
		CvorStabla d= maxPolulist(k.desno);
		if((k.levo==null) != (k.desno==null)) {
			max=k;
		}
		if(l!=null && (max==null || l.podatak>max.podatak)) {
			max=l;
		}
		if(d!=null && (max==null || d.podatak>max.podatak)) {
			max=d;
		}
		return max;
	}
	
	public CvorStabla najdubljiList(CvorStabla k) {
		if(k==null) {
			return null;
		}
		CvorStabla max=null;
	    CvorStabla l= najdubljiList(k.levo);
	    CvorStabla d= najdubljiList(k.desno);
	    if(k.levo==null && k.desno==null) {
	    	max=k;
	    }
	    if(l!=null && nivo(k, l)>nivo(k, max)) {
	    	max=l;
	    }
	    if(d!=null && nivo(k, d)>nivo(k, max)) {
	    	max=d
	    			;
	    }
		return max;
	}
	
	public int zbirZajPredaka(CvorStabla k, CvorStabla c1, CvorStabla c2) {
		if(k==null || c1==null || c2==null || !postoji2(k, c1) || !postoji2(k, c2) 
				|| k==c1 || k==c2) {
			return 0;
		}
		if( postoji2(k.levo, c1) && postoji2(k.levo, c2)) {
			return 1+zbirZajPredaka(k.levo, c1, c2);
		}
		else if ( postoji2(k.levo, c1) && postoji2(k.levo, c2)) {
			return 1+zbirZajPredaka(k.desno, c1, c2);
		}
		else return k.podatak;
	}
	
	public boolean istaStruktura(CvorStabla k1, CvorStabla k2) {
		if(k1==null && k2==null) {
			return true;
		}
		if((k1==null) || (k2==null)) {
			return false;
		}
		
		if(((k1.levo==null) != (k2.levo==null)) ||
				((k1.desno==null) != (k2.desno==null)) 	)
			return false;
		return istaStruktura(k1.levo, k2.levo) && istaStruktura(k1.desno, k2.desno);
		}
	
	public boolean istaStruktura2(CvorStabla k1, CvorStabla k2) {
		if(k1==null && k2==null) {
			return true;
		}
		if((k1==null) || (k2==null)) {
			return false;
		}
		if(k1.podatak!=k2.podatak) {
			return false;
		}
		
		if(((k1.levo==null) != (k2.levo==null)) ||
				((k1.desno==null) != (k2.desno==null)) 	)
			return false;
		return istaStruktura2(k1.levo, k2.levo) && istaStruktura2(k1.desno, k2.desno);
		}
	
	public boolean ogledalo(CvorStabla k1, CvorStabla k2) {
		if(k1==null && k2==null) {
			return true;
		}
		if(k1==null || k2==null) {
			return false;
		}
		if(((k2.levo==null)!=(k1.desno==null)) || (k1.levo==null)!=(k2.desno==null)){
			return false;
		}
		return ogledalo(k1.levo, k2.desno) &&
				ogledalo(k1.desno, k2.desno);
			
	}
	
	public int pretragaR(int niz[], int el, int i) {
		if(i==niz.length) {
	        return -1;
		}
		if(niz[i]==el) {
			return i;
		}
		return pretragaR(niz, el, i+1);
	}
}
