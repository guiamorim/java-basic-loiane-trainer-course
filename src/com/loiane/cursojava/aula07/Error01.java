package com.loiane.cursojava.aula07;

public class Error01 {

	public static void main(String[] args) {
		
		System.out.println("Hello World");

	}

}

class Cachorro {
	
	String 	type;
	Double 	height;
	Double 	weight;
	String 	temperament;
	int 	lifeSpan;
	String 	activityLevel;


Cachorro( String type){
	this.type = type;
}


public String bark() {
	
	String sound = ("au au au");
	return sound;
}



}