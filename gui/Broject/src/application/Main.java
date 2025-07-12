package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);

        Image icon = new Image("Spotify_Primary_Logo_RGB_Green.png");
        stage.getIcons().add(icon);
        stage.setTitle("Spotify");
        stage.setWidth(450);
        stage.setHeight(450);
        stage.setResizable(false);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("Press S fast");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("S"));

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
