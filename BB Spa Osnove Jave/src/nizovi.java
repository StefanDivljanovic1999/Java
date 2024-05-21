
public class nizovi {
public void test() {
	System.out.println("Mi vezbamo nizove!");
}
public void zbirElNiza(int niz[]) {
	if(niz==null) {
		System.out.println("Niz ne postoji!");
		return;
	}
	int suma=0;
	for (int i = 0; i < niz.length; i++) {
		suma+=niz[i];
	}
	System.out.println("Zbir elemenata niza je: "+ suma);
}
void proizvodNeparnih(int niz[]) {
	if(niz==null) {
	System.out.println("Niz ne postoji!");
	
	}
	
	int proizvod=1;
	if(niz.length==0) {
		System.out.println("Niz je prazan!");
		
	}
	for (int i = 0; i < niz.length; i++) {
		if(niz[i]%2!=0) {
		proizvod=proizvod*niz[i];
		}
	}
	System.out.println("Proizvod elemenata niza je: " +proizvod);
}

}
