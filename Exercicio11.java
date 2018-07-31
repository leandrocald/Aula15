package com.leandrocald.cursojava.aula15;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seu Salário: ");
		double s = scan.nextDouble();
		
		if (s<=280) {
			System.out.println("Seu Salário Antes era:  " +(s));
			System.out.println("O Reajuste de 20 % Corresponde a : " +(s*0.2));
			System.out.println("Seu Novo Salário é : " +(s+(s*0.2)));
		}else if (s>280&&s<=700) {
			System.out.println("Seu Salário Antes era:  " +(s));
			System.out.println("O Reajuste de 15 % Corresponde a : " +(s*0.15));
			System.out.println("Seu Novo Salário é : " +(s+(s*0.15)));
		}else if (s>700&&s<=1500) {
			System.out.println("Seu Salário Antes era:  " +(s));
			System.out.println("O Reajuste de 10 % Corresponde a : " +(s*0.1));
			System.out.println("Seu Novo Salário é : " +(s+(s*0.1)));
		}else if (s>1500) {
			System.out.println("Seu Salário Antes era:  " +(s));
			System.out.println("O Reajuste de 5 % Corresponde a : " +(s*0.05));
			System.out.println("Seu Novo Salário é : " +(s+(s*0.05)));
		}
	}
}
