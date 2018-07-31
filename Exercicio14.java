package com.leandrocald.cursojava.aula15;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a 1ª NOTA: ");
		double nota1 = scan.nextDouble();
		System.out.println("Digite a 2ª NOTA: ");
		double nota2 = scan.nextDouble();
		double notaf = ((nota1+nota2)/2);
		System.out.println("1ª NOTA: 		"+nota1);
		System.out.println("2ª NOTA: 		"+nota2);
		System.out.println("Média:	 		"+notaf);
		
		if (notaf>=9&&notaf<=10) {
			System.out.println("Aprovado - Conceito: 	A");	
		}else if (notaf>=7.5&&notaf<9) {
			System.out.println("Aprovado - Conceito: 	B");	
		}else if (notaf>=6&&notaf<7.5) {
			System.out.println("Aprovado - Conceito: 	C");	
		}else if (notaf>=4&&notaf<6) {
			System.out.println("Reprovado - Conceito: 	D");	
		}else if (notaf>=0&&notaf<4) {
			System.out.println("Reprovado - Conceito: 	E");	
		}
		
	}

}
