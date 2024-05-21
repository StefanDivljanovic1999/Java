
public class test1 {
public static void main(String[] args) {
	dsl f= new dsl();
	f.ubaci_element_na_pocetak(449);
	f.ubaci_element_na_pocetak(78);
	f.ubaci_element_na_pocetak(16);
	f.ubaci_element_na_pocetak(31);
	f.ubaci_element_na_pocetak(16);
	f.ubaci_element_na_pocetak(53);
	f.ubaci_element_na_pocetak(49);
	System.out.println("Elementi liste su: ");
	f.ispisi_listu();
	System.out.println("\nNajmanji element liste je: " +f.min_liste());
	System.out.println("Lista nakon izbacivanja (zadnjeg) najmanjeg elementa: ");
	f.izbac_zadnji_min();
	f.ispisi_listu();
}
}
