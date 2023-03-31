package com.loiane.cursojava.aula42;

public class FinalModifierTest {

	public static void main(String[] args) {

		System.out.println(Constants.URL_SITE);
		
//		Constants.URL_SITE = "Change is not allowed"; // Changes on a final attribute is not allowed
		
		Robot r2d2 = new Robot(); //A final class can be instiated in a object but no extended by other class
	}

}
