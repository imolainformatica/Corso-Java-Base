/* Progetto Controllo, Cicli e Array.
 * Esempio di uso di Cicli For, Loop While 
 * e di utilizzo di array.
 * Corso Java Base giorno 2
 */

//Package che contiene la oggettoEsempio:
package it.imolinfo.javacurse2017.Slide2_1.ControlloCicliArray;

//NOTA.
//In questo caso la oggettoEsempio che contiene il Main si chiama Main
//anch'essa e di conseguenza il file MA non è obbligatorio.
//Poteva chiamarsi ad esempio StartCCA ...
public class Main {

    public static void main(String[] args) {
       
      //Istanza di un oggetto della classe CCA  
      CCA oggettoEsempio = new CCA();
      //dichiara un array di interi (di lunghezza non definita!)
      //che è riempito dal metodo manipolaArray di CCA:
      int[] arrayCopia = oggettoEsempio.manipolaArray();
      
      System.out.println("la copia è lunga: " + arrayCopia.length);
      
      //Definisce un array di interi (anche qui non definisce la lunghezza):
      int[] elencoNumeri = {1,3,4,5,6,7,9,12,34,55,32,190,3,67,88,97,56,36,2,18,72};
      
      //Lo usa come parametro in input per il metodo stampaSeMultiplo
      //che stampa a video gli interi di elencoNumeri 
      //multipli di 3 (altro parametro del metodo)
      oggettoEsempio.stampaSeMultiplo(elencoNumeri, 3);
        
    }

}
