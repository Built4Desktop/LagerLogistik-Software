package org.example.oranjelogistiksoftware;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ApplicationController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Velkommen til Oranje's Lager & Logistik Program");
    }
}