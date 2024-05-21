package zadatak1;

public class Televizor {
	boolean ukljucen=false;
	int jacina_tona=0;
	int program=1;
	
	void ukljuci() {
	  ukljucen=true;
	}
	
	void iskljuci() {
		ukljucen=false;
	}
	
	void pojacaj_ton() {
		jacina_tona+=1;
	}
	
	void smanji_ton() {
		jacina_tona-=1;
	}
	
	void iskljuciTon() {
		jacina_tona=0;
	}
	
	boolean daLiJeUkljucen() {
		return ukljucen;
	}
	
	int vratiJacinuTona() {
		return jacina_tona;
	}
	
	void promeniProgram(int program) {
		this.program=program;
	}

	public String ispisi() {
		return "Televizor [ukljucen=" + ukljucen + ", jacina_tona=" + jacina_tona + ", program=" + program + "]";
	}
	
	
	
	
	

}
