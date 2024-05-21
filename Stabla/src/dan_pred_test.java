import labis.cvorovi.CvorStabla;
import labis.exception.LabisException;
import labis.generator.StabloGenerator;
import labis.stabla.ABinarnoStablo;

public class dan_pred_test {

	public static void main(String[] args) throws LabisException {
		Dan_pre d= new Dan_pre();
		ABinarnoStablo a= new ABinarnoStablo();
		StabloGenerator.izgenerisiStablo(a);
		System.out.println("Elementi stabla su: ");
		d.ispisi(a.koren);
		System.out.println("\nVisina stabla je: " +d.visina(a.koren));
		CvorStabla desni_unuk= a.koren.desno.desno;
		System.out.println("\nNivo desnog unuka je: " +d.nivo(a.koren, desni_unuk));
		System.out.println("\nBroj cvorova u intervalu 45 do 400 je: " +d.broj_cvorova_u_intervalu(a.koren, 45, 200));
        CvorStabla levi_unuk=a.koren.levo.desno.levo;
        CvorStabla levi_unuk1=a.koren.levo.levo.levo.desno;
       
        System.out.println("Proizvod zaj predaka: " +d.proizvod_zajednickih_predatka(a.koren, desni_unuk, levi_unuk1));
	System.out.println("Broj elemenata na nivou 3: " +d.broj_el_na_nivou(a.koren, 1, 2));
	System.out.println("Broj podstabala vecih od 20 :" +d.broj_podstabala_vecih_od_br(a.koren,900)); 
	System.out.println("zbir: "+d.zbir(a.koren.levo));
	System.out.println("razlika: "+d.razlika(a.koren));
	System.out.println("zbir do lista: " +d.max_zbir_od_korena_do_lista(a.koren));
	
	
	
	}

}
