import labis.cvorovi.CvorJSListe;
import labis.exception.LabisException;

public class jstest {

	public static void main(String[] args) {
		jslist j= new jslist();
		CvorJSListe l1=null;
		 l1= new CvorJSListe(4, l1);
		 l1= new CvorJSListe(5, l1);
		 l1= new CvorJSListe(6, l1);
		 l1= new CvorJSListe(7, l1);
		 l1= new CvorJSListe(8, l1);
		 
		j.ubaci_na_kraj(15);
		j.ubaci_na_kraj(18);
		j.ubaci_na_kraj(23);
		j.ubaci_na_kraj(2400);
		j.ubaci_na_kraj(45);
		
		j.ispisi_listu();
		
		System.out.println();
		j.ispisi_vecu_polovinu(23);
		
		
	}

}
