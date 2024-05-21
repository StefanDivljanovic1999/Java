import labis.cvorovi.CvorDSListe;

public class nesto {

	public static void main(String[] args) {
		CvorDSListe a = null;
		CvorDSListe b = null;
		CvorDSListe c=null;
		CvorDSListe d=null;
		a.sledeci=b;
		b.prethodni=a;
		System.out.println(a.sledeci);

	}

}
