//il nome del package entro cui "risiede" la ns. classe:
package it.imolinfo.javacurse2017.Slide1_2.Esercizio1VicinoDiCasa;

/** Progetto "Vicino di Casa".
 *  Questo � il primo esempio del corso.
 *  Qui definiamo una classe VicinoDiCasa che:
 *    - ha due costruttori uno con e uno senza parametri
 *    - "fa" una sola cosa (un unico metodo): saluta
 *    - "ha" una sola caratteristica (propriet�): il suo nome.
 *
*/


//qui comincia veramente il codice.

//La ns. classe deve avere lo STESSO NOME DEL FILE .JAVA
public class VicinoDiCasa {
  
   //il nome del vicino � una propriet� / attributo della classe
   //e la caratterizza:
   private String nome;
   
   //2 costruttori, uno con parametri, uno senza parametri.
   //(overload di un metodo)
   //Costruttore (1)
   //Il costruttore si attende un nome per l'oggetto vicino
   public VicinoDiCasa(String nomeDelVicino){
      nome = nomeDelVicino;
   }
   //Costruttore (2)
   //Costruttore "vuoto"; usa un nome di default: Vercingetorige
   public VicinoDiCasa(){
      this.nome = "Vercingetorige";
   }
   
   //I metodi definiscono il comportamento dell'oggetto creato
   //(istanziato) a partire dalla classe VicinoDiCasa.
   //In particolare, i ns. oggetti vicini di casa 
   //fanno solo una cosa: salutano ...
   public void saluta(){
      System.out.println("Ciao Vicino, io sono " + nome + "!");
   }
}
