package project.java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            // Carica il file FXML di login
            Parent root = FXMLLoader.load(getClass().getResource("/project/resources/login.fxml"));
            Scene scene = new Scene(root, 400, 300);

            primaryStage.setTitle("Applicazione di Login");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

