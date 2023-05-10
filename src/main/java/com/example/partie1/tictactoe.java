package com.example.partie1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class tictactoe extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane root =new BorderPane();

        ImageView image = new ImageView("");

        Scene scene = new Scene(root, 300,300);
        primaryStage.initStyle(StageStyle.UTILITY);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Tic Tac Toe");
        // Affichage de la fenêtre
        primaryStage.show();

    }
}
