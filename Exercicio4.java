package com.leandrocald.cursojava.aula15;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		

		System.out.println("Digite uma Letra ");
		String letra = scan.nextLine();
		
		String letra1 = letra.toUpperCase();
		
		switch (letra1) {
		case "A": System.out.println("É uma VOGAL -->  "+letra1);break; 
		case "E": System.out.println("É uma VOGAL -->  "+letra1);break;
		case "I": System.out.println("É uma VOGAL -->  "+letra1);break;
		case "O": System.out.println("É uma VOGAL -->  "+letra1);break;
		case "U": System.out.println("É uma VOGAL -->  "+letra1);break;
		default: System.out.println("NÃO É VOGAL -->  "+letra1);
		}
		
	}

}
