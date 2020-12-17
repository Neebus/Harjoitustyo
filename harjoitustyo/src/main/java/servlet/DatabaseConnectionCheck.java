package servlet;

import database.Database;
import java.sql.*;

public class DatabaseConnectionCheck {
	public static void main(String[] args) {
		// LUODAAN DATABASE OLIO
		Database database = new Database();
		// KUTSUTAAN DATABASE OLION CONNECT-METODIA/FUNKTIO
		Connection connection = database.connect();
		// YMPÄRÖIDÄÄN TIETOKANTAKYSELYN TEKO 
		try {
			// LUODAAN SQL KYSELY, JOKA HAKEE TIETOKANNASTA TIETOA
			PreparedStatement statement = connection.prepareStatement("SELECT * FROM Album");
			// SUORITETAAN ÄSKEN MÄÄRITETTY SQL KYSELY JA OTETAAN TALTEEN TULOKSET
			ResultSet results = statement.executeQuery();
			// LOOPATAAN KYSELYN TULOKSET LÄPI RIVI RIVILTÄ
			while(results.next()) {
				System.out.println(results.getString("Title"));
			}
			// LOPUKSI SULJETAAN TIETOKANTARESURSSI
			results.close();
			statement.close();
			connection.close();
			
		} catch(Exception ex) {
			System.out.println("Tietokantakyselyn teko epäonnistui.");
		} 
		
	}
}
