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
    	
    	 try (PrintWriter out = response.getWriter()) {
             out.println("<!DOCTYPE html>");
             out.println("<html>");
             out.println("<head>");
             out.println("<title>Servlet PessoaServlet</title>");
             out.println("</head>");
             out.println("<body>");
             out.println("<h1>Servlet PessoaServlet: Muitos-para-muitos com entidade de relacionamento</h1>");
             out.println("<p>Processamento concluído com sucesso.</p>");
             out.println("<p><pre>"
//                     + Util.toJson(pessoa1Bd)
                     + "</pre></p>");
             out.println("<p><pre>"
//                     + Util.toJson(pessoa2Bd)
                     + "</pre></p>");
             out.println("<a href=\"index.html\">Voltar</a>");
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
