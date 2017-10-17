package it.imolinfo.javacurse2017.Slide4_1.VariEsempi;

import java.io.*;

//PrintWriter per scrivere su file
//DataOutputStream per scrivere su qualsiasi altra destinazione
public class PrintWriterEs {

    public static void main(String[] args) {
       try (
               OutputStream os = new FileOutputStream("dos.txt");
               PrintWriter pw = new PrintWriter(os)) {

           pw.print(123); // su file non scrive realmente 123 in quanto un file accetta
           pw.write(" stella");


       } catch (FileNotFoundException fnfe) {

       } catch (IOException e) {

       }
    }
}
