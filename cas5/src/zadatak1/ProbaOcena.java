package zadatak1;

public class ProbaOcena {
	
	public static void main(String[] args) {
	String ocene= "0067/99 Bojan Vukovic 10;0103/06 Jelena Jovic 6;0001/99 Mika Lazic 5";
	OceneStudenata o= new OceneStudenata(ocene);
	o.ispisiPodatke();
	o.polozili();
}
}
