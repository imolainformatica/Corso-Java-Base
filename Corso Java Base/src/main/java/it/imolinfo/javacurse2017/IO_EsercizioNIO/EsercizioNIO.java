package it.imolinfo.javacurse2017.IO_EsercizioNIO;
/* Esercizio:
 * Si scriva un programma per testare le performance di java.nio e java.io.
 * Tale programma deve aprire un file in scrittura di 1000000 bytes e vi deve scrivere 1000000 per 10 volte.
 * Alla fine di questo deve stampare il tempo totale impiegato.
 */
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/*
 * Creato il 3-mag-2004
 *
 * Per modificare il modello associato a questo file generato, aprire
 * Finestra&gt;Preferenze&gt;Java&gt;Generazione codice&gt;Codice e commenti
 */

/**
 * @author giammarc
 *
 * Per modificare il modello associato al commento di questo tipo generato, aprire
 * Finestra&gt;Preferenze&gt;Java&gt;Generazione codice&gt;Codice e commenti
 */
public class EsercizioNIO {
    RandomAccessFile fos;
    FileChannel ch;
    MappedByteBuffer mbb;
    ByteBuffer bb;
    ByteBuffer dbb;
    byte[] ab;
    
    public EsercizioNIO() throws IOException {
        fos = new RandomAccessFile("bigtext.txt", "rw");
        ch = fos.getChannel();
        mbb = ch.map(FileChannel.MapMode.READ_WRITE, 0, 1000000);
        bb = ByteBuffer.allocate(1000000);
        dbb = ByteBuffer.allocateDirect(1000000);
        ab= new byte[1000000];
    }
    
    public static void main(String[] args) throws IOException {
        EsercizioNIO nio = new EsercizioNIO();
        nio.testa();
        long t = System.currentTimeMillis();
        for (int i2 = 0; i2 < 10; i2++) {
            nio.testa();
        }
        
        t = System.currentTimeMillis() - t;
        System.out.println(t);
        t = System.currentTimeMillis();
        for (int i2 = 0; i2 < 10; i2++) {
            nio.testa2();
        }
        
        t = System.currentTimeMillis() - t;
        System.out.println(t);
        t = System.currentTimeMillis();
        for (int i2 = 0; i2 < 10; i2++) {
            nio.testa3();
        }
        
        t = System.currentTimeMillis() - t;
        System.out.println(t);
        t = System.currentTimeMillis();
        
        for (int i2 = 0; i2 < 10; i2++) {
            nio.testa4();
        }
        
        t = System.currentTimeMillis() - t;
        System.out.println(t);
    }
    
    
    
    public void testa() {
        for (int i = 0; i < 1000000; i++) {
            mbb.put(i, (byte) 65);
        }
        //mbb.force();
    }
    
    public void testa2() throws IOException {
        for (int i = 0; i < 1000000; i++) {
            bb.put(i, (byte) 65);
        }
        bb.flip();
        ch.write(bb);
        bb.clear();
    }
    public void testa3() throws IOException {
        for (int i = 0; i < 1000000; i++) {
            dbb.put(i, (byte) 65);
        }
        dbb.flip();
        ch.write(dbb);
        dbb.clear();
    }
    public void testa4() throws IOException {
        for (int i = 0; i < 1000000; i++)
            ab[i]=65;
        //fos.seek(0);
        fos.write(ab);
    }
}
