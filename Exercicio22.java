package com.leandrocald.cursojava.aula15;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Deseja Comprar Morango (S) ou (N):");
		String frutaMorango = scan.nextLine();
		String fruta1=frutaMorango.toUpperCase();
		System.out.println("Deseja Comprar Maçã (S) ou (N):");
		String frutaMaca = scan.nextLine();
		String fruta2=frutaMaca.toUpperCase();
		double kilo1=0;
		double kilo2=0;
		double valor1=0;
		double valor2=0;
		switch ( fruta1 ) {
		case "S": System.out.println("Quantos kilos de Morango ?");
		kilo1 = scan.nextDouble();
		if (kilo1>5) {
			valor1 = kilo1*1.5;
		}	else {
			valor1 = kilo1*1.8;
		};break;
		case "N": kilo1=0;valor1=0;break;
		default: System.out.println("Inválido!!!"); 
		} 
		switch ( fruta2 ) {
		case "S": System.out.println("Quantos kilos de Maçã ?");
		kilo2 = scan.nextDouble();
		if (kilo2>5) {
			valor2 = kilo2*2.2;
		}	else {
			valor2 = kilo2*2.5;
		};break;
		case "N": kilo2=0;valor2=0;break;
		default: System.out.println("Inválido!!!"); 
		} 
		double kiloTotal=kilo1+kilo2;
		double valorTotal=valor1+valor2;
		if (kiloTotal>8 ||valorTotal>25) {
			System.out.println(" O Valor total com desconto será: "+ ((valorTotal)-(valorTotal*0.10)));
		}else {
			System.out.println(" O Valor total será: "+valorTotal);
		}
	}
}
