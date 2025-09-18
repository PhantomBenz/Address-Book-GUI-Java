package addressbook;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application{

    @Override
    public void start(Stage stage) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("assets/style/Main.fxml"));
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