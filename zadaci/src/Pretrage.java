import java.util.Iterator;
import java.util.Stack;

public class Pretrage {
	int niz[]= new int[50];
	int brojac=0;
	public void ubaci_u_niz(int el) {
		if(brojac<niz.length) {
			niz[brojac++]=el;
		}
	}
	
	public void ispisi_niz() {
	for (int i = 0; i < brojac; i++) {
		System.out.println(i+1+". "+niz[i]);
	}
	}
	
	public int pretrazi(int el) {
		int mesto=0;
		for (int i = 0; i <brojac; i++) {
			if(niz[i]==el) {
				
				return mesto+1;
			}
			mesto++;
		}
		return -1;
	}
	
	
	
}
