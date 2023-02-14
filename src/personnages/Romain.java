package personnages;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		// TODO Auto-generated constructor stub
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		// TODO Auto-generated method stub
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
		}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
		}

	public void recevoirCoup(int forceCoup) {
		// TODO Auto-generated method stub
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}

	}
		
	}


