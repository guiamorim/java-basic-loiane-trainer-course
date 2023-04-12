package com.loiane.cursojava.aula43.labs;

import java.util.Calendar;

public class SaveAccount extends BankAccount {

	private int incomeDay;
	private double incomeRate;

	public int getIncomeDay() {
		return incomeDay;
	}

	public void setIncomeDay(int incomeDay) {
		this.incomeDay = incomeDay;
	}

	public double getIncomeRate() {
		return incomeRate;
	}

	public void setIncomeRate(double incomeRate) {
		this.incomeRate = incomeRate;
	}
	
	
	public boolean newBalanceCalculation(double incomeRate) {
		Calendar today = Calendar.getInstance();
		
		if(incomeDay == today.get(Calendar.DAY_OF_MONTH)) {
			this.setAccountBalance(this.getAccountBalance() + (this.getAccountBalance() * incomeRate));
			return true;
		}
		return false;
	}
	

	@Override
	public String toString() {

		String s = "[Save Account -  ";
		s += "Income Day:" + this.getIncomeDay() + "] ";
		s += super.toString();
		return s;
	}

}
