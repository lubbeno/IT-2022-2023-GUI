package lubos.sukup.it20222023gui.kalkulacka;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class KalkulackaApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(KalkulackaApplication.class
                .getResource("kalkulacka.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Kalkulacka Login");
        stage.setScene(scene);
        stage.setResizable(true);
        stage.setAlwaysOnTop(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}