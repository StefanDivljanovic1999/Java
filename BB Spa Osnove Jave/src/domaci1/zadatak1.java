package domaci1;

import java.util.Iterator;

public class zadatak1 {

public double prosek_niza(int niz[]) {
	double prosek = 0;
	int brojac=0;
	int suma=0;
		try {
		
			for (int i = 0; i < niz.length; i++) {
				suma+=niz[i];
				brojac++;
			}
			prosek=(double)suma/brojac;		
			return prosek;
		} catch (Exception e) {
		System.out.println(e.getMessage());
		
		}
	return prosek;
	
	}
public int min_niza(int niz[]) throws LabisException {
	if(niz==null || niz.length==0) {
		throw new LabisException("Greskaa");	
		}
	int najmanji;
	najmanji= Integer.MAX_VALUE;
	for (int i = 0; i < niz.length; i++) {
		if(niz[i]<najmanji) {
			najmanji=niz[i];
		}
	}
return najmanji;

}
public int pozicija_najveceg_elementa(int niz[]) throws LabisException {
	if (niz==null ) {
		throw new LabisException("Greska!");
	}
	int pozicija = 0;
	int max=Integer.MIN_VALUE;
	for (int i = 0; i < niz.length; i++) {
		if(niz[i]>max) {
			max=niz[i];
			pozicija=i;
		}
	}

return pozicija;
}
public void dodaj_u_niz(int niz[], int el) {
int brojac=0;
if(brojac<niz.length) {
	niz[brojac]=el;
	brojac++;
} else {
	System.out.println("Greska!");
	return;
}

}
public void ispisi_niz(int niz[]) {
	for (int i = 0; i < niz.length; i++) {
		System.out.println(" "+niz[i]);
	}
}
}