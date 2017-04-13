package it.imolinfo.javacurse2017.Slide5_1.EsempiAWT.Bottoni;
import java.awt.*;
/**
 * Created by francesca on 13/04/17.
 */
public class Interfaccia {
    Frame f;
    Button b;
    Button b2;
    InterfacciaListener pl;

    public Interfaccia() {
        //Istanzio il frame
        f = new Frame();

        //Istanzio i widget necessari
        b = new Button("ciao");
        b2 = new Button("ciao2");

        //Istanzio il Listener
        pl = new InterfacciaListener();

        //Aggiungo il listener ai widget creati
        b.addActionListener(pl);
        b2.addActionListener(pl);
        b.setActionCommand("b");
        b2.setActionCommand("b2");

        //Definisco il layout del frame
        f.setLayout(new BorderLayout());

        //Aggiungo i widget al Frame con il layout scelto
        f.add(b,BorderLayout.NORTH);
        f.add(b2,BorderLayout.EAST);

        //Renderizzo del layout
        f.pack();

        //Rendo visibile il frame
        f.setVisible(true);
    }

    public static void main(String[] args) {
        Interfaccia p=new Interfaccia();
    }
}
