package it.imolinfo.javacurse2017.Slide5_1.ShareListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by francesca on 14/04/17.
 */
public class Listener extends KeyAdapter implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public void keyReleased(KeyEvent e) {
        JTextField textField = (JTextField) e.getSource();
        String text = textField.getText();
        textField.setText(text.toUpperCase());
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
    }
}
