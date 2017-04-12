/*
 * Created on 3-mag-2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package it.imolinfo.javacurse2017.Slide3_2.Esercizio6Eccezioni;

/**
 * @author Lorenzo
 *
 * Semplice applicazione che stampa ciclicamente le strighe contenute in un array 
 * e genera un ArrayIndexOutOfBoundsException. Tale accezzione � gestita stampando un 
 * messaggio e resettando il contatore.
 */
public class HelloWorldException {
	public static void main(String[] args) {
		int i = 0;
		String[] greetings =
			{ "Hello world!", "No, I mean it!", "HELLO WORLD!!" };
		while (i < 4) {
			try {
				System.out.println(greetings[i]);
				i++;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Re-setting Index Value");
				i = 0;
			} finally {
				System.out.println("This is always printed");
			}
		}
	}
}
