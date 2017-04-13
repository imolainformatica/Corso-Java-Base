package it.imolinfo.javacurse2017.Slide5_1.SwingApp1;

/**
 * Created by francesca on 13/04/17.
 */
import java.awt.*;import javax.swing.*;
/***Questa classe estende JFrame*e crea una GUI personalizzata**/

public class HelloSwing extends JFrame{
    private JLabel body;
    private Container MainPanel;

    // costruttore
    public HelloSwing(){
        // uso il costruttore della SUPER classe
        super("HelloSwing");
        body = new JLabel("Ciao SWING! addio AWT");MainPanel = super.getContentPane();MainPanel.add( body );
    }
    public void go(){
        // aggiungo la gestione della chiusura del frame
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        // modifico le dimensioni iniziali
        this.setSize(200, 200);
        // rendo visibile i componenti
        this.setVisible(true);
    }

}
