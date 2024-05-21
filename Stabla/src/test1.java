import labis.cvorovi.CvorStabla;
import labis.generator.StabloGenerator;
import labis.stabla.ABinarnoStablo;

public class test1 {
public static void main(String[] args) {
	dan_testa d= new dan_testa();
	ABinarnoStablo a= new ABinarnoStablo();
	StabloGenerator.izgenerisiStablo(a);
	d.ispisi(a.koren);
	System.out.println("\nVisina: " +d.visina(a.koren));
	CvorStabla desni= a.koren.desno.desno;
	System.out.println(d.nivo(a.koren, desni));
	System.out.println(d.min(a.koren));
}
}
