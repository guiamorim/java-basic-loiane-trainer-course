package com.loiane.cursojava.exercicios_aulas16and17;

// 9. This app should return only odd numbers between 0 and 150.

public class Exerc09 {

	public static void main(String[] args) {

		for (int count = 1; count > 0 && count < 150; count ++) {
			if(count%2 != 0) {
				System.out.println(count);
			}
		}
	}

}
