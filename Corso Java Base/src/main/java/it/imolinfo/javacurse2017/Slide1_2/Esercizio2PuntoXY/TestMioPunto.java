/*
 * Created on 21-apr-2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package it.imolinfo.javacurse2017.Slide1_2.Esercizio2PuntoXY;

/**
 * @author LORENZO
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class TestMioPunto {

	public static void main(String[] args) {
		// Step 1: dichiarazione delle variabili
		MioPunto inizio = new MioPunto(10,10);
		MioPunto fine = new MioPunto(20,30);
	
		// Step 2: inizializzare inizio e fine 
		/*inizio.setX(10);
		inizio.setY(10);
		fine.setX(20);
		fine.setY(30);
*/
		// Step 3: stampa di inizio e fine
		System.out.println("Punto Inizio  " + inizio);
		System.out.println("Punto Fine " + fine);
		System.out.println("Questo è il mio Punto. Si posiziona sulla coordinata X =" + inizio.getX() + " e sulla coordinata Y=" + inizio.getY() +" del piano cartesiano");


	
	}
}
