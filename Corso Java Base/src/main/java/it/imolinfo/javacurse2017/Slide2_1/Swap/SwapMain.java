/*
 * Created on 22-apr-2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package it.imolinfo.javacurse2017.Slide2_1.Swap;

import com.sun.org.apache.bcel.internal.generic.SWAP;

/**
 * @author LORENZO
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class SwapMain {
	/*
	static void eseguiSwap(Integer c, Integer d){
		int i_a=c.intValue();
		int i_b=d.intValue();
		int temp;
		
		temp = i_a;
		i_a=i_b;
		i_b = temp;
		
	    c = new Integer(i_a);
	    d = new Integer(i_b);
	    return;
		
	}
*/
static void eseguiSwap(Counter c, Counter d){
	int temp;
		
	temp = c.getValue();
	c.setValue(d.getValue());
	d.setValue( temp );
		
	return;
		
}


	public static void main(String[] args) {
		/*Integer a = new Integer(2);
		Integer b = new Integer(3);*/
		Counter a = new Counter(2);
		Counter b = new Counter(3);

		SwapMain Swap1 = new SwapMain();
		Swap1.eseguiSwap(a,b);
		System.out.println(a.getValue() + " " + b.getValue());
		
	}
	

}
