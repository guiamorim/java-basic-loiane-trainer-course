package com.loiane.cursojava.aula33.labs;

public class CheckingAccount {

	private String acountNumber;
	private String agencyNumber;
	private boolean isSpecialAccount;
	private double specialLimit;
	private double balance;

	public CheckingAccount() {
	}

	public CheckingAccount(String acountNumber, String agencyNumber, boolean isSpecialAccount, double specialLimit,
			double balance) {
		super();
		this.acountNumber = acountNumber;
		this.agencyNumber = agencyNumber;
		this.isSpecialAccount = isSpecialAccount;
		this.specialLimit = specialLimit;
		this.balance = balance;
	}

	public String getAcountNumber() {
		return acountNumber;
	}

	public void setAcountNumber(String acountNumber) {
		this.acountNumber = acountNumber;
	}

	public String getAgencyNumber() {
		return agencyNumber;
	}

	public void setAgencyNumber(String agencyNumber) {
		this.agencyNumber = agencyNumber;
	}

	public boolean isSpecialAccount() {
		return isSpecialAccount;
	}

	public void setSpecialAccount(boolean isSpecialAccount) {
		this.isSpecialAccount = isSpecialAccount;
	}

	public double getSpecialLimit() {
		return specialLimit;
	}

	public void setSpecialLimit(double specialLimit) {
		this.specialLimit = specialLimit;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean withdraw(double value) {
		if (balance >= value) { // There is a positive balance
			balance -= value;
			return true;
		} else { // there is no suficient balance
			if (isSpecialAccount()) {
				double limit = getSpecialLimit() + getBalance();
				if (limit >= value) {
					balance -= value;
					return true;
				} else {
					System.out.println("Balance is not sufficient");
					return false;
				}
			}else {
				return false; // is not a special account and there is no sufficient balance.
			}
		}
	}

	public void deposit(double depositValue) {
		balance += depositValue;
	}

	public void balanceCheck() {
		System.out.println("Current balance = " + getBalance());
	}

	public boolean specialLimitUsageChecking() {
		return balance < 0;
	}

}
