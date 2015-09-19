/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx2;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 *
 * @author ajax
 */
public class FXLifeCycleApp extends Application {
   public FXLifeCycleApp(){
       String name = Thread.currentThread().getName();
       System.out.println("FXLifeCycleApp() contructor: " + name);
   }
   
   public static void main(String[] args){
       Application.launch(args);
   }
   
   @Override
   public void init(){
       String name = Thread.currentThread().getName();
       System.out.println("init() methid: " + name);      
    }
   
   @Override
   public void start(Stage stage){
       String name = Thread.currentThread().getName();
       System.out.println("start() methid: " + name);      
       Scene scene = new Scene(new Group(), 200, 200);
       stage.setScene(scene);
       stage.setTitle("JavaFx App Life Cycle");
       stage.show();
       
    }
   
   @Override
   public void stop(){
       String name = Thread.currentThread().getName();
       System.out.println("stop() methid: " + name);      
    }
   
}
