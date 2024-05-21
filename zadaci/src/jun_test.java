
public class jun_test {

	public static void main(String[] args) {
	jun2019 j= new jun2019();
	System.out.println("-----------ZADATAK NIZ---------------");
	j.dodaj_u_niz(1);
	j.dodaj_u_niz(2);
	j.dodaj_u_niz(3);
	j.dodaj_u_niz(4);
	j.dodaj_u_niz(5);
	j.dodaj_u_niz(6);
	System.out.println("Elementi niza su: ");
	j.ispisi_niz();
	System.out.println("\nPrepakovan niz:");
    j.prepakuj_niz(4);
    System.out.println("\n\n-------------------------ZADATAK LISTA--------------------------");
    j.dodaj_na_pocetak(1);
    j.dodaj_na_pocetak(2);
    j.dodaj_na_pocetak(3);
    j.dodaj_na_pocetak(4);
    System.out.println("\nElementi liste:");
    j.izbaci_kvadrat_manji_od_zbira();
    j.ispisi();
    System.out.println("\nZbir liste je: "+j.zbir_liste());
	}

}
