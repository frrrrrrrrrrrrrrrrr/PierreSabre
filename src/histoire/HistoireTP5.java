package histoire;
import personnages.Commercant;
import personnages.Ronin;
import personnages.Yakuza;
import personnages.Samourai;
import personnages.Traitre;

public class HistoireTP5 {
	
	public static void main(String[] args) {

		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir","whisky", 30, "Warsong"); 
		Ronin roro = new Ronin("Roro", "shochu", 60);
		
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
		marco.listerConnaissances();
		roro.listerConnaissances();
		yaku.listerConnaissances();
		
		Samourai akimoto = new Samourai("Miyamoto","Akimoto", "sak�", 80);
		akimoto.direBonjour();
		marco.faireConnaissanceAvec(akimoto);
		akimoto.listerConnaissances();
		akimoto.boire("th�");
		
		Traitre masako = new Traitre("Miyamoto","Masako", "whisky", 100); 
		
		masako.faireLeGentil();
		
		masako.ranconner(kumi);
		masako.ranconner(chonin);
		masako.ranconner(marco);
		akimoto.faireConnaissanceAvec(masako);
		masako.ranconner(chonin);
		masako.faireConnaissanceAvec(yaku);
		masako.faireLeGentil();
		masako.faireConnaissanceAvec(roro);
		

	}
}
