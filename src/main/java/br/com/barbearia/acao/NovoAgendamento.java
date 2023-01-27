package br.com.barbearia.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.barbearia.model.Agenda;
import br.com.barbearia.model.Banco;
public class NovoAgendamento implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		Banco banco = new Banco();
		Agenda agenda = new Agenda();
		agenda.setData(request.getParameter("data"));
		agenda.setHorario(request.getParameter("horario"));
		banco.adicionaAgendamento(agenda);
		request.setAttribute("listaAgenda", banco.getListaAgenda());
		return "redirect:controller?acao=ListaAgenda";
	}

}
