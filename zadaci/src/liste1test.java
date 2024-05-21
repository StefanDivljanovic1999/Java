import labis.cvorovi.CvorJSListe;
import labis.exception.LabisException;

public class liste1test {
public static void main(String[] args) {
	cas2 c= new cas2();
	c.ubaci_na_pocetak(98);
	c.ubaci_na_pocetak(123);
	c.ubaci_na_kraj(439);
	c.ubaci_na_pocetak(96);
	c.ubaci_na_kraj(123);
	c.ubaci_na_kraj(96);
	System.out.println("Broj ponavljanja broja 96 je: " +c.broj_ponavljanja(96));
	c.ispisi_listu();
	System.out.println("\n");
	try {
		c.izbaci_element(96);
	} catch (LabisException e) {
	System.out.println(e.getMessage());
	}
	System.out.println("Lista nakon izbacivanja elementa 96:");
	c.ispisi_listu();
	
	CvorJSListe lista1=null;
	lista1= new CvorJSListe(432, lista1);
	lista1= new CvorJSListe(576, lista1);
	lista1= new CvorJSListe(3, lista1);
	lista1= new CvorJSListe(220, lista1);
	lista1= new CvorJSListe(17, lista1);
	
	CvorJSListe lista2=null;
	lista2= new CvorJSListe(18, lista2);
	lista2= new CvorJSListe(26, lista2);
	lista2= new CvorJSListe(3, lista2);
	lista2= new CvorJSListe(432, lista2);
	lista2= new CvorJSListe(76, lista2);
	System.out.println("\nElementi liste broj 1 su: ");
	c.ispisi_listu_2(lista1);
	System.out.println("\nElementi liste broj 2 su:");
	c.ispisi_listu_2(lista2);
	System.out.println("\nUnija liste broj 1 i liste broj  2:");
	try {
		c.unija_dve_liste(lista1, lista2);
		System.out.println("\nPresek liste broj 1 i liste broj 2:");
		c.presek_dve_liste(lista1, lista2);
	} catch (LabisException e) {
		System.out.println(e.getMessage());
	}
	System.out.println("\nLista 1 pre invertovanja:");
	c.ispisi_listu_2(lista1);
	System.out.println("\nLista 1 nakon invertovanja:");
	c.invertuj_listu(lista1);
		
	}

}
