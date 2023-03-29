package br.com.calculadoraUFRA.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SomaServlet extends HttpServlet {
	
	int constante; //que será inicializado no xml

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.constante = Integer.parseInt(config.getInitParameter("constante"));
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
		
		//lógica.
		
		int soma;
		String reqNumero = request.getParameter("valor");
		int numero;
		
		try {
			//tranformar a string em interger
			numero = Integer.valueOf(reqNumero);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			numero = 0;
		}
		//logica da soma
		if(numero != 0){
			soma = this.constante + numero;
		}else {
			soma = 0;
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("/ResultadoDaSoma.jsp");
		request.setAttribute("valorVar", numero);
		request.setAttribute("const", this.constante);
		request.setAttribute("total", soma);
		rd.forward(request, response);
	}

}
