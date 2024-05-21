package zadatak2;

public class SlozeniKalkulator2 {

	void ispisi55Do0() {
		int i=55;
		while(i>0) {
			System.out.println(i);
			i--;
		}
	}
	
	static int faktorijel(int N) {
		int proizvod=1;
		for (int i = N; i>0; i--) {
			proizvod*=i;
		}
		return proizvod;
	}
	
	static int ABN(int a, int b, int n) {
		int proizvod=1;
		for (int i = 1; i <=n; i++) {
			proizvod*=(a+b);
		}
		return proizvod;
	}
	
	
}
