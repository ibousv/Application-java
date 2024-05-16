package fx.sample;

public class Cours {
    private String nom;
    private String enseignant;
    // Constructor
    public Cours(String nom, String enseignant) {
        this.nom = nom;
        this.enseignant = enseignant;
    }

    // Getters and Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(String enseignant) {
        this.enseignant = enseignant;
    }

}
