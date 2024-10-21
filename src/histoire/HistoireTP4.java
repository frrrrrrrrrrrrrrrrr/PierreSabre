package histoire;
import personnages.Humain;
import personnages.Commercant;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof", 54, "kombucha");
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		
		Commercant marco = new Commercant("Marco", 20);
		marco.direBonjour();
		marco.recevoir(15);
		marco.boire();
		marco.seFaireExtorquer();
	}
}
