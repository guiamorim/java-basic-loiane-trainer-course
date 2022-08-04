package com.loiane.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {
		
		
		int idade = 20;
		String nome = "Guilherme";
		String nomeDoMeuCachorro = "totó";
		
		// aceito, mas não é utilizado
		int _idade;
		int $idade;
		String ano2022;
		
		// não é convenção Java
		String nome_do_meu_cachorro;
		String NomeDoMeuCachorro;
		String nomeDoMeucachorro;
		
		
		idade = 25;
		System.out.println("Idade =" + idade);
		System.out.println("Nome = " + nome);
		
		
		//má prática, não há significado no nome da variável
		int a = 10;
		String b = "Guilherme";
		
	}

}
