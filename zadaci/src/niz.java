import labis.exception.LabisException;

public class niz {
	int niz[]= new int[540];
	int brojac=0;
 public void dodaj_u_niz(int p) {
	 if(niz.length==brojac || p<0) {
		 return;
	 }
	 niz[brojac++]=p;
 }
 public void ispisi() {
	 System.out.println("Elementi niza su: ");
	 for (int i = 0; i < brojac; i++) {
		System.out.print(" " +niz[i]);
	}
 }
 public void proizvod_suseda() {
	int noviNiz[]= new int[niz.length];
	int br=0;
	noviNiz[br++]=niz[1]*niz[0];
	
	for (int i = 1; i <brojac-1; i++) {
		
		noviNiz[br++]=niz[i-1]*niz[i+1];
		
	}
	noviNiz[br++]=niz[brojac-1]*niz[brojac-2];
	for (int i = 0; i <br; i++) {
		System.out.print(" "+noviNiz[i]);
	}
}
 public void premesti_za_K_napred(int k) {
	 int noviNiz[]= new int[niz.length];
	 int br=0;
	 if(k>brojac) {
		 System.out.println("Korak je veci od duzine niza!!!");
		 return;
	 }
	for (int i = brojac-k; i <brojac; i++) {
		noviNiz[br++]=niz[i];
	}
	for (int i = 0; i <brojac-k; i++) {
		noviNiz[br++]=niz[i];
		}
	for (int i = 0; i < br; i++) {
		System.out.print(" "+noviNiz[i]);
	}
 }
 public int max_razlika() {
	 int max_razlika= Integer.MAX_VALUE;
	 
	 
	 for (int i = 0; i <brojac-1; i++) {
		for (int j = i+1; j <brojac; j++) {
			if(niz[i]<niz[j] && niz[i]-niz[j]<max_razlika) {
				max_razlika=niz[i]-niz[j];
				
			}
		}
		
	}
	return max_razlika;
 }

	public int vratiDuzinuNajkracegPodNiza(int[] niz, int broj) throws LabisException {
		if (niz == null || niz.length == 0) {
			throw new LabisException("przan niz");
		}
		int minDuzina = Integer.MAX_VALUE;
		for (int i = 0; i < niz.length; i++) {
			int suma = niz[i];
			int duzina = 1;
			if (suma > broj) {
				if (minDuzina > duzina) {
					minDuzina = duzina;
					continue;
				}
			}
			for (int j = i + 1; j < niz.length; j++) {
				if (suma <= broj) {
					duzina++;
					suma += niz[j];

				}
				if (suma > broj && minDuzina > duzina) {
					minDuzina = duzina;
					break;
				}

			}

		}

		if (minDuzina == Integer.MAX_VALUE) {
			throw new LabisException("nema vecih od parametra");

		}
		return minDuzina;

	}
	public int duzina_podniza_index(int i, int br) {
	 int brojac=0;
     int suma=0;
     for (int j = 0; j < niz.length; j++) {
		suma+=niz[i];
		brojac++;
		if(suma>br) {
			return brojac;
		}
			}
		return Integer.MAX_VALUE;
	}
	public int min_podniz(int broj) {
		int trenutna=0;
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < niz.length; i++) {
			trenutna=duzina_podniza_index(i, broj);
			if(trenutna<min) {
				min= trenutna;
			}
		}
		return min;
	}
		}
