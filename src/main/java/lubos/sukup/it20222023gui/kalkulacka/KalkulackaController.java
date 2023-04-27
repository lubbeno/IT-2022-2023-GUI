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

public class KalkulackaController {

    @FXML
    private TextField prveCisloScitanie;

    @FXML
    private TextField druheCisloScitanie;

    @FXML
    private TextField vysledokScitanie;

    @FXML
    private ComboBox<String> komboBox;

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


    public void initialize(){
        prveCisloScitanie.setText("prve");
        druheCisloScitanie.setText("druhe");
        vysledokScitanie.setText("vysledok");

    }

    public void vypocitaj1(){
        //NumberFormatException
        try {
            double cislo1 = Double.parseDouble(prveCisloScitanie.getText());
            double cislo2 = Double.parseDouble(druheCisloScitanie.getText());
            vysledokScitanie.setText( String.valueOf(cislo1 + cislo2));
        } catch (NumberFormatException ex){
            error.setText("zly format");
        }

    }

    public void textFieldVysledok(){
        System.out.println("tst");
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
                    error.setText("zla operacia");
            }

            }catch (NumberFormatException e){
            error.setText("zly format");
        } catch (ArithmeticException ex){
            System.out.println( "arit");
        }
        }





      /*  ObservableList<String> operace =
                FXCollections.observableArrayList("+", "-", "*", "/");
        komboBox.setItems(operace);
        komboBox.getSelectionModel().selectFirst();
        getError("some Error");
*/




    private void getError(String errorMessage){
        Stage dialogStage = new Stage();
        dialogStage.initModality(Modality.WINDOW_MODAL);
       Button button = new Button("Close");

        VBox vbox = new VBox(new Text("Error !!!!!"),new Label(errorMessage), button);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(15));
        button.setOnAction( a -> dialogStage.close());
        dialogStage.setScene(new Scene(vbox));
        dialogStage.setAlwaysOnTop(true);
        dialogStage.show();
    }
}
