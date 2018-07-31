package com.leandrocald.cursojava.aula15;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número");
		
		double num1 = scan.nextDouble();
		System.out.println("Digite mais um número");
		
		double num2 = scan.nextDouble();
		System.out.println("Qual operação deseja realizar: Adição(A), Subitração(S), Multiplicação (M) ou Divisão (D)");
		//coloquei duas Strings seguidas e o programa funcionou.  
		//mas não consegui consertar. Quem puder:
		//é um bug?
		
		String letra = scan.nextLine();	
		
		String operacao = scan.nextLine();
		String op1 = operacao.toUpperCase();
		double n1;
		
		switch (op1) {
		case "A": 
		n1 =num1+num2;
			if (n1>0) {
				System.out.println("O Número será Positivo");
			}else if (n1==0) {
				System.out.println("O Número é ZERO");
			}else { 
				System.out.println("O Número será Negativo");
			}
			if (n1%2==0) {
				System.out.println("O Número é PAR");
			}else if (n1%1==0&&n1%2!=0) {
				System.out.println("O Número é ÍMPAR");
			}else {
				System.out.println("O Número é Fracionado");
			}
			System.out.println("O resultado da operação é: "+n1);break;
		case "S": 
			n1 =num1-num2;
				if (n1>0) {
					System.out.println("O Número será Positivo");
				}else if (n1==0) {
					System.out.println("O Número é ZERO");
				}else { 
					System.out.println("O Número será Negativo");
				}
				if (n1%2==0) {
					System.out.println("O Número é PAR");
				}else if (n1%1==0&&n1%2!=0) {
					System.out.println("O Número é ÍMPAR");
				}else {
					System.out.println("O Número é Fracionado");
				}
				System.out.println("O resultado da operação é: "+n1);break;
		case "M": 
			n1 =num1*num2;
				if (n1>0) {
					System.out.println("O Número será Positivo");
				}else if (n1==0) {
					System.out.println("O Número é ZERO");
				}else { 
					System.out.println("O Número será Negativo");
				}
				if (n1%2==0) {
					System.out.println("O Número é PAR");
				}else if (n1%1==0&&n1%2!=0) {
					System.out.println("O Número é ÍMPAR");
				}else {
					System.out.println("O Número é Fracionado");
				}
				System.out.println("O resultado da operação é: "+n1);break;
		case "D": 
			n1 =num1/num2;
				if (n1>0) {
					System.out.println("O Número será Positivo");
				}else if (n1==0) {
					System.out.println("O Número é ZERO");
				}else { 
					System.out.println("O Número será Negativo");
				}
				if (n1%2==0) {
					System.out.println("O Número é PAR");
				}else if (n1%1==0&&n1%2!=0) {
					System.out.println("O Número é ÍMPAR");
				}else {
					System.out.println("O Número é Fracionado");
				}
				System.out.println("O resultado da operação é: "+n1);break;
			default:System.out.println("Operação inválida "); ;	
				
				
		}
		

		
	}

}
