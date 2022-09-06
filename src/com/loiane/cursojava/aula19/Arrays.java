package com.loiane.cursojava.aula19;

public class Arrays {

	public static void main(String[] args) {

		double[] dailyTemperature = new double[365];
	
		
		dailyTemperature[0] = 31.3;
		dailyTemperature[1] = 33.7;
		dailyTemperature[2] = 32;
		dailyTemperature[3] = 34;
		dailyTemperature[4] = 33.1;
		
		System.out.println("THe value of temperature dor day 3 is: " + dailyTemperature[2]);
		
		System.out.println("THe array size is : " + dailyTemperature.length);
		
		System.out.println("Address memory - " + dailyTemperature);
		
		
		// Doing a loop on an Array
		for (int i = 0; i < dailyTemperature.length; i++) {
			System.out.println("Temperature od the day " + (i+1) + ": " + dailyTemperature[i]);
		}
		
		
		//Enhanced For
		for(double temperature : dailyTemperature) {
			System.out.println(temperature);
		}
		
		
	}

}
