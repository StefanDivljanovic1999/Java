import labis.cvorovi.CvorStabla;
import labis.exception.LabisException;
import labis.stabla.ABinarnoStablo;

public class stabla2 extends ABinarnoStablo {
	public int broj(CvorStabla k) {
		if(k==null) {
			return 0;
		} else {
		return 1+ broj(k.levo)+broj(k.desno);
		}
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
	
	public int proizvodPozitivnihTrocifrenih(CvorStabla k) {
		if(k==null) {
			return 1;
		}
		if(k.podatak>=100 && k.podatak<=999) {
			return k.podatak*proizvodPozitivnihTrocifrenih(k.levo)*proizvodPozitivnihTrocifrenih(k.desno);
		}
		return proizvodPozitivnihTrocifrenih(k.levo)*proizvodPozitivnihTrocifrenih(k.desno);
	}
	
	public int brojNeparnihListova(CvorStabla k) {
		if(k==null) {
			return 0;
		}
		if(k.levo==null && k.desno==null && k.podatak%2!=0) {
			return 1+brojNeparnihListova(k.levo)+brojNeparnihListova(k.desno);
		}
		return brojNeparnihListova(k.levo)+brojNeparnihListova(k.desno);
	}
	
	public int brojNegativnihPolulistova(CvorStabla k) {
		if(k==null) {
			return 0;
		}
		if((k.levo==null) != (k.desno==null) && k.podatak<0) {
			return 1+ brojNegativnihPolulistova(k.desno)+brojNegativnihPolulistova(k.levo);
		}
		return brojNegativnihPolulistova(k.desno)+brojNegativnihPolulistova(k.levo);
	}
	
	public int proizvodPolulistovaSaDvaDeteta(CvorStabla k) {
		if(k==null) {
			return 1;
		}
		if((k.levo!=null && k.desno!=null) && (k.levo.levo!=null && k.levo.desno!=null)
				&& (k.desno.levo!=null && k.desno.desno!=null)) {
			return k.podatak*proizvodPolulistovaSaDvaDeteta(k.levo)*proizvodPolulistovaSaDvaDeteta(k.desno);
		}
		return proizvodPolulistovaSaDvaDeteta(k.levo)*proizvodPolulistovaSaDvaDeteta(k.desno);

	}
	
	public int prosek(CvorStabla k) throws LabisException {
		if(k==null) {
		throw new LabisException("Greska!");
		}
		return zbir(k)/broj(k);
	}
	
	public boolean prost(int broj) {
		int brojac=0;
		for (int i = 1; i <= broj; i++) {
			if(broj%i==0) {
				 brojac++;
			}
		}
		return (brojac==2);
	}
	
	public int proizvodProstih(CvorStabla k) {
		if(k==null) {
			return 1;
		}
		if(prost(k.podatak)) {
			return k.podatak*proizvodProstih(k.levo)*proizvodProstih(k.desno);
		}
		return proizvodProstih(k.levo)*proizvodProstih(k.desno);
	}
	
	public int zbirDeljivihBarJednimDetetom(CvorStabla k) {
		if(k==null) {
			return 0;
		}
		if((k.podatak%k.levo.podatak==0 && k.levo!=null) || (k.desno!=null && k.podatak%k.desno.podatak==0)) {
			return k.podatak+zbirDeljivihBarJednimDetetom(k.levo)+zbirDeljivihBarJednimDetetom(k.desno);
		}
		return zbirDeljivihBarJednimDetetom(k.desno)+zbirDeljivihBarJednimDetetom(k.levo);
	}
	
	public int brojPolulistovaVecihOdSvogDeteta(CvorStabla k) {
		if(k==null) {
			return 0;
		}
		if((k.levo!=null && k.desno==null && k.levo.podatak<k.podatak) ||
				(k.levo==null && k.desno!=null && k.desno.podatak<k.podatak)) {
			return 1+brojPolulistovaVecihOdSvogDeteta(k.levo)+brojPolulistovaVecihOdSvogDeteta(k.desno);
		}
		return brojPolulistovaVecihOdSvogDeteta(k.levo)+brojPolulistovaVecihOdSvogDeteta(k.desno);
	}
	
	public int maxVr(CvorStabla k)  {
		int max= Integer.MIN_VALUE;
		if(k==null) {
			return max;
		}
		return Math.max(k.podatak, Math.max(maxVr(k.levo), maxVr(k.desno)));
	}
	
	
	public void ispisiKorenDoCvora(CvorStabla k) {
		if(k==null) {
			return;
		}
		System.out.println(k.podatak);
		if(k.levo==null && k.desno==null) {
			return;
		}
		if(visina(k.levo)>visina(k.desno)) {
			ispisiKorenDoCvora(k.levo);
		} else {
			ispisiKorenDoCvora(k.desno);
		}
		
	}
	public int visina(CvorStabla k) {
		if(k==null) {
			return 0;
		}
		return 1+Math.max(visina(k.levo), visina(k.desno));
	}
	
	public void ispisiOdKorenaDoMax(CvorStabla k) {
		if(k==null) {
			return;
		}
		System.out.println(k.podatak);
		if(k.podatak==maxVr(k)) {
			return;
		}
		if(maxVr(k.levo)>maxVr(k.desno)) {
			ispisiKorenDoCvora(k.levo);
		} else {
			ispisiKorenDoCvora(k.desno);
		}
	}
	
	public void ispisiOdKorenaDoCvoraBST(CvorStabla k, int p) {
		if(k==null) {
			return;
		}
		System.out.println(k.podatak);
		if(k.podatak==p) {
			return;
		}
		if(p<k.podatak) {
			ispisiOdKorenaDoCvoraBST(k.levo, p);
			 
		}
		if(p>k.podatak) {
			ispisiOdKorenaDoCvoraBST(k.desno, p);
		}
	}
	
	public void quiz(int i) {
		if(i>1) {
			quiz(i/2);
			System.out.println(i);
			quiz(i/3);
		}
		System.out.println(i);
	}
	
	public void quiz1(int i) {
		if(i>0) {
			quiz1(i-2);
			quiz1(i-2);
			System.out.print(i);
		}
	
	}
	
	public void quiz2(int i) {
	if(i<1) {
		return;
		
	}
	System.out.print("*");
	if(i%3==0) {
		quiz2(--i);
		System.out.print(i);
		quiz2(i/2);
	}
	if(i%3==1) {
		quiz2(i/2);
		System.out.print("i");
		quiz2(i/3);
	}
	
	
	}
	
	public int maxVrednost(CvorStabla k) throws LabisException {
		if(k==null) {
			return Integer.MIN_VALUE;
		}
		
		
		return Math.max(k.podatak,Math.max(maxVrednost(k.levo),maxVrednost(k.desno)));
	}
	
	public CvorStabla minCvor(CvorStabla k) {
		if(k==null) {
			return null;
		}
		CvorStabla max=k;
		CvorStabla l=minCvor(k.levo);
		CvorStabla d= minCvor(k.desno);
		
		if(l!=null && l.podatak<max.podatak) {
			max=l;
		}
		
		if(d!=null && d.podatak<max.podatak) {
			max=d;
		}
		return max;
	}
	
	public CvorStabla minPozitivan(CvorStabla k) {
		if(k==null) {
			return null;
		}
		CvorStabla min=null;
		CvorStabla l=minPozitivan(k.levo);
		CvorStabla d= minPozitivan(k.desno);
		if(l!=null && (min==null || l.podatak<min.podatak)) {
			min=l;
		}
		if(d!=null && (min==null || d.podatak<min.podatak)) {
			min=d;
		}
		return min;
	}
	
	public CvorStabla pronadji(CvorStabla k,int p) {
		if(k==null) {
			return null;
		}
		if(k.podatak==p) {
			return k;
		}
		CvorStabla l= pronadji(k.levo, p);
		CvorStabla d= pronadji(k.desno, p);
		if(l!=null) {
			return l;
		}
		return d;
	}
	
	public CvorStabla pronadjiBST(CvorStabla k,int p) {
		if(k==null) {
			return null;
		}
		if(k.podatak==p) {
			return k;
		}
		if(p>k.podatak) {
			return pronadjiBST(k.desno, p);
		}
		return pronadjiBST(k.levo, p);
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
	
	public int visina1(CvorStabla k) {
		if(k==null) {
			return 0;
		}
		return 1+Math.max(visina1(k.levo), visina(k.desno));
	}
	
	public int nivo(CvorStabla k, CvorStabla c) {
		if(k==null || k==c) {
			return 0;
		}
		if(k.levo==c || k.desno==c) {
			return 1;
		}
		if(pronadji(k.levo, c.podatak)!=null) {
			return 1+nivo(k.levo, c);
		}
		return 1+nivo(k.desno,c);
		
	}
	
	public CvorStabla maxPolulist(CvorStabla k) {
		if(k==null) {
			return null;
		}
		CvorStabla max=null;
		return max;
		
	}
	
	public boolean postoji(CvorStabla k, CvorStabla c) {
		if(k==null || c==null) {
			return false;
		}
		if(k==c) {
			return true;
		}
		if(postoji(k.levo, c)) {
			return true;
		}
		if(postoji(k.desno, c)) {
			return true;
		}
		return false;
		
	}
	
	public int nivo2(CvorStabla k, CvorStabla c) {
		if(k==null || c==null || !postoji(k, c) || k==c) {
			return 0;
		}
		if(k.levo==c || k.desno==c) {
			return 1;
		}
		if(postoji(k.levo, c)) {
			return 1+nivo(k.levo, c);
		}
		return 1+nivo(k.desno, c);
	}
	
	public int vis(CvorStabla k) {
		if(k==null ) {
			return 0;
		}
		return 1+Math.max(vis(k.levo), vis(k.desno))
		;
	}
	
	public CvorStabla maxPolulist1(CvorStabla k) {
		if(k==null) {
			return null;
		}
		CvorStabla max=null;
		CvorStabla l= maxPolulist(k.levo);
		CvorStabla d= maxPolulist(k.desno);
		if((k.levo==null)!=(k.desno==null)) {
			max=k;
		}
		if(l!=null && (max==null || l.podatak>max.podatak)) {
			max= l;
		}
		if(d!=null && (max==null || d.podatak>max.podatak)) {
			max= d;
		}
		return max;
	}
	
	public CvorStabla najdubljiList(CvorStabla k) {
		if(k==null) {
			return null;
		}
	
      if(k.levo==null && k.desno==null) {
    	  return k;
      }
     if(visina(k.levo)>visina(k.desno)) {
    	 return najdubljiList(k.levo);
     } else {
    	 return najdubljiList(k.desno);
     }
	}
}
