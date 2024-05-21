import labis.cvorovi.CvorDSListe;

public class p3_test {
public static void main(String[] args) {
	priprema3 x= new priprema3();
	x.dodaj_na_pocetak(15);
	x.dodaj_na_pocetak(18);
	x.dodaj_na_pocetak(33);
	x.dodaj_na_pocetak(26);
	x.dodaj_na_pocetak(14);
	x.dodaj_na_pocetak(789);
	
	System.out.println("ELementi liste su: ");
	x.ispisi();
	System.out.println("\nIntervali:");
	//x.inv_po_inter(3);
	//x.invertuj_listu();
	x.ispisi();
	
	
}
}
