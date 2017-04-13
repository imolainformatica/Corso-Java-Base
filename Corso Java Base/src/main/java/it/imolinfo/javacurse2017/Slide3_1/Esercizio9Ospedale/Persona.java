package it.imolinfo.javacurse2017.Slide3_1.Esercizio9Ospedale;

public class Persona {
	public int età;
	public String Nome;
	public String Cognome;
	public String codiceFiscale;
		
	
	@Override
	public String toString() {
		return "Persona [età=" + età + ", Nome=" + Nome + ", Cognome=" + Cognome + ", codiceFiscale=" + codiceFiscale
				+ "]";
	}

	public Persona(int età, String nome, String cognome) {
		super();
		this.età = età;
		Nome = nome;
		Cognome = cognome;
		codiceFiscale = Nome.substring(0, 4) + Cognome.substring(0, 3) + età + cognome.substring(4);
	}
	
	public void Stampa() {
		
		System.out.println("Paziente:" + Nome + " " + Cognome  + " di " + età + "anni - CF:" + codiceFiscale);
	}
	
}
