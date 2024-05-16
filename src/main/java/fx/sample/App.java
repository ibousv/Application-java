package fx.sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage s) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MainView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        s.setTitle("AGS");
        s.setScene(scene);
        s.show();
        MainViewController.mainStage = s;
    }

    public static void main(String[] args){
      launch();
    }
}
