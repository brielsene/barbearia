package br.com.barbearia.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.barbearia.model.Agenda;
import br.com.barbearia.model.Banco;

public class AlteraAgendamento implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		Banco banco = new Banco();
		Integer id = Integer.valueOf(request.getParameter("id"));
		Agenda agenda = banco.buscaAgendamentoPeloId(id);
		
		agenda.setData(request.getParameter("data"));
		agenda.setHorario(request.getParameter("horario"));
		return "redirect:controller?acao=ListaAgenda";
	}

}
