/*
 * Created on 27-apr-2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package it.imolinfo.javacurse2017.Slide2_1.Stack;


/**
 * @author LORENZO
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class Main {

	public static void main(String[] args) {
		Stack a = new Stack(20);
		 int i;

		 i=1;
		 while(i<=13)
		 {
			   if(i % 2 !=0)
			   {
						System.out.println(i);
						a.push(new Integer(i));
				}
				i++;

	    }
    }
}