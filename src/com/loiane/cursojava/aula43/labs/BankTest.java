package com.loiane.cursojava.aula43.labs;

public class BankTest {

	public static void main(String[] args) {

		System.out.println("*** Bank Account Test ***");

		BankAccount simpleAccount = new BankAccount();

		simpleAccount.setClientName("Guilherme Amorim");
		simpleAccount.setAccountNumber("1111");
		simpleAccount.setAccountBalance(100);

		System.out.println(simpleAccount.toString());
		System.out.println(simpleAccount.getAccountBalance());

		//withdraw tests
		withdraw(simpleAccount, 50);
		withdraw(simpleAccount, 70);

		System.out.println(simpleAccount.getAccountBalance());

		simpleAccount.deposit(100);

		System.out.println(simpleAccount.getAccountBalance());

		
		System.out.println("\n*** Save Account Test ***");

		SaveAccount saveAccount = new SaveAccount();

		saveAccount.setClientName("Leidiane Amorim");
		saveAccount.setAccountNumber("2222");
		saveAccount.setAccountBalance(100);
		saveAccount.setIncomeDay(12);

		System.out.println(saveAccount.toString());
		System.out.println(saveAccount.getAccountBalance());

		//withdraw tests
		withdraw(saveAccount, 50);
		withdraw(saveAccount, 70);
		
		if(saveAccount.newBalanceCalculation(0.05)) {
			System.out.println("New income applied. New current balance: " + saveAccount.getAccountBalance());
		} else
			System.out.println("Today is not a income day, current balance: " + saveAccount.getAccountBalance());

		System.out.println(saveAccount.getAccountBalance());

		saveAccount.deposit(50);

		System.out.println(saveAccount.getAccountBalance());
		
		
		
		
		System.out.println("\n*** Especial Account Test ***");

		EspecialAccount especialAccount = new EspecialAccount();

		especialAccount.setClientName("Gloria Amorim");
		especialAccount.setAccountNumber("3333");
		especialAccount.setAccountBalance(100);
		especialAccount.setLimitValue(50);

		System.out.println(especialAccount.toString());
		System.out.println(especialAccount.getAccountBalance());

		//withdraw tests
		withdraw(especialAccount, 50);
		withdraw(especialAccount, 70);
		withdraw(especialAccount, 80);
		
		System.out.println("Account Balance: " + especialAccount.getAccountBalance());

		especialAccount.deposit(50);
		System.out.println("Account Balance: " + especialAccount.getAccountBalance());

	}

	private static void withdraw(BankAccount account, double value) {
		if (account.withdraw(value)) {
			System.out.println("Successful withdraw, new current balance: " + account.getAccountBalance());
		} else {
			System.out.println("Insufficient balance for withdraw of " + value + ".");
		}
		;
	}

}
