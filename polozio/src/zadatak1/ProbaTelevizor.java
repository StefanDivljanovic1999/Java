package zadatak1;

public class ProbaTelevizor {

	public static void main(String[] args) {
		Televizor t= new Televizor();
		t.ukljuci();
		t.pojacaj_ton();
		t.smanji_ton();
		t.promeniProgram(5);
		t.vratiJacinuTona();

		System.out.println(t.ispisi());
		
	}
}
