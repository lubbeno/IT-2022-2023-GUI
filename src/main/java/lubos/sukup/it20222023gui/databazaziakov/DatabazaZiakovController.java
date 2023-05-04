package lubos.sukup.it20222023gui.databazaziakov;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;


public class DatabazaZiakovController {

    @FXML
    public ListView<Ziak> myView;

    @FXML
    TextArea myArea;

    public void initialize(){

        ObservableList<Ziak> operacie =
                FXCollections.observableArrayList(new Ziak("jedna","dva",1),new Ziak("jedna","dva",1));
        myView.setItems(operacie);
       // myView.getSelectionModel().getSelectedItems();

        myArea.setText("test");
    }

}
