package it.imolinfo.javacurse2017.Slide5_1.EsempiAWT;
import  java.awt.*;
/**
 * Created by francesca on 13/04/17.
 */
public class Prova {
    Button b;
    Frame f;

    public Prova() {
        f=new Frame();
        b=new Button("ciao");
        f.add(b);
        f.setVisible(true);

    }public static void main(String[] args) {
        Prova p=new Prova();
    }
}
