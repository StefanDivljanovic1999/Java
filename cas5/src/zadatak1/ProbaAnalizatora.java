package zadatak1;

public class ProbaAnalizatora {
public static void main(String[] args) {
	AnalizatorSlovaUTesktu a= new AnalizatorSlovaUTesktu();
	a.tekst="Ides za Kanadua!a";
	System.out.println(a.tekst);
	System.out.println("Duzina teksta: "+a.duzinaTeksta());
	System.out.println("Broj pojavljivanje malog slova a: "+a.pojavljivanjeMalogA());
	System.out.println("Broj pojavljivanje slova u zagradi: "+a.pojavljivanjeSlova('r'));
	System.out.println("Broj recenica u tekstu: "+a.brojRecenica());
	System.out.println("Broj samoglasnika u tekstu: " +a.brojSamoglasnika());
	System.out.println("Karakter koji se najvise ponavlja: "+a.maxZnak());
	System.out.println("Karakter koji se najmanje ponavlja: "+a.minZnak());
	System.out.println("Prvo pojavljivanje slova a: "+a.prvoPojavljivanjeA());
	System.out.println("Zadnje pojavljivanje slova a: "+a.zadnjePojavljivanjeA());
	System.out.println("Drugo pojavljivanje slova iz zagrade: " +a.drugoPojavljivanje('a'));
	System.out.println("Pretposlednje pojavljivanje slova iz zagrade: " +a.pretposlednjePojavljivanje('a'));

	
}
}
