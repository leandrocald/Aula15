package com.leandrocald.cursojava.aula15;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite tr�s n�meros: ");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		double n3 = scan.nextDouble();
	
		System.out.println(n1+", "+n2+", "+n3);
		
		
		if ((n1>n2&&n2>n3)&&(n1!=n2&&n1!=n3&&n3!=n2)) {
			System.out.println("A ordem decrescente � "+ n1 +" / " + n2 +" / "+ n3);	
		}else if ((n1>n2&&n3>n2)&&(n1!=n2&&n1!=n3&&n3!=n2)) {
			System.out.println("A ordem decrescente �  "+ n1 +" / " + n3 +" / "+ n2);	
		}else if ((n2>n1&&n1>n3)&&(n1!=n2&&n1!=n3&&n3!=n2)) {
			System.out.println("A ordem decrescente � "+ n2 +" / " + n1 +" / "+ n3);	
		}else if ((n2>n1&&n3>n1)&&(n1!=n2&&n1!=n3&&n3!=n2)) {
			System.out.println("A ordem decrescente � "+ n2 +" / " + n3 +" / "+ n1);	
		}else if (n3>n1&&n1>n2) {
			System.out.println("A ordem decrescente � "+ n3 +" / " + n1 +" / "+ n2);	
		}else if (n3>n2&&n2>n1) {
			System.out.println("A ordem decrescente � "+ n3 +" / " + n2 +" / "+ n1);	
		}else if (n3==n2&&n2==n1) {
			System.out.println("Os tr�s s�o iguais "+ n3 +" / " + n2 +" / "+ n1);	
		}else if (n1==n2&&n2>n3){
			System.out.println("Os dois primeiros s�o iguais e a ordem decrescente � "+ n1 +" / " + n2 +" / "+ n3);	
		}else if (n1==n2&&n2<n3){
			System.out.println("Os dois primeiros s�o iguais e a ordem decrescente � "+ n3 +" / " + n2 +" / "+ n1);	
		}else if (n1==n3&&n3>n2){
			System.out.println("O primeiro e �ltimos s�o iguais e a ordem decrescente � "+ n1 +" / " + n3 +" / "+ n2);	
		}else if (n1==n3&&n3<n2){
			System.out.println("O primeiro e �ltimos s�o iguais e a ordem decrescente � "+ n2 +" / " + n3 +" / "+ n1);	
		}else if (n2==n3&&n3>n1){
			System.out.println("Os dois �ltimos s�o iguais e a ordem decrescente � "+ n2 +" / " + n3 +" / "+ n1);	
		}else if (n2==n3&&n3<n1){
			System.out.println("Os dois �ltimos s�o iguais e a ordem decrescente � "+ n1 +" / " + n2 +" / "+ n3);	
		}else{
			System.out.println(" Erro 500 ");
		}
	}
}
