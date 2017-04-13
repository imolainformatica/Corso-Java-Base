package it.imolinfo.javacurse2017.Slide3_1.IntervalloData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class IntervalloDate {
	
	/**
	* metodo che calcola e stampa le differenze tra due date
	*/
	public static void calcolaIntervalli(String data1, String data2, String formato){
		
		//imposto il formato della data
		SimpleDateFormat df = new SimpleDateFormat(formato);
		
		Date date1  = null;
		Date date2  = null;
		
		//converto le stringhe ricevute in oggetti Date
		try {
			date1 = df.parse(data1); 
			date2 = df.parse(data2); 
		}catch (ParseException pe){
			pe.printStackTrace();
		}
		
		//creo due istanze Calendar(hanno il tempo e l'ora corrente)
		Calendar cal1 = Calendar.getInstance();  
		Calendar cal2 = Calendar.getInstance(); 
		

		//setto le date ricevute come argomenti negli oggetti Calendar
		cal1.setTime(date1);          
		long ldate1 = date1.getTime();
		cal2.setTime(date2);
		long ldate2 = date2.getTime();
		
		//Calcolo il tempo in ore
		int hr1   = (int)(ldate1/3600000); //60*60*1000
		int hr2   = (int)(ldate2/3600000);
		
		//Calcolo il tempo in giorni
		int days1 = (int)hr1/24;
		int days2 = (int)hr2/24;
		
		//Calcolo la differenza di giorni
		int dateDiff  = days2 - days1;
		
		//Calcolo la differenza di settimane
		int weekOffset = (cal2.get(Calendar.DAY_OF_WEEK) - cal1.get(Calendar.DAY_OF_WEEK))<0 ? 1 : 0;
		int weekDiff  = dateDiff/7 + weekOffset; 
		
		//Calcolo la differenza di anni
		int yearDiff  = cal2.get(Calendar.YEAR) - cal1.get(Calendar.YEAR); 
		
		//Calcolo la differenza di mesi
		int monthDiff = yearDiff * 12 + cal2.get(Calendar.MONTH) - cal1.get(Calendar.MONTH);
		
		System.out.println("Giorni di differenza: "+dateDiff);
		System.out.println("Settimane di differenza: "+weekDiff);
		System.out.println("Mesi di differenza: "+monthDiff);
		System.out.println("Anni di differenza: "+yearDiff);
		
	}

	
	//semplice main di prova.
	public static void main(String[] args){
		
		System.out.println("Differenza tra 14 Aprile 1981 e 29 Novembre 1982:");
		calcolaIntervalli("14 Aprile 1981", "29 Novembre 1982", "dd MMMM yyyy");
	
	}
}
