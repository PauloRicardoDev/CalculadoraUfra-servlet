package br.com.calculadoraUFRA.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/multiplicacaoServlet")
public class MultiplicacaoServlet extends HttpServlet {

      
	public void init(ServletConfig config) throws ServletException {

	}

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int total;
		String reqA = request.getParameter("valor1");
		String reqB = request.getParameter("valor2");
		System.out.println(reqA + reqB);
		try {
			total = Integer.valueOf(reqA) * Integer.valueOf(reqB); 
		}catch (Exception e) {
			System.out.println(e.getMessage());
			total = 0;
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("/ResultadoDaMultiplicacao.jsp");
		request.setAttribute("valor1", reqA);
		request.setAttribute("valor2", reqB);
		request.setAttribute("total", total);
		rd.forward(request, response);
	}


}
