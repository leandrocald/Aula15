package com.leandrocald.cursojava.aula15;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite tr�s N�meros: ");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		double num3 = scan.nextDouble();
		
		if ((num1+num2)>num3) {
			System.out.println("Forma um tri�ngulo: ");	
		}else if ((num1+num3)>num2) {
			System.out.println("Forma um tri�ngulo: ");	
		}else if ((num2+num3)>num1) {
			System.out.println("Forma um tri�ngulo: ");	
		}
		
		if ((num1==num2)||(num1==num3)||( num3==num2)) {
			System.out.println("Is�sceles ");	
		}else if (num1==num2&&num1==num3) {
			System.out.println("Equil�tero ");
		}else {
			System.out.println("Escaleno ");
		}
	}
}
