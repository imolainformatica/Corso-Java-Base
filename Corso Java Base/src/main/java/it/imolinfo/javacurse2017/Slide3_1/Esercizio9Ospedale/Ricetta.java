package it.imolinfo.javacurse2017.Slide3_1.Esercizio9Ospedale;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Random;

public class Ricetta {
	public int Codice;;
	public double prezzo;
	public Date data = new Date();
	private static final SimpleDateFormat SDF = new SimpleDateFormat("dd-MM-YYYY");


	public Ricetta(double prezzo,int x) {
		Random r1 = new Random();
		this.Codice = r1.nextInt(x);
		this.prezzo = prezzo;
	}
	
	public void Stampa () {
		System.out.println("Ricetta nr." + Codice + " emessa il " + SDF.format(data) + ".Prezzo: € " + prezzo);
	}
	
	
}
