/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdojo.scene;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author ajax
 */
public class RunLaterApp extends Application {
    /**
    * 
    * @param args 
    */
    public static void main(String[] args){
        Application.launch(args);
    }
    
    @Override
    public void init(){
        System.out.println("init(): " + Thread.currentThread().getName());
        
        Runnable task = () -> System.out.println(" Running the task on the " + Thread.currentThread().getName());
        
        Platform.runLater(task);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(new Group(), 400, 100));
        stage.setTitle("Using platform.runLater() Method");
        stage.show();
    }
}
