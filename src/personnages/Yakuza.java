package personnages;

public class Yakuza extends Humain{
	private int reputation = 4;
	
	public Yakuza(String nom, int argent, String boissFav) {
		super(nom, argent, boissFav);
	}
	
	
	
	public int getReputation() {
		return reputation;
	}



	public void extorquer(Commercant victime) {
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		reputation += 1;
		int gain = victime.seFaireExtorquer();
		gagnerArgent(gain);
		parler("J'ai piqué les " + gain + " sous de " + victime.getNom() + " j'ai maintenant " + getArgent());
	}
	
	public int perdre(){
		
		reputation -= 1;
		int perdu = getArgent();
		parler("J'ai perdu mon duel et mes " + perdu + " sous, snif... J'ai déshonoré le clan de Warsong.");
		if(perdu>0) {
			perdreArgent(perdu);
			return perdu;
		}
		return 0;
	}
	
	public void gagner(int gain) {
		parler(" Ce ronin pensait vraiment battre " + getNom() + "du clan de Warsong ?\r\n"
				+ "Je l'ai dépouillé de ses"+ gain +" sous.");
		reputation += 1;
		gagnerArgent(gain);
	}
	
	
}
