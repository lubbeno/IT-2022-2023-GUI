module lubos.sukup.it20222023gui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;

    opens lubos.sukup.it20222023gui to javafx.fxml;
    exports lubos.sukup.it20222023gui;
}