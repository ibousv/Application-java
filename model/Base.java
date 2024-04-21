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

	}

	public void insert(Cours c) {

	}

	public void insert(Notes u) {

	}

	public void display(Etudiant e) {
		String sql = "select * from etudiants ";
		try {
			pre = con.prepareStatement(sql);
			re = pre.executeQuery();
			while (re.next()) {

			}
		} catch (Exception ex) {
			ex.getMessage();
		}
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
