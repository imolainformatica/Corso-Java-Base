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
public class MioPunto {
	
	private int x;
	private int y;

    MioPunto (int x, int y){
    	this.x = x;
    	this.y = y;
    }
    
	public String toString() {
		return ("[" + x + "," + y + "]");
	  }

	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int i) {
		x = i;
	}
	public void setY(int i) {
		y = i;
	}

}
