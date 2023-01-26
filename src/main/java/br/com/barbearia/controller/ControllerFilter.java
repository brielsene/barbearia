package br.com.barbearia.controller;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.barbearia.acao.Acao;

/**
 * Servlet Filter implementation class ControllerFilter
 */
@WebFilter("/controller")
public class ControllerFilter extends HttpFilter implements Filter {
   
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest)req;
		HttpServletResponse response = (HttpServletResponse)resp;
		
		String paramAcao = request.getParameter("acao");
		String nomeDaClasse = "br.com.barbearia.acao."+paramAcao;
		String nome = null;
		
		try {
			Class classe = Class.forName(nomeDaClasse);
			Acao acao = (Acao)classe.newInstance();
			nome = acao.executa(request, response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IOException
				| ServletException e) {
			// TODO Auto-generated catch block
			throw new ServletException(e);
		}
		
		String[] tipoEEndereco = nome.split(":");
		if(tipoEEndereco[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/"+tipoEEndereco[1]);
					rd.forward(request, response);
		}else {
			response.sendRedirect(tipoEEndereco[1]);
		}
		
	}



}
