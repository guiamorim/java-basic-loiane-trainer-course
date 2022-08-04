package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class ExerciciosAula13 {

	public static void main(String[] args) {

		
		  
//		  1. Faça um progrtama que mostre a mensagem "Alo mundo" na tela
//		  
//		  System.out.println("Alo mundo");
		  
		  
		  
//		  2. Faça um Programa que peça um número e então mostre a mensagem O número
//		  informado foi [número].
//		  
//		  System.out.println("Informe um numero: "); Scanner sc = new
//		  
//		  Scanner(System.in); int numero = sc.nextInt();
//		  
//		  System.out.println("O numero informado foi " + numero);
//		  
//		  sc.close();
		  
		  
		  
//		  3. Faça um programa que peça dois números e imprima a soma.
//		  
//		  Scanner sc = new Scanner (System.in);
//		  
//		  int numero1, numero2; 
//		  System.out.println("Por favor, informe dois números para descobrir a soma dos dois: ");
//		  System.out.println("Primeiro número: ");
//		 
//		  numero1 = sc.nextInt();
//		  
//		  System.out.println("Segundo número: ");
//		  
//		  numero2 = sc.nextInt();
//		  
//		  System.out.println("1º número informado: " + numero1);
//		  System.out.println("2º número informado: " + numero2);
//		  System.out.println("A soma entre "+ numero1 + " e " + numero2 + " é: " +
//		  (numero1+numero2));
		  
		  
//		  4. Faça um programa que peça as 4 notas bimestrais e mostre a média.
		  
//		  Scanner sc = new Scanner(System.in);
//		  
//		  System.out.print("1º nota do bimestre: "); double nota1 = sc.nextDouble();
//		  System.out.print("2º nota do bimestre: "); double nota2 = sc.nextDouble();
//		  System.out.print("3º nota do bimestre: "); double nota3 = sc.nextDouble();
//		  System.out.print("4º nota do bimestre: "); double nota4 = sc.nextDouble();
//		  
//		  System.out.println("A média das notas é: " + ((nota1 + nota2 + nota3 +
//		  nota4)/4));
		  
		  
//		  5. Faça um programa que converta metros para centímetros.
//		  Scanner sc = new Scanner (System.in);
//		  
//		  System.out.println("CONVERSOR DE MTs PARA CMs");
//		  System.out.println("Informe um valor em metros: ");
//		  
//		  double metros = sc.nextDouble();
//		  
//		  System.out.println("Valor em metros: " + metros);
//		  System.out.println("Valor em centímetros: " + (metros * 100));
		  
		  
		 
//		6 . Faça um programaque peça o raio de um círculo, calculo e mostre sua área.
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Informe um raio de um círculo para calcular a área.");
//		
//		double raio, area;
//		final double PI = 3.1415; 
//		
//		raio = sc.nextDouble();
//		area = PI*(Math.pow(raio, 2));
//		
//		System.out.println("A área do circulo é: " + area);
		
		
		
//		7. Faça um programa que calcule a área de uma quadrado , em seguida mostre o dobro desta área para o utilizador.
		
//		Scanner sc = new Scanner (System.in);
//		
//		double area, lado1, lado2;
//		
//		System.out.println("CALCULO DA AREA DE UM QUADRADO");
//		System.out.println("Informe o valor do primeiro lado do quadrado:");
//		lado1 = sc.nextDouble();
//		
//		System.out.println("Informe o valor do segundo lado do quadrado:");
//		lado2 = sc.nextDouble();
//		
//		area = lado1*lado2;
//		
//		System.out.println("O valor da área do quadrado é :" + area);
//		System.out.println("O valor do dobro da área deste quadrado é :" + (area*2));

		
//		8. Faça um prgrama que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
		
//		Scanner sc = new Scanner (System.in);
//		
//		System.out.println("CALCULO DE SALARIO MENSAL SIMPLIFICADO");
//		
//		System.out.println("Informe o valor pago por hora: ");
//		double valorHora = sc.nextDouble();
//		
//		System.out.println("Informe o total de horas trabalhadas no mês corrente:");
//		double totalHorasTrabalhadasMes = sc.nextDouble();
//		
//		System.out.println("Salário mensal bruto: " + (valorHora * totalHorasTrabalhadasMes));
//		;
		
		
	
//		9. Faça um programa que peça a temperatura em graus Celsius, transforme e mostre em Graus Farenheit.
		
//		Scanner sc = new Scanner(System.in);
//		
//		//FORMULA: C = (5 * (F-32 / 9)
//		
//		System.out.println("CONVERSOR DE FARENHEIT PARA CELSIUS\n");
//		
//		System.out.println("Informe o valor em graus FARENHEIT: ");
//		
//		double grausFarenheit = sc.nextDouble();
//		
//		double grausCelsius = (5 *(grausFarenheit-32) / 9);
//		
//		System.out.println("O valor convertido de graus FARENHEIT para graus CELSIUS: " + grausCelsius);
//		
//		
		
		
//		10. Faça um programa que peça a temperatura em graus Celsius e tranforme em graus Farenheit.
		
//		Scanner sc = new Scanner(System.in);
//		
//		//FORMULA F = °C × 1, 8 + 32
//		
//		System.out.println("CONVERSOR DE CELSIUS PARA FARENHEIT\n");
//		
//		System.out.println("Informe o valor em graus CELSIUS: ");
//		
//		double grausCelsius = sc.nextDouble();
//		
//		double grausFarenheit = (grausCelsius * 1.8) + 32;
//		
//		System.out.println("O valor convertido de graus Celsius para graus Farenheit é: " + grausFarenheit);

		
	
		
//		11. Faça um programa que peça dois números inteiros e um número real. Calcule e mostre:
//		 a. O produto do dobro do primeiro com metade do segundo
//		 b. A soma do triplo do primeiro com o terceiro.
//		 c. O terceiro elevado ao cubo
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int numero1, numero2;
//		double numeroReal;
//		
//		System.out.println("Informe um primeiro valor inteiro: ");
//		
//		numero1 = sc.nextInt();
//		
//		System.out.println("Informe um segundo valor inteiro: ");
//		
//		numero2 = sc.nextInt();
//
//		System.out.println("Informe um valor de número do grupo dos Reais: ");
//		
//		numeroReal = sc.nextDouble();
//		
//		
//		System.out.println(((numero1*2) * (numero2/2)));
//		System.out.println((numero1*3)+(numeroReal));
//		System.out.println((Math.pow(numeroReal, 3)));



//		12. Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte formula: (72.7*altura)-58
		
//		Scanner sc = new Scanner(System.in);
//		
//		double altura, peso;
//		
//		System.out.println("CALCULO DE PESO IDEAL\n");
//		
//		System.out.println("Informe a sua altura em Mts");
//		altura = sc.nextDouble();
//		
//		peso =  (72.7* altura) - 58;
//		
//		System.out.println("Seu peso ideal para a altura de " + altura + " é de :" + peso);
		
		
		
		
//		13. Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
//		 Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o IRS, 8% para a SS e 5% para sindicato.
//		 Informe: 
//		 a. Salário bruto
//		 b. quanto pagou a SS
//		 c. quanto pagou ao sindicato
//		 d. O salário líquido
//		 e. Calcule os decontos e o salário líquido conforme a tabela abaixo:
//		 Salário líquido = Salário Bruto - IRS (11%) - SS(8%) - Sindicado(5%)
		
//		Scanner sc = new Scanner(System.in);
//		
//		double valorGanhoHora, salarioBruto, salarioliquido, deducaoIRS, deducaoSS, deducaoSindicato;
//		int horasTrabalhadas;
//		
//		System.out.println("CALCULO DE SALÁRIO\n");
//		
//		System.out.println("Informe o valor ganho por hora: ");
//		valorGanhoHora = sc.nextDouble();
//		
//		System.out.println("Informe o total de horas trabalhadas no mês: ");
//		horasTrabalhadas = sc.nextInt();
//		
//		salarioBruto = valorGanhoHora * horasTrabalhadas;
//		
//		deducaoIRS = salarioBruto * 0.11;
//		deducaoSS = salarioBruto * 0.08;
//		deducaoSindicato = salarioBruto * 0.05;
//		
//		salarioliquido = salarioBruto - (deducaoIRS + deducaoSS + deducaoSindicato);
//		
//		System.out.println("Valor do Salario Bruto: €" + salarioBruto);
//		System.out.println("Valor deduzido para o IRS: €" + deducaoIRS);
//		System.out.println("Valor deduzido para a Segurança Social: €" + deducaoSS);
//		System.out.println("Valor deduzido para o Sindicato: €" + deducaoSindicato);
//		System.out.println("Valor do Salário Líquido: €" + salarioliquido);
		
		
		
//		14. Faça um programa que peça o tamanho de um ficheiro para download (em MB) e a velocidade de um link de internet(Mbps), 
//		 calcule e informe o tempo aproximado de download do ficheiro usando este link(em minutos)
		
//		Scanner sc = new Scanner(System.in);
//		
//		double tamanhoFicheiro, velocidadeLink, tempoDeDownload;
//		
//		System.out.println("Informe o tamanho do ficheiro que deseja descarregar (em MB): ");
//		
//		tamanhoFicheiro = (sc.nextDouble() * 8);
//		
//		System.out.println("Informe a velocidade do link de internet disponível para esta operação (em Mbps):");
//		
//		velocidadeLink = (sc.nextDouble() * 60);
//		
//		tempoDeDownload = (tamanhoFicheiro / velocidadeLink);
//		
//		System.out.println(tempoDeDownload);
		
		
	}

}
