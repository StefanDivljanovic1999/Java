package domaci1;

public class cene {
	double cene[]= new double[100];
	int brojac=0;
 public void dodajCenu(double cena) {
	if(brojac<100 && cena>0) {
		cene[brojac++]=cena;
	} else {
		System.out.println("Greska!");
	}
}
 public void ispisiNiz() {
for (int i = 0; i < brojac; i++) {
	
	System.out.println(i+1+ ". " +cene[i]);
	
}	
}
}