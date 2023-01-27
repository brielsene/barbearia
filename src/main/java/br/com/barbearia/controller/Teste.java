package br.com.barbearia.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.barbearia.model.Agenda;
import br.com.barbearia.model.Banco;

public class Teste {

	public static void main(String[] args) {
		Banco banco = new Banco();
		List<Agenda>lista = banco.getListaAgenda();
		
		
		
		System.out.println(lista);
		

	}

}
