import labis.cvorovi.CvorJSListe;
import labis.exception.LabisException;

public class testr {
public static void main(String[] args) {
	Rekurzija r= new Rekurzija();
	/*r.ispisiR(3, 9);
	System.out.println("\nRekurzivna metoda: "+r.faktorijel(5));
	try {
		System.out.println("\n" +r.faktorijelR(5));
	} catch (LabisException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	CvorJSListe prvi= null;
	prvi= new CvorJSListe(5, prvi);
	prvi= new CvorJSListe(1, prvi);
	prvi= new CvorJSListe(3, prvi);
	prvi= new CvorJSListe(4, prvi);
	prvi= new CvorJSListe(7, prvi);
	prvi= new CvorJSListe(2, prvi);
	System.out.println("Elementi liste ispisani iterativno: ");
	r.ispisiR(prvi);
	System.out.println("\nElementi liste ispisani u rikverc rekurzivno:");
	//r.ispisi_u_rikvercR(prvi);
	System.out.println("\n Proizvod neparnih elemenata liste: " +r.proizvod_neparnih_el_liste(prvi));
	*/
	int niz[]= new int[4];
	int brojac=0;
	niz[brojac]=5;
	r.ubaci_u_niz(niz, 7, brojac);
	r.ubaci_u_niz(niz, 48, brojac);
	r.ispisiR(niz, brojac);
}
}
