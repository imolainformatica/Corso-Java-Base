package it.imolinfo.javacurse2017.Slide5_1.EsempiAWT.Bottoni;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * Created by francesca on 13/04/17.
 */
public class InterfacciaListener implements ActionListener {
    public InterfacciaListener() {}
    public void actionPerformed(ActionEvent e) {
        System.out.println("ehi qualcuno ha premuto il bottone "+e.getActionCommand());
    }
}
