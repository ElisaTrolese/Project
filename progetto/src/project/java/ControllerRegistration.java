package project.java;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ControllerRegistration {
    
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button registerButton;

    @FXML
    private Label statusLabel;

    @FXML
    private void initialize(){
        registerButton.setOnAction(event -> register());
    }

    private void register(){
        String username = usernameField.getText();
        String password = passwordField.getText();

        if(GestoreUsers.userExists(username)){
            statusLabel.setText("Utente già registrato");
        }else{
            GestoreUsers.registerUser(username, password);
            statusLabel.setText("Registrazione avvenuta con successo");
        }
    }
}
