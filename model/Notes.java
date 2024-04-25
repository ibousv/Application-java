package model;

public class Notes {
	private int valeur;
	private Cours cours;
	private Etudiant etudiant;

	public Notes(int valeur, Cours cours, Etudiant etudiant) {
		this.valeur = valeur;
		this.cours = cours;
		this.etudiant = etudiant;
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

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
}
