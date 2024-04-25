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
					pre.setString(3, u.getPrenom());
					pre.setString(4, u.getPassword());
					pre.execute();
					con.close();
				}
			} catch (SQLException e) {
				System.out.println("L'admin  existe déjà");
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
					pre.setString(3, u.getPrenom());
					pre.setString(4, u.getPassword());
					pre.execute();
					con.close();
				}

			} catch (SQLException e) {
				System.out.println("L'etudiant existe déjà");
			}
		}
	}

	public static void main(String[] args) {
		Base b = new Base();
		b.connection();
		b.insert(new Etudiant("Fall", "Ibrahima", "ibousv", "31012003"));
	}

	@Override
	public void insert(Cours c) {
		String sql = "select * from cours where nom = ?";
		try {
			pre = con.prepareStatement(sql);
			pre.setString(1, c.getNom());
			re = pre.executeQuery();
			if (re.getRow() == 0) {
				sql = "insert into cours values (?,?)";
				pre = con.prepareStatement(sql);
				pre.setString(1, c.getNom());
				pre.setString(2, c.getEnseignant());
				pre.execute();
				con.close();
			}
		} catch (SQLException e) {
			System.out.println("Ce cours existe déjà");
		}
	}

	@Override
	public void delete(Cours c) {
		String sql = "select * from cours where nom = ?";
		try {
			pre = con.prepareStatement(sql);
			pre.setString(1, c.getNom());
			re = pre.executeQuery();
			if (re.getRow() == 1) {
				sql = "delete from cours where nom = ?";
				pre = con.prepareStatement(sql);
				pre.setString(1, c.getEnseignant());
				pre.execute();
				con.close();
			}
		} catch (SQLException e) {
			System.out.println("Une erreur est survenu");
		}
	}

	@Override
	public void update(Cours c) {
		String sql = "select * from cours where nom = ?";
		try {
			pre = con.prepareStatement(sql);
			pre.setString(1, c.getNom());
			re = pre.executeQuery();
			if (re.getRow() == 1) {
				sql = "update cours set enseignant = ? where nom = ?";
				pre = con.prepareStatement(sql);
				pre.setString(1, c.getEnseignant());
				pre.setString(2, c.getNom());
				pre.execute();
				con.close();
			}
		} catch (SQLException e) {
			System.out.println("Une erreur est survenu");
		}
	}

	@Override
	public void update(Etudiant e) {
		String sql = "select * from etudiants where login = ?";
		try {
			pre = con.prepareStatement(sql);
			pre.setString(1, e.getLogin());
			re = pre.executeQuery();
			if (re.getRow() == 1) {
				sql = "update etudiants set nom = ? , prenom = ? , motpasse = ? where login = ?";
				pre = con.prepareStatement(sql);
				pre.setString(1, e.getNom());
				pre.setString(2, e.getPrenom());
				pre.setString(3, e.getPassword());
				pre.setString(4, e.getLogin());
				pre.execute();
				con.close();
			}

		} catch (SQLException ex) {
			System.out.println("L'etudiant existe déjà");
		}
	}

	@Override
	public void delete(Etudiant e) {
		String sql = "select * from etudiants where login = ?";
		try {
			pre = con.prepareStatement(sql);
			pre.setString(1, e.getLogin());
			re = pre.executeQuery();
			if (re.getRow() == 1) {
				sql = "delete from etudiants where login = ?";
				pre = con.prepareStatement(sql);
				pre.setString(1, e.getLogin());
				pre.execute();
				con.close();
			}
	}

	@Override
	public void insert(Notes n) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'insert'");
	}

	@Override
	public void update(Notes n) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'update'");
	}

	@Override
	public void display(Etudiant e) {
		String sql = "select  from notes where login = ?";
		try {
			pre = con.prepareStatement(sql);
			pre.setString(1, e.getLogin());
			re = pre.executeQuery();
			if (re.getRow() == 1) {
				sql = "update etudiants set nom = ? , prenom = ? , motpasse = ? where login = ?";
				pre = con.prepareStatement(sql);
				pre.setString(1, e.getNom());
				pre.setString(2, e.getPrenom());
				pre.setString(3, e.getPassword());
				pre.setString(4, e.getLogin());
				pre.execute();
				con.close();
			}
	}

}
