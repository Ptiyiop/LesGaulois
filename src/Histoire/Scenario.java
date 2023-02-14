package Histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Romain Minus;
		Minus = new Romain("Minus",6);
		Gaulois asterix;
		asterix = new Gaulois("Astérix", 8);
		asterix.parler("Bonjour!");
		Minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(Minus);
		asterix.frapper(Minus);
		asterix.frapper(Minus);
	}

}
