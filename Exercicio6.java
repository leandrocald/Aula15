package com.leandrocald.cursojava.aula15;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite três números: ");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		double n3 = scan.nextDouble();
	
		System.out.println(n1+", "+n2+", "+n3);
		
		if ((n1>n2&&n2>n3)||(n1>n3&&n3>n2)) {
			System.out.println("O Primeiro número "+n1+" é o maior");	
		}else if ((n2>n1&&n1>n3)||(n2>n3&&n3>n1)){
			System.out.println("O Segundo número "+n2+" é o maior");	
		}else if ((n3>n2&&n2>n1)||(n3>n1&&n1>n2)) {
			System.out.println("O Terceiro número "+n3+" é o maior");	
		}else if (n1==n2&&n2>n3) {
			System.out.println("O Primeiro e o Segundo São iguais e maiores que o Terceiro ");	
		}else if (n3==n2&&n2>n1) {
			System.out.println("O Segundo e o Terceiro São iguais e maiores que o Primeiro ");	
		}else if (n3==n1&&n1>n2) {
			System.out.println("O Primeiro e o Terceiro São iguais e maiores que o Segundo ");	
		}else if (n1==n2&&n2<n3) {
			System.out.println("O Primeiro e o Segundo São iguais e menores que o Terceiro ");	
		}else if (n3==n2&&n2<n1) {
			System.out.println("O Segundo e o Terceiro São iguais e menores que o Primeiro ");	
		}else if (n3==n1&&n1<n2) {
			System.out.println("O Primeiro e o Terceiro São iguais e menores que o Segundo ");	
		}
		else {
			System.out.println("OS NÚMEROS SÃO IGUAIS");	
		}
	}

}
