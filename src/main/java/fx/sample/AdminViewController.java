package fx.sample;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BarcodeQRCode;
import com.itextpdf.text.pdf.PdfWriter;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;

public class AdminViewController {
    // Input from Cours View
    public TextField input_cours;
    public TextField input_enseignant;
    // Input from Etudiant View
    public TextField input_nom;
    public TextField input_prenom;
    public TextField input_login;
    public TextField input_mdp;
    // Input from Notes View
    public TextField input_le;
    public TextField input_note;
    public TextField input_nc;
    public Label welcome_text = new Label("Bienvenue sur votre page");
    // Base object
    Base b = new Base();

    public void gestion_etudiant(ActionEvent actionEvent) throws IOException{
        Stage stage = new Stage();
        Scene sc = new Scene(FXMLLoader.load(MainViewController.class.getResource("EView.fxml")));
        stage.setScene(sc);
        stage.show();
    }

    public void gestion_cours(ActionEvent actionEvent) throws IOException{
        Stage stage = new Stage();
        Scene sc = new Scene(FXMLLoader.load(MainViewController.class.getResource("CView.fxml")));
        stage.setScene(sc);
        stage.show();
    }

    public void gestion_notes(ActionEvent actionEvent) throws IOException{
        Stage stage = new Stage();
        Scene sc = new Scene(FXMLLoader.load(MainViewController.class.getResource("NView.fxml")));
        stage.setScene(sc);
        stage.show();
    }

    public void exit(ActionEvent actionEvent) throws IOException {
        Scene sc = new Scene(FXMLLoader.load(MainViewController.class.getResource("MainView.fxml")));
        MainViewController.mainStage.setScene(sc);

    }


    public void supCours(ActionEvent actionEvent) throws SQLException {
        b.connection();
        if(b.delete(new Cours(input_cours.getText(),input_enseignant.getText()))){
            Alert al = new Alert(Alert.AlertType.NONE, "Le Cours a été supprimé avec succés", ButtonType.OK);
            al.setTitle("Notification");
            al.show();
            b.con.close();
        }else{
            Alert al = new Alert(Alert.AlertType.NONE, "Une erreur est survenue ", ButtonType.OK);
            al.setTitle("Oops");
            al.show();
        }
    }

    public void modCours(ActionEvent actionEvent) throws SQLException {
        b.connection();
        if(b.update(new Cours(input_cours.getText(),input_enseignant.getText()))){
            Alert al = new Alert(Alert.AlertType.NONE, "Le Cours a été modifié avec succés", ButtonType.OK);
            al.setTitle("Notification");
            al.show();
            b.con.close();
        }else{
            Alert al = new Alert(Alert.AlertType.NONE, "Une erreur est survenue ", ButtonType.OK);
            al.setTitle("Oops");
            al.show();
        }
    }

    public void addCours(ActionEvent actionEvent) {
        b.connection();
        if(b.insert(new Cours(input_cours.getText(),input_enseignant.getText()))){
            Alert al = new Alert(Alert.AlertType.NONE, "Le Cours a été enregistré avec succés", ButtonType.OK);
            al.setTitle("Notification");
            al.show();

        }else{
            Alert al = new Alert(Alert.AlertType.NONE, "Une erreur est survenue ", ButtonType.OK);
            al.setTitle("Oops");
            al.show();
        }
    }

    public void add(ActionEvent actionEvent) {
        b.connection();
        if(b.insert(new Etudiant(input_nom.getText(),input_prenom.getText(),input_login.getText(),
                input_mdp.getText()))){
            Alert al = new Alert(Alert.AlertType.NONE, "L' étudiant a été enregistré avec succés", ButtonType.OK);
            al.setTitle("Notification");
            al.show();

        }else{
            Alert al = new Alert(Alert.AlertType.NONE, "Une erreur est survenue ", ButtonType.OK);
            al.setTitle("Oops");
            al.show();
        }
    }

    public void mod(ActionEvent actionEvent) {
        b.connection();
        if (b.update(new Etudiant(input_nom.getText(), input_prenom.getText(), input_login.getText(),
                input_mdp.getText()))) {
            Alert al = new Alert(Alert.AlertType.NONE, "L' étudiant a été modifié avec succés", ButtonType.OK);
            al.setTitle("Notification");
            al.show();

        } else {
            Alert al = new Alert(Alert.AlertType.NONE, "Une erreur est survenue ", ButtonType.OK);
            al.setTitle("Oops");
            al.show();
        }
    }

