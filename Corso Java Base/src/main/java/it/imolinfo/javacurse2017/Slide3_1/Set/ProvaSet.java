/*
 * Created on 3-mag-2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package it.imolinfo.javacurse2017.Slide3_1.Set;

import java.util.*;
/**
 * @author Lorenzo
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class ProvaSet {

	public static void main(String args[]) {
		Set set = new HashSet();
		set.add("Claudia");
		set.add("Samantha");
		set.add("Luisa");
		set.add("Luisa");
		System.out.println(set); // chiama il toString()
		Set sortedSet = new TreeSet(set);
		System.out.println(sortedSet);
	}
}
