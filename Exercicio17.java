package com.leandrocald.cursojava.aula15;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um ano: ");
		int ano = scan.nextInt();
		
		int r4=ano%4;
		int r100=ano%100;
		int r400=ano%400;

		if (r4==0||r400==0&&r100==0) {
			System.out.println("É um ano BISSEXTO");
		}else {
			System.out.println("NÃO É um ano BISSEXTO");
		}
	


	}

}
