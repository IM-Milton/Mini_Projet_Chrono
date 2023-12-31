package com.example.mini_projet_chrono;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.image.*;
import javafx.stage.Stage;


import java.io.IOException;
import java.util.Objects;

public class Main extends Application {

    public void start( Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("View.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 458, 277);
        stage.setTitle("Chronomètre");
        stage.setScene(scene);


        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}
