package wc01.oef01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Spel
 */
@WebServlet("/Spel")
public class Spel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	int random;
	
    public Spel() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		BusinessLogic bl;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		if(session.getAttribute("user") == null){
			bl = new BusinessLogic();
			bl.setNaam(request.getParameter("naam"));
			session.setAttribute("user", bl);
		}else{
			bl = (BusinessLogic) session.getAttribute("user");
			bl.setNextNumber();
			bl.setCount();
		}
		
		out.println("<html><head><title>Welkom!</title></head>"
				+ "<body>"
				+ "<h1>Welkom, " + bl.getNaam() + "!</h1><br><br>"
						+ "<h2>Laat ons hoger lager spelen...</h2><br><br>");
		
		if(bl.getCurrentNumber() != -1){
			if((bl.checkHogerLager() && (request.getParameter("hoger") != null)) || 
					(!bl.checkHogerLager() && (request.getParameter("lager") != null))){
				out.println("<h3>JUIST!</h3>");
			}else{
				out.println("<h3>FOUT!</h3>");
			}
			
		}
		
			
		
		out.println("<h1>" + bl.getNextNumber() + "</h1><br><br>"
								+ "<form action='Spel' method='post'>"
								+ "<input name='hoger' type='submit' value='HOGER'>      <input name='lager' type='submit' value='LAGER'>"
								+ "</form><br>"
								+ "<h4>Beurt: " + bl.getCount() + "</h4>"
				+ "</body>"
				+ "</html>");
	}
	
	

}
