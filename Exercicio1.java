package com.leandrocald.cursojava.aula15;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		double number1 = scan.nextDouble();
		
		System.out.println("Entre com outro número: ");
		double number2 = scan.nextDouble();
		
		if (number1>number2) {
			System.out.println("O número: "+ number1 +" é maior do que o número "+ number2);
			} else if (number2>number1) {
				System.out.println("O número: "+ number2 +" é maior do que o número "+ number1);
			}else {
				System.out.println("Os números são iguais: "+ number2 );
				}
		
	}

}
