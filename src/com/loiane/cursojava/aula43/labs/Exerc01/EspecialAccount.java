package com.loiane.cursojava.aula43.labs.Exerc01;

public class EspecialAccount extends BankAccount {

	private double limitValue;

	public double getLimitValue() {
		return limitValue;
	}

	public void setLimitValue(double limitValue) {
		this.limitValue = limitValue;
	}

	
	@Override
	public boolean withdraw(double value) {
		double balanceWithLimitValue = this.getAccountBalance() + limitValue;
		
		if((balanceWithLimitValue - value) >= 0) {
			this.setAccountBalance(this.getAccountBalance() - value);
			return true;
		}
			return false;
	}

	@Override
	public String toString() {

		String s = "[Especial Account -  ";
		s += "Limit value:" + this.getLimitValue() + "] ";
		s += super.toString();
		s += " [Total (Balance + Limite): " + (this.getAccountBalance()+this.getLimitValue()) + "]";
		return s;
	}

}
