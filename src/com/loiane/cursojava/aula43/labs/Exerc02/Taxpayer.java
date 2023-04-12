package com.loiane.cursojava.aula43.labs.Exerc02;

public abstract class Taxpayer {

	private String name;
	private double grossIncome;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrossIncome() {
		return grossIncome;
	}

	public void setGrossIncome(double grossIncome) {
		this.grossIncome = grossIncome;
	}

	public abstract double taxCalculation();

	@Override
	public String toString() {
		String s = "Name: " + this.getName();
		s += "; Gross Income: " + this.getGrossIncome();
		return s;
	}

}
