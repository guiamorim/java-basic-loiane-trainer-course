package com.loiane.cursojava.aula34.labs;

public class Calculator {

	public static double sum(double num1, double num2) {
		return num1 + num2;
	}

	public static double subtraction(double num1, double num2) {
		return num1 - num2;

	}

	public static double multiplication(double num1, double num2) {
		return num1 * num2;
	}

	public static double division(double num1, double num2) {
		return num1 / num2;
	}

	public static double pow(double num1, double num2) {
		return Math.pow(num1, num2);
	}

	public static int factorial(int num1) {
		int num = num1;

		int factorial = num;
		System.out.print(num + "! = ");

		if (num == 0) {
			return 1;
		} else if (num == 1) {
			return 1;
		} else {
		}
		for (int i = num; i > 1; i--) {

			// display mode
			System.out.print(i - 1);

			if (i - 1 == 1) {
				System.out.print(" = ");
			} else {
				System.out.print(" x ");
			}
			factorial *= (i - 1);
		}

		// System.out.println(factorial);
		return factorial;
	}

	//Conversion methods for Area units
	
	//Square meter to square foot
	public static double areaUnitConversionSqMtToSqFt(double meters) {

		double sqMeter = 10.76; // 1 square meter equals to 10.76 square foots
		double ConvertedSqFoot = meters * sqMeter;

		return ConvertedSqFoot;
	}

	//Square foot to square meter
	public static double areaUnitConversionSqFtToSqMt(double foots) {
		double sqFoot = 0.929; // 1 square foot equals to 0.929 meters
		double convertedSqMeter = foots * sqFoot;

		return convertedSqMeter;
	}
	
	//Square mile to acre
	public static double areaUnitConversionSqMileToAcre(double miles) {
		double sqMile = 640; // 1 square mile equals to 640 acres.
		double convertedAcre = sqMile * miles;
		
		return convertedAcre;
	}
	
	//Acre to Square foot
	public static double areaUnitConversionAcreToSqFoot(double acre) {
		double acre1 = 43560;
		double convertedSqFoot = acre * acre1;
		
		return convertedSqFoot;
		
	}
	
	
	//Conversion methods for volume units
	
	//Liter to cubic centimeters
	public static double volumeUnitConversionLiterToCbCentimeter(double liter) {
		
		double liter1 = 1000; // 1 liter equals ti 1000 cubic centimeters.
		double convertedCubicCentimeter = liter1 * liter;
		
		return convertedCubicCentimeter;
	}
	
	//Cubic meter to Liter
	public static double volumeUnitConversionCubicMetersToLiter (double cubicMeter) {
		
		double cubicMeter1 = 1000; // 1 cubic meter equals to 1000 liters.
		double convertedLiter = cubicMeter * cubicMeter1;
		
		return convertedLiter;
	}
	
	//Cubic meter to cubic foot
	public static double volumeUnitConversionCubicMetersToCubicFoot (double cubicMeter) {
		
		double cubicMeter1 = 35.32; //1 cubic meter equals to 35.32 cubic foots
		double convertedCubicFoot = cubicMeter * cubicMeter1;
		
		return convertedCubicFoot;
	}
	
	//American Gallon to cubic Inches
	public static double volumeUnitConversionAmericanGallonToCubicInches (double americanGallon) {
		double americanGallon1 = 231; // 1 american gallon equals to 231 cubic inches
		double convertedCubicInches = americanGallon * americanGallon1;
		
		return convertedCubicInches;
	}
	
	//American Gallon to liter
	public static double volumeUnitConversionAmericanGallonToLiter (double americanGallon) {
		double americanGallon1 = 3785; // 1 american gallon equals to 3785 liters
		double convertedLiter = americanGallon * americanGallon1;
				
		return convertedLiter;
	}
	
	
	
	//Conversion methods for time units
	
	//Minutes to Seconds
	public static double timeUnitConversionMinuteToSeconds (double minute) {
		double minute1 = 60; // 1 mninutes equals to 60 seconds;
		double convertedSeconds = minute * minute1;
		return convertedSeconds;
	}
	
	//Hour to minutes
	public static double timeUnitConversionHourToMinute (double hour) {
		double hour1 = 60; // 1 hour equals to 60 minutes;
		double convertedMinutes = hour * hour1;
		return convertedMinutes;
	}
	
	//Day to hour
	public static double timeUnitConversionDayToHour (double day) {
		double day1 = 24; // 1 day equals to 24 hours
		double convertedHours = day * day1;
		return convertedHours;
	}
	
	//Week for days
	public static double timeUnitConversionWeekToDay (double week) {
		double week1 = 7; // 1 week equals to 7 days.
		double convertedDays = week * week1;
		return convertedDays;
	}
	
	//Month to days
	public static double timeUnitConversionMonthToDay (double month) {
		double month1 = 30; // 1 month in general equals to 30 days
		double convertedDays = month * month1;
		return convertedDays;
	}
	
	//Year to days
	public static double timeUnitConversionYearToDay (double year) {
		double year1 = 365; // Usually, 1 year equals to 365 days
		double convertedDays = year * year1;
		return convertedDays;
	}
	
	
	

}
