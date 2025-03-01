package org.example.oranjelogistiksoftware;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;
import java.io.InputStream;


public class OranjeLogistik extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(OranjeLogistik.class.getResource("login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1080, 720);
        Image image = new Image(getClass().getResource("/org/example/oranjelogistiksoftware/images/logo.png").toExternalForm());
        stage.getIcons().add(image);
        stage.setTitle("Oranje Logistik");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}