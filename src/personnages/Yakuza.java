package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		parler(victime.getNom() + " si tu veux vivre, donne moi ta bourse !");
		int gain = victime.getArgent();
		gagnerArgent(victime.getArgent());
		victime.seFaireExtorquer();
		reputation += 1;
		parler("J'ai volé les " + gain + " sous de " + victime.getNom() + " ce qui me fait " + getArgent() + " dans ma poche. Hé hé hé !");
	}

	public int getReputation() {
		return reputation;
	}
	
	public int perdre() {
		int perte = getArgent();
		parler("J'ai perdu mon duel et mes " + getArgent() + "sous ! Sniff... J'ai déshonoré le clan " + clan + "...");
		perdreArgent(perte);
		reputation -= 1;
		return perte;
	}
	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation += 1;
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan " + clan + "? Ha ha ! Sa cuisant défaite lui aura couté " + gain + " sous !");
	}
}
