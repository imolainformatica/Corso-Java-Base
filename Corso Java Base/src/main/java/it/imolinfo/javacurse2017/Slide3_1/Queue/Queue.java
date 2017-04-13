/*
 * Created on 3-mag-2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package it.imolinfo.javacurse2017.Slide3_1.Queue;

import java.util.*;
/**
 * @author Lorenzo
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */


	public class Queue {
		
		private LinkedList<Object> list = new LinkedList<Object>();
		
		//metodo pe aggiungere un elemento alla lista
		public void put(Object v) {
			try{
				list.addFirst(v);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		//metodo per prelevare il primo elemento dalla lista
		public Object get() {
			if ( !list.isEmpty() )
				return list.removeLast();
			else return null;
		}
		
		//metodo che retituisce true se la lista � vuota
		public boolean isEmpty() {
			return list.isEmpty();
		}
		
		
		//stampa il contenuto della lista
		public String toString() {
			ListIterator i = list.listIterator();
			StringBuffer sb = new StringBuffer();
			while (i.hasNext()) {
				Object ob = i.next();
				sb = sb.append(ob);
				sb = sb.append(",");
			}
			return sb.toString();
		}

		//semplice main di prova
		public static void main(String[] args) {
			System.out.println("\nQueue Example: \n");
			//inizializzo la lista con due elementi
			Queue q = new Queue();
			q.put(new Integer(1));
			q.put(new Integer(12));
			//stampo il contenuto della lista
			System.out.println("Elementi in coda: " + q);
			
			//prelevo elelmtnti dalla lista
			System.out.println("Eseguo Get!" );
			q.get();
			
			//stampo il contenuto della lista
			System.out.println("Elementi in coda: " + q);
		}

	}
