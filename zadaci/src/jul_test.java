
public class jul_test {

	public static void main(String[] args) {
		jul2019 j= new jul2019();
		j.dodaj_na_pocetak(4);
		j.dodaj_na_pocetak(3);
		j.dodaj_na_pocetak(2);
		j.dodaj_na_pocetak(1);
		System.out.println("Elementi liste:");
		j.ispisi();
		System.out.println("\nParovi veci od broja ispod:");
		j.parovi_veci_od_K(5);
		
		System.out.println("Prosek parnih elemenata liste je: " +j.prosek_parnih_elemenata());
        
		System.out.println("\n----------------------------Zadatak niz---------------------------");
		j.dodaj_u_niz(1);
		j.dodaj_u_niz(2);
		j.dodaj_u_niz(3);
		j.dodaj_u_niz(4);
		j.dodaj_u_niz(5);
		
		System.out.println("Elementi niza:");
		j.ispisi_niz();
		System.out.println("\n");
		j.zameni_proizvodom_suseda();
	}

}
