package personnages;

public class Samourai extends Ronin {
	private String seigneur;
	
	
	public Samourai(String seigneur, String nom, String boissFav, int argent) {
		super(nom, boissFav, argent);
		this.seigneur = seigneur;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis fier de servie le seigneur " + seigneur + ".");
	}
	
	public void boire(String boisson) {
		parler("Qu'est-ce que je vais boire comme boisson ? Tiens, je vais prendre du " + boisson);
	}
	
}
