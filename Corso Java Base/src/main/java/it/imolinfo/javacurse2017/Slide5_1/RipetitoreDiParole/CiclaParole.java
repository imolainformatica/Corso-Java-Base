package it.imolinfo.javacurse2017.Slide5_1.RipetitoreDiParole;

/**
 * Created by francesca on 13/04/17.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CiclaParole extends JFrame
        implements ActionListener {
    JButton btnSuccessiva;
    JLabel lbParola;
    JPanel pannello;
    String[] parole = {"Albero", "Fiume", "Terra", "Lago", "Fuoco"};
    int i =  0;

    public CiclaParole() {
        pannello = new JPanel(new GridLayout(0,1));
        lbParola = new JLabel();
        btnSuccessiva = new JButton("Parola Successiva");
        pannello.add(btnSuccessiva);
        pannello.add(lbParola);
        setContentPane(pannello);
        btnSuccessiva.addActionListener(this);
        setTitle("Cicla Parole");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(400,150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int c = i % parole.length;
        lbParola.setText(parole[c]);
        i++;
    }

    public static void main(String[] args) {
        CiclaParole frame = new CiclaParole();
    }
}
