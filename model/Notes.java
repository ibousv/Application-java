package model;

public class Notes {
	private int valeur;
	private Cours cours;

	public Notes(int valeur, Cours cours) {
		this.valeur = valeur;
		this.cours = cours;
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	public Cours getCours() {
		return cours;
	}

	public void setCours(Cours cours) {
		this.cours = cours;
	}
}
