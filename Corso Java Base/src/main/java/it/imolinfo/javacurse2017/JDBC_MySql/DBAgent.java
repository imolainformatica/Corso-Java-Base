package it.imolinfo.javacurse2017.JDBC_MySql;

import java.sql.*;


public class DBAgent{

	private void queryCommand() throws SQLException{

		int    nr; // Numero Righe
		String q;  // query

		//impostazioni per la connessione al DB
		final String DB_DRIVER = "com.mysql.jdbc.Driver";
		final String DB_URL    = "jdbc:mysql://localhost/test";

		/* ---- */

		DBEntry db = new DBEntry();

		//apro la connessione al DB
		db.open( DB_DRIVER, DB_URL );

		//imposto un query
		q = "CREATE TABLE IF NOT EXISTS voli ( "   +
        " idVolo VARCHAR(5) NOT NULL PRIMARY KEY, "  +
        " partenza VARCHAR(25), " + " orarioPartenza VARCHAR(6)," +
        		"arrivo VARCHAR(25), " + "orarioArrivo VARCHAR(6) )";
		//eseguo la query
		db.command( q );

		//creo una nuova query
		q = "INSERT INTO voli VALUES ( "  +
        " 'BMM01', "          +
        " 'Bologna', " + "'07:15', " + "'MilanoMalpensa', " + "'07:55' )"      ;
		//eseguo la query
		db.command( q );

		//imposto un query		
		q = "INSERT INTO voli VALUES ( "  +
        " 'MMB01', "          +
        " 'Milano Malpensa', " + "'09:55', " + "'Bologna', " + "'10:35' )"      ;
		//eseguo la query
		db.command( q );

		//imposto un query		
		q = "INSERT INTO voli VALUES ( "  +
        " 'VMM01', "          +
        " 'Venezia', " + "'06:55', " + "'Milano Malpensa', " + "'07:40' )"      ;
		//eseguo la query
		db.command( q );

		//chiudo la connessione al Db
		db.close();
	}



	private void querySelect() throws SQLException{

		String     q; // query
		ResultSet  rs     = null;

		final String DB_DRIVER = "com.mysql.jdbc.Driver";
		final String DB_URL    = "jdbc:mysql://localhost:3306/test";

		/* ---- */

		//imposto una query
		q = "SELECT * FROM voli WHERE partenza='Venezia'";

		DBEntry db = new DBEntry();
		
		//creo una connessione al DB
		db.open( DB_DRIVER, DB_URL );

		//eseguo la query
		rs = db.query( q );

		//Stampo i risultati
		rs.beforeFirst();

		System.out.println("Table: ");
		while( rs.next() ){
			System.out.println("---> Partenza da: " + rs.getString(2) );
			System.out.println("---> Orario Partenza: " + rs.getString(3) );
			System.out.println("---> Arrivo a:    " + rs.getString(4) );
			System.out.println("---> Orario Arrivo: " + rs.getString(5) );
			System.out.println("****");
		}

		//chiudo la connessione
		db.close();
	}



	public static void main(String args[]){

		DBAgent app = new DBAgent();

		try{
			//query di inserimento dati
			app.queryCommand();

			//query di selezione
			app.querySelect();

		}catch(SQLException sqle){
			System.err.println("Error ---> " + sqle.getMessage() );
			sqle.printStackTrace();
		}

	}// end main
}// end class
