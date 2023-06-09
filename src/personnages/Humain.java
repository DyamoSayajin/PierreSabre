package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	private int nbConnaissance = 0;
	private Humain[] memoire = new Humain[30];
	
	
	
	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}
	
	public void parler(String texte) {
		System.out.println("("+nom+") - " + texte); 
	}

	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boisson);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous" );
		}
	}
	
	public void faireConnaissance(Humain humain2) {
		direBonjour();
		humain2.repondre(this);
		memoriser(humain2);
	}
	
	public void memoriser(Humain humain) {
		if (nbConnaissance == 30) {
			
		} else {

		}
	}
	
	
	public void gagnerArgent(int gain) {
		argent += gain;
	}
	
	public void perdreArgent(int perte) {
		argent -= perte;
	}
	
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}
	
	
}
