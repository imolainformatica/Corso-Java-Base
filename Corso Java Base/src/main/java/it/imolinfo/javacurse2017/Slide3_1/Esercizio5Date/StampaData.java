package it.imolinfo.javacurse2017.Slide3_1.Esercizio5Date;

import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class StampaData {
	public static void main(String[] args) {
		
		Calendar c= new GregorianCalendar();
		c.set(c.YEAR, 1972);
		c.set(c.MONTH, 10);
		c.set(c.DAY_OF_WEEK, 2);
		c.set(c.DAY_OF_MONTH, 02);
		
		/*Calendar c= Calendar.getInstance();
		Calendar c1= Calendar.getInstance();
		c.add(c.YEAR, 1);
		c1.add(c1.YEAR, -1);*/
		
		
		Date d1 = new Date();
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-YYYY");
		System.out.println("Current:" + sdf.format(d1));
		System.out.println(sdf.format(c.getTime()));
		//System.out.println(sdf.format(c1.getTime()));
	}
}
