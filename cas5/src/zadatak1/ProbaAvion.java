package zadatak1;

public class ProbaAvion {

	public static void main(String[] args) {
		Avion a= new Avion();
		a.uvediPutnika(2, "Stefan Divljanovic");
		a.uvediPutnika(5, "Marko Markovic");
		a.uvediPutnika(1, "Uros Divljanovic");
		a.uvediPutnika(4, "Ivana Markovic");
		a.uvediPutnika(7, "Sara Saric");
		a.uvediPutnika(29, "Zoran Saric");
		a.uvediPutnika(25, "Ivana Saric");
		a.uvediPutnika(25, "Paja Pajic");

		
		System.out.println("Broj slobodnih mesta na letu: "+a.brojSlobodnihMesta());
		System.out.println("Broj zauzetih mesta na letu: "+a.brojZauzetihMesta());
		a.imenaPutnika("Divljanovic");
		System.out.println("Broj putnika sa imenom iz zagrade: "+a.prezimenaPutnika("Ivana"));
		a.ispisi_status();
		
		


	}

}
