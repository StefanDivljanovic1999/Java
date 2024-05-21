import labis.liste.AJSLista;
import labis.test.ListGenerator;

public class ciklustest {

	public static void main(String[] args) {
		ciklus c= new ciklus();
		//c.ubaci_prvi(15);
		AJSLista a= new AJSLista() {
		};
		int niz[]= {9,3,4,5,6,9};
		ListGenerator.napraviJSListuCommon(a, niz , true);
		ListGenerator.ispisiJSListu(a.prvi);
		c.izbaci_poslednji();
		System.out.println();
		ListGenerator.ispisiJSListu(a.prvi);
	}

}
