package com.github.DiegogMagalhaes.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Relatorios
 */
@WebServlet(name="Relatorio", urlPatterns =  "/Relatorios")
public class Relatorios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Relatorios() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	System.out.println("Entrou aqui");
    	
    	 try (PrintWriter out = response.getWriter()) {
             out.println("<!DOCTYPE html>");
             out.println("<html>");
             out.println("<head>");
             out.println("<title>Relatorio</title>");
             out.println("</head>");
             out.println("<body>");
             out.println("<h2>Pessoas Cadastradas - Query</h2>");
             out.println("<h2>Pessoas Cadastradas - TypedQuery</h2>");
             out.println("<h2>Pessoas Cadastradas - NamedQuery</h2>");
             out.println("<h2>Nome das Pessoas - Query</h2>");
             out.println("<h2>Nome das Pessoas - TypedQuery</h2>");
             out.println("<h2>Nome das Pessoas - NamedQuery</h2>");
             out.println("<h2>Nome e Endereço das Pessoas - Query</h2>");
             out.println("<h2>Nome e Endereço das Pessoas - TypedQuery</h2>");
             out.println("<h2>Nome e Endereço das Pessoas - NamedQuery</h2>");
             out.println("<h2>Pessoas que moram em Avenidas - Query</h2>");
             out.println("<h2>Pessoas que moram em Avenidas - TypedQuery</h2>");
             out.println("<h2>Pessoas que moram em Avenidas - NamedQuery</h2>");
             out.println("<h2>Pessoas que não moram em Praças - Query</h2>");
             out.println("<h2>Pessoas que não moram em Praças - TypedQuery</h2>");
             out.println("<h2>Pessoas que não moram em Praças - NamedQuery</h2>");
             out.println("<h2>Nomes e Telefones das Pessoas - Query</h2>");
             out.println("<h2>Nomes e Telefones das Pessoas - TypedQuery</h2>");
             out.println("<h2>Nomes e Telefones das Pessoas - NamedQuery</h2>");
             
             out.println("</body>");
             out.println("</html>");
         }catch (Exception e) {
			e.printStackTrace();
		}
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

}
