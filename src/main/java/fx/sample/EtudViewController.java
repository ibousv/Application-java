package fx.sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.stage.Stage;


import java.io.IOException;

public class EtudViewController {
    public static String login;

    public void displayNote(ActionEvent actionEvent) {
        Base b = new Base();
        Stage stage = new Stage();
        ListView<String> list = new ListView<String>();
        b.connection();
        String sql = "select nom_cours,valeur from notes where login_etudiant = ?";
        try {

            b.pre = b.con.prepareStatement(sql);
            b.pre.setString(1,login);
            b.re = b.pre.executeQuery();
            String et;
            while (b.re.next()) {
                et = b.re.getString("nom_cours")+"\t\t"+b.re.getString("valeur");
                list.getItems().add(et);
            }

        } catch (Exception ex) {
            Alert al = new Alert(Alert.AlertType.NONE,"Une erreur est survenue", ButtonType.OK);
            al.setTitle("Oops");
            al.show();
        }
        Scene sc = new Scene(list,600,400);
        stage.setScene(sc);
        stage.show();
    }

    public void exit(ActionEvent actionEvent) throws IOException {
        Scene sc = new Scene(FXMLLoader.load(MainViewController.class.getResource("MainView.fxml")));
        MainViewController.mainStage.setScene(sc);
    }
}