    public void sup(ActionEvent actionEvent) {
        b.connection();
        if(b.delete(new Etudiant(input_nom.getText(),input_prenom.getText(),input_login.getText(),
                input_mdp.getText()))){
            Alert al = new Alert(Alert.AlertType.NONE, "L' étudiant a été supprimé avec succés", ButtonType.OK);
            al.setTitle("Notification");
            al.show();

        }else{
            Alert al = new Alert(Alert.AlertType.NONE, "Une erreur est survenue ", ButtonType.OK);
            al.setTitle("Oops");
            al.show();
        }
    }

    public void addNote(ActionEvent actionEvent) {
        b.connection();
        if(b.insert(new Notes(Integer.parseInt(input_note.getText()),
                new Cours(input_nc.getText(),null),
                new Etudiant(null,null,input_le.getText(),null)))){
            Alert al = new Alert(Alert.AlertType.NONE, "La note a été enregistré avec succés", ButtonType.OK);
            al.setTitle("Notification");
            al.show();

        }else{
            Alert al = new Alert(Alert.AlertType.NONE, "Une erreur est survenue ", ButtonType.OK);
            al.setTitle("Oops");
            al.show();
        }
    }

    public void modNote(ActionEvent actionEvent) {
        b.connection();
        if(b.update(new Notes(Integer.parseInt(input_note.getText()),
                new Cours(input_nc.getText(),null),
                new Etudiant(null,null,input_le.getText(),null)))){
            Alert al = new Alert(Alert.AlertType.NONE, "La note a été modifié avec succés", ButtonType.OK);
            al.setTitle("Notification");
            al.show();

        }else{
            Alert al = new Alert(Alert.AlertType.NONE, "Une erreur est survenue ", ButtonType.OK);
            al.setTitle("Oops");
            al.show();
        }
    }

    public void list_etudiant(ActionEvent actionEvent){
        Stage stage = new Stage();
        ListView<String> list = new ListView<String>();
        b.connection();
        String sql = "select prenom,nom,login,motpasse from etudiants";

        try {
             b.pre = b.con.prepareStatement(sql);
            b.re = b.pre.executeQuery();
            String et;
            while (b.re.next()) {
                et = b.re.getString("prenom")+"\t\t"
                        +b.re.getString("nom")+"\t\t"+b.re.getString("login")
                        +"\t\t"+ b.re.getString("motpasse");
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

    public void gen(ActionEvent actionEvent) {
        String sql = "select nom_cours, valeur from notes where login_etudiant = ?";
        String info="";
        b.connection();
        try {
            b.pre = b.con.prepareStatement(sql);
            b.pre.setString(1, input_le.getText());
            b.re = b.pre.executeQuery();
            while (b.re.next()) {
                info += b.re.getString("nom_cours") + "   " + b.re.getInt("valeur") + "\n";
            }

            Document doc = new Document();
            PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream(input_le.getText() + "_info.pdf"));
            doc.open();
            doc.add(new Paragraph("Les information de l'étudiant: Cours et Notes obtenues"));
            doc.add(new Paragraph(info));
            BarcodeQRCode barcodeQRCode = new BarcodeQRCode(info, 100, 100, null);
            barcodeQRCode.createAwtImage(Color.BLACK, Color.LIGHT_GRAY);
            doc.add(barcodeQRCode.getImage());
            doc.close();
            writer.close();
            Alert al = new Alert(Alert.AlertType.NONE, "Le fichier pdf à été générer avec succés", ButtonType.OK);
            al.setTitle("Notification");
            al.show();
        }catch(Exception ex){
            Alert al = new Alert(Alert.AlertType.NONE,"Une erreur est survenue", ButtonType.OK);
            al.setTitle("Oops");
            al.show();
        }
    }

    public void gen_pdf(ActionEvent actionEvent) throws IOException{
        Stage stage = new Stage();
        Scene sc = new Scene(FXMLLoader.load(MainViewController.class.getResource("fichier.fxml")));
        stage.setScene(sc);
        stage.show();
    }
}
