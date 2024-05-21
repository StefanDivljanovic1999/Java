import labis.cvorovi.CvorStabla;
import labis.generator.StabloGenerator;
import labis.stabla.ABinarnoStablo;

public class test extends ABinarnoStablo {

	

	public static void main(String[] args) {
		stabla4 s= new stabla4();
		
	/*ABinarnoStablo a= new ABinarnoStablo();
	StabloGenerator.izgenerisiStablo(a);
	//StabloGenerator.zameniVrednost(a.koren, 56, 1156);
	s.ispisi(a.koren);

	
	CvorStabla p= a.koren.desno.desno.levo;
	System.out.println("\n"+s.nivo(a.koren, p));
	System.out.println("\n Zbir unutrasnjih cvorova na nivou je : " +s.zbir_elemenata_na_nivou(a.koren, 2,1));
	*/
		int a=5;
		int b=a--;
		a=b++ + --a;
		System.out.println(a+" " +b);
		System.out.println(--b);
		System.out.println(a++);
	
	}
	

}
