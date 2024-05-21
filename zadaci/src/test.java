import labis.exception.LabisException;

public class test {
public static void main(String[] args) {
	liste l= new liste();
    l.ubaci_prvi(19);
	l.ubaci_prvi(24);
	l.ubaci_prvi(56);
	l.ubaci_prvi(73);
	l.ubaci_prvi(78);
	l.ubaci_prvi(25);
	l.ubaci_poslednji(1999);
	l.ubaci_poslednji(2003);
	try {
		l.izbaci_prvi();
	    l.izbaci_poslednji();
	    l.izbaciElement(73);
		//l.izbaciElement(1999);
	} catch (LabisException e) {
		System.out.println(e.getMessage());
	}
	
	l.ispisi_listu();

}
}
