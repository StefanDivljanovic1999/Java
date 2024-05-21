import labis.test.ListGenerator;

public class ajstest {

	public static void main(String[] args) {
		ajs a= new ajs();
		a.dodaj(4);
		a.dodaj(3);
		a.dodaj(2);
		a.dodaj(1);
		
	
		a.ispisi();
		
		System.out.println("\nZbir liste je: "+a.zbir_js());
		a.izbaci_kv_veci_od_zbira();
		System.out.println("Lista nakon izbacivanja: ");
		a.ispisi();
		

	}

}
