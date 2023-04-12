package com.loiane.cursojava.aula43.labs.Exerc02;

public class PrivatePerson extends Taxpayer {

	private String vat;

	public String getVat() {
		return vat;
	}

	public void setVat(String vat) {
		this.vat = vat;
	}

	@Override
	public double taxCalculation() {

		double income = this.getGrossIncome();

		if (income <= 1400) {
			return 0;
		}

		else if (income > 1400 && income <= 2100) {
			return (income * 0.1) - 100;
		}

		else if (income > 2100 && income <= 2800) {
			return (income * 0.15) - 270;
		}

		else if (income > 2800 && income <= 3600) {
			return (income * 0.25) - 500;
		}

		// greater then 3600
		return (income * 0.3) - 700;

	}

	@Override
	public String toString() {

		String s = "Private Person [";
		s += super.toString();
		s += " ; VAT: " + this.getVat();
		s += " ; Tax to be payed: " + Math.round(this.taxCalculation());
		s += "]";

		return s;

	}
}
