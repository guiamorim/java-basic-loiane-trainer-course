package com.loiane.cursojava.aula34.labs;

// 34. This class Test the Static modifier for methods and variable from class CounterStatic.java

public class CounterStaticTest {

	static void printCounter() {
		System.out.println(CounterStatic.counterDisplay());
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		System.out.println(CounterStatic.counterDisplay()); // no instance so far, so counter is equal to 0

		CounterStatic counter = new CounterStatic(); // 1st instance

		printCounter();// class had been instanciated, so counter is incremented to 1.

		counter.counterIncrement(2);

		printCounter(); // class instanciated, so counter is incremented to 1.

		CounterStatic cs2 = new CounterStatic();// 2nd instance

		printCounter();

		System.out.println(cs2.counterDisplay());

		cs2.counterToZero();

		System.out.println(cs2.counterDisplay());

	}

}
