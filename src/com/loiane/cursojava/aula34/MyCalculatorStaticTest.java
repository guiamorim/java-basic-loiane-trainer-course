package com.loiane.cursojava.aula34;

public class MyCalculatorStaticTest {

	public static void main(String[] args) {

		MyCalculatorStatic myCalc = new MyCalculatorStatic();
		
		int num1 =10, num2 =2;
		double num3 = 3, num4 = 4;
		
		System.out.println("Division " + num1 + "/" + num2 + " = " + myCalc.division(num1, num2));
		
		System.out.println("Sum " + num3 + "+" + num4 + " = " + MyCalculatorStatic.sum(num3, num4));
		
	}

}
