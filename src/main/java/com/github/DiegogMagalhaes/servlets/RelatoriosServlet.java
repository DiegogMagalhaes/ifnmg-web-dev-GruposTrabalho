package com.github.DiegogMagalhaes.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

import com.github.DiegogMagalhaes.bean.RelatorioBean;
import com.github.DiegogMagalhaes.util.Util;

/**
 * Servlet implementation class Relatorios
 */
@Transactional
@WebServlet(name="Relatorio", urlPatterns =  "/Relatorios")
public class RelatoriosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	@Inject
	RelatorioBean realatBean;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RelatoriosServlet() {
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
             out.println("<pre class=\"high\">"
             		+ Util.toJson(realatBean.selectAllPessoaQuery())
             		+ "</pre>"
            		 );
             out.println("<h2>Pessoas Cadastradas - TypedQuery</h2>");
             out.println("<pre class=\"high\">"
              		+ Util.toJson(realatBean.selectAllPessoaTypedQuery())
              		+ "</pre>"
             		 );
             out.println("<h2>Pessoas Cadastradas - NamedQuery</h2>");
             out.println("<pre class=\"high\">"
              		+ Util.toJson(realatBean.selectAllPessoaNamedQuery())
              		+ "</pre>"
             		 );
             out.println("<h2>Nome das Pessoas - Query</h2>");
             out.println("<pre class=\"high\">"
               		+ Util.toJson(realatBean.selectAllPessoaNomeQuery())
               		+ "</pre>"
              		 );
             out.println("<h2>Nome das Pessoas - TypedQuery</h2>");
             out.println("<pre class=\"high\">"
               		+ Util.toJson(realatBean.selectAllPessoaNomeTypedQuery())
               		+ "</pre>"
              		 );
             out.println("<h2>Nome das Pessoas - NamedQuery</h2>");
             out.println("<pre class=\"high\">"
               		+ Util.toJson(realatBean.selectAllPessoaNomeNamedQuery())
               		+ "</pre>"
              		 );
             out.println("<h2>Nome e Endereço das Pessoas - Query</h2>");
             out.println("<pre class=\"high\">"
                		+ Util.toJson(realatBean.selectAllPessoaNomeEnderecoQuery())
                		+ "</pre>"
               		 );
             out.println("<h2>Nome e Endereço das Pessoas - TypedQuery</h2>");
             out.println("<pre class=\"high\">"
                		+ Util.toJson(realatBean.selectAllPessoaNomeEnderecoTypedQuery())
                		+ "</pre>"
               		 );
             out.println("<h2>Nome e Endereço das Pessoas - NamedQuery</h2>");
             out.println("<pre class=\"high\">"
                		+ Util.toJson(realatBean.selectAllPessoaNomeEnderecoNamedQuery())
                		+ "</pre>"
               		 );
             out.println("<h2>Pessoas que moram em Avenidas - Query</h2>");
             out.println("<pre class=\"high\">"
             		+ Util.toJson(realatBean.selectAllPessaoByAvenidaQuery())
             		+ "</pre>"
            		 );
             out.println("<h2>Pessoas que moram em Avenidas - TypedQuery</h2>");
             out.println("<pre class=\"high\">"
             		+ Util.toJson(realatBean.selectAllPessaoByAvenidaTypedQuery())
             		+ "</pre>"
            		 );
             out.println("<h2>Pessoas que moram em Avenidas - NamedQuery</h2>");
             out.println("<pre class=\"high\">"
             		+ Util.toJson(realatBean.selectAllPessaoByAvenidaNamedQuery())
             		+ "</pre>"
            		 );
             out.println("<h2>Pessoas que não moram em Praças - Query</h2>");
             out.println("<pre class=\"high\">"
             + Util.toJson(realatBean.selectAllPessaoDiffPracaQuery())
      		+ "</pre>"
     		 );
             out.println("<h2>Pessoas que não moram em Praças - TypedQuery</h2>");
             out.println("<pre class=\"high\">"
             + Util.toJson(realatBean.selectAllPessaoDiffPracaTypedQuery())
      		+ "</pre>"
     		 );
             out.println("<h2>Pessoas que não moram em Praças - NamedQuery</h2>");
             out.println("<pre class=\"high\">"
             + Util.toJson(realatBean.selectAllPessaoDiffPracaNamedQuery())
      		+ "</pre>"
     		 );   
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
