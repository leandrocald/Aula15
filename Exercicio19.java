package com.leandrocald.cursojava.aula15;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um n�mero");
		
		double num1 = scan.nextDouble();
		System.out.println("Digite mais um n�mero");
		
		double num2 = scan.nextDouble();
		System.out.println("Qual opera��o deseja realizar: Adi��o(A), Subitra��o(S), Multiplica��o (M) ou Divis�o (D)");
		//coloquei duas Strings seguidas e o programa funcionou.  
		//mas n�o consegui consertar. Quem puder:
		//� um bug?
		
		String letra = scan.nextLine();	
		
		String operacao = scan.nextLine();
		String op1 = operacao.toUpperCase();
		double n1;
		
		switch (op1) {
		case "A": 
		n1 =num1+num2;
			if (n1>0) {
				System.out.println("O N�mero ser� Positivo");
			}else if (n1==0) {
				System.out.println("O N�mero � ZERO");
			}else { 
				System.out.println("O N�mero ser� Negativo");
			}
			if (n1%2==0) {
				System.out.println("O N�mero � PAR");
			}else if (n1%1==0&&n1%2!=0) {
				System.out.println("O N�mero � �MPAR");
			}else {
				System.out.println("O N�mero � Fracionado");
			}
			System.out.println("O resultado da opera��o �: "+n1);break;
		case "S": 
			n1 =num1-num2;
				if (n1>0) {
					System.out.println("O N�mero ser� Positivo");
				}else if (n1==0) {
					System.out.println("O N�mero � ZERO");
				}else { 
					System.out.println("O N�mero ser� Negativo");
				}
				if (n1%2==0) {
					System.out.println("O N�mero � PAR");
				}else if (n1%1==0&&n1%2!=0) {
					System.out.println("O N�mero � �MPAR");
				}else {
					System.out.println("O N�mero � Fracionado");
				}
				System.out.println("O resultado da opera��o �: "+n1);break;
		case "M": 
			n1 =num1*num2;
				if (n1>0) {
					System.out.println("O N�mero ser� Positivo");
				}else if (n1==0) {
					System.out.println("O N�mero � ZERO");
				}else { 
					System.out.println("O N�mero ser� Negativo");
				}
				if (n1%2==0) {
					System.out.println("O N�mero � PAR");
				}else if (n1%1==0&&n1%2!=0) {
					System.out.println("O N�mero � �MPAR");
				}else {
					System.out.println("O N�mero � Fracionado");
				}
				System.out.println("O resultado da opera��o �: "+n1);break;
		case "D": 
			n1 =num1/num2;
				if (n1>0) {
					System.out.println("O N�mero ser� Positivo");
				}else if (n1==0) {
					System.out.println("O N�mero � ZERO");
				}else { 
					System.out.println("O N�mero ser� Negativo");
				}
				if (n1%2==0) {
					System.out.println("O N�mero � PAR");
				}else if (n1%1==0&&n1%2!=0) {
					System.out.println("O N�mero � �MPAR");
				}else {
					System.out.println("O N�mero � Fracionado");
				}
				System.out.println("O resultado da opera��o �: "+n1);break;
			default:System.out.println("Opera��o inv�lida "); ;	
				
				
		}
		

		
	}

}
