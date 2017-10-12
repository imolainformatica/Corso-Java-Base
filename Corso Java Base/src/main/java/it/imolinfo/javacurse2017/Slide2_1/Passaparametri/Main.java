/* Progetto passaparametri.
 * Esempio di passaggio delle variabili per valore, 
 * degli oggetti per riferimento e il comportamento
 * dei "puntatori" agli oggetti.
 * Usa anche dei metodi static per dei metodi di "utilità"
 * Corso Java Base giorno 2 
 */

package it.imolinfo.javacurse2017.Slide2_1.Passaparametri;

/**
 * Questa è la ns. classe main, punto di ingresso dell'applicativo.
 * @author Giuliano
 */
public class Main {
    //Metodo main:
    public static void main(String[] args) {
    
       //Oggetto Passaparametri:
       Passaparametri p = new Passaparametri(100, "parola iniziale");
       //Dichiarazione di un po' di variabili locali:
       int variabile1 = 23;
       int variabile2 = 33;
       int variabile3 = 2008;
       int variabileR = 0;
       //Stampa a terminale:
       System.out.println("variabile1 (prima del metodo passaVariabile) = " + variabile1);
       System.out.println("variabile2 (seconda del metodo passaVariabile) = " + variabile2);
       System.out.println("variabile3 (terza del metodo passaVariabile) = " + variabile3);
       System.out.println("variabileR (rest. dal metodo passaVariabile) = " + variabileR + "\n");
       //metodo al quale si passano delle variabili locali.
       //sono passati come valore, che è usato dal metodo ma il
       //loro valore corrente non è modificato.
       variabileR = p.passaVariabile(variabile1, variabile2, variabile3);
       //Stampa a terminale:
       System.out.println("\nvariabile1 (dopo il metodo passaVariabile)      = " + variabile1);
       System.out.println("variabile2 (dopo il metodo passaVariabile)      = " + variabile2);
       System.out.println("variabile3 (dopo il metodo passaVariabile)      = " + variabile3);
       System.out.println("variabileR (risultato del metodo passaVariabile)= " + variabileR + "\n");
       
       System.out.println("======================================================\n");
       
       System.out.println("p.numero (prima del metodo passaOggetto)          = " + p.numero);
       System.out.println("p.stringa (prima del metodo passaOggetto)         = " + p.stringa + "\n");
       //A questo metodo si passa un oggetto quindi le modifiche
       //alle sue proprietà sono permanenti.
       p.passaOggetto(p, 99, "parola modificata");
       
       System.out.println("\np.numero (dopo il metodo passaOggetto)            = " + p.numero);
       System.out.println("p.stringa (dopo il metodo passaOggetto)           = " + p.stringa);
       
       //Creo una copia DEL RIFERIMENTO all'oggetto
       //Di fatto ho due "puntatori" alla stessa entità
       Passaparametri pCopia = Passaparametri.copiaOggetto(p);
       System.out.println("\nHo copiato l'oggetto, nella copia trovo:");
       System.out.println("pCopia.numero = " + pCopia.numero);
       System.out.println("pCopia.stringa = " + pCopia.stringa);
       //Invece ora creo una copia "autonoma", cioè che non 
       //risente delle modifiche all'originale ma ha vita propria:
       Passaparametri pReplica = Passaparametri.replicaOggetto(p);
       //Se infatti modifico una proprietà dell'originale:
       p.numero = 1234567890;
       //Avrò i seguenti esiti ...
       System.out.println("Ho modificato p.numero              : " + p.numero);
       System.out.println("Trovo che pCopia.numero è           : "+pCopia.numero);
       System.out.println("Mentre per pReplica.numero è ancora   : "+pReplica.numero);    
       
       Passaparametri.printOggettiCreati();
    }

}
