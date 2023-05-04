package lubos.sukup.it20222023gui.databazaziakov;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Databazaziakov extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Databazaziakov.class
                .getResource("databazaziakov.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Databaza Ziakov");
        stage.setScene(scene);
        stage.setResizable(true);
        stage.setAlwaysOnTop(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}