/*
 * Created on 27-apr-2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package it.imolinfo.javacurse2017.Slide2_1.Esercizio3Fibonacci;

/**
 * @author LORENZO
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class Fibonacci {

	public int fib(int n){
		 		
		switch (n) {
			case 0: return 1;
			case 1: return 1;
			default : return (fib(n-1) + fib (n-2));
		}
	}

	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		
		for(int k = 0; k<10;  k++){
		
		  System.out.println(f.fib(k));
		
		}
	}
}
