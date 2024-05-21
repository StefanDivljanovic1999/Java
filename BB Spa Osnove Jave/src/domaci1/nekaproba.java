package domaci1;


public class nekaproba {
int brojac=0;
int niz[]= new int[10];
	public void dodaj_u_niz( int el) {
		if(brojac<niz.length)
			niz[brojac++]=el;
			}
public 	void ispisi_niz() {
		for (int i = 0; i < brojac; i++) {
			System.out.println(niz[i]);
		}
	}
	public static void main(String[] args) {
		int niz[]= new int[10];
		nekaproba n= new nekaproba();
		n.dodaj_u_niz( 15);
		n.dodaj_u_niz( 4);
		n.ispisi_niz();
	}
}
