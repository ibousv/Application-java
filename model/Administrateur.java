package model;

import java.util.List;

public class Administrateur extends Utilisateur {

	public Administrateur(String nom, String prenom, long id) {
		super(nom, prenom, id);
	}

	private Notes lesNotes;
	private Cours lesCours;
	private Etudiant lesEtudiants;
	private List<Cours> cours;
	private List<Notes> notes;
	private List<Etudiant> etudiant;

	Base base = new Base();

	public void inscriptEt(Etudiant e) {
		base.connection();

	}

	public void modEt() {

	}

	public void suppEt() {

	}

	public void getNotes() {

	}

	public void getCours() {

	}

	public void getEtudiants() {

	}

	public long getId() {
		return 0;
	}

	public static void main(String[] args) {
		Base b = new Base();
		b.connection();
		try {
			b.testDisplay();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
