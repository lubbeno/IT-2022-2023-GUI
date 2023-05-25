package lubos.sukup.it20222023gui.databazaziakov;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;


public class DatabazaZiakovController {

    @FXML
    private TextField meno;
    @FXML
    private TextField priezvisko;
    @FXML
    private TextField vek;
    @FXML
    private TextField poradie;
    @FXML
    public ListView<Ziak> myView;
    @FXML
    TextArea myArea;

    private List<Ziak> ziaci = new ArrayList<>();

    @FXML
    public void pridatZiaka(){
        Ziak ziak = new Ziak(meno.getText(),priezvisko.getText(),Integer.parseInt(vek.getText()));
        ziaci.add(ziak);
        zobrazZiakov();

    }


    public void initialize(){

        ObservableList<Ziak> operacie =
                FXCollections.observableArrayList(new Ziak("jedna","dva",1),new Ziak("jedna","dva",1));
        myView.setItems(operacie);
       // myView.getSelectionModel().getSelectedItems();

        myArea.setText("test");
    }

@FXML
public void zmazatZiaka(){
     int poradieZ = Integer.parseInt(poradie.getText());
     ziaci.remove(poradieZ-1);

    zobrazZiakov();
}

private void zobrazZiakov(){
    String vsetci="";
    for (Ziak ziak1 : ziaci) {
        vsetci = vsetci + ziak1.getMeno() + " " + ziak1.getPriezvisko() +
                " " + ziak1.getVek() + "\n";
    }

    myArea.setText(vsetci);

    ObservableList<Ziak> operacie =
            FXCollections.observableArrayList(ziaci);
    myView.setItems(operacie);
}
}
