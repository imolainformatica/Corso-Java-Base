package it.imolinfo.javacurse2017.Slide4_1.ByteArrayIOSample;

/** Applicativo ByteArrayIOSample
 *  Usa oggetti delle classi ByteArray(I/O)Stream 
 *  per scivere delle stringhe in memoria, leggerle 
 *  e stamparle a video.
 * 
 * Corso Java Base Giorno */
import java.io.* ;

public class ByteArrayIOSample {
    public static void main( String args[]) throws IOException {
      // Definisce un array di stringhe. 
      String[] stringsArray ={"casa", "pallone", "bicicletta", "aquilone"};  
      // Istanzia un oggetto di tipo ByteArrayOutputStream
      ByteArrayOutputStream byteArrayOutStream = new ByteArrayOutputStream() ;

      // Scrive le stringhe nel ByteArrayOutputStream e quindi nella memoria !!!
      //Esegue un ciclo sugli elementi (stringhe)
      for(int i = 0; i < stringsArray.length ; i++){
         //e per ogni elemento scrive carattere per carattere
         for(int j = 0; j < stringsArray[i].length(); j++)
            byteArrayOutStream.write(stringsArray[i].charAt(j));
         //Agiunge un separatore tra le parole:
         byteArrayOutStream.write('.');
      }
      // Stampa a video il contenuto di byteArrayOutStream
      // NMB: println invoca impicitamente il metodo toString dell'oggetto.
      System.out.println( "oStream : " + byteArrayOutStream ) ; 
      // Stampa a video la dimensione di byteArrayOutStream                                                   
      System.out.println( "size : " + byteArrayOutStream.size() ) ;

      // Ora istanziamo uno Stream in input per scivere il contenuto 
      // della memoria a video:
      // Al costruttore passiamo lo Output Stream da quale leggere: 
      ByteArrayInputStream byteArrayInStream = new ByteArrayInputStream( byteArrayOutStream.toByteArray() ) ;
      
      // Recupera il numero di byte da leggere:
      int availableBytes = byteArrayInStream.available();
      System.out.println( "Byte disponibili : " +  availableBytes) ;
      
      // Usa un ciclo while per scrivere dallo Input Stream
      int readValue = 0;
/*
      //Si pu� usare un ciclo while testando l'output:
      while((readValue = byteArrayInStream.read()) != -1){
         System.out.write(readValue);
      }
*/
      //Oppure un ciclo for in base al valore availableBytes:
      for(int j=0; j<availableBytes; j++){
         readValue = byteArrayInStream.read();
         System.out.print((char)readValue);
      }
    }
}
    
    
    