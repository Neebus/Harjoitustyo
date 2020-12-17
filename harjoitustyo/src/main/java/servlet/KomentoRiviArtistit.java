package servlet;

import model.Artist;
import database.*;
import java.util.*;

public class KomentoRiviArtistit {
	
	public static void main(String[] args) {
		
		List<Artist> artistit = new ArrayList<Artist>();
		
		ArtistDao artistDao = new ArtistDao();
		
		artistit = artistDao.getAllArtists();
		
		System.out.println(artistit);
		
	}
}
