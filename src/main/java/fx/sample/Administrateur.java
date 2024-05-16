package fx.sample;

public class Administrateur extends Utilisateur{
    // Connection
    Base base = new Base();
    //Constructor
    public Administrateur(String nom, String prenom, String login, String password) {
        super(nom, prenom, login, password);

    }
    public String affiche(Etudiant e) {
        base.connection();
        String sql = "select nom_cours, valeur from notes where login_etudiant = ?";
        String info = "";
        try {
            base.pre = base.con.prepareStatement(sql);
            base.pre.setString(1, e.getLogin());
            base.re = base.pre.executeQuery();
            while (base.re.next()) {
                info += base.re.getString("nom_cours") + "   " + base.re.getInt("valeur") + "\n";
            }
            return info;
        } catch (Exception ex) {
            System.out.println("Une erreur est survenue :" + ex.getMessage());
        }
        return null;
    }


}
