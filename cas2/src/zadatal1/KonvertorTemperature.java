package zadatal1;

public class KonvertorTemperature {
 double apsolutnaNulaC=-273.5;
 double apsolutnaNulaF=-459.67;
 
 double konvertujUFarenhajte(double c) {
	 if(c<apsolutnaNulaC) {
		return -1000; 
	 } 
	 else {
		 return c*9/5+32;
	 }
 }
 
 double konvertujUCelzijuse(double f){
	 if(f<apsolutnaNulaF) {
		 return -1000;
	 }
	 else {
		 return (f-32)*5/9;
	 }
 }
 
 AgregatnoStanje vratiAgregatnoStanjeVode(double temp) {
	 if(temp<0) {
		 return AgregatnoStanje.CVRSTO;
	 }
	 else if(temp>=0 && temp<=100){
		 return AgregatnoStanje.TECNO;
	 }
	 else return AgregatnoStanje.GAS;
 }
 
 
}
