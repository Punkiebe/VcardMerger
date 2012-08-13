/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.nevies.vcardmerger;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.layout.Pane;
import net.sourceforge.cardme.engine.VCardEngine;
import net.sourceforge.cardme.vcard.VCard;

/**
 *
 * @author Dries
 */
public class VcardUtil {

    private static Collection<Contact> contactlist = new ArrayList<>();

    public static void readVcfFile(File file, Pane parent) {
        VCardEngine engine = new VCardEngine();
        try {
            List<VCard> vcards = engine.parseMultiple(file);

            for (VCard card : vcards) {
                Contact convert = Contact.convert(card, parent);
                System.out.println(">>" + convert.toString());
                contactlist.add(convert);
            }
        } catch (IOException ex) {
            Logger.getLogger(VcardUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Print to the console all the contacts in the contact list.
     */
    public static void printToConsole() {
        for (Contact contact : contactlist) {
            System.out.println(contact.toString());
        }
    }
}
