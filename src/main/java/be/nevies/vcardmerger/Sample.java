/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.nevies.vcardmerger;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Dries
 */
public class Sample implements Initializable {
    
    @FXML
    private Label OpenContactListOneButton;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        OpenContactListOneButton.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
