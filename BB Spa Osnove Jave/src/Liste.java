 

public class Liste {
class JSLista{
	CVORJSliste prvi;
}

class CVORJSliste{
	int podatak;
	CVORJSliste sledeci;
	public CVORJSliste(int podatak, Liste.CVORJSliste sledeci) {
		
		this.podatak = podatak;
		this.sledeci = sledeci;
		
	}
}

}

