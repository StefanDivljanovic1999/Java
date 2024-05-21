package zadatak1;

public class AnalizatorTeksta {
 String tekst;
 public AnalizatorTeksta() {
	tekst="nepoznat";
}
public AnalizatorTeksta(String tekst) {
	if(tekst!=null) {
	this.tekst=tekst;
	} else {
		this.tekst="nepoznato";
		System.out.println("Greska!");
	}
}

public String getTekst() {
	return tekst;
}

public void setTekst(String tekst) {
	if(tekst!=null)
	this.tekst = tekst;
	else System.out.println("Greska");
}

void dodajTekstNaKraj(String noviTekst) {
	if(noviTekst==null) {
		System.out.println("Greska!");
	}else if (tekst=="nepoznat") {
		tekst=noviTekst;
	}else {
		tekst+=noviTekst;
	}
	
}

boolean daLiJeIstiTekst(String tekst) {
	if(this.tekst.equals(tekst)) {
		return true;
	}
	return false;
}

boolean daLiJeIstiTekstCase(String tekst) {
	if(this.tekst.equalsIgnoreCase(tekst)) {
		return true;
	}
	return false;
}



}