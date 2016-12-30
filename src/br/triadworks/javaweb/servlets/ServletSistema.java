package br.triadworks.javaweb.servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.triadworks.javaweb.logica.AdicionaCaloteiroLogica;
import br.triadworks.javaweb.logica.DeletaCaloteiroLogica;
import br.triadworks.javaweb.logica.ListaCaloteiroLogica;
import br.triadworks.javaweb.modelo.Logica;

@WebServlet("/sistema")
public class ServletSistema extends HttpServlet{
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws CaloteiroServletException{
		
		String acao = req.getParameter("logica");
		
		String nomeClasse = "br.triadworks.javaweb.logica." + acao + "Logica";
		
		Class classe;
		
		try {
			classe = Class.forName(nomeClasse);
			
			Object obj = classe.newInstance();
			
			Logica logica = (Logica) obj;
			
			logica.executa(req, res);
			
		} catch (ClassNotFoundException e) {
			
			throw new CaloteiroServletException(e.getMessage());

		} catch (InstantiationException | IllegalAccessException e) {
			
			throw new CaloteiroServletException(e.getMessage());
			
		}  catch (Exception e) {
			
			throw new CaloteiroServletException(e.getMessage());
		}
		
//		
////		if(acao.equals("PopulaCaloteiro")){
////			
////			CaloteiroDAO dao = new CaloteiroDAO();
////			
////			String idS = req.getParameter("id");
////			
////			Long id = Long.valueOf(idS);
////			
////			Caloteiro caloteiro = dao.getCaloteiro(id);
////
////			RequestDispatcher rd = req.getRequestDispatcher("/altera-caloteiro.jsp");
////			
////			try {
////				req.setAttribute("caloteiro", caloteiro);
////				rd.forward(req, res);
////			} catch (ServletException e) {
////				// TODO Auto-generated catch block
////				e.printStackTrace();
////			} catch (IOException e) {
////				// TODO Auto-generated catch block
////				e.printStackTrace();
////			}
////			
////		}
////		
////		
////		if(acao.equals("AlteraCaloteiro")){
////			
////			CaloteiroDAO dao = new CaloteiroDAO();
////			
////			String idS = req.getParameter("id");
////			
////			Long id = Long.valueOf(idS);
////			
////			Caloteiro caloteiro = dao.getCaloteiro(id);
////
////			RequestDispatcher rd = req.getRequestDispatcher("/altera-caloteiro.jsp");
////			
////			try {
////				req.setAttribute("caloteiro", caloteiro);
////				rd.forward(req, res);
////			} catch (ServletException e) {
////				// TODO Auto-generated catch block
////				e.printStackTrace();
////			} catch (IOException e) {
////				// TODO Auto-generated catch block
////				e.printStackTrace();
////			}
////			
////		}
		
	}

}
