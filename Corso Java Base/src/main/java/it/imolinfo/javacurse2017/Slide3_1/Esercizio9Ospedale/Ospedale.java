package it.imolinfo.javacurse2017.Slide3_1.Esercizio9Ospedale;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

public class Ospedale {
	private ArrayList<Medico> medici = new ArrayList<>();
	private LinkedList<Persona> persone = new LinkedList<>();
	private LinkedList<Ricetta> ricette1 = new LinkedList<>();
	private LinkedList<Ricetta> ricette2 = new LinkedList<>();
	private LinkedList<Ricetta> ricette3 = new LinkedList<>();
	private HashMap<Medico, LinkedList<Persona>> pazienti = new HashMap<>();
	private HashMap<Persona, LinkedList<Ricetta>> prescrizioni = new HashMap<>();

	/**
	 * Costruttore di Ospedale
	 */
	public Ospedale () {
		
		Medico m1 = new Medico("andrea", "Guggi", 47);
		Medico m2 = new Medico("Gianluca", "Feruzzi",58);
		Medico m3 = new Medico("Luca", "Pasetto", 36);
		medici.add(m1);
		medici.add(m2);
		medici.add(m3);

		for(int i=0;i<medici.size();i++) {
			medici.get(i).ruolo = Ruolo.values()[i];
		}

		Persona p1 = new Persona(25, "Francesca", "Bersanetti");
		Persona p2 = new Persona(35, "Mario", "Rossi");
		Persona p3 = new Persona(31, "Elisabetta", "Bersanetti");
		Persona p4 = new Persona(67, "Dani", "Bersanetti");
		Persona p5 = new Persona(78, "Daniele", "Bersanetti");
		persone.add(p1);
		persone.add(p2);
		persone.add(p3);
		persone.add(p4);
		persone.add(p5);

		Ricetta r1 = new Ricetta(25.50,45);
		Ricetta r2 = new Ricetta(20.50,45);
		Ricetta r3 = new Ricetta(10.50,45);
		Ricetta r4 = new Ricetta(12.30,45);	
		Ricetta r5 = new Ricetta(12.30,45);
		Ricetta r6 = new Ricetta(12.30,45);
		Ricetta r7 = new Ricetta(12.30,45);
		ricette1.add(r1);
		ricette1.add(r2);
		ricette1.add(r3);
		ricette1.add(r4);
		ricette1.add(r5);
		ricette1.add(r5);

		ricette2.add(r1);
		ricette2.add(r2);
		ricette2.add(r3);
		ricette2.add(r4);

		ricette3.add(r1);
		ricette3.add(r2);

		for(Medico m: medici) {
			pazienti.put(m, persone);
		}

		for (Persona p: persone) {
			int random = new Random().nextInt(4);
			switch(random) {
				case 0:
					prescrizioni.put(p, ricette1);
					break;

				case 1:
					prescrizioni.put(p, ricette2);
					break;

				default:
					prescrizioni.put(p, ricette2);
					break;

			}
		}
	}

	public ArrayList<Medico> getMedici() {
		return medici;
	}
	public void setMedici(ArrayList<Medico> medici) {
		this.medici = medici;
	}
	public LinkedList<Persona> getPersone() {
		return persone;
	}
	public void setPersone(LinkedList<Persona> persone) {
		this.persone = persone;
	}

	public HashMap<Medico, LinkedList<Persona>> getPazienti() {
		return pazienti;
	}
	public void setPazienti(HashMap<Medico, LinkedList<Persona>> pazienti) {
		this.pazienti = pazienti;
	}
	public HashMap<Persona, LinkedList<Ricetta>> getPrescrizioni() {
		return prescrizioni;
	}
	public void setPrescrizioni(HashMap<Persona, LinkedList<Ricetta>> prescrizioni) {
		this.prescrizioni = prescrizioni;
	}
	
	/**
	 * Restituisce i pazienti con meno di trent'anni e con più di una ricetta per paziente dato un medico di input
	 * @param medico
	 */
	public ArrayList<Persona> pazientiGiovani(Medico medico) {
		ArrayList<Persona> pazientiXmedico = new ArrayList();
		pazientiXmedico.addAll(pazienti.get(medico));
		ArrayList<Persona> pazientixMedicoMaGiovani = new ArrayList();
		ArrayList<Ricetta> ricettexPaziente = new ArrayList();
		medico.Stampa();

		for (Persona p: pazientiXmedico) {
			if (p.età < 50) {
				pazientixMedicoMaGiovani.add(p);
				ricettexPaziente.addAll(prescrizioni.get(p));
				if (ricettexPaziente.size() > 5) {
					p.Stampa();
				}
			}
		}
		return pazientixMedicoMaGiovani;
	}
	
	
}
