package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}

	public int seFaireExtorquer() {
		int perte = getArgent();
		perdreArgent(perte);
		parler("OH NON ! J'ai tout perdu ! Le monde est trop injuste...");
		return perte;
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent + " sous ! Je te remercie généreux donateurs !");
	}
	
	
}
