/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx2;

import java.util.List;
import java.util.Map;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 *
 * @author ajax
 */
public class FxParamApp extends Application{
    public static void main(String[] args){
        Application.launch(args);
    }
    
    @Override
    public void start(Stage stage){
        Parameters p = this.getParameters();
        Map<String, String> namedParams = p.getNamed();
        List<String> unnamedParams = p.getUnnamed();
        List<String> rawParams = p.getRaw();
        
        String ParamStr = "Named Parameter: " + namedParams + "\n" + "Unnamed Params: " + unnamedParams +
                            "Raw params: " + rawParams;
        
        TextArea ta = new TextArea(ParamStr);
        Group root = new Group(ta);
        stage.setScene(new Scene(root));
        stage.setTitle("Application parameters");
        stage.show();
      
        
    }
   
}
