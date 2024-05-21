import labis.cvorovi.CvorJSListe;

public class test2 {
public static void main(String[] args) {
	obn o= new obn();
	o.dodaj_na_pocetak(71);
	o.dodaj_na_pocetak(17);
	o.dodaj_na_pocetak(1459);
	o.dodaj_na_pocetak(36);
	o.dodaj_na_pocetak(17);
	o.dodaj_na_pocetak(594);
	o.dodaj_na_kraj(915);
	o.ispisi_listu();/*
	System.out.println("\nBroj cvorova cija je vrednost veca od prvog: " +o.broj_vecih_od_prvog());
	//o.izbaci_min_element();
	o.izbaci_posle_min();
	o.ispisi_listu();
	System.out.println("\nInvertovana lista: ");
	o.invertuj_listu();*/
	
	//System.out.println("\nElementi niza:");
	/*o.dodaj_u_niz(15);
	o.dodaj_u_niz(496);
	o.dodaj_u_niz(18);
	o.dodaj_u_niz(63);
	o.dodaj_u_niz(4);
	o.ispisi_niz();*/
	
	//o.napravi_niz_od_liste();
	CvorJSListe l1=null;
	 l1= new CvorJSListe(546, l1);
	 l1= new CvorJSListe(38, l1);
	 l1= new CvorJSListe(17, l1);
	 l1= new CvorJSListe(29, l1);
	 l1= new CvorJSListe(488, l1);
	 l1= new CvorJSListe(59, l1);
	
	 CvorJSListe l2=null;
	 l2= new CvorJSListe(38, l2);
	 l2= new CvorJSListe(268, l2);
	 l2= new CvorJSListe(17, l2);
	 l2= new CvorJSListe(38, l2);
	 l2= new CvorJSListe(499, l2);
	 l2= new CvorJSListe(59, l2);
	 l2= new CvorJSListe(546, l2);
	 l2= new CvorJSListe(55, l2);
	 
System.out.println("\nPresek dve liste je:");
	 o.presek_dve_liste(l2, l1);
	 
	// o.najveci_element_na_pocetku(l2);
	// System.out.println("\nElementi druge liste su: ");
	// o.ispis_liste(l2);
System.out.println("\n Elementi liste su: ");
	o.ispis_liste(l1);
	o.maksimalni_na_prvo_mesto(l1);
	System.out.println("\nLista nakon prebacivanja najveceg elementa na prvo mesto:");
	o.ispis_liste(l1);
	 
}
}
