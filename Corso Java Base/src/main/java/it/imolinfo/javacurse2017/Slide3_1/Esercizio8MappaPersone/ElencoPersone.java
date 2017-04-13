package it.imolinfo.javacurse2017.Slide3_1.Esercizio8MappaPersone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ElencoPersone {
	
	
	
	public static void main(String[] args) {
		Persona p1 = new Persona(24, "Francesca", "Bersanetti",  "Femmina");
		Persona p2 = new Persona(31, "Elisabetta", "Bersanetti", "Femmina");
		Persona p3 = new Persona(67, "Dani", "Bersanetti", "Maschio");
				
		
		ArrayList<Persona> persone = new ArrayList<Persona>();
		persone.add(p1);
		persone.add(p2);
		persone.add(p3);
		
	Map<String, Persona> mappaPersone = new HashMap<>();
		
		for (Persona p: persone) {
			
			mappaPersone.put(p.codiceFiscale, p);
			System.out.println(p);

		}
		
		
	}
	
	
	
	
	
	
	
	
}