
public class tst {
public static void main(String[] args) {
	
	Pretrage p= new Pretrage();
	
	p.ubaci_u_niz(26);
	p.ubaci_u_niz(15);
	p.ubaci_u_niz(175);
	p.ubaci_u_niz(16);
	p.ubaci_u_niz(57);
	
	p.ispisi_niz();
	
	System.out.println("Mesto na kome se nalazi broj u zagradi u nizu je: " +p.pretrazi(26));
}
}
