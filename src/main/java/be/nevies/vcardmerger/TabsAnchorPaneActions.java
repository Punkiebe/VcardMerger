/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.nevies.vcardmerger;

import java.io.File;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;

/**
 *
 * @author Dries
 */
public class TabsAnchorPaneActions {
    
    @FXML
    private MenuItem printConsoleMenu;
    
    @FXML
    private VBox anchorPaneListOne;

    @FXML
    private Button openContactListOneButton;

    @FXML
    private void listOneButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");

        FileChooser fileChooser = new FileChooser();

        //Set extension filter
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("VCF Files(*.vcf)", "*.vcf");
        fileChooser.getExtensionFilters().add(extFilter);
        fileChooser.setInitialDirectory(new File("G:\\JavaDev\\Projects\\VcardMerger\\src\\etc"));

        //Show open file dialog
        File file = fileChooser.showOpenDialog(null);
        
        if (file.canRead()) {
            System.out.println("Can read!!");
            openContactListOneButton.setVisible(false);
            
            VcardUtil.readVcfFile(file, anchorPaneListOne);
            anchorPaneListOne.setVisible(true);
            
        } else {
            // can't read
            openContactListOneButton.setText("Hello World!");
            System.out.println("Can't read the file!!");
        }
    }
    
    @FXML
    private void printToConsoleListOneAction(ActionEvent event) {
        System.out.println("-------------------------------------------");
        VcardUtil.printToConsole();
        System.out.println("-------------------------------------------");
    }
}
