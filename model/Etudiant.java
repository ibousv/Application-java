/**
 * Model package
 */
package model;
/**
 * Etudiant class
 * extend Utilisateur
 */
public class Etudiant extends Utilisateur {
    // Constructor
    public Etudiant(String nom, String prenom, String login, String password) {
        super(nom, prenom, login, password);

    }
    /**
     * ListerNotes method 
     * list all notes from etudiant
     */
    public void ListerNotes() {
        Base b = new Base();
        b.connection();
        b.display(this);
    }
}
