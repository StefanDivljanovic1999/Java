package domaci1;

public class cas2 {
	int brojac=0;
	int niz[]= new int[100];
public void dodaj_u_niz(int el) {
	if(brojac<niz.length) {
		niz[brojac]=el;
		brojac++;
	}
}
public void ispisi_niz() {
	for (int i = 0; i < brojac; i++) {
		System.out.println(i+1+". "+niz[i]);
	}
}
public void sortiraj_niz() {
	for (int i = 0; i <brojac-1; i++) {
		for (int j = i+1; j < brojac; j++) {
			int c= niz[i];
			niz[i]=niz[j];
			niz[j]=c;
		}
	}
}
public void dodaj2(int niz[],int el) {
	if(brojac<niz.length) {
		niz[brojac++]=el;
	}
}

public void veci_od_sledbenika() {
	for (int i = 1; i < niz.length-1; i++) {
		if(niz[i]>niz[i+1] && niz[i+1]!=niz[niz.length-1]) {
			System.out.println(niz[i]);
		}
	}
}
public void broj_deljivih_sa_svojim_susedom() {
int br=0;
for (int i = 0; i < brojac-1; i++) {
	if(niz[i]%niz[i+1]==0 || niz[i+1]%niz[i]==0) {
		br++;
		System.out.println(niz[i]);
	}
}
System.out.println("Broj clanova koji su deljivi sa svojim susedima je: " +br);
}
}
