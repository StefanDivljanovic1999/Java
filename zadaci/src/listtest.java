

public class listtest {
public static void main(String[] args) {
	ListeObnova l= new ListeObnova();
	l.dodaj_na_kraj(59);
	l.dodaj_na_pocetak(15);
	l.dodaj_na_pocetak(18);
	l.dodaj_na_pocetak(59);
	l.dodaj_na_pocetak(59);
	l.dodaj_na_pocetak(17);
	l.ubaci_pretposlednji(14);

	System.out.println("Elementi liste su: ");
	l.ispisi_listu();
	
	l.izbaci_neki(59);
	System.out.println();
	l.ispisi_listu();
	
	
}
}
