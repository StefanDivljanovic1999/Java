import labis.cvorovi.CvorDSListe;
import labis.test.ListGenerator;

public class inv_test_19 {
 public static void main(String[] args) {
	invertuj_po_k_jun_19 i= new invertuj_po_k_jun_19();
	System.out.println("--------------------LISTE--------------------");
	
	
	CvorDSListe list= null;
	list= new CvorDSListe(-1, null, list);
	list= new CvorDSListe(2, null, list);
	list= new CvorDSListe(1, null, list);
	list= new CvorDSListe(3, null, list);
	list= new CvorDSListe(7, null, list);
	list= new CvorDSListe(-6, null, list);
	
	
	System.out.println("1.Elementi liste su: ");
	
	i.ispisi(list);
	System.out.println("\n2. Ubacivanje elementa izmedju dva negativna: ");
	//i.ubaci_izmedju_dva_negativna(p1, 5);
  
	//i.izbaci_sve_manje_od_el(p1, 7);
	i.izbaci_prvi(list);
	i.ispisi(list);
	
}
}
