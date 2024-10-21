package personnages;

public class Ronin extends Humain {
	private int honneur = 0;

	public Ronin(String nom, int argent, String boissFav) {
		super(nom, argent, boissFav);
	}
	
	public void donner(Commercant beneficiaire) {
		int don = getArgent()/10;
		parler(beneficiaire.getNom() + " prend ces " + don + " sous");
		beneficiaire.recevoir(don);
	}
}
