package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import model.Artist;

public class ArtistDao {
	
	private Database database = new Database();

	
	public List<Artist> getAllArtists() {
		List<Artist> artists = new ArrayList<Artist>();
		
		Connection connection = database.connect();
		
		try {
			PreparedStatement statement = connection.prepareStatement("SELECT * FROM Artist");
			ResultSet results = statement.executeQuery();
			while(results.next()) {
				
				Artist artist = new Artist(results.getString("Name"));
				
				artists.add(artist);
			}
			results.close();
			statement.close();
			connection.close();
			
		} catch(Exception ex) {
			System.out.println("Tietokantakyselyn teko epäonnistui.");
		} 
		
		return artists;
	}
	

}
