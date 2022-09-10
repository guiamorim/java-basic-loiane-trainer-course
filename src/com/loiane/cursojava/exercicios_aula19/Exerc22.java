package com.loiane.cursojava.exercicios_aula19;

import java.lang.Math;

// 22 - This App will process ramdonly 10 positions in a array, then will
// calculate the percentage(%) that each possible value (o or 1) represent from the total.
public class Exerc22 {

	public static void main(String[] args) {

		int arrayJ[] = new int[10];
		int quantity0 = 0;
		int quantity1 = 0;

		System.out.println("Filling the array content...");

		for (int i = 0; i < arrayJ.length; i++) {
			arrayJ[i] = (int) Math.round(Math.random() * 1);
			System.out.println("" + (i + 1) + " - " + arrayJ[i]);
		}

		for (int j : arrayJ) {
			if (j == 0) {
				quantity0++;
			} else {
				quantity1++;
			}
		}

		System.out.println("Randomic ocurrency result:");
		System.out.println(" 0: " + ((quantity0 * 100) / arrayJ.length) + "%");
		System.out.println(" 1: " + ((quantity1 * 100) / arrayJ.length) + "%");

	}

}
