
import labis.cvorovi.CvorJSListe;
import labis.exception.LabisException;
import labis.liste.AJSLista;

public class liste extends AJSLista {

	public void ubaci_prvi(int p) {
		/*CvorJSListe novi= new CvorJSListe(p, prvi);
		prvi=novi;*/
		prvi= new CvorJSListe(p, prvi);
		
	}
	public void ubaci_poslednji(int p) {
	CvorJSListe novi= new CvorJSListe(p, null);
	CvorJSListe pom= prvi;
	if(prvi==null) {
		prvi= new CvorJSListe(p, null);
		return;
	}
	while(pom.sledeci!=null) {
		pom=pom.sledeci;
	}
		pom.sledeci=novi;
	}
	
	void ispisi_listu() {
		
		CvorJSListe pom= prvi;
	while(pom!=null) {
		System.out.print(" "+pom.podatak);
		pom=pom.sledeci;
		
}
	
	}
void izbaci_prvi() throws LabisException {
	if(prvi==null) {
		throw new LabisException("Prazna lista!");
	}
	CvorJSListe pom= prvi.sledeci;
	prvi.podatak=pom.podatak;
	prvi.sledeci=pom.sledeci;
	}

void izbaci_poslednji() throws LabisException {
	CvorJSListe pom= prvi;
	if(prvi==null) {
		throw new LabisException("Prazna lista!");
	}
	while(pom.sledeci!=null) {
		pom=pom.sledeci;
	}
	CvorJSListe pom1= prvi;
	while(pom1.sledeci!=pom) {
		pom1=pom1.sledeci;
	}
	pom1.sledeci=null;
	
}
boolean postojiLiUListi(int el) {
	CvorJSListe pom= prvi;
	while(pom.sledeci!=null) {
		pom=pom.sledeci;
	
		if(pom.podatak==el) {
			return true;
		}
		}
	
	return false;
}

void izbaciElement(int el) throws LabisException {
	CvorJSListe pom= prvi;
	if(prvi==null) {
		throw new LabisException("Lista prazna!");
	}
	
	while(pom.sledeci.podatak!=el) {
		pom=pom.sledeci;
	}
	pom.sledeci=pom.sledeci.sledeci;
}
}