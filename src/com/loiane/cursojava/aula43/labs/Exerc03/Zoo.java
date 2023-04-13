package com.loiane.cursojava.aula43.labs.Exerc03;

public class Zoo {

	public static void main(String[] args) {

		
		
		Animal[] zoo = new Animal[3];
		
		Mammal camel = new Mammal("Camel", 150, 4, "Yellow", "Land", 2.0, "Herbivore");
		Fish shark = new Fish("Shark", 300, 0, "Gray", "Sea", 1.5, "Carnivore");
		Mammal bear = new Mammal("Bear", 180, 4, "Red", "Land", 0.5, "Honney");
		
		
		System.out.println(" Zoo:");
		
		zoo[0] = camel ;
		zoo[1] = shark;
		zoo[2] = bear;
		
		
		for(Animal a : zoo){
			System.out.println("------------------------");
			System.out.println(a.toString());
			System.out.println("------------------------");
		}
		
		
		
	}

}
