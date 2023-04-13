package lubos.sukup.it20222023gui.basic;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Label menoPriezvisko;

    @FXML
    private TextField prveTextovePole;

    public void initialize(){
        System.out.println(menoPriezvisko.getText());
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Toto je moja GUI aplikacia");
    }

    @FXML
    public void zobrazPole(){

        try {
            BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
            String s;
            while ( ( s = reader.readLine())  != null) {

                welcomeText.setText(welcomeText.getText() + " "+ s);

            }

            reader.close();

        }catch (IOException ex){
            System.out.println(ex);
        }

    }
}