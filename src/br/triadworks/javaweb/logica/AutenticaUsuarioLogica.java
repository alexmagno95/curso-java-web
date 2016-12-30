package br.triadworks.javaweb.logica;

import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.triadworks.javaweb.dao.UsuarioDAO;
import br.triadworks.javaweb.modelo.Logica;
import br.triadworks.javaweb.modelo.Usuario;

public class AutenticaUsuarioLogica implements Logica{

	@Override
	public void executa(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		
		Usuario usuarioAutenticado = null;
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		Connection connection = (Connection) req.getAttribute("conexao");
		
		UsuarioDAO dao = new UsuarioDAO(connection);
		usuarioAutenticado = dao.autentica(login, senha);
		
		if(usuarioAutenticado != null){
						
			HttpSession session = req.getSession();
			
			session.setAttribute("usuarioLogado", usuarioAutenticado);
			
			session.setAttribute("usuarioLogado", usuarioAutenticado);

			req.setAttribute("nome", "RequestScope");
			
			session.setAttribute("nome", "SessionScope");
			
			res.sendRedirect("menu.jsp");
		}
		else{
			
			req.setAttribute("msgUsuario", "Login ou senha inválidos");

			res.sendRedirect("login.jsp");
						
		}
		
		
	}

}
