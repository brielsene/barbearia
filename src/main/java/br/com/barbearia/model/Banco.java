package br.com.barbearia.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Banco  {
	private static List<Usuario> listaUsuario = new ArrayList<>();
	private static List<Agenda> listaAgenda = new ArrayList<>();
	private static int chaveSequencial = 1;
	
	static {
		//Usuario
		Usuario usuario = new Usuario();
		usuario.setLogin("gb");
		usuario.setSenha("111");
		listaUsuario.add(usuario);
		
		//Agendamento
		Agenda agenda = new Agenda();
		agenda.setData("30/03/2023");
		agenda.setHorario("12:00");
		agenda.setId(chaveSequencial++);
		listaAgenda.add(agenda);
		
		//Agendamento2
				Agenda agenda2 = new Agenda();
				agenda2.setData("30/03/2023");
				agenda2.setHorario("11:00");
				agenda2.setId(chaveSequencial++);
				listaAgenda.add(agenda2);
	}
	
	public static List<Usuario> getListaUsuario() {
		return listaUsuario;
	}
	
	public Usuario usuarioExiste (String login, String senha) {
		for (Usuario usuario : listaUsuario) {
				if(usuario.ehIgual(login, senha)) {
					return usuario;
				}
			
		}return null;
	}
	
	public void adicionaAgendamento (Agenda agenda) {
		agenda.setId(chaveSequencial++);
		Banco.listaAgenda.add(agenda);
	}
	
	public static List<Agenda> getListaAgenda() {
		return listaAgenda;
	}
	
	public void ordenaAgendamento() {
		Banco.getListaAgenda().sort((c1,c2)->c1.devolveDataCompleta().compareTo(c2.devolveDataCompleta()));
	}
	
	public Agenda buscaAgendamentoPeloId (Integer id) {
		for (Agenda agenda : listaAgenda) {
			if(agenda.getId()==id) {
				return agenda;
			}
			
		}return null;
	}
	
	

	
	
	
	
	

}
