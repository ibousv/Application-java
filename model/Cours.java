package model;

public class Cours {
	
	private String nom;

	private int coeff;


	public Cours(String nom, int coeff) {
		this.nom = nom;
		this.coeff = coeff;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCoeff() {
		return coeff;
	}

	public void setCoeff(int coeff) {
		this.coeff = coeff;
	}

	public Notes getNotes() {
		return notes;
	}
}