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
	
	public void provoquer(Yakuza adversaire) {
		int force = honneur * 2;
		int somme;
		parler("Je provoque " + adversaire.getNom());
		
		if(adversaire.getReputation() <= force) {
			somme = adversaire.perdre();
			gagnerArgent(somme);
			parler("Je gagne" + somme + " j'ai maintenant " + getArgent());
		}
		else {
			somme = getArgent();
			perdreArgent(somme);
			adversaire.gagner(somme);
			honneur -= 1;
			parler("Je perds " + somme);
			
		}
	}
}
