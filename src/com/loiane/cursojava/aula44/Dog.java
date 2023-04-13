package com.loiane.cursojava.aula44;

public class Dog extends Mammal implements PetAnimal, DomesticAnimal {

	private int size;
	private String breed;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public void breastfeeding() {
		// TODO Auto-generated method stub

	}

	@Override
	public void emitSound() {
		// TODO Auto-generated method stub

	}

	@Override
	public void play() {
		// TODO Auto-generated method stub

	}

	@Override
	public void takeToWalk() {
		// TODO Auto-generated method stub

	}

	@Override
	public void takeToTheVeterinarian() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void feed() {
		// TODO Auto-generated method stub
		
	}

}
