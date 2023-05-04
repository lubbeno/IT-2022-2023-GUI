package lubos.sukup.it20222023gui.kalkulacka;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableListBase;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.List;

public class KalkulackaController {

    @FXML
    private TextField prveCisloScitanie;

    @FXML
    private TextField druheCisloScitanie;

    @FXML
    private TextField vysledokScitanie;

    @FXML
    private Label error;

    @FXML
    private TextField volbaOperacie;

    @FXML
    private TextField prveCisloBezCombo;
    @FXML
    private TextField druheCisloBezCombo;

    @FXML
    private TextField vysledokBezCombo;

    @FXML
    private ComboBox<String> komboBox;

    public void initialize(){
        ObservableList<String> operacie =
                FXCollections.observableArrayList("+", "-", "*", "/");
        komboBox.setItems(operacie);
        komboBox.getSelectionModel().selectFirst();
    }

    public void vypocitaj3(){
       String s = komboBox.getSelectionModel().getSelectedItem();
    }

    public void vypocitaj1(){
        //NumberFormatException
        try {
            String prveCislo = prveCisloScitanie.getText();
            String druheCislo = druheCisloScitanie.getText();
            double cislo1 = Double.parseDouble(prveCislo);
            double cislo2 = Double.parseDouble(druheCislo);
            vysledokScitanie.setText( String.valueOf(cislo1 + cislo2));
        } catch (NumberFormatException ex){
            getError("zly format");
        }

    }

    public void textFieldVysledok(){
        try {
            double cislo1 = Double.parseDouble(prveCisloBezCombo.getText());
            double cislo2 = Double.parseDouble(druheCisloBezCombo.getText());
            switch (volbaOperacie.getText()){
                case "+" :
                    vysledokBezCombo.setText(String.valueOf(cislo1 + cislo2));
                    break;
                case "-" :
                    vysledokBezCombo.setText(String.valueOf(cislo1 - cislo2));
                    break;
                case "/" :
                    vysledokBezCombo.setText(String.valueOf(cislo1 / cislo2));
                    break;
                case "*" :
                    vysledokBezCombo.setText(String.valueOf(cislo1 * cislo2));
                    break;
                default:
                    getError("zla operacia");
            }
            }catch (NumberFormatException e){
            getError("zly format");
        }
        }

    private void getError(String errorMessage){
        Stage dialogStage = new Stage();
        dialogStage.initModality(Modality.WINDOW_MODAL);
       Button button = new Button("Close");

        VBox vbox = new VBox(new Text("Error !!!!!"),new Label(errorMessage), button);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPrefHeight(50);
        vbox.setPrefWidth(200);
        vbox.setPadding(new Insets(15));
        button.setOnAction( a -> dialogStage.close());
        dialogStage.setScene(new Scene(vbox));
        dialogStage.setAlwaysOnTop(true);
        dialogStage.setResizable(false);
        dialogStage.show();
    }
}
