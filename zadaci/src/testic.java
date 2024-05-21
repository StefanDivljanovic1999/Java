import labis.exception.LabisException;

public class testic {
public static void main(String[] args) {
	zadacici z= new zadacici();
	z.dodaj_na_pocetak(9);
	z.dodaj_na_pocetak(23);
	z.dodaj_na_pocetak(158);
	z.dodaj_na_pocetak(19);
	//z.izbaci_sa_kraja();
	
	z.pretvori_iz_liste_u_niz();
	//System.out.println("Elementi liste su:");
	//z.ispisi_listu();
	
	z.ispisi_listu();
	System.out.println("\nNajmanji element u listi je: "+z.najmanji_element());
}
}
