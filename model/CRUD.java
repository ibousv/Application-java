package model;

/**
 * 
 * 
 * Interface CRUD
 * Container of all methods ->
 * insert() display() delete() update()
 * 
 * @author ib
 * @version v1.0.0
 */
interface CRUD {
	void insert(Cours c);

	void update(Cours c);

	void delete(Cours c);

	void insert(Utilisateur u);

	void update(Etudiant e);

	void delete(Etudiant e);

	void insert(Notes n);

	void update(Notes n);

	void display(Etudiant e);
}
