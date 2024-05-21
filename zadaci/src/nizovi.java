

public class nizovi {
	int niz[]= new int[50];
	int brojac=0;
	

 public void dodaj_u_niz(int el) {
	 if(niz.length==0 || niz==null || brojac==el) {
		 return;
	 }
	 niz[brojac++]=el;
 }
 
 public void ispisi() {
	 System.out.println("Elementi niza su: ");
	 for (int i = 0; i <brojac; i++) {
		System.out.print(" " +niz[i]);
	}
 }
 
 public double prosek() {
	 int brEl=0;
	 
	 int suma=0;
	 for (int i = 0; i <brojac; i++) {
		brEl++;
		suma+=niz[i];
	}
	 return  (double)suma/brEl;
 }
 
 public int min_pozitivan() {

	 int min= Integer.MAX_VALUE;
	 for (int i = 0; i < brojac; i++) {
		if(niz[i]<min && niz[i]>=0) {
			min=niz[i];
		}
	}
	 if(min==Integer.MAX_VALUE) {
		 return -1;
	 }
	return min;
 }

 public void invertuj_niz(){
	 int tmp[]= new int[niz.length];
	 int br1=0;
	 for (int i = brojac-1; i>=0; i--) {
		tmp[br1++]=niz[i];
	}
	 ispis(tmp, br1);
 }

 public void ispis(int niz1[], int br) {
	 for (int i = 0; i <br; i++) {
		System.out.print(" " +niz1[i]);
	}
 }

 public void invertuj2() {
	 for (int i = 0; i < brojac/2; i++) {
	 int tmp=niz[i];
	 niz[i]=niz[brojac-i-1];
	 niz[brojac-i-1]=tmp;
	}
 }

 public void sortiraj_neopadajuce() {
	 for (int i = 0; i < brojac-1; i++) {
		for (int j = i+1; j <brojac; j++) {
			if(niz[i]<niz[j]) {
			int tmp=niz[i];
			niz[i]=niz[j];
			niz[j]=tmp;
			}
		}
	}
 }

 public void veci_od_sledbenika() {
	 for (int i = 0; i <brojac; i++) {
		if(niz[i]>niz[i+1]) {
			System.out.print(" " +niz[i]);
		}
	}
 }

 public void deljivi_sa_bar_jednim_susedom() {
	 if(niz[0]%niz[1]==0) {
		 System.out.println(niz[0]);
	 }
	 if(niz[brojac-1]%niz[brojac-2]==0) {
		 System.out.println(niz[brojac-1]);
	 }
	 for (int i = 1; i <brojac-1; i++) {
		if(niz[i]%niz[i+1]==0 || niz[i]%niz[i-1]==0) {
			System.out.println(niz[i]);
		}
	}
 }

 public void ispisi_u_rikverc_rekurzija(int niz[], int brojac) {
	 if(brojac<0) {
		 return;
	 }
	 System.out.println(niz[brojac]);
	 ispisi_u_rikverc_rekurzija(niz,brojac-1);
 }
}

