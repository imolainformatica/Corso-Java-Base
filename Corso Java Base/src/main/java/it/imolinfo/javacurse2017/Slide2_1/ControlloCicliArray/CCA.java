/** Progetto Controllo, Cicli e Array.
 *  Questo esempio introduce l'uso degli array
 *  dei cicli for e while.
 *  Sfrutta un array di interi "cablato" per comodità nella classe
 * 
 *  Metodi:
 *    costruttore (unico)  -  visualizza l'array di partenza
 *    stampaArrayOfInt     -  stampa a video i valori di un generico array di interi
 *    manipolaArray        -  partendo dall'array cablato nella classe:
 *                            genera e stampa un array i cui valori derivano dall'array originale
 *                            esegue una copia el.to per el.to dell'array originale che 
 *                            è anche l'output del metodo.
 *   stampaSeMultiplo      -  stampa a video i valori dell'array di interi "numeri" che sono multipli
 *                            esatti dell'intero "base" con "numeri" e "base" entrambi 
 *                            parametri in input 
 */

package it.imolinfo.javacurse2017.Slide2_1.ControlloCicliArray;

/**
 * Esercizi per i corsi Java
 * Mokabyte - Imola Informatica
 * Autore: Giuliano
 */

//E' un buon esempio di nome PESSIMO! Non significa nulla ma
// in realtà ha scopo didattico e quindi non ha uno scopo preciso ...
public class CCA {
   //questo è l'array alla base dei metodi di esempio.
   private int[] numeriDaStampare = {1,3,5,7,9,11,13,17};
   
   public CCA(){
      System.out.println("Costruttore: la classe possiede questo array di interi:");
      stampaArrayOfInt(numeriDaStampare);
      
   }
   
   //Metoso di uso interno (quindi privato!) che stampa i valori dell'array.
   private void stampaArrayOfInt(int [] inputArray){
      String elencoElementi = "{";
      for(int i=0; i < inputArray.length; i++){
         elencoElementi =  elencoElementi + " " + inputArray[i];
      }
      System.out.println(elencoElementi + " }");
   }
   
   //Metodo che restitusice un copia dell'array proprietà della classe
   //ed esegue alcune operazioni a partire dai valori dello stesso array.
   public int[] manipolaArray(){ 
      //Definisco due array lunghi quanto numeriDaStampare:
      int iArrayLength = numeriDaStampare.length;
      int[] copiaNumeriDaStampare = new int[iArrayLength];
      int[] numeriModificati = new int[iArrayLength];
      //Eseguo una copia ed alcuni calcoli sui vettori:
      for (int i=0; i < iArrayLength; i++){
         copiaNumeriDaStampare[i] = numeriDaStampare[i];
         numeriModificati[i] = (numeriDaStampare[i]*2)+7;
      }
      System.out.println("numeri modificati:");
      stampaArrayOfInt(numeriModificati);
      System.out.println("copia dei numeri:");
      stampaArrayOfInt(copiaNumeriDaStampare);
      //Restituisco la copia; le manipolazioni 
      //"muoiono" all'uscita del metodo.
      return copiaNumeriDaStampare;      
   }
   
   //Questo metodo accetta un array "dinamico" di interi 
   //in ingresso e controlla se i numeri sono multipli 
   //di un dato valore passato anch'esso come parametro.
   public int stampaSeMultiplo(int[] numeri, int base){
      //a capo ...
      System.out.println("\n");
      //Varibili locali
      int iArrayLength = numeri.length;   //lunghezza dell'array in ingresso.
      int indiceElemento = 0;
      int totaleMultipli = 0;

      //Mostriamo i numeri passati:
      System.out.println("Array da esaminare:");
      stampaArrayOfInt(numeri);
      
      //ciclo while:
      while(indiceElemento < iArrayLength){
         //verifica se l'el.to corrente è multiplo di base:
         if((numeri[indiceElemento]%base) == 0){
            System.out.println(numeri[indiceElemento] + " e' un multiplo di " + base);
            totaleMultipli++;
         }
         else
            System.out.println(numeri[indiceElemento] + " non e' multiplo di " + base);
         indiceElemento++;
      }
      return totaleMultipli;
   }
   
   
}

