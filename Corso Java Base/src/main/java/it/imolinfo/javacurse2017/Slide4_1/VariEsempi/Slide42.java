package it.imolinfo.javacurse2017.Slide4_1.VariEsempi;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.math.BigDecimal;

public class Slide42 {

    public static void main (String[] args) {
        ByteOutputStream bos = new ByteOutputStream(args.length);
        for (String arg : args) {
            bos.writeAsAscii(arg);
        }

        ByteInputStream bis = new ByteInputStream(bos.getBytes(), bos.getBytes().length);

        for (int i = 0; i < bis.getBytes().length; i++) {
            int intero = bis.read();
            System.out.println("l'intero " + intero + " equivale al char " + (char)intero);
        }
    }
}
