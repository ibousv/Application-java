/**
 * Model package
 */
package model;

import java.sql.*;
import com.mysql.cj.jdbc.Driver;
/**
 * Base class container of all database method
 * implement CRUD interface
 */
final class Base implements CRUD {

	Connection con;
	PreparedStatement pre;
	ResultSet re;
	/**
	 * Connection method
	 * create the symlink to the database
	 */
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

	/**
	 * insert method
	 * can add admin to the database
	 * @param (Administrateur)u
	 */
	public void insert(Administrateur u) {
		String sql = "select * from administrateurs where login = ?";
		try {
			pre = con.prepareStatement(sql);
			pre.setString(1, u.getLogin());
			re = pre.executeQuery();
			if (re.getRow() == 0) {
				sql = "insert into administrateurs values (?,?,?,?)";
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
	}

	/**
	 * insert method
	 * can add etudiant to the database
	 * @param (Etudiant)u
	 */
	public void insert(Etudiant u) {
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

	/**
	 * insert method
	 * can add Cours to the database
	 * @param (Cours)c
	 */
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

	/**
	 * delete method
	 * can delete Cours to the database
	 * @param (Cours)c
	 */
	public void delete(Cours c) {
		String sql = "select * from cours where nom = ?";
		try {
			pre = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
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

	/**
	 * update method
	 * can  modify Cours to the database
	 * @param (Cours)c
	 */
	public void update(Cours c) {
		String sql = "select * from cours where nom = ?";
		try {
			pre = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			pre.setString(1, c.getNom());
			re = pre.executeQuery();
			re.last();
			if (re.getRow() == 1) {
				sql = "update cours set enseignant = ? where nom = ?";
				pre = con.prepareStatement(sql);
				pre.setString(1, c.getEnseignant());
				pre.setString(2, c.getNom());
				pre.execute();
				con.close();
			}
		} catch (SQLException e) {
			System.out.println("Une erreur est survenu :"+e.getMessage());
		}
	}

	/**
	 * update method
	 * can modify etudiant to the database
	 * @param (Etudiant)e
	 */
	public void update(Etudiant e) {
		String sql = "select * from etudiants where login = ?";
		try {
			pre = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			pre.setString(1, e.getLogin());
			re = pre.executeQuery();
			re.last();
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
			System.out.println("L'etudiant existe déjà :"+ ex.getMessage());
		}
	}

	/**
	 * delete method
	 * can drop etudiant to the database
	 * @param (Etudiant)e
	 */
	public void delete(Etudiant e) {
		String sql = "select * from etudiants where login = ?";
		try {
			pre = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			pre.setString(1, e.getLogin());
			re = pre.executeQuery();
			re.last();
			if (re.getRow() == 1) {
				sql = "delete from etudiants where login = ?";
				pre = con.prepareStatement(sql);
				pre.setString(1, e.getLogin());
				pre.execute();
				con.close();
			}
		} catch (SQLException ex) {
			System.out.println("Une erreur est survenu :"+ex.getMessage());
		}
	}

	/**
	 * insert method
	 * can add Notes to the database
	 * @param (Notes)n
	 */
	public void insert(Notes n) {
		String sql = "select * from notes where nom_cours = ?";
		try {
			pre = con.prepareStatement(sql);
			pre.setString(1, n.getCours().getNom());
			re = pre.executeQuery();
			if (re.getRow() == 0) {
				sql = "insert into notes values (?,?,?)";
				pre = con.prepareStatement(sql);
				pre.setInt(1, n.getValeur());
				pre.setString(2, n.getCours().getNom());
				pre.setString(3, n.getEtudiant().getLogin());
				pre.execute();
				con.close();
			}

		} catch (SQLException ex) {
			System.out.println("Une erreur est survenu :"+ ex.getMessage());
		}
	}

	/**
	 * update method
	 * can modify Notes to the database
	 * @param (Notes)n
	 */
	public void update(Notes n) {
		String sql = "select valeur from notes where nom_cours = ? and login_etudiant = ? ";
		try {
			pre = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			pre.setString(2, n.getEtudiant().getLogin());
			pre.setString(1, n.getCours().getNom());
			re = pre.executeQuery();
			re.last();
			if (re.getRow() == 1) {
				sql = "update notes set valeur = ? where login_etudiant = ? and nom_cours = ?";
				pre = con.prepareStatement(sql);
				pre.setInt(1, n.getValeur());
				pre.setString(2, n.getEtudiant().getLogin());
				pre.setString(3, n.getCours().getNom());

				pre.execute();
				con.close();
			}
		} catch (SQLException ex) {
			System.out.println("Une erreur est survenu :"+ex.getMessage());
		}
	}

	/**
	 * display method
	 *  print etudiant to the outputStream
	 * @param (Etudiant)e
	 */
	public void display(Etudiant e) {
		String sql = "select nom_cours, valeur from notes where login_etudiant = ?";
		try {
			pre = con.prepareStatement(sql);
			pre.setString(1, e.getLogin());
			re = pre.executeQuery();
			while (re.next()) {
				System.out.println(re.getString("nom_cours") +" "+ re.getInt("valeur"));
			}
		} catch (Exception ex) {
			System.out.println("Une erreur est survenue :"+ex.getMessage());
		}
	}

}