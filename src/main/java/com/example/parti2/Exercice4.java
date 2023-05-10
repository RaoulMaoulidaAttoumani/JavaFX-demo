package com.example.parti2;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Exercice4 extends Application {

    private Label topLabel;

    private Button btnG;
    private Button btnR;
    private Button btnB;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        BorderPane root = new BorderPane();


        // create bottom section with status label
        this.topLabel = new Label("Vert chois 3 fois");
        VBox top = new VBox(topLabel);
        top.setAlignment(Pos.CENTER);
        top.setPadding(new Insets(10));
        root.setTop(top);

        Pane main = new Pane();


        HBox hbtn = new HBox();

        this.btnG = new Button("Vert");
        this.btnR = new Button("Rouge");
        this.btnB = new Button("Bleu");

        // Gestionnaire d'évènements appelé lors du clic sur le bouton
        EventHandler<MouseEvent> buttonClickHandler = actionEvent -> {
            topLabel.setText(btnB.getText()+" cliqué");
        };
        hbtn.setSpacing(10);
        hbtn.setAlignment(Pos.CENTER);
        hbtn.setPadding(new Insets(10));

        hbtn.getChildren().addAll(btnG, btnR, btnB);

        root.setBottom(hbtn);
        // Changement du texte après un clic sur le bouton
        btnG.addEventHandler(MouseEvent.MOUSE_CLICKED, buttonClickHandler);
        btnR.addEventHandler(MouseEvent.MOUSE_CLICKED, buttonClickHandler);
        btnB.addEventHandler(MouseEvent.MOUSE_CLICKED, buttonClickHandler);
        // set the scene
        Scene scene = new Scene(root, 600, 400);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Window Color");
        primaryStage.show();


    }
}