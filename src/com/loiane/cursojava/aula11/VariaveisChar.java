package com.loiane.cursojava.aula11;

public class VariaveisChar {

	public static void main(String[] args) {
		
		char o = 'o';
		char i = 'i';
		char interrogacao = 0x003F; // valor unicode para ?
		
		System.out.println(""+o+i+interrogacao);
		
		char o1 = 111; // usando valor unicode
		
		char i1 = 105;
		
		System.out.println(""+o1+i1+interrogacao);

	}

}
