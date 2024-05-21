import labis.cvorovi.CvorDSListe;
import labis.exception.LabisException;
import labis.liste.ADSLista;

public class DSLista extends ADSLista {
void ubaci_na_pocetak(int p) {
	if(prvi==null) {
		prvi= new CvorDSListe(p, null, null);
		return;
	}
prvi.prethodni= new CvorDSListe(p, null, prvi);
prvi=prvi.prethodni;
}
void ispisi_listu() {
	CvorDSListe pom=prvi;
	while(pom!=null) {
		System.out.print(pom.podatak+" ");
		pom=pom.sledeci;
	}
	
}
void ubaci_na_kraj(int p) {
	if(prvi==null) {
		return;
		}
	CvorDSListe pom= prvi;
	
	while(pom.sledeci!=null) {
		pom=pom.sledeci;
	}
	
	CvorDSListe novi= new CvorDSListe(p, pom, null);
	pom.sledeci=novi;
}
void izbaci_sa_pocetka() throws LabisException {
if(prvi==null) {
	throw new LabisException("Prazna lista!");
}
	prvi=prvi.sledeci;
	prvi.sledeci.prethodni=null;
}
void izbaci_sa_kraja() throws LabisException {
	if(prvi==null) {
		throw new LabisException("prazna lista!");
	}
	CvorDSListe pom= prvi;
	while(pom.sledeci!=null) {
		pom=pom.sledeci;
	}
	pom.prethodni.sledeci=null;
	
}

void ubaci_na_predpredposlednje(int p) {
	CvorDSListe pom= prvi;
	while(pom.sledeci.sledeci.sledeci!=null) {
		pom=pom.sledeci;
	}
	CvorDSListe novi= new  CvorDSListe(p, pom, pom.sledeci);
	pom.sledeci=novi;
}

void izbaci_drugi() {
	CvorDSListe drugi=prvi.sledeci;
	prvi.sledeci=drugi.sledeci;
	drugi.sledeci.prethodni=prvi;
}
void ispisi_sve_deljive_susedima() {
	CvorDSListe pom=prvi;
	while(pom.sledeci!=null) {
		if(pom.podatak % pom.sledeci.podatak ==0) {
			System.out.println(pom.podatak);
		}
		pom=pom.sledeci;
	}
}
}	
