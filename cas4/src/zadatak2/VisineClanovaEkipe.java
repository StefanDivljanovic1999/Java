package zadatak2;

public class VisineClanovaEkipe {

	int[] nizVisina;
	int brojac=0;
	
	public VisineClanovaEkipe(int kapacitet) {
		if(kapacitet>0) {
		nizVisina= new int[kapacitet];
		} else {
			nizVisina= new int[20];
		}
		for (int i = 0; i < nizVisina.length; i++) {
			nizVisina[i]=0;
		}
	}
	
	void unesi(int visina) {
		if((visina>=160 && visina<=250) && brojac<nizVisina.length ) {
			nizVisina[brojac++]=visina;
		}
		else {
			System.out.println("GRESKA");
		}
	}
	
	double vratiProsek() {
		int suma=0;
		for (int i = 0; i < nizVisina.length; i++) {
			suma+=nizVisina[i];
		}
		return (double)suma/brojac;
	}
	
	void ispisi() {
		for (int i = 0; i < nizVisina.length; i++) {
			System.out.println(i+1+". "+nizVisina[i]);
		}
	}
	
	int vratiNajvecuRazliku() {
		int max=Integer.MIN_VALUE;
		int min= Integer.MAX_VALUE;
		
		for (int i = 0; i < nizVisina.length; i++) {
			if(nizVisina[i]<min) {
				min=nizVisina[i];
			}
			if(nizVisina[i]>max) {
				max=nizVisina[i];
			}
		}
		System.out.println("Najvisi igrac u timu ima: "+max+"cm ");
		System.out.println("Najnizi igrac u timu ima: "+min+"cm ");
			return max-min;
		
	}
	
	
}
