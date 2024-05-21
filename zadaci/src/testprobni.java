import labis.cvorovi.CvorJSListe;
import labis.exception.LabisException;

public class testprobni {
public static void main(String[] args) {
	ProbniKolokvijum p= new ProbniKolokvijum();
	p.ubaci_na_pocetak(15);
	p.ubaci_na_pocetak(18);
	p.ubaci_na_pocetak(23);
	p.ubaci_na_pocetak(46);
	p.ubaci_na_pocetak(17);
	p.ubaci_na_pocetak(11);
	
	System.out.println("Elementi liste: ");
	p.ispisi();
	//p.ubaciPrePrvogKojiNijeVeci(16);
	System.out.println("\nElementi liste nakon izmene: ");
	p.ispisi();
	System.out.println("\n Broj elemenata: "+p.broj_Elemenata());
	System.out.println("Srednji element liste je: " +p.srednji_Element());
	try {
		System.out.println("\nIzbaceni element liste je: " +p.izbaci_srednji_element());
	} catch (LabisException e) {
		System.out.println(e.getMessage());
	}
	System.out.println("Lista nakon izbacivanja srednjeg elementa: ");
	p.ispisi();
	
}
}
