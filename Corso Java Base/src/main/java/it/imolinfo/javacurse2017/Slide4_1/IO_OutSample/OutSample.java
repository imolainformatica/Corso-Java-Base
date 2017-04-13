/*
    OutSample.java
    Semplice esempio di utilizzo dello stream System.out
*/

package it.imolinfo.javacurse2017.Slide4_1.IO_OutSample;
import java.io.*;

public class OutSample {
    
  public static void main (String args[]) throws IOException {
    String[] stringhe ={"casa", "pallone", "bicicletta", "aquilone"};  
    for (int i = 0; i < stringhe.length; ++ i) {
          for (int j = 0; j < stringhe[i].length() ; ++j){
            System.out.write ((byte) stringhe[i].charAt (j));
          }
          
          System.out.write ('\n'); // scrive un invio
          System.out.flush (); // scarica il buffer
        }
  }
}
