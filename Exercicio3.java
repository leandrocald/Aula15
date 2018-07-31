package com.leandrocald.cursojava.aula15;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite o sexo (M) ou (F) ");
		
		//no JAVA o String é imutável, logo deve ser criado uma nova String recebendo o toupperCase --> String s = s1.toUpperCase();
		
		String s1 = scan.next();
	
		String s = s1.toUpperCase();
		switch (s) {
		
		case "F": System.out.println("O Sexo digitado foi Feminino ");break; 
		case "M": System.out.println("O Sexo digitado foi Masculino ");break;
		default:  System.out.println("Inválido! Digite apenas (F) ou (M) ");
		
		 }
		
	}

	private static void toUpperCase(String sexo) {
		// TODO Auto-generated method stub
		
	}

}
