package br.triadworks.javaweb.logica;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.triadworks.javaweb.dao.CaloteiroDAO;
import br.triadworks.javaweb.modelo.Caloteiro;
import br.triadworks.javaweb.modelo.Logica;

public class DeletaCaloteiroLogica implements Logica{
	
	public void executa(HttpServletRequest req, HttpServletResponse res) throws Exception{
		
		Connection conexao = (Connection) req.getAttribute("conexao");

		CaloteiroDAO dao = new CaloteiroDAO(conexao);
		
		String idS = req.getParameter("id");
		
		Long id = Long.valueOf(idS);
		
		Caloteiro c = dao.getCaloteiro(id);
		
		dao.deleta(c);
					
		List<Caloteiro> lista = dao.getLista();
		
		RequestDispatcher rd = req.getRequestDispatcher("/lista-caloteiros-jstl.jsp");
		
		try {
			req.setAttribute("lista", lista);
			rd.forward(req, res);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
