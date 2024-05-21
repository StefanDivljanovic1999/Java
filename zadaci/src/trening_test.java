import labis.cvorovi.CvorDSListe;

public class trening_test {
public static void main(String[] args) {
	Trening t = new Trening();
      t.dodaj_na_kraj(1);
      t.dodaj_na_kraj(2);
      t.dodaj_na_kraj(3);
      t.dodaj_na_kraj(4);
      t.dodaj_na_kraj(5);
      t.dodaj_na_kraj(6);
      t.dodaj_na_kraj(7);
      
      System.out.println("Elementi liste: ");
      t.ispisi();
	  t.izbaci_pre_tog_elementa(2);
	  System.out.println("\nNakon izbacivanja el pre 6 :");
	  t.ispisi();
	  
	  System.out.println("\n---------------------------NIZ----------------------------------");
	  t.dodaj_u_niz(1);
	  t.dodaj_u_niz(-2);
	  t.dodaj_u_niz(-3);
	  t.dodaj_u_niz(4);
	  t.dodaj_u_niz(-5);
	  t.dodaj_u_niz(6);
	  t.dodaj_u_niz(7);
	  t.ispisi_niz();
	  System.out.println();
	  t.negativni_na_pocetku();
	}
}
