package com.loiane.cursojava.aula44;

public abstract class Animal {
	private String name;
	
	public abstract void emitSound();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
