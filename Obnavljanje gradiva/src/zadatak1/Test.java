package zadatak1;

public class Test {
public static void main(String[] args) {
	Grad grad= new Grad();
	grad.naziv="Arandjelovac";
	grad.brojStanovnika=24797;
	
	Grad grad1= new Grad();
	grad1.naziv="Beograd";
	grad1.brojStanovnika=1163763;
	
	Grad g= new Grad();
	if(grad.brojStanovnika>grad1.brojStanovnika) {
		g=grad;
	} else {
		g= grad1;
	}
	System.out.println("Grad "+g.naziv+" ima vise stanovnika!"); 
	
}
}
