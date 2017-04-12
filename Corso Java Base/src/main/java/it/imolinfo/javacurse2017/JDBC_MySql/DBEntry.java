package it.imolinfo.javacurse2017.JDBC_MySql;

import java.sql.*;

public class DBEntry{

	
	Connection dbConn = null;
	Statement  dbStat = null;
	ResultSet  rs     = null;

	/**
	 * open(String driver, String url) </br>
	 * Crea una connessione ad un DB MySQL </br>
	 * @param String driver = driver specifico per il database da caricare
	 * @param String url = url specifico del database
	 */
	public void open( String driver, String url){
		try{

			// ---- carico il driver
			Class.forName( driver );

			// ---- creo la connessione
			dbConn = DriverManager.getConnection( url, "root", "rootroot" );

			// ---- creo lo Statement
			dbStat = dbConn.createStatement();

		}catch(ClassNotFoundException cnfe){
			System.err.println( "ERROR ---> " + cnfe.getMessage() );
			cnfe.printStackTrace();
			System.exit(-1);
		}catch(SQLException sqle){
			System.err.println( "ERROR ---> " + sqle.getMessage() );
			System.exit(-2);
		}
	}// end method: open

	/**
	 * close() </br>
	 * Chiude la connessione con il DB </br>
	 * 
	 */
	public void close(){

		try{
			// ---- chiudi lo Statement
			dbStat.close();

			// ---- chiudi la connessione
			dbConn.close();

		}catch(SQLException sqle){
			System.err.println( "ERROR ---> " + sqle.getMessage() );
			System.exit(-1);
		}

	}// end method: close


	/**
	 * ResulSet query(String query) </br>
	 * Esegue una SELECT su un DB </br>
	 * @param String query = query da eseguire sul database
	 * @return un oggetto RS contenente il risultato
	 * della query eseguita
	 */
	public ResultSet query( String query ){

		ResultSet rs = null;

		try{

			// esegui la query
			rs = dbStat.executeQuery( query );

		}catch(SQLException sqle){
			System.err.println( "ERROR ---> " + sqle.getMessage() );
			System.exit(-1);
		}

		return( rs );

	}// end method: transazione


	/**
	 * int command(String query) </br>
	 * Esegue una query di comando su un DB </br>
	 * @param query = query di comando da eseguire sul DB
	 * @return numero righe modificate
	 */
	public int command( String query ){

		int numeroRighe = 0;

		try{

			// esegui la query
			numeroRighe = dbStat.executeUpdate( query );

		}catch(SQLException sqle){
			System.err.println( "ERROR ---> " + sqle.getMessage() );
			System.exit(-1);
		}

		return( numeroRighe );

	}// end method: command


}// end class
