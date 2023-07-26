package com.loiane.cursojava.aula52.labs;

public class FullAgendaException extends Exception{

	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Agenda is already full";
	}
	
}
