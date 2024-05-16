package fx.sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

public class MainViewController {
    public static Stage mainStage;

    @FXML
    public PasswordField input_password;
    @FXML
    public TextField input_login;

    @FXML
    public void onConnection(ActionEvent actionEvent) {
        if (input_login.getText().isEmpty() || input_password.getText().isEmpty()) {
            Alert al = new Alert(Alert.AlertType.NONE, "Vous devez renseignez tous les champs", ButtonType.OK);
            al.setTitle("Oops");
            al.show();
        } else {
            Base b = new Base();
            b.connection();
            Connection con = b.con;
            PreparedStatement pre1, pre2;
            ResultSet r1, r2;
            String et = "select * from etudiants where login = ? and motpasse = ?";
            String ad = "select * from administrateurs where login=? and motpasse=?";
            try {
                pre1 = con.prepareStatement(et, ResultSet.TYPE_SCROLL_SENSITIVE,
                        ResultSet.CONCUR_UPDATABLE);
                pre2 = con.prepareStatement(ad, ResultSet.TYPE_SCROLL_SENSITIVE,
                        ResultSet.CONCUR_UPDATABLE);

                pre1.setString(1, input_login.getText());
                pre1.setString(2, input_password.getText());
                pre2.setString(1, input_login.getText());
                pre2.setString(2, input_password.getText());

                r1 = pre1.executeQuery();
                r2 = pre2.executeQuery();
                if (r1.last()) {
                    EtudViewController.login = input_login.getText();
                    Scene sc = new Scene(FXMLLoader.load(EtudViewController.class.getResource("EtudView.fxml")));
                    mainStage.setScene(sc);
                }else if (r2.last()) {
                    Scene sc = new Scene(FXMLLoader.load(AdminViewController.class.getResource("AdminView.fxml")));
                    mainStage.setScene(sc);
                }else{
                    Alert al = new Alert(Alert.AlertType.NONE, "Login ou mot de passe incorrect !", ButtonType.OK);
                    al.setTitle("Oops");
                    al.show();
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
