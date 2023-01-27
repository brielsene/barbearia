package br.com.barbearia.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.barbearia.model.Agenda;
import br.com.barbearia.model.Banco;

public class ListaAgenda implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		Banco banco = new Banco();
		//Ordena pela data
		banco.ordenaAgendamento();
		request.setAttribute("listaAgenda", banco.getListaAgenda());
		return"forward:listaAgenda.jsp" ;
		
		
	}

}
