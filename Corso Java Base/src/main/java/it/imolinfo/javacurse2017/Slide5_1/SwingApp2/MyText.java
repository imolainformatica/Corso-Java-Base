package it.imolinfo.javacurse2017.Slide5_1.SwingApp2;
import java.awt.*;
import javax.swing.*;

/**
 * Created by francesca on 13/04/17.
 */
public class MyText extends JFrame {
    private Container MainPanel;
    private JPanel top, up, down;
    private JTextArea  textViewer;
    private JTextField textToAdd;
    private JButton    execAdd;
    private ControllerAdd execAddSoul;

    public MyText(){
        // uso il costruttore della SUPER classe
        super("Il mio testo");
        top  = new JPanel();
        up   = new JPanel();
        down = new JPanel();
        top.setLayout(new GridLayout(2,1));
        up.setLayout(new FlowLayout());
        down.setLayout(new FlowLayout());
        MainPanel = super.getContentPane();
        MainPanel.add(top);
        top.add(up);
        top.add(down);
    }
    public void go() {
        textViewer = new JTextArea(50, 30);
        textViewer.setEditable(false);
        up.add(textViewer);
        textToAdd = new JTextField(20);
        execAdd = new JButton("Add");
        execAddSoul = new ControllerAdd(this);
        execAdd.addActionListener(execAddSoul);
        down.add(textToAdd);
        down.add(execAdd);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setVisible(true);
    }
    public void execAdd() {
        textViewer.append(textToAdd.getText() + "\n");
    }
}
