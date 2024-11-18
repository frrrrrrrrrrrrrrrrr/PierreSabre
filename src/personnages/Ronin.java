package personnages;

public class Ronin extends Humain {
	private int honneur = 0;

	public Ronin(String nom, String boissFav, int argent) {
		super(nom, argent, boissFav);
	}
	
	public void donner(Commercant beneficiaire) {
		int don = getArgent()/10;
		parler(beneficiaire.getNom() + " prend ces " + don + " sous");
		beneficiaire.recevoir(don);
	}
	
	public void provoquer(Yakuza adversaire) {
		int force = honneur * 2;
		int somme;
		parler(" Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		
		if(adversaire.getReputation() <= force) {
			somme = adversaire.perdre();
			gagnerArgent(somme);
			parler("Je t’ai eu petit yakusa!");
		}
		else {
			somme = getArgent();
			perdreArgent(somme);
			adversaire.gagner(somme);
			honneur -= 1;
			parler(" J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			
		}
	}
}
