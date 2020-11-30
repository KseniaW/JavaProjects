package com.syntax1.class09int;

import com.syntax1.class01int.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

import static javafx.application.Application.launch;

public class GUIApp extends Application implements EventHandler<ActionEvent> {


    private Object Label;

    public static void main(String[] args) {

        launch();
    }



    @Override
    public void start(Stage primaryStage)throws Exception{
        Button button=new Button("Click Me");
       Label label=new Label("Enter your name");
        TextField text = new TextField();
        VBox vBoxlayout=new VBox();
        //StackPane vBoxLayout=new StackPane();
        vBoxlayout.getChildren().add((Node) Label);

    }


    @Override
    public void handle(ActionEvent event) {
    }
}



