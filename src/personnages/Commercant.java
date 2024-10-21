package personnages;

public class Commercant extends Humain {
	public Commercant(String nom, int argent){
		super(nom, argent, "thé");
	}
	
	public int seFaireExtorquer() {
		parler("Le monde est vraiment trop injuste !");
		int argentPerdu = getArgent();
		if (argentPerdu > 0) {
			perdreArgent(argentPerdu);
			return argentPerdu;
		}
		return 0;
		
	}
	
	public void recevoir(int gain) {
		parler( gain + " sous ! Je te remercie généreux donateur!");
		gagnerArgent(gain);
	}
	
	
}
