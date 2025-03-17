package project.java;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.*;
import javafx.stage.Stage;

public class ControllerLogin {

   @FXML
   private TextField usernameField;

   @FXML
   private PasswordField passwordField;

   @FXML
   private Button loginButton;

   @FXML
   private Button registerButton;

   @FXML
   private void initialize(){
       loginButton.setOnAction(event -> login());
       registerButton.setOnAction(event -> openRegistrationForm());
   }

   private void login(){
        String username = usernameField.getText();
        String password = passwordField.getText();

        //verifica credenziali
        if(GestoreUsers.authenticate(username, password)){
            System.out.println("Login riuscito");
        }else{
            System.out.println("Credenziali errate");
        }
   }

   private void openRegistrationForm(){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/project/resources/registration.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(loader.load(), 400, 300));
            stage.show();
        }catch(Exception e){
            System.err.println("Errore nel caricamento del file FXML: " + e.getMessage());
            e.printStackTrace();
        }
   }
}
