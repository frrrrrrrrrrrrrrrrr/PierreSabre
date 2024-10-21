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
		parler("J'extorque un faible marchant : " + victime.getNom());
		reputation += 1;
		int gain = victime.seFaireExtorquer();
		gagnerArgent(gain);
		parler("J'ai piqué les " + gain + " sous de " + victime.getNom() + " j'ai maintenant " + getArgent());
	}
	
	public int perdre(){
		parler("Je perds");
		reputation -= 1;
		int perdu = getArgent();
		if(perdu>0) {
			perdreArgent(perdu);
			return perdu;
		}
		return 0;
	}
	
	public void gagner(int gain) {
		parler("Je gagne");
		reputation -= 1;
		gagnerArgent(gain);
	}
	
	
}
