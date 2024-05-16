package fx.sample;

public interface CRUD {
    boolean insert(Cours c);

    boolean update(Cours c);

    boolean delete(Cours c);

   // boolean insert(Administrateur u);

    boolean insert(Etudiant u);

    boolean update(Etudiant e);

    boolean delete(Etudiant e);

    boolean insert(Notes n);

    boolean update(Notes n);

    //void display(Etudiant e);
}
