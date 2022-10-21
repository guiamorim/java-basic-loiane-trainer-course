package com.loiane.cursojava.exercicios_aula24;

public class Exerc01Lamp {

	public static void main(String[] args) {

		Lamp lamp01 = new Lamp();
		
		lamp01.color = "blue";
		lamp01.lumens = 10000;
		lamp01.costPrice = 5.88;
		lamp01.sellPrice = 10.00;
		lamp01.productCode = 100123;
		lamp01.brand = "Philips";
		lamp01.description = "Lamp " + lamp01.brand + ", " + lamp01.color + ", " + lamp01.lumens;
		
		
		System.out.println("Color: " + lamp01.color);
		System.out.println("Lumens: " + lamp01.lumens);
		System.out.println("Cost price: " +lamp01.costPrice);
		System.out.println("Sell price: " + lamp01.sellPrice);
		System.out.println("Product code: " + lamp01.productCode);
		System.out.println("Label: " + lamp01.description);
		System.out.println("Brand: " + lamp01.brand);
	}

}
