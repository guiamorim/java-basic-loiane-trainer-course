package com.loiane.cursojava.exercicios_aulas16and17;

public class Exerc04 {

	public static void main(String[] args) {

		double populationA, populationB, idxAnnualGrowthA, idxAnnualGrowthB;
		int year = 0;
		
		populationA = 80_000;
		idxAnnualGrowthA = 0.03;
		
		populationB = 200_000;
		idxAnnualGrowthB = 0.015;
		
		do{
			year++;
			
			populationA *= (idxAnnualGrowthA +1);
			
			populationB *= (idxAnnualGrowthB +1);
			
			if(populationA == populationB) {
				System.out.println("\nYear: " + year);
				System.out.println("population A is equal to population B at year:"+ year);
				System.out.printf("Population A: %.2f %n", populationA);
				System.out.printf("Population B: %.2f %n", populationB);
			} else if(populationA > populationB) {
				System.out.println("\nYear: " + year);
				System.out.println("Population A is over population B at year:" + year);
				System.out.printf("Population A: %.2f %n", populationA);
				System.out.printf("Population B: %.2f %n", populationB);
			} else {
				
			}
			
		}while(populationA != populationB && populationA < populationB);
		
		
		
	}

}
