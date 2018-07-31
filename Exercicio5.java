package com.leandrocald.cursojava.aula15;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a 1° nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a 2° nota: ");
		double nota2 = scan.nextDouble();
		
		if ((nota1+nota2)/2==10) {
			System.out.print("Aprovado com Distinção");	
		}else if ((nota1+nota2)/2>=7) {
			System.out.println("Aprovado");	
		}else {
			System.out.println("Reprovado");	
		}
		
	}

}
