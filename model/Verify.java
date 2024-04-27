package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import view.MainView;
import view.VueAdmin;
import view.VueEtudiant;

public abstract class Verify {
  Base database = new Base();

  public void verify(String login, String password) {
    database.connection();
    String req1 = "select * from administrateurs where login = ? and motpasse = ?";
    String req2 = "select * from etudiants where login = ? and motpasse = ?";
    try {
      PreparedStatement pre1 = database.con.prepareStatement(req1);
      pre1.setString(1, login);
      pre1.setString(2, password);
      ResultSet re1 = pre1.executeQuery();

      PreparedStatement pre2 = database.con.prepareStatement(req2);
      pre2.setString(1, login);
      pre2.setString(2, password);
      ResultSet re2 = pre2.executeQuery();

      if (re1.getRow() == 1) {
        MainView.mainView.setVisible(false);
        new VueAdmin().setVisible(true);
      } else if (re2.getRow() == 1) {
        MainView.mainView.setVisible(false);
        new VueEtudiant().setVisible(true);
      }
    } catch (SQLException ex) {
      System.out.println("Erreur :" + ex.getMessage());
    }

  }
}
