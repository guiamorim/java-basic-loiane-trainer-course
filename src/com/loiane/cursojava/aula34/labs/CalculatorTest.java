package com.loiane.cursojava.aula34.labs;

public class CalculatorTest {

	static void print(double value) {
		System.out.println(value); 
	}
	
	static void print(int value) {
		System.out.println(value); 
	}
	
	
	
	public static void main(String[] args) {
		
//		print(Calculator.multiplication(10, 2.5));
//		print(Calculator.division(10, 2.5));
//		print(Calculator.sum(4.7, 3.3));
//		print(Calculator.subtraction(7, 13.9));
//		print(Calculator.factorial(-3));
		
		print(Calculator.areaUnitConversionAcreToSqFoot(1));
		print(Calculator.areaUnitConversionSqFtToSqMt(1));
		print(Calculator.areaUnitConversionSqMileToAcre(1));
		print(Calculator.areaUnitConversionSqMtToSqFt(1));
		
		System.out.println();
		
		print(Calculator.volumeUnitConversionAmericanGallonToCubicInches(1));
		print(Calculator.volumeUnitConversionAmericanGallonToLiter(1));
		print(Calculator.volumeUnitConversionCubicMetersToCubicFoot(1));
		print(Calculator.volumeUnitConversionCubicMetersToLiter(1));
		print(Calculator.volumeUnitConversionLiterToCbCentimeter(1));
		
		System.out.println();
		
		print(Calculator.timeUnitConversionMinuteToSeconds(1));
		print(Calculator.timeUnitConversionHourToMinute(1));
		print(Calculator.timeUnitConversionDayToHour(1));
		print(Calculator.timeUnitConversionWeekToDay(1));
		print(Calculator.timeUnitConversionMonthToDay(1));
		print(Calculator.timeUnitConversionYearToDay(1));
		
		
	}
}
