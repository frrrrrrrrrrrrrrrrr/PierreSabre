package personnages;



public class Humain {
	private static final int TAILLE_MEME = 30;
	
	private String nom;
	private String boissFav = "café";
	private int argent;
	protected  int nbConnaissances;
	protected Humain[] memoire = new Humain[TAILLE_MEME];
	
	
	public Humain( String nom, int argent, String boissFav) {
		this.nom = nom;
		this.argent = argent;
		this.boissFav = boissFav;
	}


	public String getBoissFav() {
		return boissFav;
	}


	public int getArgent() {
		return argent;
	}
	
	
	
	public String getNom() {
		return nom;
	}


	protected void parler(String texte) {
		System.out.println("(" + nom + ")" + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissFav);
		
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissFav + "! GLOUPS !");
	}
	
	protected void gagnerArgent(int gain) {
		argent += gain;
	}
	
	protected void perdreArgent(int perte) {
		argent -= perte;
	}
	
	public int acheter(String bien, int prix) {
		
		if(argent -prix < 0) {
			parler("Je n'ai que  " + argent + " sous en poche, je ne peux plus m'offrir " + bien + " ï¿½ " + prix + " sous.");
			return -1;
		}
		else {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " ï¿½ " + prix + " sous ");
			perdreArgent(prix);
			return 0;
		}
	}
	
	private void memoriser(Humain humain) {
		if(nbConnaissances < TAILLE_MEME) {
			memoire[nbConnaissances] = humain;
			nbConnaissances ++;
		}else {
			for(int i=0; i<nbConnaissances; i++) {
				memoire[i] = memoire[i+1];
			}
			memoire[nbConnaissances - 1] = humain;
		}
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.direBonjour();
		memoriser(autreHumain);
		autreHumain.memoriser(this);
		
	}
	
	public void listerConnaissances(){
		String aDire = "Je connais beaucoup de monde :";
		
		for(int i=0; i<nbConnaissances; i++){
			aDire += memoire[i];
		}
		
		parler(aDire);
		
	}
	
	
}
