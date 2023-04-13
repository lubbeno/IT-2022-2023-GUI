package lubos.sukup.it20222023gui.gridpane;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

import java.util.HashMap;
import java.util.Map;

public class PrvyGridPaneController {

    @FXML
    private Label loginText;


    private Map<String,String> passwordStore = new HashMap<>();

    {
        passwordStore.put("john","123");
        passwordStore.put("marry","456");
    }

    @FXML
    public void process(){

    }

}
