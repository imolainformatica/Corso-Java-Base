package it.imolinfo.javacurse2017.Slide3_1.Esercizio9Ospedale;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Random;

public class Ricetta {
	public int Codice;;
	public double prezzo;
	public Date data = new Date();
	
	public Ricetta(double prezzo,int x) {
		super();
		this.data = data;
		//Calendar c = new GregorianCalendar();
		//this.data = (Date)c.getInstance();
		
		Random r1 = new Random();
			
		this.Codice = r1.nextInt(x);
		this.prezzo = prezzo;
	}
	
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");

	public void Stampa () {
		System.out.println("Ricetta nr." + Codice + " emessa il " + sdf.format(data) + ".Prezzo: € " + prezzo);
	}
	
	
}
