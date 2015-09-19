/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdojo.stage;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

/**
 *
 * @author ajax
 */
public class EverRunningApp extends Application {
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args){
        Application.launch(args);
    }
    
    /**
     * 
     * @param stage 
     */
    @Override
    public void start(Stage stage){
        //Platform.exit();
        stage.show();
        stage.close();
    }
    
}
