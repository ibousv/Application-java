package model;

import java.sql.*;

import com.mysql.cj.jdbc.Driver;

final class Base implements CRUD {

	protected void connection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc://localhost:3306/ags", "root", "");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insert(Utilisateur u) {

	}

	public void insert(Cours c) {

	}

	public void insert(Notes u) {

	}

	public void display(Utilisateur u) {

	}

	public void display(Cours c) {

	}

	public void display(Notes n) {

	}

	public void update(Etudiant u) {

	}

	public void update(Cours c) {

	}

	public void update(Notes n) {

	}

	public void delete(Etudiant e) {

	}

	public void delete(Cours c) {

	}

}
