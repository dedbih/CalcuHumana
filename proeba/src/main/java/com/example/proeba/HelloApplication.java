package com.example.proeba;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Lógica detrás del GUI, me carga el archivo .fxml, configura la ventana principal
 */
public class HelloApplication extends Application {
    /**
     *
     * @param primaryStage
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        primaryStage.setTitle("Calculadora Humana");
        primaryStage.setScene(new Scene(root, 426, 538));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}