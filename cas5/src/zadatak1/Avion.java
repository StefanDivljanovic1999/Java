package zadatak1;

public class Avion {
	
	String[] sedista;
	
	public Avion() {
		sedista= new String[50];
		for (int i = 0; i < sedista.length; i++) {
			sedista[i]=null;
		}
	}

	public String getSedista(int mesto) {
		return sedista[mesto];
	}

	public void uvediPutnika(int mesto, String imePrezime) {
		if(sedista[mesto]==null) {
			sedista[mesto]=imePrezime;
		} else {
			System.out.println(imePrezime+" nije rasporedjen/a na mesto: "+mesto+" jer je ono zauzeto i na njemu sedi: "+sedista[mesto]);
		}
	}
	
	public void izvediPutnika(int mesto) {
		if(sedista[mesto]==null) {
			System.out.println("Mesto :"+mesto+" nije bilo zauzeto." );
		}else {
			
			System.out.println("Putnik: "+sedista[mesto]+" je napustio mesto: "+mesto);
			sedista[mesto]=null;
		}
	}
	
	public int brojSlobodnihMesta() {
		int brojac=0;
		for (int i = 0; i < sedista.length; i++) {
			if(sedista[i]==null) {
				brojac++;
			}
		}
		return brojac;
	}
	
	public int brojZauzetihMesta() {
		int brojac=0;
		for (int i = 0; i < sedista.length; i++) {
			if(sedista[i]!=null) {
				brojac++;
			}
		}
		return brojac;
	}
	
	public void imenaPutnika(String prezime) {
		String ime;
		int j=1;
		System.out.println("Putnici koji imaju prezime: "+prezime);
		for (int i = 0; i < sedista.length; i++) {
			if(sedista[i]!=null && sedista[i].split(" ")[1].equals(prezime)) { 
			ime= sedista[i].split(" ")[0];
			System.out.println((j++)+". "+ime);
			}
		}
	}
	
	public int prezimenaPutnika(String ime) {
		
		int brojac=0;
		
		for (int i = 0; i < sedista.length; i++) {
			if(sedista[i]!=null && sedista[i].split(" ")[0].equals(ime)) { 
			brojac++;
			}
		}
		return brojac;
	}
	
	void ispisi_status() {
		for (int i = 0; i < sedista.length; i++) {
			if(sedista[i]==null) {
				System.out.println("Sediste broj: "+i+ " je slobodno.");
			} else {
				System.out.println("Sediste broj: "+i+ " je zauzeo/la : "+sedista[i]);
			}
		}
	}
}
