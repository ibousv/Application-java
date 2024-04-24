package model;

import java.util.List;

public class Cours {
	
	private String nom;

	private int coeff;

	private Notes notes;

	public Cours(String nom, int coeff, Notes notes) {
		this.nom = nom;
		this.coeff = coeff;
		this.notes = notes;
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

	public void setNotes(Notes notes) {
		this.notes = notes;
	}
	
}