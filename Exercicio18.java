package com.leandrocald.cursojava.aula15;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um n�mero Inteiro");
				
		int num1 = scan.nextInt();
		
		if (num1%2==0) {
			System.out.println("� PAR");
		}else{
			System.out.println("� �MPAR");
		}
		
		
		
	}

}
