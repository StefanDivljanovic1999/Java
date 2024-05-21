package zadatak1;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Iterator;

public class TwitterPoruka {
String korisnik="nepoznato";
String poruka="nepoznato";
LocalDateTime datum= LocalDateTime.now();

void postaviKorisnika(String korisnickoIme) {
	if(korisnickoIme!=null && korisnickoIme!="nepoznato") {
		korisnik=korisnickoIme;
	} else {
		System.out.println("Greska");
	}
}

void postaviPoruku(String poruka) {
	if(poruka!=null && poruka.length()<=140) {
		this.poruka=poruka;
	}else {
		System.out.println("Greska!");
	}
}

int prebrojHash() {
	int brojac=0;
	for (int i = 0; i <poruka.length(); i++) {
		if(poruka.charAt(i) == '#') {
			brojac++;
		}
	}
	return brojac;
}

int prebrojReci() {
String reci[]= poruka.split(" ");
return reci.length;
}

void ispisi() {
	int dan= datum.getDayOfMonth();
	int mesec=datum.getMonthValue();
	int godina=datum.getYear();
	int sat= datum.getHour();
	int minut= datum.getMinute();
	
	System.out.println("Korisnik: "+korisnik);
	System.out.println("Poruka: "+poruka);
	System.out.println("Datum i vreme:"+dan+"."+mesec+"."+godina+". "+sat+":"+minut);
	
}

boolean proveriRodjendan(LocalDateTime rodjendan) {
	
	if(rodjendan==null || !rodjendan.isBefore(datum)) {
		return false;
	}
	
	int dan= datum.getDayOfMonth();
	int mesec=datum.getMonthValue();
	
	
	
	int danR= rodjendan.getDayOfMonth();
	int mesecR=rodjendan.getMonthValue();
	
	
	if(dan==danR && mesec==mesecR) {
		return true;
	}
	
	return false;
}

}
