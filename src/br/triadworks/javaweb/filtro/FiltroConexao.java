package br.triadworks.javaweb.filtro;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import br.triadworks.javaweb.dao.ConnectionFactory;
import br.triadworks.javaweb.servlets.CaloteiroServletException;


@WebFilter(filterName="FiltroConexao", urlPatterns="/sistema")
public class FiltroConexao implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		
		
		Connection conexao = new ConnectionFactory().getConnection();
		
		req.setAttribute("conexao", conexao);
		
		chain.doFilter(req, res);
		
		try {
			conexao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new CaloteiroServletException("Erro ao fechar a conexão com o banco!");
		}
		
	}

}