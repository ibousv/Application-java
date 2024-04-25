package model;

import java.util.ArrayList;

public class Etudiant extends Utilisateur {

    private ArrayList<Notes> mesNotes = new ArrayList<Notes>();

    public Etudiant(String nom, String prenom, String login, String password) {
        super(nom, prenom, login, password);

    }

    public void ListerNotes() {
        for (Notes notes : mesNotes) {
            System.out.println(notes.getValeur());
        }
    }
}
