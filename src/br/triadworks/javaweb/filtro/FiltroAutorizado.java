package br.triadworks.javaweb.filtro;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import br.triadworks.javaweb.modelo.Usuario;

@WebFilter(filterName="FiltroAutorizado", urlPatterns="/*")
public class FiltroAutorizado implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest) req;
		String uri = request.getRequestURI();
		
		String logica = request.getParameter("logica");
		
		if(logica == null){
			
			logica = "";
			
		}
		
		if(uri.equals("login.jsp")
				|| logica.endsWith("AutenticaUsuario")
				|| uri.endsWith("jpg")){
			
			chain.doFilter(req, res);
		}
		else{
			
			Usuario usuarioLogado = (Usuario) request.getSession().getAttribute("usuarioLogado");
		
			if(usuarioLogado != null){
				
				chain.doFilter(req, res);
				
			}
			else{
				
				RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
				req.setAttribute("msgUsuario", "Você não tem autorização!");
				rd.forward(req, res);
			}
			
		}
				
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	
	

}
