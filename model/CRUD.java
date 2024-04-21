package model;

/**
 * 
 * 
 * Interface
 * Container of all methods -- CRUD
 * insert() display() delete() update()
 * @author ib
 * @version v1.0.0
 */
interface CRUD {
	/**
	 * 
	 * @param u
	 */
	void insert(Utilisateur u);

	/**
	 * 
	 * @param c
	 */
	void insert(Cours c);

	/**
	 * 
	 * @param n
	 */
	void insert(Notes n);

	/**
	 * 
	 * @param u
	 */
	void display(Utilisateur u);

	/**
	 * 
	 * @param c
	 */
	void display(Cours c);

	/**
	 * 
	 * @param n
	 */
	void display(Notes n);

	/**
	 * 
	 * @param e
	 */
	void update(Etudiant e);

	/
	void update(Cours c);

	//
	void update(Notes n);

	//
	void delete(Etudiant e);

	//
	void delete(Cours c);

}
