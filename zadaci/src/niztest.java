
public class niztest {
public static void main(String[] args) {
	nizovi n= new nizovi();
	n.dodaj_u_niz(15);
	n.dodaj_u_niz(18);
	n.dodaj_u_niz(23);
	n.dodaj_u_niz(46);
	n.dodaj_u_niz(26);
	n.dodaj_u_niz(-7);
	n.dodaj_u_niz(14);
	n.dodaj_u_niz(28);
	
	int niz[]= new int[]{2,4,76,1,2,3,4,5,646,7};
	n.ispisi_u_rikverc_rekurzija(niz, 9);
	

}
}
