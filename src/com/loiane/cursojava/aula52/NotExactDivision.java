package com.loiane.cursojava.aula52;

public class NotExactDivision extends Exception{

	
	private static final long serialVersionUID = 1L;
	private int numerator;
	private int denominator;
	
	public NotExactDivision(int num, int den) {
		super();
		this.numerator= num;
		this.denominator= den;
	}

	@Override
	public String toString() {
		return "Result of " + this.numerator + " / " + this.denominator + " isn't an integer number.";
	}
	
	
	
}
