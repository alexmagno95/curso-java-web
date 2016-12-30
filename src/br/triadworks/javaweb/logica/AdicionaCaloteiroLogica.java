package br.triadworks.javaweb.logica;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.triadworks.javaweb.dao.CaloteiroDAO;
import br.triadworks.javaweb.modelo.Caloteiro;
import br.triadworks.javaweb.modelo.Logica;

public class AdicionaCaloteiroLogica implements Logica {
	
	
	public void executa(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		Connection conexao = (Connection) req.getAttribute("conexao");


		String nome = req.getParameter("nome");
		String email = req.getParameter("email");
		String devendo = req.getParameter("devendo");
		String dataDivida = req.getParameter("dataDivida");

		Calendar dataDividaConvertida = null;

		Date data;
		try {
			data = new SimpleDateFormat("dd/MM/yyy").parse(dataDivida);
			dataDividaConvertida = Calendar.getInstance();
			dataDividaConvertida.setTime(data);

			Caloteiro caloteiro = new Caloteiro();

			caloteiro.setNome(nome);
			caloteiro.setEmail(email);
			caloteiro.setDevendo(new Integer(devendo));
			caloteiro.setDataDivida(dataDividaConvertida);

			CaloteiroDAO dao = new CaloteiroDAO(conexao);
			dao.adiciona(caloteiro);

			RequestDispatcher rd = req
					.getRequestDispatcher("/caloteiro-adicionado.jsp");
			rd.forward(req, res);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
