package com.leandrocald.cursojava.aula15;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite tr�s n�meros: ");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		double n3 = scan.nextDouble();
	
		System.out.println(n1+", "+n2+", "+n3);
		
		if ((n1>n2&&n2>n3)||(n1>n3&&n3>n2)) {
			System.out.println("O Primeiro n�mero "+n1+" � o maior");	
		}else if ((n2>n1&&n1>n3)||(n2>n3&&n3>n1)){
			System.out.println("O Segundo n�mero "+n2+" � o maior");	
		}else if ((n3>n2&&n2>n1)||(n3>n1&&n1>n2)) {
			System.out.println("O Terceiro n�mero "+n3+" � o maior");	
		}else if (n1==n2&&n2>n3) {
			System.out.println("O Primeiro " +n1+ " e o Segundo " +n2 + " S�o iguais e maiores que o Terceiro " +n3);	
		}else if (n3==n2&&n2>n1) {
			System.out.println("O Segundo  " +n2+ " e o Terceiro  " +n3+ "  S�o iguais e maiores que o Primeiro  "+n1);	
		}else if (n3==n1&&n1>n2) {
			System.out.println("O Primeiro " +n1+  " e o Terceiro "  +n3+  " S�o iguais e maiores que o Segundo "  +n2 );	
		}else if (n1==n2&&n2<n3) {
			System.out.println("O Primeiro " +n1+  " e o Segundo " +n2+  " S�o iguais e menores que o Terceiro " +n3);	
		}else if (n3==n2&&n2<n1) {
			System.out.println("O Segundo "  +n2+  " e o Terceiro "  +n3+  " S�o iguais e menores que o Primeiro " +n1);	
		}else if (n3==n1&&n1<n2) {
			System.out.println("O Primeiro "  +n1+  " e o Terceiro "  +n3+  " S�o iguais e menores que o Segundo " +n2 );	
		}
		else {
			System.out.println("OS N�MEROS S�O IGUAIS");
		}
	}
}
