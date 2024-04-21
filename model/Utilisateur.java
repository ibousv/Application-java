package model;

public class Utilisateur {
	private String nom;
	private String prenom;
	private long id;

	public Utilisateur(String nom, String prenom, long id) {
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
