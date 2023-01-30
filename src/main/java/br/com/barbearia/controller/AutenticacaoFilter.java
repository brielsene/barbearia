package br.com.barbearia.controller;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class AutenticacaoFilter
 */
@WebFilter("/controller")
public class AutenticacaoFilter extends HttpFilter implements Filter {

	

	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest)req;
		HttpServletResponse response = (HttpServletResponse)resp;
		
		HttpSession sessao = request.getSession();
		String paramAcao = request.getParameter("acao");
		boolean ehUmaAcaoProtegida = !(paramAcao.equals("FormLogin")|| paramAcao.equals("Login"));
		boolean usuarioNaoEstaLogado = sessao.getAttribute("usuarioLogado")==null;
		
		if(ehUmaAcaoProtegida && usuarioNaoEstaLogado) {
			response.sendRedirect("controller?acao=FormLogin");
			return;
		}
		
		
		chain.doFilter(request, response);
	}


}
