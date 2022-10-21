package com.loiane.cursojava.exercicios_aula24;

public class Exerc02Book {

	public static void main(String[] args) {

		Book book01 = new Book();
		
		book01.author = "Guilherme Freitas";
		book01.edithor = "Life Editor";
		book01.genre = "Fiction";
		book01.pageQuantity = 365*37;
		book01.title = "It's what it's";
		book01.isbn = "123456789";
			
			
		System.out.println(book01.edithor);
		System.out.println(book01.author);
		System.out.println(book01.genre);
		System.out.println(book01.pageQuantity);
		System.out.println(book01.title);
		System.out.println(book01.isbn);
	}

}
