
public class niztest1 {

	public static void main(String[] args) {
		niz n= new niz();
		n.dodaj_u_niz(10);
		n.dodaj_u_niz(1);
		n.dodaj_u_niz(5);
		n.dodaj_u_niz(6);
		n.dodaj_u_niz(9);
	
		n.ispisi();
		System.out.println();
		System.out.println(n.min_podniz(15));
		
	}

}
