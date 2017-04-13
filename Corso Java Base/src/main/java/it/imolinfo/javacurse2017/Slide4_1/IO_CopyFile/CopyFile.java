package it.imolinfo.javacurse2017.Slide4_1.IO_CopyFile;
import java.io.*;

/** Applicazione CopyFile
 *  Utilizza uno FileStream in lettura ed 
 *  un FIleStream in scrittura per fare un
 *  copia file byte a byte.
 * 
 *  Corso Java Base Giorno 4
*/

public class CopyFile {
   
   static public void main (String args[]) throws IOException {
      
      //Se il file non esiste: exception!
      FileInputStream fileInStream = new FileInputStream ("text.txt");
      //Se il file non esiste, lo crea. Se esiste, lo sovrascrive.
      FileOutputStream fileOutStream = new FileOutputStream ("text2.txt"); 
      
      //Buffer di 256 byte:
      byte buffer[] = new byte[256];
      
      //intero per testare il valore restituito da .read():
      // quando � -1 significa EOF.
      int n;
      
      //Ciclo di lettura e scrittura: ogni volta che il buffer
      //� riempito lo scrive nel nuovo file e ricomincia.
      //Il numero di cicli dipende dalle dimensioni del file.
      while ((n = fileInStream.read(buffer)) > -1){
         System.out.println("Ho riempito buffer, ora scrivo ...");
         fileOutStream.write(buffer, 0, n);
      }
      System.out.println("File copiato.");
      
      //Chiude gli stream.
      fileOutStream.close ();
      fileInStream.close ();
   }
}
