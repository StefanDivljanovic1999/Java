import labis.exception.LabisException;

public class testds {
public static void main(String[] args) {
	DSLista ds= new DSLista();
	ds.ubaci_na_pocetak(1);
	ds.ubaci_na_pocetak(2);
	ds.ubaci_na_kraj(16);
	ds.ubaci_na_kraj(4);
	ds.ubaci_na_kraj(5);
	ds.ubaci_na_kraj(6);
	ds.ubaci_na_kraj(7);
	
	try {
		ds.izbaci_sa_pocetka();
		ds.izbaci_sa_pocetka();
		ds.izbaci_sa_kraja();
		ds.izbaci_drugi();
		
	} catch (LabisException e) {
		
		System.out.println(e.getMessage());
	}
	ds.ubaci_na_predpredposlednje(8);
	ds.ubaci_na_predpredposlednje(2);
	ds.ispisi_listu();
	System.out.println("\n");
	ds.ispisi_sve_deljive_susedima();
}
}
