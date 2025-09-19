package addressbook.gui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main {

    private Parent root;
    private Scene scene;
    private Stage stage;
    
    public void createAccount(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Create.fxml"));
        scene = new Scene(root);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Create Account");
        stage.setScene(scene);
        stage.show();
    }

    public void loginAccount(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        scene = new Scene(root);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Create Account");
        stage.setScene(scene);
        stage.show();
    }
}
