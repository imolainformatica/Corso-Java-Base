//il nome del contenitore di classi in cui si trova �:
package it.imolinfo.javacurse2017.Slide1_2.Esercizio1VicinoDiCasa;
/*che � lo stesso della classe VicinoDiCasa e quindi si "vedono" tra loro
 (fermo restando le regole del public/private/protected)*/

/** Progetto "Vicino di Casa"
 *  Il primo esempio del corso.
 *  Corso Java Base giorno 1
 */


//Questa classe serve "SOLO" a contenere il metodo Main
//in quanto nessun metodo pu� "vivere" al di fuori di una classe.
public class StartVicinoDiCasa{
   
   //il metodo Main � punto di ingresso dell'applicazione:
   public static void main(String[] args){
      
      //Questo � il codice che avvia veramente l'applicazione
      //Facciamo l'istanza di tre nostri vicini di casa:
      //Mario (c'� sempre un Mario)
      VicinoDiCasa mario = new VicinoDiCasa("Mario");
      mario.saluta();
      //POi c'� Pietro
      VicinoDiCasa pietro = new VicinoDiCasa("Pietro");
      pietro.saluta();
      //Poi ce ne uno senza nome esplicito che quindi
      //sar�? V...
      VicinoDiCasa vuoto = new VicinoDiCasa();
      vuoto.saluta();
      //fine del Main, fine dell'applicazione ...
   }
}