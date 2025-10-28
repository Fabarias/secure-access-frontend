module org.secureaccess.app.secureaccessfrontend {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens org.secureaccess.app.secureaccessfrontend to javafx.fxml;
    opens org.secureaccess.app.secureaccessfrontend.ui.login.Policia to javafx.fxml;
    opens org.secureaccess.app.secureaccessfrontend.ui.login.Ciudadano to javafx.fxml;
    opens org.secureaccess.app.secureaccessfrontend.ui.dashboard to javafx.fxml;
    opens org.secureaccess.app.secureaccessfrontend.ui.selection to javafx.fxml;


    exports org.secureaccess.app.secureaccessfrontend;
}