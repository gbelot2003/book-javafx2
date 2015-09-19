/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx2;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author ajax
 */
public class JavaFx2 extends Application {
    
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        Label nameLbl = new Label("Enter your name: ");
        TextField nameFld = new TextField();

        Label msg = new Label();
        msg.setStyle("-fx-text-fill: blue");

        Button sayHelloBtn = new Button("Say Hello");
        Button exitBtn = new Button("Exit");

        sayHelloBtn.setOnAction(e -> {
            String name = nameFld.getText();
            if (name.trim().length() > 0) {
                msg.setText("Hello " + name);
            } else {
                msg.setText("Hello there");
            }
        });
        
        exitBtn.setOnAction(e -> Platform.exit());

        VBox root = new VBox();
        
        root.setSpacing(5);
        
        root.getChildren().addAll(nameLbl, nameFld, msg, sayHelloBtn, exitBtn);
        
        Scene scene = new Scene(root, 350, 150);
        
        stage.setScene(scene);
        
        stage.setTitle("Improved Hello JavaFx Aplicaction");
        
        stage.show();
    }
      
}
