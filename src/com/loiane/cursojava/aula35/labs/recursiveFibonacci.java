package com.loiane.cursojava.aula35.labs;

public class recursiveFibonacci {

	public static int fibonacci(int num) {

		if (num < 2)
			return 1;
		
		return fibonacci(num - 1) +
				fibonacci(num - 2);

	}

}
