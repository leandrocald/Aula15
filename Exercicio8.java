package com.leandrocald.cursojava.aula15;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite o preço de três Produtos: ");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		double n3 = scan.nextDouble();
	
		System.out.println(n1+", "+n2+", "+n3);
		
	
		if ((n2>=n3&&n3>n1)||(n2>=n3&&n3>n1)||(n1<n2&&n2<=n3)){
			System.out.println("Compre o Primeiro");	
		} else if ((n1>=n3&&n3>n2)||(n3>=n1&&n1>n2)||(n2<n1&&n1<=n3)){
			System.out.println("Compre o Segundo");	
		}  else if ((n1>=n2&&n2>n3)||(n2>=n1&&n1>n3)||(n3<n1&&n1<=n3)){
			System.out.println("Compre o Terceiro");	
		}
		
		else if (n1==n2&&n2>n3) {
			System.out.println("Compre o Terceiro");	
		}
		else if (n1==n2&&n2<n3){
			System.out.println("Compre o Primeiro ou Segundo");	
		}
		
		
		else if (n1==n3&&n1>n2){
			System.out.println("Compre o Segundo");	
		}
		else if (n1==n3&&n1<n2){
			System.out.println("Compre o primeiro ou o Terceiro");	
		}
		
		else if (n2==n3&&n2>n1){
			System.out.println("Compre o Primeiro");	
		}
		else if (n2==n3&&n2<n1){
			System.out.println("Compre o Segundo ou o Terceiro");	
		}	
		
		else {
			System.out.println("São todos iguais");
		}
		
		
		
	}

}
