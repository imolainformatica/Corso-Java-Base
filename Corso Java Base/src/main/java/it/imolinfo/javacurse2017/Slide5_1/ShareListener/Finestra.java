package it.imolinfo.javacurse2017.Slide5_1.ShareListener;

import javax.swing.*;
import java.awt.*;

/**
 * Created by francesca on 14/04/17.
 */
public class Finestra extends JFrame {

    JTextField campo1;
    JTextField campo2;
    JPanel pannello;

    public Finestra() {
        campo1=new JTextField();
        campo2=new JTextField();
        pannello = new JPanel(new GridLayout(1,0)) ;


        Listener ac = new Listener();
        campo1.addActionListener(ac);
        campo2.addActionListener(ac);
        campo1.addKeyListener(ac);
        campo2.addKeyListener(ac);

        pannello.add(campo1);
        pannello.add(campo2);
        setContentPane(pannello);
        pack();
        setVisible(true);
        setSize(400,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        Finestra fi = new Finestra();
    }

}
