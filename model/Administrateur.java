package model;

import java.util.ArrayList;

public class Administrateur extends Utilisateur {

	Base base = new Base();

	public Administrateur(String nom, String prenom, String login, String password) {
		super(nom, prenom, login, password);

	}
}
