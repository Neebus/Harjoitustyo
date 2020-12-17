package servlet;

import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.ArtistDao;
import model.Artist;

@WebServlet("")
public class IndexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
		List<Artist> artistit = new ArrayList<Artist>();
		
		ArtistDao artistDao = new ArtistDao();
		
		artistit = artistDao.getAllArtists();
		
		System.out.println(artistit);
		
		

        // pass the time string to the JSP page as an attribute
        req.setAttribute("artistit", artistit);

        // forward the request to the index.jsp page
        req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp);
    }
}
