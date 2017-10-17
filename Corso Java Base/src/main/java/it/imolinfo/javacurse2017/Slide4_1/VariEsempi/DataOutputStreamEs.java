package it.imolinfo.javacurse2017.Slide4_1.VariEsempi;

import java.io.*;

//gestisce i tipi primitivi e li scrive o come byte o come stringa a seconda dei metodi
public class DataOutputStreamEs {

    public static void main(String[] args) {
        try (
                OutputStream os = System.out;
                DataOutputStream dos = new DataOutputStream(os)) {

            dos.writeInt(123);
            dos.writeUTF("\n");
            dos.writeUTF("stella");
            dos.writeUTF("\n");
            dos.writeChars("stella");

        } catch (IOException e) {

        }
    }
}
