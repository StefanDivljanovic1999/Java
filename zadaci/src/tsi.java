import labis.cvorovi.CvorDSListe;
import labis.exception.LabisException;

public class tsi {
public static void main(String[] args) {
	ads a= new ads();
	/*a.ubaci_na_pocetak(15);
	a.ubaci_na_pocetak(-18);
	a.ubaci_na_pocetak(2334);
	a.ubaci_na_pocetak(125);
	a.ubaci_na_pocetak(-25);
	a.ubaci_na_pocetak(22);
	a.ubaci_na_pocetak(109);
    a.ubaci_na_kraj(49);
    a.ubaci_na_kraj(488);*/
	
	/*System.out.println("Elementi liste su: ");
	a.ispisi();
	System.out.println("\nApsolutne vrednosti: ");
	a.ubaci_apsolutne();
	a.ispisi();
	System.out.println("\nElement posle dodavanja elementa posle max elementa: ");
	a.ubaci_posle_najveceg(199);*/
	/*a.ubaci_na_pocetak(24);
	a.ubaci_na_pocetak(3);
	a.ubaci_na_pocetak(8);
	a.ubaci_na_pocetak(31);
	a.ubaci_na_pocetak(19);
	a.ubaci_na_pocetak(3);
	a.ubaci_na_pocetak(5);
	a.ubaci_na_pocetak(4);
	a.ubaci_na_pocetak(11);
	a.ubaci_na_kraj(58);*/
	
	a.ubaci_na_kraj(58);
	a.ubaci_na_kraj(6);
	a.ubaci_na_kraj(36);
	a.ubaci_na_kraj(2);
	a.ubaci_na_kraj(5);
	a.ubaci_na_kraj(15);
	a.ubaci_na_kraj(35);
	a.ubaci_na_kraj(456);
	a.ubaci_na_kraj(55);
	
	
	
	
	System.out.println("\nElementi liste:");
	
	
	a.ispisi();
	//a.izbaci_deljive_nakon_zbira();
	a.ubaci_pre_prvog_deljivog(3);
	System.out.println("\n");
	//a.izbaci_sve_neparne();
	//a.zbir_dva_prethodna_veca_od_zbira_dva_sledeca();
	a.ispisi();
	System.out.println("\n");
	try {
		System.out.println("\nZbir dva prethodnika broja u zagradi:  " +a.zbir_dva_prethodnika(58));
		System.out.println("\nZbir dva sledbenika broja u zagradi: " +a.zbir_dva_sledbenika(55));
		a.zbir_dva_prethodna_veca_od_zbira_dva_sledeca();
	} catch (LabisException e) {
		System.out.println(e.getLocalizedMessage());
	}
	//System.out.println("\nZbir posle elementa: " +a.zbir_posle_el(49));
}
}
