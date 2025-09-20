package addressbook;

import java.io.IOException;
import javafx.application.Application;
// import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
// import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application{

    @Override
    public void start(Stage stage) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("gui/Main.fxml"));
        Scene scene = new Scene(root);

        String imagePath = "assets/image/icon.png";
        
        Image icon = new Image(getClass().getResourceAsStream(imagePath));
        stage.getIcons().add(icon);
        stage.setTitle("Address Book GUI");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}