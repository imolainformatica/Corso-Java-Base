package it.imolinfo.javacurse2017.Slide3_1.Esercizio9Ospedale;

public class Medico {
	public String codiceFiscale;
	public String nome;
	public String cognome;
	public int età;
	public Ruolo ruolo;


	public Medico(String nome, String cognome, int età) {
		this.nome = nome;
		this.cognome = cognome;
		this.età = età;
		this.codiceFiscale = nome.substring(0, 4) + cognome.substring(0, 3)+ età + cognome.substring(4);
	}

	public void Stampa() {
		System.out.println(nome + " " + cognome + " è un " + ruolo + " di " + età + "anni - CF:" + codiceFiscale);
	}

}
