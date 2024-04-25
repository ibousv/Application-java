package model;

import java.sql.*;

import com.mysql.cj.jdbc.Driver;

final class Base implements CRUD {

	Connection con;
	PreparedStatement pre;
	ResultSet re;

	protected void connection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ags", "root", "31012003");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testDisplay() throws Exception {
		String sql = "show tables ";
		pre = con.prepareStatement(sql);
		re = pre.executeQuery();
		while (re.next()) {
			String name = re.getString("Tables_in_ags");
			System.out.println(name);
		}

	}

	public void insert(Utilisateur u) {
		if (u instanceof Administrateur) {
			String sql = "select * from administrateurs where login = ?";
			try {
				pre = con.prepareStatement(sql);
				pre.setString(1, u.getLogin());
				re = pre.executeQuery();
				if (re.getRow() == 0) {
					sql = "insert into administrateurs values ()";

				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} else {
			String sql = "select * from etudiants where login = ?";
			try {
				pre = con.prepareStatement(sql);
				pre.setString(1, u.getLogin());
				re = pre.executeQuery();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void insert(Cours c) {

	}

	public void insert(Notes u) {

	}

	/*
	 * public void display(Etudiant e) {
	 * String sql = "select * from etudiants ";
	 * try {
	 * pre = con.prepareStatement(sql);
	 * re = pre.executeQuery();
	 * while (re.next()) {
	 * // Gestion de l'affichage
	 * }
	 * } catch (Exception ex) {
	 * ex.getMessage();
	 * }
	 * }
	 */

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

	
	public void display(Etudiant e) {

	}

	public static void main(String[] args) {
		Base b = new Base();

		System.out.println(b.con);
		b.connection();
		System.out.println(b.con);
	}
}
