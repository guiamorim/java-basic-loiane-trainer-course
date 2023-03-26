package com.loiane.cursojava.exercicios_aula27;

//This App is a Test for Lamp class

public class Exerc01LampTest {

	public static void main(String[] args) {

		Lamp lamp01 = new Lamp();

		lamp01.color = "blue";

		lamp01.turnOn();

		lamp01.displayStatus();

		lamp01.turnOff();
		
		lamp01.displayStatus();
		
		lamp01.changeturnOn();
		
		lamp01.displayStatus();
		
	}
}
