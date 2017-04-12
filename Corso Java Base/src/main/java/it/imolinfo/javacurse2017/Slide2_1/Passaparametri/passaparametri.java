/** Progetto passaparametri
 *  In questo esempio:
 *    Si definisce una classe Passaparametri che funge
 *    da contenitore di alcuni esempi sul modo
 *    in cui possono essere passati i parametri da un metodo.
 * 
 *    La classe ha una varibile static per tenere conto del 
 *    numero di oggetti creati.
 *    
 *    I metodi sono:
 *       passaVariabile -  passaggio varibili per valore;
 *       passaOggetto   -  passaggio oggetti per riferimento;
 *       copiaOggetto   -  duplica il "puntatore" all'oggetto e non l'oggetto
 *       replicaOggetto -  crea un nuovo oggetto con proprietà identiche a quelle dell'originale
 *       printOggettiCreati   -  stampa a video il numero di oggetti effettivemente creati (istanziati)
 */

package it.imolinfo.javacurse2017.Slide2_1.Passaparametri;

/**
 * Esercizi per i corsi Java
 * Mokabyte - Imola Informatica
 * Autore: Giuliano
 */
public class passaparametri{
   
   //Propietà della classe:
   public int numero;
   public String stringa;
   
   //Variabile Static, comune a tutti gli oggetti.
   //La usiamo per contare gli oggetti istanziati.
   private static int oggettiCreati = 0;
           
   //costruttore della classe
   public passaparametri(int numeroInput, String stringaInput){
      
      //Queste caratterizzano il singolo oggetto:
      stringa = stringaInput;
      numero = numeroInput;
      
      //Questa è Static ed è una variabile 
      //contatore di oggetti istanziati:
      oggettiCreati++;
   
   }
   
   //Il metodo passaVariabile riceve in input delle varibili x VALORE
   //Il metodo modifica i valori al suo interno 
   //ma, siccome si tratta di "copie", le modifiche 
   //non hanno effetto sulle varibili "originali".
   public int passaVariabile(int i, int j, int k){
      
      //Dichiaro quello che ho ricevuto:
      System.out.println("valori passati (i, j, k): " + i+", "+j+", "+k);
      
      //Eseguo delle elaborazioni usando le varibili in ingresso:
      i = i + (j*7) - 1;
      j = i+5;
      k = i+j;
      
      //Riepilogo a monitor quanto fatto:
      System.out.println("ho modificato il valore delle varibili passate:");
      System.out.println("i: "+ i +", j: "+ j + ", k: " + k);
      System.out.println("restituisco la loro somma, che è: " + (i+j+k));
      
      //Valore restiutito:
      return (i+j+k);
   }
   
   
   //Il metodo passaOggetto riceve in input il RIFERIMENTO ad un oggetto
   //e ne modifica le proprietà.
   //In questo caso le modifiche alle proprietà dell'oggetto sono definitive
   public void passaOggetto(passaparametri p, int nuovoNumero, String nuovaStringa){
   
      //Dichiaro quello che ho ricevuto:
      System.out.println("I valori correnti sono: \"" + stringa + "\" e " + numero);
      
      //Eseguo le modifiche
      p.stringa = nuovaStringa;
      p.numero = nuovoNumero;

      //Riepilogo a monitor quanto fatto:
      System.out.println("Ho assegnato i seguenti valori: ");
      System.out.println("->" + nuovaStringa);
      System.out.println("->" + nuovoNumero);
      
   }
   
   //Questo metodo crea una copia del riferimento all'oggetto passato
   //E' una utilità, la definiamo static così è accessibile a tutti
   //senza dover istanziare alcun oggetto.
   public static passaparametri copiaOggetto(passaparametri pOriginale)
   {
      //crea una copia del RIFERIMENTO all'oggetto
      //e la restiutisce:
      passaparametri pCopia = pOriginale;
      return pCopia;
   }

   //Questo metodo crea un nuovo oggetto con le stesse proprietà di 
   //quello passato.
   //Anche questa è una utilità, la definiamo static così è accessibile a tutti
   //senza dover istanziare alcun oggetto.
   public static passaparametri replicaOggetto(passaparametri pOriginale){
      passaparametri pClone = new passaparametri(pOriginale.numero, pOriginale.stringa);
      return pClone;
   }
   
   
   //Visualizza il numero di oggetti realmente creati con una new.
   public static void printOggettiCreati(){
      System.out.println("Oggetti passaparametri finora creati:" + oggettiCreati);
   }
   
}
