package model;

public class Cours {
	
	private String nom;

	private String enseignant;


	public Cours(String nom, String enseignant) {
		this.nom = nom;
		this.enseignant = enseignant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(String enseignant) {
		this.enseignant = enseignant;
	}


}