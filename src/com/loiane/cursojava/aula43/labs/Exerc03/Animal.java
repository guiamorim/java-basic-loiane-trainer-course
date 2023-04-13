package com.loiane.cursojava.aula43.labs.Exerc03;

public abstract class Animal {

	private String name;
	private double length;
	private int legs;
	private String environment;
	private double velocity;
	private String color;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public int getLegs() {
		return legs;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public double getVelocity() {
		return velocity;
	}

	public void setVelocity(double velocity) {
		this.velocity = velocity;
	}
	
	@Override
	public String toString() {
		String s = " [ANIMAL: " + this.getName();
		s += " \n LENGTH: " + this.getLength() + "cm";
		s += " \n LEGS: " + this.getLegs();
		s += " \n COLOR: " + this.getColor();
		s += " \n ENVIRONMENT: " + this.getEnvironment();
		s += " \n SPEED: " + this.velocity + "m/s";
		return s;
	}

}
