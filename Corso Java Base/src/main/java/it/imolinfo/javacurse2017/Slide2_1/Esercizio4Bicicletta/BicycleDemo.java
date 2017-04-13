/** Progetto Bicycle.
 *  Esempio di utilizzo di una classe, una sottoclasse derivata
 *  di più costruttori e di override di metodi nella classe derivata
 *  Usa varibili e metodi static;
 *  Introduce istruzioni condizionali if/else
 *  Corso Java Base giorno 2 */

package it.imolinfo.javacurse2017.Slide2_1.Esercizio4Bicicletta;

public class BicycleDemo {
   
/*------------------------------------------------
 Metodo MAIN: punto di accesso dell'applicativo
 ------------------------------------------------*/    
    public static void main(String[] args) {

       // Istanzia 4 oggetti:
       // 2 di tipo bicletta
       Bicycle bike1 = new Bicycle(50, 40, 2);
       Bicycle bike2 = new Bicycle(40, 30, 3);
       
       //-------------------------------------------
       //Visualizza lo stato, cambia cadenza, 
       //velocità e marcia e quindi visualizza quelli nuovi
       
       System.out.println("status bike1 iniziale: ");
       bike1.printStates();
       bike1.changeCadence(30);
       bike1.applyBrakes(20);
       bike1.changeGear(4);
       System.out.println("status bike1 modificato: ");
       bike1.printStates();
           
       System.out.println("status bike2 iniziale: ");
       bike2.printStates();
       bike2.changeCadence(80);
       bike2.speedUp(35);
       bike2.changeGear(1);
       System.out.println("status bike2 modificato: ");
       bike2.printStates();


    
       //-------------------------------------------
       //Se numOfgear è Static modificando il valore
       //dell'oggetto Bike1 si modifica in TUTTE le istanze.
       //Anche quelle che ereditano (Mountainbike per esempio):
       //Il valore iniziale è:
       System.out.println("NumOfGear of ALL bikes:" + Bicycle.numOfGear);
       System.out.println("Change the numOfGear to 16");
       //Modifico il valore globale che appartiene alla classe.
       Bicycle.numOfGear = 16; 
       //Ed è modificato ovunque:
       //Il modo CORRETTO di leggere una proprietà static è
       //attraverso il nome della CLASSE!
       System.out.println("NumOfGear Bicycles:" + Bicycle.numOfGear);    
     
      
          
     }
}
