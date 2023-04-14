package personnages;

public class Ronin extends Humain{
	private int honneur = 1;

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int don = (int)(getArgent()*0.1);
		parler(beneficiaire.getNom() + " prend ces " + don + " sous.");
		beneficiaire.recevoir(don);
		perdreArgent(don);
	}
	public void provoquer(Yakuza ennemi) {
		int force = 2*honneur;
		parler("Je t'ai trouvé sale vermine ! Tu vas payer pour ce pauvre marchand ! TATAKAE !");
		if (force>=ennemi.getReputation()) {
			parler("OMAE WA MO SHINDERU !");
			ennemi.parler("NANI !");
			parler("KAMEHAMEHA !!!");
			ennemi.parler("HAAAAAAAAAAAAA, NOOOOOOOON, TROP DE POUISSANCE POUR MOI !!!");
			gagnerArgent(ennemi.getArgent());
			ennemi.perdre();
			parler("J'ai vaincu " + ennemi.getNom() + "grâce à mes techniques légendaires !");
			honneur += 1;
		} else {
			ennemi.parler("OH NON, UN RONIN, RANDOM BULLSHIT GO !");
			parler("Ce yakuza est trop fort pour moi ! Il ne me laisse pas la choix, je dois utiliser ma technique ultime... LA FUITE ! NINGERUNDAYO SMOKEY !");
			ennemi.gagner(getArgent());
			perdreArgent(getArgent());
			parler("J'ai tous perdu contre ce yakuza, mon honneur et ma bourse en ont pris un sacré coup !");
			honneur -= 1;
		}
	}
}
