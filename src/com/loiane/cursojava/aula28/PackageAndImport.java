package com.loiane.cursojava.aula28;

import java.util.Scanner;

import com.loiane.cursojava.aula27.Car;

public class PackageAndImport {

	public static void main(String[] args) {

		Car fiat;
		
		fiat = new Car();
		
		fiat.displayAutonomy();
		
		
		Scanner sc = new Scanner(System.in);
		
		sc.close();
	
	}

}
