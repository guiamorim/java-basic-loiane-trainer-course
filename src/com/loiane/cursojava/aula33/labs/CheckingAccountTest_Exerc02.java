package com.loiane.cursojava.aula33.labs;

public class CheckingAccountTest_Exerc02 {

	public static void main(String[] args) {

		CheckingAccount account01 = new CheckingAccount();
		
		account01.setAcountNumber("1234-00");
		account01.setAgencyNumber("0001");
		account01.setBalance(100);
		account01.setSpecialAccount(true);
		account01.setSpecialLimit(500);
		
		System.out.println("Account: " + account01.getAcountNumber() + "\nAgency: " + account01.getAgencyNumber());
		
		boolean withdrawDone = account01.withdraw(1000);
		
		if(withdrawDone) {
			System.out.println("Successful withdraw.");
			account01.balanceCheck();
		} else {
			System.out.println("It's not possible to perform the withdraw. Current balance is not sufficient.");
		}
		
		withdrawDone = account01.withdraw(500);
		
		System.out.println("Attempt to draw 500€.");
		
		if(withdrawDone) {
			System.out.println("Successful withdraw.");
			account01.balanceCheck();
		} else {
			System.out.println("It's not possible to perform the withdraw. Current balanceis not sufficient.");
		}
		
		account01.balanceCheck();
		account01.deposit(100);
		account01.balanceCheck();
		
		account01.withdraw(250);
		account01.balanceCheck();
		
		if(account01.specialLimitUsageChecking()) {
			System.out.println("Special limit is in usage.");
		} else {
			System.out.println("Special limit is not in usage.");
		}
	}

}
