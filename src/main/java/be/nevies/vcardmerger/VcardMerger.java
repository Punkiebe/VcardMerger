/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.nevies.vcardmerger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Dries
 */
public class VcardMerger extends Application {
    
    public static void main(String[] args) {
        Application.launch(VcardMerger.class, args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("vcardMerger_program.fxml"));
        
        stage.setScene(new Scene(root));
        stage.show();
    }
}
