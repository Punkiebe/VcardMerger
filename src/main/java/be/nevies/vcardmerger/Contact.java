/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.nevies.vcardmerger;

import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import net.sourceforge.cardme.vcard.VCard;
import net.sourceforge.cardme.vcard.features.TelephoneFeature;
import net.sourceforge.cardme.vcard.types.parameters.TelephoneParameterType;

/**
 *
 * @author Dries
 */
public class Contact {

    private Pane rootPane;
    private Parent currentElement;
    @FXML
    private TextField formattedName;
    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;
    @FXML
    private TextField email;
    @FXML
    private TextField address;
    @FXML
    private TextField homeNumber;
    @FXML
    private TextField workNumber;
    @FXML
    private TextField mobileNumber;

    public static Contact convert(VCard card, Pane parent) {
        Contact contact = new Contact();
        contact.setRootPane(parent);
        if (parent != null) {
            try {
                Parent info = FXMLLoader.load(contact.getClass().getResource("vcardMerger_contactinfo.fxml"));
                parent.getChildren().add(info);
                contact.setCurrentElement(info);
            } catch (IOException ex) {
                Logger.getLogger(Contact.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
       /* if (card.getFormattedName() != null) {
            contact.setFormattedName(card.getFormattedName().getFormattedName());
        }

        if (card.getName() != null) {
            contact.setFirstName(card.getName().getGivenName());
            contact.setLastName(card.getName().getFamilyName());
        }
        if (card.hasEmails()) {
            contact.setEmail(card.getEmails().next().getEmail());
        }
        if (card.hasAddresses()) {
            contact.setAddress(card.getAddresses().next().toString());
        }
        if (card.hasTelephoneNumbers()) {
            Iterator<TelephoneFeature> telephoneNumbers = card.getTelephoneNumbers();
            while (telephoneNumbers.hasNext()) {
                TelephoneFeature next = telephoneNumbers.next();
                if (TelephoneParameterType.HOME.getType().equals(next.getTelephoneParameterTypes().next().getType())) {
                    contact.setHomeNumber(next.getTelephone());
                } else if (TelephoneParameterType.CELL.getType().equals(next.getTelephoneParameterTypes().next().getType())) {
                    contact.setMobileNumber(next.getTelephone());
                } else if (TelephoneParameterType.WORK.getType().equals(next.getTelephoneParameterTypes().next().getType())) {
                    contact.setWorkNumber(next.getTelephone());
                }
            }
        }
        return contact;*/
    }

    public TextField getAddress() {
        return address;
    }

    public TextField getEmail() {
        return email;
    }

    public TextField getFirstName() {
        return firstName;
    }

    public TextField getFormattedName() {
        return formattedName;
    }

    public TextField getHomeNumber() {
        return homeNumber;
    }

    public TextField getLastName() {
        return lastName;
    }

    public TextField getMobileNumber() {
        return mobileNumber;
    }

    public TextField getWorkNumber() {
        return workNumber;
    }

    public void setAddress(TextField address) {
        this.address = address;
    }

    public void setEmail(TextField email) {
        this.email = email;
    }

    public void setFirstName(TextField firstName) {
        this.firstName = firstName;
    }

    public void setFormattedName(TextField formattedName) {
        this.formattedName = formattedName;
    }

    public void setHomeNumber(TextField homeNumber) {
        this.homeNumber = homeNumber;
    }

    public void setLastName(TextField lastName) {
        this.lastName = lastName;
    }

    public void setMobileNumber(TextField mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setWorkNumber(TextField workNumber) {
        this.workNumber = workNumber;
    }

    public void setAddress(String address) {
        this.address.setText(address);
    }

    public void setEmail(String email) {
        this.email.setText(email);
    }

    public void setFirstName(String firstName) {
        this.firstName.setText(firstName);
    }

    public void setFormattedName(String formattedName) {
        this.formattedName.setText(formattedName);
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber.setText(homeNumber);
    }

    public void setLastName(String lastName) {
        this.lastName.setText(lastName);
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber.setText(mobileNumber);
    }

    public void setWorkNumber(String workNumber) {
        this.workNumber.setText(workNumber);
    }

    public void setCurrentElement(Parent currentElement) {
        this.currentElement = currentElement;
    }

    public void setRootPane(Pane rootPane) {
        this.rootPane = rootPane;
    }

    public Parent getCurrentElement() {
        return currentElement;
    }

    public Pane getRootPane() {
        return rootPane;
    }

    @Override
    public String toString() {
        return "Contact{" + "formattedName=" + formattedName.getText() + ", firstName=" + firstName.getText() + ", lastName=" + lastName.getText() + ", email=" + email.getText() + ", address=" + address.getText() + ", homeNumber=" + homeNumber.getText() + ", workNumber=" + workNumber.getText() + ", mobileNumber=" + mobileNumber.getText() + '}';
    }
}
