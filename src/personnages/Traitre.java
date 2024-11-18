package personnages;

import java.util.Random;

public class Traitre extends Samourai {
	private int niveauTraitrise = 0;
	private Random rand = new Random();

	public Traitre(String seigneur, String nom, String boissFav, int argent) {
		super(seigneur, nom, boissFav, argent);
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon niveau de traîtrise actuel est " + niveauTraitrise);
	}
	
	public void ranconner(Commercant commercant) {
		if(niveauTraitrise < 3) {
			int argentRanconne = commercant.getArgent() * 2/ 10;
			commercant.perdreArgent(argentRanconne);
			gagnerArgent(argentRanconne);
			niveauTraitrise ++;
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne moi " +
			argentRanconne + "sous ou gare à toi !");
			commercant.parler("Tout de suite grand " + getNom() + ".");
		}
		else {
			parler("Mince, je ne peux plus extorquer personne, sinon un samouraï risque de me démasquer !");
			
		}
	}
	
	public void faireLeGentil() {
		if(nbConnaissances < 1) {
			parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif");
		}
		else {
			int randIndex = rand.nextInt(nbConnaissances);
			int don = getArgent() * 1/20;
			String nomAmi = memoire[randIndex].getNom();
			
			parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec " + nomAmi);
			parler("Bonjour l'ami! Je voudrais vous aidre en vous donnant " + don + " sous");
			memoire[randIndex].gagnerArgent(don);
			
			perdreArgent(don);
			
			memoire[randIndex].parler("Merci " + getNom() + ". Vous êtes quelqu'un de bien.");
			
			if(niveauTraitrise > 1) {
				niveauTraitrise --;
			}
			
		}
	}

}
