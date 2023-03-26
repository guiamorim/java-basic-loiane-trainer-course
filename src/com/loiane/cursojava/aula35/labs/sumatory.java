package com.loiane.cursojava.aula35.labs;

public class sumatory {

	public static int sum(int num) {

		if (num == 0) {
			return 0;
		} else {
			return num + sum(num - 1);
		}
	}
}
