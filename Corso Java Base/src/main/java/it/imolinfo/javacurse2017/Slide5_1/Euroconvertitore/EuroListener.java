package it.imolinfo.javacurse2017.Slide5_1.Euroconvertitore;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.Currency;

/**
 * Created by francesca on 14/04/17.
 */
public class EuroListener implements ActionListener {
    private TextField lire;
    private TextField euro;

    public EuroListener(TextField lire, TextField euro) {
        this.lire = lire;
        this.euro = euro;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println("action performed by EuroListener");
        Object o=e.getSource();
        NumberFormat ne= NumberFormat.getCurrencyInstance();
        NumberFormat nl= NumberFormat.getCurrencyInstance();

        ne.setCurrency(Currency.getInstance("EUR"));
        nl.setCurrency(Currency.getInstance("ITL"));


        try{
            //lire.setText(new Double((Double.parseDouble(euro.getText())*1936.27)).toString());
            lire.setText(nl.format(Double.parseDouble(euro.getText())*1936.27));
        }catch(Exception ex){
            System.out.println("String mal formata: richiesto un numero");
        }


    }
}
