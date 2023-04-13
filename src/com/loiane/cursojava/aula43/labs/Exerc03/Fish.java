package com.loiane.cursojava.aula43.labs.Exerc03;

public class Fish extends Animal {

	private String characteristics;
	
	
	public Fish(String name, double length, int legs, String color, String environment, double velocity, String characteristics) {
		
		super();
		this.setName(name);
		this.setLength(length);
		this.setLegs(legs);
		this.setColor(color);
		this.setEnvironment(environment);
		this.setVelocity(velocity);
		this.setCharacteristics(characteristics);
		
	}

	public String getCharacteristics() {
		return characteristics;
	}

	public void setCharacteristics(String characteristics) {
		this.characteristics = characteristics;
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		s += " \n CHARACTERISTICS: " + this.getCharacteristics();
		return s;
	}
	
	
	
}
