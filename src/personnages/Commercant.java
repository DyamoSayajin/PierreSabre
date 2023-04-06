package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}

	public void seFaireExtorquer() {
		perdreArgent(getArgent());
		parler("J'ai tout perdu ! Le monde est trop injuste...");
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent + " sous ! Je te remercie généreux donateurs !");
	}
}
