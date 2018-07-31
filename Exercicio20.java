package com.leandrocald.cursojava.aula15;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Telefonou para Vítima S ou N");
		String pergunta1 = scan.nextLine();
		System.out.println(" Esteve no local do Crime S ou N");
		String pergunta2 = scan.nextLine();
		System.out.println(" Mora perto da Vítima S ou N");
		String pergunta3 = scan.nextLine();
		System.out.println(" Devia a Vítima S ou N");
		String pergunta4 = scan.nextLine();
		System.out.println(" Já trabalhou com a Vítima S ou N");
		String pergunta5 = scan.nextLine();
		String perg1 =pergunta1.toUpperCase();
		String perg2 =pergunta2.toUpperCase();
		String perg3 =pergunta3.toUpperCase();
		String perg4 =pergunta4.toUpperCase();
		String perg5 =pergunta5.toUpperCase();
		int totalResp=0;
		
		switch (perg1) {
		case "S":	totalResp =totalResp + 1;break;
		default: totalResp = totalResp;
		}
		switch (perg2) {
		case "S":	totalResp =totalResp + 1;break;
		default: totalResp = totalResp;
		}
		switch (perg3) {
		case "S":	totalResp =totalResp + 1;break;
		default: totalResp = totalResp;
		}
		switch (perg4) {
		case "S":	totalResp =totalResp + 1;break;
		default: totalResp = totalResp;
		}
		switch (perg5) {
		case "S":	totalResp =totalResp + 1;break;
		default: totalResp = totalResp;
		}
		
		if (totalResp==0) {
			System.out.println(" Inocente");	
		}else if (totalResp==1||totalResp==2) {
			System.out.println(" Pessoa Suspeita");	
		}else if (totalResp==3||totalResp==4) {
			System.out.println(" Cumplice");	
		}else if (totalResp==5) {
			System.out.println(" Assassina");	
		}
	}
}
