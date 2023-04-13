package com.loiane.cursojava.aula43.labs.Exerc03;

public class Mammal extends Animal {

	private String foodType;

	public Mammal() {
	}

	public Mammal(String name, double length, int legs, String color, String environment, double velocity, String foodType) {
		super();
		this.setName(name);
		this.setLength(length);
		this.setLegs(legs);
		this.setColor(color);
		this.setEnvironment(environment);
		this.setVelocity(velocity);
		this.setFoodType(foodType);
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		s += " \n FOOD TYPE: " + this.getFoodType();
		return s;
	}

}
