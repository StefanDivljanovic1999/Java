import labis.cvorovi.CvorDSListe;

public class dsltest {

	public static void main(String[] args) {
		dslist d= new dslist();
		CvorDSListe pom=null;
				
				
				
				d.dodaj_na_pocetak(18);
				d.dodaj_na_pocetak(10);
				d.dodaj_na_pocetak(7);
				d.dodaj_na_pocetak(5);
				d.dodaj_na_pocetak(4);
				d.dodaj_na_pocetak(6);
				
				
				System.out.println("Lista:");
				d.ispisi();
				System.out.println();
				d.izbaci_svaki_drugi();
				
				System.out.println();
				d.ispisi();
				
       
		

	}

}
