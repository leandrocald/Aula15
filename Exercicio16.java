package com.leandrocald.cursojava.aula15;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Digite o valor de A ");
		double a = scan.nextDouble();
		if (a==0) {   
			System.out.println(" Não é uma equação do 2º Grau ");
			
		}else {System.out.println(" Digite o valor de B ");
			double b = scan.nextDouble();
			System.out.println(" Digite o valor de C ");
			double c = scan.nextDouble();
			
			double delta =  ( (b*b) -(4*a*c ));
			double x1;
			double x2;
				if (delta<0) {
				System.out.println("A equação não possui raizes Reais. ");
			}else if (delta==0) {
				System.out.println(" A equação só tem uma raiz Real ");
				x1 = (((-1*(b))+ (Math.sqrt(delta)))/2*a);
				System.out.println(" O Valor de X1: "+x1);
			}else {
				System.out.println(" A equação possui duas raízes Reais: ");
				x1 = (((-1*(b))+ (Math.sqrt(delta)))/2*a);
				x2 = (((-1*(b))- (Math.sqrt(delta)))/2*a);
				System.out.println(" O Valor de X1: "+x1);
				System.out.println(" O Valor de X2: "+x2 );
			}	
		}
		
	}
}
