package personnages;

public class Commercant extends Humain {
	public Commercant(String nom, int argent){
		super(nom, argent, "th�");
	}
	
	public int seFaireExtorquer() {
		parler("Le monde est vraiment trop injuste !");
		int argentPerdu = getArgent();
		perdreArgent(argentPerdu);
		return argentPerdu;
	}
	
	public void recevoir(int gain) {
		parler("Merci ! Je re�ois " + gain);
		gagnerArgent(gain);
	}
	
	
}
