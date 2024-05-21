import labis.cvorovi.CvorDSListe;
import labis.exception.LabisException;
import labis.test.ListGenerator;

public class adtest {

	public static void main(String[] args) {
      ad a= new ad();
     a.dodaj_na_kraj(1);
     a.dodaj_na_kraj(2);
     a.dodaj_na_kraj(3);
     a.dodaj_na_kraj(4);
     a.dodaj_na_kraj(5);
     a.dodaj_na_kraj(6);
     a.dodaj_na_kraj(7);
     a.dodaj_na_kraj(8);
     a.ispisi();
     CvorDSListe noval=null;
     a.dodaj_u_niz(1);
     a.dodaj_u_niz(5);
     a.dodaj_na_kraj(3);
     a.iz_niza_u_listu( noval, a.niz, a.brojac);
     a.ispisi_l(noval);
     System.out.println();
     a.rotiraj_k(3);
      
	}
}
