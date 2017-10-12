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
public class Stack {
	private Object data[];
	private int size;
	private int first;


	public Stack (int num){
		if (num >0) {
		   	 data = new Object[num];
		   	 size = num; // size = data.length();
		  }
		  else {
		     data = new Object[10];
		     size = 10;
		  }
	}


	public void push(Object i){ 
	     if(first < size){ 
			  data[first] = i; 
			  first ++;
		  }
	}
	



	
}
