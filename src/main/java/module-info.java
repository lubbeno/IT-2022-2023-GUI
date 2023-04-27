module myApp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;

    exports lubos.sukup.it20222023gui.gridpane;
    exports lubos.sukup.it20222023gui.basic;
    opens lubos.sukup.it20222023gui.basic to javafx.fxml;
    opens lubos.sukup.it20222023gui.gridpane to javafx.fxml;
    opens lubos.sukup.it20222023gui.kalkulacka to javafx.fxml;
    exports lubos.sukup.it20222023gui.kalkulacka;
}