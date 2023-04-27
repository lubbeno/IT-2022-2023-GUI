package lubos.sukup.it20222023gui.gridpane;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.util.HashMap;
import java.util.Map;

public class PrvyGridPaneController {
    @FXML
    private Label loginText;

    @FXML
    private TextField uzivatelskeMeno;

    @FXML
    private PasswordField heslo;

    private Map<String,String> passwordStore = new HashMap<>();
    {
        passwordStore.put("john","123");
        passwordStore.put("marry","456");
    }
    @FXML
    public void process(){
            String daneMeno = uzivatelskeMeno.getText();
            String hesloString = heslo.getText();
            String hesloZmapy = passwordStore.get(daneMeno);

           if(passwordStore.containsKey(daneMeno)){
               if(hesloZmapy.equals(hesloString)){
                   loginText.setText("Vitaj " + daneMeno.toUpperCase());
            }else{
                   loginText.setText("zle heslo");
            }
        }else{
            loginText.setText("Meno je zle");
        }

    }
}
