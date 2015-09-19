/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jdojo.container;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
/**
 *
 * @author ajax
 */
public class GridPaneChildrenPosition extends Application {

    @Override
    public void start(Stage stage) {
        Button b1 = new Button("One One One One");
        Button b2 = new Button("two two two");
        Button b3 = new Button("three");
    
        GridPane root = new GridPane();
        
        root.getChildren().addAll(b1, b2, b3);
        
        // Set the cells the buttons
        GridPane.setConstraints(b1, 0, 0); // (c0, r0)
        GridPane.setConstraints(b2, 1, 0); // (c1, r0)
        GridPane.setConstraints(b3, 2, 0); // (c2, r0)

        root.setStyle("-fx-padding: 10;" +
                        "-fx-border-style: solid inside;" +
                        "-fx-border-width: 2;" +
                        "-fx-border-insets: 5;" +
                        "-fx-border-radius: 5;" +
                        "-fx-border-color: blue;"
        );
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Setting Positions for Children in a GridPane");
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
