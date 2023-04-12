package com.loiane.cursojava.aula43.labs.Exerc01;

public class BankAccount {

	private String clientName;
	private String accountNumber;
	private double accountBalance;

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	@Override
	public String toString() {
		
		String s = "[Bank Account -  "; 
		s += "Account#:" + this.getAccountNumber();
		s += " | Holder: " + this.getClientName();
		s += " | Balance:" + this.getAccountBalance() + "]";
		return s;
	}

	public boolean withdraw(double withdrawValue) {
		if (this.accountBalance >= withdrawValue) {
			this.accountBalance -= withdrawValue;
			return true;
		} else {
			return false;
		}
	}

	public void deposit(double depositValue) {
		this.accountBalance += depositValue;
	}
}
;