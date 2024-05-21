package zadatak1;

import java.util.Iterator;

public class SlozeniKalkulator {

	static final double Pi=3.14;
	
	double podeli(double broj1, double broj2) {
		return broj1/broj2;
	}
	
	double podeli(int broj1, int broj2) {
		return broj1/broj2;
	}
	
	int podeliMod(int broj1, int broj2) {
		int broj3= broj1/broj2;
		return broj1-broj2*broj3;
	}
	
	double izracunajObimKruga(double poluprecnik) {
		return (double)2*poluprecnik*Pi;
	}
	
	double izracunajPovrsinuKruga(double poluprecnik) {
		return (double)poluprecnik*poluprecnik*Pi;
	}
	
	void ispisi50Puta(int broj) {
		for (int i = 1;i <=50; i++) {
			System.out.println(i+". "+broj+"\n");
		}
	}
	
	void ispisi1Do100() {
		for (int i = 1; i <=100; i++) {
			System.out.println(i+"\n");
		}
	}
	
	static int suma(int N) {
		int suma=0;
		for (int i = 1; i <N; i++) {
			suma+=i;
		}
		return suma;
	}
	
	static double stepenX(double X, int N) {
		double stepenovano=1;
	  for (int i = 1; i <=N; i++) {
		stepenovano= stepenovano*X;
	}
	  return stepenovano;
	}
	
	static int minStepenDva(int N) {
		int proizvod=1;
		int i=0;
		while(proizvod<=N) {
		proizvod=(int)stepenX(2, i);
		i++;
		}
		return proizvod;
	}
	
	static void deliSaDva(int x) {
		
		while(x!=1) {
			x=x/2;
			System.out.print(x+" ");
		}
	}
	
}
