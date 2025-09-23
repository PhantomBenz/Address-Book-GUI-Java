package addressbook.gui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import addressbook.controller.*;

public class Create {
    
    private Parent root;
    private Scene scene;
    private Stage stage;
    
    @FXML
    TextField username;
    @FXML
    PasswordField password;
    @FXML
    PasswordField repassword;

    private void createAccount(ActionEvent event) throws IOException {
        String usrname = username.getText();
        String passwrd = password.getText();
        String repasswrd = repassword.getText();

        if (passwrd.equals(repasswrd)) {
            
        }
    }

}
