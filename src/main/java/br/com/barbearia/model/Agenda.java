package br.com.barbearia.model;

public class Agenda  {
	private String data;
	private String horario;
	private int id;
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	
	public String getHorario() {
		return horario;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public String getData() {
		return data;
	}

	@Override
	public String toString() {
		return "[ID de agendamento: "+this.id+", Data de agendamento: "+this.data+", Horário: "+this.horario+"]";
	}
	
	public String devolveDataCompleta() {
		return "Data de agendamento: "+this.data+", Horário: "+this.horario;
	}

	
	
	
	
	
	
	

}
