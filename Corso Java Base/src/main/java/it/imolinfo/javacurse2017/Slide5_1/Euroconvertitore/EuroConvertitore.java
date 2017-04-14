/*
 * Created on 9-mag-2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package it.imolinfo.javacurse2017.Slide5_1.Euroconvertitore;

/**
 * @author Lorenzo
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
import java.awt.*;
import java.util.*;
import java.text.*;
import java.awt.event.*;


public class EuroConvertitore extends WindowAdapter implements ActionListener{
	Frame f;
	Button ltoe;
	Button etol;
	TextField lire;
	TextField euro;

	public EuroConvertitore() {
		f=new Frame();
		ltoe=new Button("Da lire ad euro");
		etol=new Button("Da euro a  lire");
		lire=new TextField();
		euro=new TextField();

		LireListener ll = new LireListener(lire,euro);
		EuroListener el = new EuroListener(lire,euro);

		f.addWindowListener(this);
		euro.addActionListener(el);
		lire.addActionListener(ll);
		ltoe.addActionListener(ll);
		etol.addActionListener(el);
		f.setLayout(new GridLayout(2,2));
		f.add(lire);
		f.add(euro);
		f.add(ltoe);
		f.add(etol);
		f.pack();
		f.setVisible(true);


	}

	public static void main(String[] args) {

		EuroConvertitore p=new EuroConvertitore();

	}


	public void actionPerformed(ActionEvent e) {
		System.out.println("action performed by Euroconvertitore");

		Object o=e.getSource();
		NumberFormat ne= NumberFormat.getCurrencyInstance();
		NumberFormat nl= NumberFormat.getCurrencyInstance();

		ne.setCurrency(Currency.getInstance("EUR"));
		nl.setCurrency(Currency.getInstance("ITL"));
		if (o==lire || o==ltoe) {
			try{
				//euro.setText(new Double((Double.parseDouble(lire.getText())/1936.27)).toString());
				euro.setText(ne.format(Double.parseDouble(lire.getText())/1936.27));
			}catch(Exception ex){
				System.out.println("String mal formata: richiesto un numero");
			}
		}
		if (o==euro || o==etol) {
			try{
				//lire.setText(new Double((Double.parseDouble(euro.getText())*1936.27)).toString());
				lire.setText(nl.format(Double.parseDouble(euro.getText())*1936.27));
			}catch(Exception ex){
				System.out.println("String mal formata: richiesto un numero");
			}

		}
	}


	/* (non-Javadoc)
	 * @see java.awt.event.WindowListener#windowClosing(java.awt.event.WindowEvent)
	 */
	public void windowClosing(WindowEvent arg0) {

		System.exit(0);
	}

}
