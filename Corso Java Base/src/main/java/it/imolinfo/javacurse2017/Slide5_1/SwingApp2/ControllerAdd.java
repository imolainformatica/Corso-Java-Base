package it.imolinfo.javacurse2017.Slide5_1.SwingApp2;

/**
 * Created by francesca on 13/04/17.
 */
import java.awt.event.*;

public class ControllerAdd implements ActionListener{
    MyText pointer;public ControllerAdd(MyText t){
        pointer = t;
    }

    public void actionPerformed(ActionEvent e){
        pointer.execAdd();
    }
}
