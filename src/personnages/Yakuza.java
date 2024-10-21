package personnages;

public class Yakuza extends Humain{
	private int reputation = 0;
	
	public Yakuza(String nom, int argent, String boissFav) {
		super(nom, argent, boissFav);
	}
	
	public void extorquer(Commercant victime) {
		parler("J'extorque un faible marchant : " + victime.getNom());
		int gain = victime.seFaireExtorquer();
		gagnerArgent(gain);
		parler("J'ai piqué les " + gain + " sous de " + victime.getNom() + " j'ai maintenant " + getArgent());
	}
}
