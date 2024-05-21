
public class od100do10 {
void ispisiOd100Do10() {
	for (int i = 100; i>=10; i--) {
		System.out.println(i);
	}
}
void ispisiSveOdAdoB(int a, int b) {
	if(a<b) {
	for (int i = a; i <=b; i++) {
		System.out.println(i+" ");
	}
	} else {
		for (int i = b; i <=a; i++) {
			System.out.println(i+" ");
		}
	}
}

}
