package com.loiane.cursojava.exercicios_aula19;

import java.util.Scanner;

// 36 - This app will generate an array using the math.pow function 

public class Exerc36 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] nums = new int[11];

		System.out.println("\nFilling the array based on pow of 2... \n");

		// Array populating
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) Math.pow(2, i);
		}
		int count = 1;

		for (int n : nums) {
			System.out.println("Number " + count + ": " + n);
			count++;
		}
		sc.close();

	}

}
