package zadatak1;

public class OceneStudenata {

	String[] ocene= new String[20];


	public OceneStudenata(String viseOcena) {
		if(viseOcena==null) {
			System.out.println("Greska!");
		}
		String ocena[]= viseOcena.split(";");
		for (int i = 0; i < ocena.length; i++) {
			ocene[i]=ocena[i];
		}
	}
	
	void ispisiPodatke() {
		
		String[] indeks= new String[ocene.length];
		String[] ime= new String[ocene.length];
		String[] prezime= new String[ocene.length];
		String[] ocena= new String[ocene.length];


		for (int i = 0; i < ocene.length; i++) {
			if(ocene[i]!=null) {
			indeks[i]= ocene[i].split(" ")[0];
			ime[i]= ocene[i].split(" ")[1];
			prezime[i]= ocene[i].split(" ")[2];
			ocena[i]= (ocene[i].split(" ")[3]);
			

		
		
	System.out.println((i+1)+". Indeks: "+indeks[i]+", ime: "+ime[i]+", prezime: "+prezime[i]+", ocena: "+ocene[i]);
			}
		}
		
	}
	
	
	public void polozili() {
		String[] rezultat= new String[ocene.length];
		for (int i = 0; i < ocene.length; i++) {
			if(ocene[i]!=null) {
			rezultat[i]= ocene[i].split(" ")[3];
			if(rezultat[i].equals("5")) {
			 
			}
		}
	}
}
}
	

	

