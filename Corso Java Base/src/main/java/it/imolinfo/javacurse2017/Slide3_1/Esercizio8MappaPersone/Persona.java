package it.imolinfo.javacurse2017.Slide3_1.Esercizio8MappaPersone;

public class Persona {
	public int età;
	public String Nome;
	public String Cognome;
	public String Sesso;
	public String codiceFiscale;
	
	
	public Persona(int età, String nome, String cognome, String sesso) {
		super();
		this.età = età;
		Nome = nome;
		Cognome = cognome;
		Sesso = sesso;
		codiceFiscale = Nome.substring(0, 4) + Cognome.substring(0, 3)+ Sesso.charAt(0)+ età + cognome.substring(4);
	}
	
	@Override
	public String toString() {
		System.out.println("Valore:" + Nome + " " + Cognome + " è un/una " + Sesso + " di " + età + "anni");
		return "Chiave:" + codiceFiscale;
	}
		
		
	
}
