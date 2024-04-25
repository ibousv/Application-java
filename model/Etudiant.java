package model;

public class Etudiant extends Utilisateur {

    public Etudiant(String nom, String prenom, String login, String password) {
        super(nom, prenom, login, password);

    }

    public void ListerNotes() {
        Base b = new Base();
        b.connection();
        b.display(this);
    }
}
