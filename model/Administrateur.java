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


}
