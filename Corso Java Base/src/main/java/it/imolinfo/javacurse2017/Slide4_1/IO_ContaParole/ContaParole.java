package it.imolinfo.javacurse2017.Slide4_1.IO_ContaParole;

/** Applicazione ContaParole
 *  Utilizza uno Stream in lettura "costruito" concatenando
 *  oggetti InputStream in modo che legga da file,
 *  con filtro e bufferizzato.
 *  
 *  Utilizza un oggetto Map (treeMap) per memorizzare le parole
 *  presenti in un file con la loro frequenza.
 *  
 *  Corso Java Base Giorno 4
*/

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ContaParole {
      
   //Permette la lettura da File
   FileInputStream fileInStream;
   //Permette di bufferizzare la lettura dal canale di Stream
   BufferedInputStream buffInStream;   
   //DataInputStream fornisce metodi per leggere i tipi primitivi:
   DataInputStream dataInStream;
   
   //Una Map permette di creare un set di dati organizzati
   //in modo che a ciascun valore (value) corrispnda 
   //una chiave (key) "rappresentativa". 
   // NMB: key � un generico Object.
   Map treeMap;
   
   //Frequenza iniziale delle parole nel file:
   final int initialFrequency = 1;

   // Costruttore della classe
   public ContaParole() throws IOException {
      
      //Istanza dell'oggetto TreeMap
      treeMap = new TreeMap();
      
      // La costruzione �:
      // fileInStream<=(bufferedInStream<=dataInStream)
      // tra () le due classi "filtro"
      // si ottiene cos� un oggetto che pu� leggere tutti i tipi
      // primitivi in modo bufferizzato da un file.
      //
      //Le successive operazioni possono generare delle eccezioni
      //quindi vanno inserite in un try ... catch:
      try{
         
         fileInStream = new FileInputStream("text.txt");
         buffInStream = new BufferedInputStream(fileInStream);
         dataInStream = new DataInputStream(buffInStream);
      }
      catch(FileNotFoundException e){
         //Nel caso in cui il file non sia presente
         //� generata questa eccezione.
         System.out.println("File not found!");
      }

    }
    
    //Calcola la frequenza, cio� quante volte 
    //� presente ogni parola nel file.
   public void calcolaFrequenzaParole() throws IOException {
       //in questa variabile leggo il singolo carattere: 
      char readCharacter = '.';
       
       
       //Le successive operazioni possono generare delle eccezioni
       //quindi vanno inserite in un try ... catch:
       try {
         
         //Loop perpetuo da cui si esce grazie all'eccezione EOF! 
         while (true){
            //in questa variabile ricostruisco le parole:
            String wordToAdd = "";
            //legge dallo stream, cio� dal file, il prossimo carattere:
            readCharacter = (char) dataInStream.readUnsignedByte();

            //Ciascuna parola � delimitata da uno spazio o da un "a capo": 
            while( (readCharacter != ' ') && (readCharacter != '\n')){
               //"rimonto" la parola
               wordToAdd = wordToAdd + readCharacter;
               //legge dallo stream, cio� dal file, il prossimo carattere:
               readCharacter = (char) dataInStream.readUnsignedByte();
            }
            //Aggiunge la parola al treeMap:
            addWordToTree(wordToAdd);
         }
      }
      catch(EOFException e) {
         System.out.println("Raggiunta EOF");
      }
      catch(NullPointerException ee){
         System.out.println("NullPointerException catched.");
      }
      finally {
         System.out.println("treeMap: " + treeMap);
      }
        
    }
    
   //Aggiunge le parole (key) al mapTree 
   //aggiornando la frequenza (Value)
   private void addWordToTree(String key) {
      //In base a Key (la parola) recupera il valore di Value
      //NMB TreeMap ESIGE Oggetti non variabili (Integer, non int)
      Integer frequency = (Integer) treeMap.get(key);
      
      //Se � la prima occorrenza inizializza la frequenza:
      if(frequency == null) {
         frequency = initialFrequency;
      }
      //ALtrimenti la aggiorna (+1)
      else{
         int value = frequency.intValue();
         frequency = new Integer(value + 1);
      }
      //aggiorna Parola (key) e frequenza (value) nel treeMap
      treeMap.put(key, frequency);
    }
    
    //Main dell'applicazione:
    public static void main(String[] args)throws FileNotFoundException, IOException {
       //Istanza della claase 
       ContaParole contaParole1 = new ContaParole();
       //Esegue il metodo principale:
       contaParole1.calcolaFrequenzaParole();
    }
    
   
    
}
