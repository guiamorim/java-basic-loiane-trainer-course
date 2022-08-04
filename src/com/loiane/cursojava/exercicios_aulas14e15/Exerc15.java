package com.loiane.cursojava.exercicios_aulas14e15;

import java.util.Scanner;

// 15. This App read 3 values as a triangle side each one. After that return the triangle type or if it's not a triangle.

public class Exerc15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int side1, side2, side3;

		System.out.println(
				"Please set 1 value for each one of 3 sides of geometric figure and discover which type os triangle it's \n.");

		System.out.println("Enter a value for side 1:");
		side1 = sc.nextInt();

		System.out.println("Enter a value for side 1:");
		side2 = sc.nextInt();

		System.out.println("Enter a value for side 1:");
		side3 = sc.nextInt();

		System.out.print("\nFor those values the triangle type is ");

		if ((side1 + side2) > side3 || (side2 + side3) > side1 || (side3 + side1) > side2) {
			if (side1 == side2 && side1 == side3) {
				System.out.println("Equilateral triangle");
			} else if (side1 == side2 || side2 == side3 || side1 == side3) {
				System.out.println("Isosceles triangle");
			} else {
				System.out.println("Scalene triangle");
			}

		} else {
			System.out.println("This is not a triangle");
		}

		sc.close();
	}

}
