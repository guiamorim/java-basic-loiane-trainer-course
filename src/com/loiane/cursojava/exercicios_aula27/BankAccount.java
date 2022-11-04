package com.loiane.cursojava.exercicios_aula27;

public class BankAccount {

	private int agencyNumber;
	private int accountNumber;
	private boolean specialAccount;
	private double initialSpecialLoan;
	private double balance;
	private double specialLoan;

	public void setAgencyNumber(int agencyNumber) {
		this.agencyNumber = agencyNumber;
	}

	public int getAgencyNumber() {
		return agencyNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setInitialSpecialLoan(double limitValue) {
		this.initialSpecialLoan = limitValue;
		this.specialLoan = this.getInitialSpecialLoan();
	}

	public double getInitialSpecialLoan() {
		return initialSpecialLoan;
	}

	public double getSpecialLoan() {
		return specialLoan;
	}

	public boolean getSpecialAccountCurrentStatus() {
		return this.specialAccount;
	}

	public void setSpecialAccount(boolean status) {
		if (status) {
			System.out.println("This account is Special.\n");
			this.specialAccount = true;
		} else if (!status && this.specialAccount == true) {
			System.out.println("This account is not longer special.\n");
			this.specialAccount = false;
		} else {
			this.specialAccount = false;
			System.out.println("This account is already not special.\n");
		}
	}

	void withdraw(double withDrawValue) {
		// insert balance validation
		if (this.getBalance() > 0 && this.getBalance() >= withDrawValue) {
			balance -= withDrawValue;
			System.out.println("Value of withdraw: " + withDrawValue);
		} else {
			if (specialAccount) {
				double leftWithDraw = withDrawValue - balance; // initial value to take off from current balance
				if (this.getSpecialLoan() > 0 && this.getSpecialLoan() >= leftWithDraw) {
					this.balance -= (withDrawValue - leftWithDraw); // balance just with the difference of
					this.specialLoan -= leftWithDraw;
					System.out.println("\nTotal Withdraw:		€" + withDrawValue + "   \n - From Balance:	€"
							+ (withDrawValue - leftWithDraw) + "   \n - From Special Loan:	€" + leftWithDraw);
//				System.out.println("Balance: " + this.balance); // FTP - for test purpose
//				System.out.println("specialLoan: " + this.specialLoan); // FTP
				} else {
					System.out.println("Balance and Special limit are insuficient for this operation.");
				}
			} else {
				System.out.println("Account is not special and there is no suficient balance for this withdraw amount.");
			}
		}
	}

	void deposit(double depositValue) {
		double specialLoanDebit = this.getInitialSpecialLoan() - this.getSpecialLoan();
		if (specialLoanDebit > 0) {
			if (depositValue >= specialLoanDebit) {
				this.specialLoan += specialLoanDebit;
				this.balance += depositValue - specialLoanDebit;
			} else {// need to add one more condition to only complete the total value of loan and
					// then the rest value add to balance.
				this.specialLoan += depositValue;
			}

		} else {
			balance += depositValue;
		}

		System.out.println("\nValue deposited:	€" + depositValue);
	}

	double getBalance() {
		return balance;
	}

	void useSpecialLoan(double value) {
		if (this.getSpecialLoan() >= value) {
			balance += value;
			this.specialLoan -= value;
		} else {
			System.out.println("Special Loan is not suficient.");
			System.out.println("Current value:" + this.getSpecialLoan());
		}
	}

	public double checkSpecialLoan() {
		if (this.specialLoan < this.initialSpecialLoan) {
			System.out.print("\nLoan is in use." + "\n - Initial total:	€" + this.getInitialSpecialLoan()
					+ "\n - Using:		€" + (this.getInitialSpecialLoan() - this.specialLoan)
					+ "\n - Available:		€" + this.getSpecialLoan());
			return this.specialLoan;
		} else {
			System.out.print("\nLoan is not in use.\nAvailable Loan amount:	€" + +this.getSpecialLoan());
			return this.specialLoan;
		}
	}

}
