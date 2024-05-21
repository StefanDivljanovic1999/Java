package zadatak1;

public class AnalizatorReciIRecenica {
String tekst="nepoznat";

public String getTekst() {
	return tekst;
}

public void setTekst(String tekst) {
	this.tekst = tekst;
}

public void bezPrvogSlova() {
	String krnjiTekst= tekst.substring(1);
	System.out.println(krnjiTekst);
}

public void bezPrvaCetiriSlova() {
	String krnjiTekst= tekst.substring(4);
	System.out.println(krnjiTekst);
}

public void bezPrveReci() {
	
	String prvaRec= tekst.split(" ")[0];
	System.out.println(prvaRec);
	String krnjiTekst= tekst.substring(prvaRec.length());
	System.out.println("Tekst bez prve reci: "+krnjiTekst);
}

public String bezPrveRecenice() {
	int indexPrveTacke= tekst.indexOf('.')+1;
	if(indexPrveTacke<0) {
		return null;
	}
	String krnjiTekst= tekst.substring(indexPrveTacke);
	return krnjiTekst;
}

public int brojReci() {
	return tekst.split(" ").length;
}
public String PoslednjaRec() {
	int indexPoslednjegRazmaka= tekst.lastIndexOf(" ");
	if(indexPoslednjegRazmaka==-1) {
		return null;
	}
	if(brojReci()==1) {
		return tekst;
	}
	String poslednjaRec=tekst.substring(indexPoslednjegRazmaka);
	return poslednjaRec;
}

public String PoslednjaRecenica() {
	int indexPoslednjeTacke= tekst.lastIndexOf(".")+1;
	
	return tekst.substring(indexPoslednjeTacke);
}

public int brojReciUTekstu(String tekstic ,String rec) {
	int brojac=0;
	String[] reci= tekstic.split(" ");
	
	for (int i = 0; i < reci.length; i++) {
		if(reci[i].equalsIgnoreCase(rec) || reci[i].equalsIgnoreCase(rec+'.')) {
			brojac++;
		}
	}
	return brojac;
}

public String maxRec(String tekstic) {
	int maxRecPon= Integer.MIN_VALUE;
	String maxRec=null;
	String[] reci= tekstic.split(" ");
	for (int i = 0; i <reci.length; i++) {
		if(brojReciUTekstu(tekstic, reci[i])>maxRecPon) {
			maxRec=reci[i];
			maxRecPon=brojReciUTekstu(tekstic, reci[i]);
		}
	}
	System.out.println("Broj ponavljanja maksimalne reci: "+maxRecPon);
	return maxRec;
}

}
