package org.example.oranjelogistiksoftware;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Alert;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;

    @FXML
    protected void handleLoginButtonAction() throws IOException {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if ("Admin".equals(username) && "123".equals(password)) {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("dashboard-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
            Stage stage = (Stage) usernameField.getScene().getWindow();
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.setTitle("Oranje Logistik");
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Login Error");
            alert.setHeaderText(null);
            alert.setContentText("Invalid username or password!");
            alert.showAndWait();
        }
    }
}