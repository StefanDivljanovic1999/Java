package zadatak1;

import java.time.LocalDateTime;

public class ProbaTwitterPoruka {

	public static void main(String[] args) {
		TwitterPoruka tp= new TwitterPoruka();
		tp.korisnik="stefandivljanovic99";
		tp.poruka="Ovo je #moja pr#va #poruka. What's on your mind?";
		
		System.out.println(tp.prebrojHash());
		System.out.println(tp.prebrojReci());
		
		tp.ispisi();
		
		LocalDateTime rodjendan= LocalDateTime.of(1999, 6, 11, 18, 10);
		System.out.println(rodjendan);
		System.out.println(tp.proveriRodjendan(rodjendan));
	}

}
