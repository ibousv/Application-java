/**
 * 
 */
package model;

/**
 * Interface
 * Container of all methods -- CRUD
 */
interface CRUD {
	//
	void insert(Utilisateur u);

	//
	void insert(Cours c);

	//
	void insert(Notes n);

	//
	void display(Utilisateur u);

	//
	void display(Cours c);

	//
	void display(Notes n);

	//
	void update(Etudiant u);

	//
	void update(Cours c);

	//
	void update(Notes n);

	//
	void delete(Etudiant e);

	//
	void delete(Cours c);

}
