package com.loiane.cursojava.aula43.labs.Exerc02;

public class LegalPerson extends Taxpayer {

	private String tin; // tax identification number;

	public String getTin() {
		return tin;
	}

	public void setTin(String tin) {
		this.tin = tin;
	}

	@Override
	public double taxCalculation() {

		double tax = this.getGrossIncome() * 0.10; // 10%

		return tax;
	}

	@Override
	public String toString() {
		String s = "Legal Person [";
		s += super.toString();
		s += " ; TIN: " + this.getTin();
		s += " ; Tax: " + this.taxCalculation();
		return s;
	}

}
