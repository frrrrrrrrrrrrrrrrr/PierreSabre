package personnages;

public class Yakuza extends Humain{
	private int reputation = 0;
	private String clan;
	
	public Yakuza(String nom, String boissFav, int argent,  String clan) {
		super(nom, argent, boissFav);
		this.clan = clan;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de " + clan);
	}
	
	public String getClan() {
		return clan;
	}



	public int getReputation() {
		return reputation;
	}



	public void extorquer(Commercant victime) {
		parler(victime.getNom() + ", si tu tiens � la vie donne moi ta bourse !");
		reputation++;
		int gain = victime.seFaireExtorquer();
		gagnerArgent(gain);
		parler("J'ai piqu� les " + gain + " sous de " + victime.getNom() + " j'ai maintenant " + getArgent());
	}
	
	public int perdre(){
		
		reputation--;
		int perdu = getArgent();
		parler("J'ai perdu mon duel et mes " + perdu + " sous, snif... J'ai d�shonor� le clan de Warsong.");
		if(perdu>0) {
			perdreArgent(perdu);
			return perdu;
		}
		return 0;
	}
	
	public void gagner(int gain) {
		parler(" Ce ronin pensait vraiment battre " + getNom() + "du clan de Warsong ?\r\n"
				+ "Je l'ai d�pouill� de ses"+ gain +" sous.");
		reputation++;
		gagnerArgent(gain);
	}
	
	
}
