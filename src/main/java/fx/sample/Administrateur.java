package fx.sample;

public class Administrateur extends Utilisateur{
    // Connection
    Base base = new Base();
    //Constructor
    public Administrateur(String nom, String prenom, String login, String password) {
        super(nom, prenom, login, password);

    }

}
