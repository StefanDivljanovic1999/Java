
import domaci1.zadatak1;

public class test1 {
public static void main(String[] args)  {
zadatak1 z= new zadatak1();
int niz[]= new int[10];
z.dodaj_u_niz(niz, 14);
z.dodaj_u_niz(niz, 1999);
z.dodaj_u_niz(niz, 25);
z.dodaj_u_niz(niz, 76);
z.dodaj_u_niz(niz, 3576);
z.dodaj_u_niz(niz, 154);
z.dodaj_u_niz(niz, 459);

System.out.println(niz.length);

z.ispisi_niz(niz);

}
}

