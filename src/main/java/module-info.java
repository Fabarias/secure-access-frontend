module org.secureaccess.app.secureaccessfrontend {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens org.secureaccess.app.secureaccessfrontend to javafx.fxml;


    exports org.secureaccess.app.secureaccessfrontend;
    exports org.secureaccess.app.secureaccessfrontend.controllers.menuControllers.listadoDelincuentesControllers;
    opens org.secureaccess.app.secureaccessfrontend.controllers.menuControllers.listadoDelincuentesControllers to javafx.fxml;
    exports org.secureaccess.app.secureaccessfrontend.controllers.loginsControllers;
    opens org.secureaccess.app.secureaccessfrontend.controllers.loginsControllers to javafx.fxml;
    exports org.secureaccess.app.secureaccessfrontend.controllers.eleccionControllers;
    opens org.secureaccess.app.secureaccessfrontend.controllers.eleccionControllers to javafx.fxml;
}