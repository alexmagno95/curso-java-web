package br.triadworks.javaweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/contador")
public class ServletContador extends HttpServlet{
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	private int contador = 0;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
			
		contador++;
		
		PrintWriter sysout = res.getWriter();
		
		sysout.println("<html>");
		sysout.println("<body>");
		sysout.println("Servlet de número " + contador);
		sysout.println("</body>");
		sysout.println("</html>");
		
	}
	

}
