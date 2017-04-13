package it.imolinfo.javacurse2017.Slide5_1.EsempiAWT;
import java.awt.Frame;
import java.awt.Button;

/**
 * Created by francesca on 13/04/17.
 */
public class Prova2 extends Frame {
    Button b;

    public Prova2() {
        b=new Button("ciao");
        this.add(b);

    }public static void main(String args[]) {
        Prova2 p2=new Prova2();
        p2.setVisible(true);
    }
}
