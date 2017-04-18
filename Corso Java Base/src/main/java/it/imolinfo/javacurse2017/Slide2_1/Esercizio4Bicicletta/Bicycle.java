//il nome del package entro cui "risiede" la ns. classe:
package it.imolinfo.javacurse2017.Slide2_1.Esercizio4Bicicletta;

/* Progetto Bicycle.
 * In questo esempio:
 *    Si definisce una classe Bicycle, che
 *    modella una bicicletta generica.
 * 
 *    Si definisce una classe Mountaibike che eredita
 *    i caratteri generali da Bicycle;
 * 
 *    Si usano dei campi static per tenere memoria del
 *    numero di oggetti creati (numberOfBicycles) e per 
 *    definire delle costanti (numero di marce, massima velocità);
 *    
 *    Si fa un esempio di override usando "super".
 * 
 *    Si introducono delle istruzioni di condizione (if ...else)
 *    per verificare la velocità assegnata alla bici. 
 */


public class Bicycle {

   //Proprietà (tutte private!)
   //che caratterizzano gli oggetti della classe. 
   private int cadence;    //ritmo di pedalata
   private int speed;      //velocità
   private int gear;       //marcia
   
   //Ciascuna istanza della classe (= oggetto)
   //avrà un suo identificativo.
   private int id;
   
   /*
   * Proprietà Static, quindi proprietà della CLASSE
   * valide per tutte le istanze che da essa derivano.
   */
   public static int numOfGear = 12; 
   private static int numberOfBicycles = 0;
   private static int maxSpeed = 60;

   //Unico costruttore della classe Bicycle:
   public Bicycle(int startCadence, int startSpeed, int startGear){
      //Inizializza le proprietà dell'oggetto:
      gear = startGear;
      cadence = startCadence;
      speed = startSpeed;
      
      //Aggiorna l'ID usando la proprietà static numberOfBicycles
      id = ++numberOfBicycles;
      
      //Variante: un ID "pseudo" casuale ...
      //numberOfBicycles++;
      //id = numberOfBicycles * startGear * 7;
   }
   /*
   * Metodo getID che permette di accedere in maniera
   * controllata alla proprietà privata ID
   */
   public int getID(){
      return id;
   }
   
   // Metodo Static che restituisce la proprietà Static
   // numberOfBicycle della classe
   public static int getNumberOfBicycles(){
      return numberOfBicycles;
   }
   
   // Metodi che eseguono le attività proprie degli oggetti Bicicletta:
   // cambia cadenza e marcia, incrementa e decrementa velocità:
   public void changeCadence(int newValue){
      cadence = newValue;
   }
   public void changeGear(int newValue){
      gear = newValue;
   }
   
   // La modifica della velocità è subordinata ad un controllo
   // affinché che non superi quella massima fissata (maxSpeed)
   public void speedUp(int increment){
   
      int tempSpeed = speed + increment;
      if(tempSpeed <= maxSpeed)
         speed = speed + increment;
      else{
         speed = maxSpeed;
         System.out.println("Warning: Maximum Speed Reached!");
      }
   }
   
   // Inserito un controllo: non ha senso che la bici 
   // vada in retromarcia! Una volta ridotta la velocità
   // a zero, la bici si ferma
   public void applyBrakes(int decrement){
   
      int tempSpeed = speed - decrement;
      if(tempSpeed >= 0)
         speed = tempSpeed;
      else{
         speed = 0;
         System.out.println("Warning: The Bike is stopped!");
      }
   }
   
   // Stampa a schermo lo stato delle bici
   // si potrebbe inserire anche la nozione (compito a casa?)
   // di "bici ferma" e/o velocità massima raggiunta.
   public void printStates() {
      System.out.println("cadence:"+cadence+" speed:"+speed+" gear:"+gear);
   }
   
   //Mostra l'id (la "targa") della bicicletta.
   // l'id è una proprietà privata
   public void showId(){
      System.out.println(id);
   }
}



