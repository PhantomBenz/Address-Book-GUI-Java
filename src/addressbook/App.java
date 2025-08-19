package addressbook;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Group;
// import javafx.fxml.FXMLLoader;
// import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {

        /* Just tried some stuff */
        
        Stage stage = new Stage();
        Group root = new Group();
        Scene scene = new Scene(root, Color.gray(0));

        stage.setTitle("Phantom Testing");
        stage.setWidth(470);
        stage.setHeight(470);
        stage.setResizable(true);
        stage.setX(50);
        stage.setY(50);
        // stage.setFullScreen(true);
        // stage.setFullScreenExitHint("Press q to exit");
        // stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
