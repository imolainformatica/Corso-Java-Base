/*
 * Created on 3-mag-2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package it.imolinfo.javacurse2017.Slide3_1.Esercizio7List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Lorenzo
 *
 * 
 * 
 */
public class ProvaList {
	public static void main(String args[]) {

		List list = new ArrayList();
		list.add("Donatella");
		list.add("Carla");
		list.add("Donatella");
		list.add("Luisa");
		list.add("Antonella");

		//stampo la lista
		System.out.println(list);
		
		//stampo l'elemento della lista in posizione due
		System.out.println("2: " + list.get(2));
		
		//stampo l'elemento della lista in posizione zero
		System.out.println("0: " + list.get(0));

		//Costruisco una LinkedList
		//NOTA: Linked list implementation of the List interface. 
		//      Implements all optional list operations, and permits all elements (including null). 
		//      In addition to implementing the List interface, the LinkedList class provides uniformly named 
		//      methods to get, remove and insert an element at the beginning and end of the list. 
		//      These operations allow linked lists to be used as a stack, queue, or double-ended queue (deque).
		LinkedList queue = new LinkedList();
		queue.addFirst("Clara");
		queue.addFirst("Luisa");
		queue.addFirst("Donatella");
		queue.addFirst("Antonella");
		queue.addFirst("Grazia");
		queue.addFirst("Clara");
		

		System.out.println(queue);

		//rimuovo gli ultimi due elementi dalla lista
		queue.removeLast();
		queue.removeLast();
		System.out.println(queue);
	}

}
