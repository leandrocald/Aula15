package com.leandrocald.cursojava.aula15;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero: ");
		double number1 = scan.nextDouble();
		
		System.out.println("Entre com outro n�mero: ");
		double number2 = scan.nextDouble();
		
		if (number1>number2) {
			System.out.println("O n�mero: "+ number1 +" � maior do que o n�mero "+ number2);
			} else if (number2>number1) {
				System.out.println("O n�mero: "+ number2 +" � maior do que o n�mero "+ number1);
			}else {
				System.out.println("Os n�meros s�o iguais: "+ number2 );
				}
		
	}

}
