package com.leandrocald.cursojava.aula15;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Em que turno estuda: Matutito (M), Vespertino (V) ou Noturno (N) ");
		
		String turno = scan.nextLine();
		String turno1 = turno.toUpperCase();
		
		switch (turno1) {
		case "M": System.out.println("Bom dia! ");break;
		case "V": System.out.println("Boa Tarde! ");break;
		case "N": System.out.println("Boa Noite! ");break;
		default: System.out.println("Valor inválido");
		}
	}

}
