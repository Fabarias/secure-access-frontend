package org.secureaccess.app.secureaccessfrontend.ui.selection;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class eleccionController {

    @FXML
    private void accesoLoginCiudadano(ActionEvent event) throws IOException {

        String fxmlPath = "/org/secureaccess/app/secureaccessfrontend/ui/login/Ciudadano/loginCiudadanoView.fxml";

        FXMLLoader fxmlCiudadano = new FXMLLoader(getClass().getResource(fxmlPath));

        Parent loginCiudadano = fxmlCiudadano.load();

        Scene escenarioLoginCiudadano = new Scene(loginCiudadano);
        Stage ventanaActual = (Stage) ((Node) event.getSource()).getScene().getWindow();

        ventanaActual.setScene(escenarioLoginCiudadano);
        ventanaActual.show();
    }

    @FXML
    private void accesoLoginPolicia(ActionEvent event) throws IOException {

        String fxmlPath = "/org/secureaccess/app/secureaccessfrontend/ui/login/Ciudadano/loginCiudadanoView.fxml";

        FXMLLoader fxmlCiudadano = new FXMLLoader(getClass().getResource(fxmlPath));

        Parent loginCiudadano = fxmlCiudadano.load();

        Scene escenarioLoginCiudadano = new Scene(loginCiudadano);
        Stage ventanaActual = (Stage) ((Node) event.getSource()).getScene().getWindow();

        ventanaActual.setScene(escenarioLoginCiudadano);
        ventanaActual.show();

    }


}
