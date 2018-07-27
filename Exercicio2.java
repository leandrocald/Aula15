package com.leandrocald.cursojava.aula15;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Entre com um valor: ");
		double valor = scan.nextDouble();
		if (valor<0) {
			System.out.println("O valor digitado é negativo");	
		} else if (valor==0){
			System.out.println("O valor digitado é ZERO");
		} else {
			System.out.println("O valor digitado é Positivo");
		}
		

	}
}
