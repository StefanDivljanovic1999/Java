import labis.cvorovi.CvorJSListe;

public class priprema_test {
public static void main(String[] args) {
  priprema2 p= new priprema2();
  p.ubaci_na_kraj(15);
  p.ubaci_na_kraj(18);
  p.ubaci_na_kraj(33);
  p.ubaci_na_kraj(26);
  p.ubaci_na_kraj(48);
  p.ubaci_na_kraj(14);
  p.ubaci_na_kraj(459);
  System.out.println("Elementi liste su:");
  p.ispisi();
  System.out.println("\nZbir elemenata liste je: " +p.zbir_liste());
  p.izbaci_kv_el_manji_od_zbira();
  System.out.println();
  p.ispisi();
 
  System.out.println("\nElementi niza su:");
  
  p.dodaj_u_niz(1);
  p.dodaj_u_niz(2);
  p.dodaj_u_niz(3);
  p.dodaj_u_niz(4);
  p.dodaj_u_niz(5);
  p.ubaci_na_neko_mesto(95,3);  
  p.ubaci_na_neko_mesto(99, 0);
  p.ubaci_na_neko_mesto(2003, 5);
  p.ispisi_niz();
  	
  CvorJSListe l1= null;
  l1= new CvorJSListe(9, l1);
  l1= new CvorJSListe(7, l1);
  l1= new CvorJSListe(5, l1);
  l1= new CvorJSListe(3, l1);
  l1= new CvorJSListe(1, l1);
  System.out.println("\nElementi liste l1 su: ");
  p.isp_l(l1);
  
  CvorJSListe l2=null;
  l2= new CvorJSListe(2, l2);
  l2= new CvorJSListe(4, l2);
  l2= new CvorJSListe(6, l2);
  l2= new CvorJSListe(8, l2);
  l2= new CvorJSListe(10, l2);
  System.out.println("\nElementi liste l2 su:");;
  p.isp_l(l2);
  
  System.out.println("\nElementi liste l3 su:");
  //p.napravi_neopadajucu(l1, l2);

  
  System.out.println("Elementi liste: ");
  p.ispisi();
  
  System.out.println("\nInvertovana: ");
  p.invertuj_po_intervalima(0);
  
}
   
}

