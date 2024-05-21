
import labis.cvorovi.CvorJSListe;

public class zlist {
public static void main(String[] args) {
	Zadaci_liste z= new Zadaci_liste();
	
	CvorJSListe prva=null;
	prva= new CvorJSListe(1, prva);
	prva= new CvorJSListe(4, prva);
	prva= new CvorJSListe(5, prva);
	prva= new CvorJSListe(6, prva);
	
	System.out.println("Elementi prve liste su: ");
	z.ispisi(prva);
	
	CvorJSListe druga= null;
	druga= new CvorJSListe(2, druga);
	druga= new CvorJSListe(5, druga);
	druga= new CvorJSListe(6, druga);
	druga= new CvorJSListe(4, druga);
	druga= new CvorJSListe(8, druga);
	
	System.out.println("\nElementi druge liste su: ");
	z.ispisi(druga);
	
	System.out.println("\nPresek liste broj 1 i liste broj 2: ");
	//z.ispisi(z.presek(prva, druga));
	
	System.out.println("\nInvertovana lista broj 1: ");
	z.ispisi(z.invertuj(prva));
	
	z.ubaci_u_listu(15,prva);


	System.out.println("\nElementi liste: ");
	z.ubaci_na_pocetak(155);
	z.ubaci_na_pocetak(7);
	z.ubaci_na_pocetak(18);
	z.ubaci_na_pocetak(45);
	z.ubaci_na_pocetak(49);
	
	z.ispisi();
	System.out.println("\nSortirana lista: ");
	//z.SortirajListuRastuce();
	z.ispisi();
	System.out.println("\nElement na polovini liste: "+z.element_na_polovini());
	z.ispisi_polovinu_sa_vecim_zbirom();
	
}
}
