package histoire;

import personnages.*;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof","kombucha",54);
//		prof.direBonjour();
//		prof.acheter("une boisson", 12);
//		prof.boire();
//		prof.acheter("un jeu", 2);
//		prof.acheter("un kimono",50);
		
		Commercant terry = new Commercant("Terry","thé",15);
//		terry.direBonjour();
//		terry.seFaireExtorquer();
//		terry.recevoir(15);
//		terry.boire();
		
		Yakuza ichiban = new Yakuza("Ichiban Kasuga","whisky",45,"Tojo");
		ichiban.direBonjour();
		ichiban.parler("Tiens tiens, ne serait-ce pas un faible marchand qui passe pas l� ?");
		ichiban.extorquer(terry);
		
		Ronin jin = new Ronin("Jin Sakai","sak�",60);
//		jin.direBonjour();
//		jin.donner(terry);
		
		jin.provoquer(ichiban);
		
	}

}
