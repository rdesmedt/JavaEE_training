package wc01.oef3;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Authentication
 */
@WebServlet("/Authentication")
public class Authentication extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Persoon p = new Persoon();
		session.setAttribute("user", p);
		
		if(request.getParameter("login").equals(p.getLogin())
				&& request.getParameter("pass").equals(p.getPassw())){
			response.sendRedirect("success.jsp");
		}else{
			response.sendRedirect("failure.jsp");
		}
	}

}
