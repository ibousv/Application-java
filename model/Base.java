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

	public void insert(Utilisateur u) {
		if (u instanceof Administrateur) {
			String sql = "select * from administrateurs where login = ?";
			try {
				pre = con.prepareStatement(sql);
				pre.setString(1, u.getLogin());
				re = pre.executeQuery();
				if (re.getRow() == 0) {
					sql = "insert into administrateurs values (?,?,?)";
					pre = con.prepareStatement(sql);
					pre.setString(1, u.getLogin());
					pre.setString(2, u.getNom());
					pre.setString(1, u.getPrenom());
					pre.setString(1, u.getPassword());
					re = pre.executeQuery();
					con.close();
				} else {
					System.out.println("L'admin  existe déjà");
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
				if (re.getRow() == 0) {
					sql = "insert into etudiants values (?,?,?,?)";
					pre = con.prepareStatement(sql);
					pre.setString(1, u.getLogin());
					pre.setString(2, u.getNom());
					pre.setString(1, u.getPrenom());
					pre.setString(1, u.getPassword());
					re = pre.executeQuery();
					con.close();
				} else {
					System.out.println("L'etudiant existe déjà");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void insert(Cours c) {

	}

	public void insert(Notes u) {

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

	public static void main(String[] args) {
		Base b = new Base();

		System.out.println(b.con);
		b.connection();
		b.insert(new Etudiant("Fall", "Ibrahima", "ibousv", "31012003"));
	}

}
