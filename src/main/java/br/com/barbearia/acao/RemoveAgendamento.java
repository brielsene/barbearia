package br.com.barbearia.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.barbearia.model.Banco;

public class RemoveAgendamento implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		Integer id = Integer.valueOf(request.getParameter("id"));
		Banco banco = new Banco();
		banco.removeAgendaPeloId(id);
		
		
		return "redirect:controller?acao=ListaAgenda";
	}

}
