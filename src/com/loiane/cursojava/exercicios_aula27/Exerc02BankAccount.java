package com.loiane.cursojava.exercicios_aula27;

// This App is a test for BankAccount class

public class Exerc02BankAccount {

	public static void main(String[] args) {

		BankAccount account01 = new BankAccount();
		
		account01.setAccountNumber(1234);
		account01.setAgencyNumber(0001);;
		account01.setSpecialAccount(true);
		account01.setInitialSpecialLoan(100);
		
		account01.checkSpecialLoan();
		account01.deposit(200);
		System.out.println("\nCurrent balance:	€" + account01.getBalance());
		
		
		account01.withdraw(250);
		System.out.println("\nCurrent balance:	€" + account01.getBalance());
		account01.checkSpecialLoan();
		account01.withdraw(50);
		account01.checkSpecialLoan();
		
		account01.deposit(70);
		account01.checkSpecialLoan();
		
		account01.deposit(70);
		account01.checkSpecialLoan();
		
		System.out.println("\nCurrent balance:	€" + account01.getBalance());
		
		account01.deposit(70);
		account01.checkSpecialLoan();
		
		System.out.println("\nCurrent balance:	€" + account01.getBalance());
		
		account01.deposit(70);
		account01.checkSpecialLoan();
		System.out.println("\nCurrent balance:	€" + account01.getBalance());
		
	}

}
