package zadatak1;

public class TezineProba {
	public static void main(String[] args) {
	TezineClanovaEkipe t= new TezineClanovaEkipe();
	t.unesi(95);
	t.unesi(118);
	t.unesi(73);
	t.unesi(68);
	t.unesi(97);
	t.unesi(62);
	
	
	
	t.ispisi();
	
	System.out.println(t.pronadjiTezinu(95));
	System.out.println("Tezina najlakseg igraca: "+t.pronadjiNajlakseg());
	
	t.ispisiKategorije();
}
}
