package com.leandrocald.cursojava.aula15;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o combustível: Gasolina (G) ou Álcool (A):");
		String comb = scan.nextLine();
		String comb1=comb.toUpperCase();
		double desc;
		double valor;
		System.out.println("Quantos litros?");
		double litro = scan.nextDouble();
				
		switch (comb1) {
		case "A": 
		if (litro>20) {
			desc=litro*1.9*0.05;
			valor = (litro*1.9)-desc;
			System.out.println("O total de Desconto no Álcool foi: "+ desc);
			System.out.println("O total a ser pago: " + valor);break;
		}	else {
			desc=litro*1.9*0.03;
			valor = (litro*1.9)-desc;
			System.out.println("O total de Desconto no Álcool foi: "+ desc);
			System.out.println("O total a ser pago: " + valor);break;
		}
		
		case "G":
			if (litro>20) {
				desc=litro*1.9*0.06;
				valor = (litro*1.9)-desc;
				System.out.println("O total de Desconto no Álcool foi: "+ desc);
				System.out.println("O total a ser pago: " + valor);break;
			}	else {
				desc=litro*1.9*0.04;
				valor = (litro*1.9)-desc;
				System.out.println("O total de Desconto no Álcool foi: "+ desc);
				System.out.println("O total a ser pago: " + valor);break;
			}
		default: System.out.println("Inválido ");
		}
	}
}
