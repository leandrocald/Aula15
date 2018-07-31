package com.leandrocald.cursojava.aula15;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		//voltar nesse quando estudar e aprender a colocar casas decimais.
		Scanner scan = new Scanner(System.in);
		System.out.println("#################################################################################");
		System.out.println("#################################################################################");
		System.out.println("			   Bem-vindo ao Hipermercado Tabajara");
		System.out.println("#################################################################################");
		System.out.println("#################################################################################");
		System.out.println("#############################   Promoção de Carne   #############################");
		System.out.println("#################################################################################");
		//nota-se que os valores não correspondem a realidade, pois levando maior quantidade se paga mais.
		System.out.println("			Até 5 Kg				Mais de 5 Kg");
		System.out.println("Filé Duplo		R$ 4,90 por kg 				R$ 5,90 por kg");
		System.out.println("Alcatra			R$ 5,90 por kg 				R$ 6,80 por kg");
		System.out.println("Picanha			R$ 6,90 por kg 				R$ 7,80 por kg");
		System.out.println("#################################################################################");
		System.out.println("#################################################################################");
		
		double valorF = 0;
		double valorA = 0;
		double valorP = 0;
		String tipoFinal="-";
		double valorFinal=0;
		double descontoFinal = 0;
		String tipoPagamento = "-";
		System.out.println("Compra no Cartão Tabajara (S) ou (N): ");
		String cartao1 = scan.nextLine();
		String cartao = cartao1.toUpperCase();
		
		System.out.println("Quantos kilos? ");
		double kilo = scan.nextDouble();
		
		//AQUI O PROBLEMA:
		System.out.println("Qual tipo de carne deseja Filé Duplo (F), Alcatra (A) ou Picanha (P)");
		String TIPO = scan.nextLine();
		System.out.println("Qual tipo de carne deseja Filé Duplo (F), Alcatra (A) ou Picanha (P)");
		String tipo1 = scan.nextLine();
		String tipo = tipo1.toUpperCase();
		//AQUI O PROBLEMA
		
		
		switch (tipo) {
		case "F": 
			String tipoF = "Filé D.";
			tipoFinal=tipoF;
			if (kilo>5) {
				valorF=kilo*5.9;
				
		switch (cartao) {
		case "S":descontoFinal =valorF*0.10; valorF=(valorF)-(descontoFinal) ;  valorFinal=valorF; tipoPagamento = "Cartão Tabajara"; ;break;
		case "N": valorFinal=valorF ; descontoFinal=0; tipoPagamento = "Dinheiro";break;
		default:System.out.println("Inválido "); 
		};break;
			}else {
				valorF=kilo*4.9;
				switch (cartao) {
				case "S":descontoFinal= valorF*0.10;  valorFinal=(valorF)-(descontoFinal) ;valorFinal=valorF; tipoPagamento = "Cartão Tabajara";break;
				case "N":valorFinal=valorF ; descontoFinal =0;tipoPagamento = "Dinheiro";break;
				default:System.out.println("Inválido "); 
				}
			};break;			
		case "A": 
			String tipoA = "Alcatra";
			tipoFinal=tipoA;
			if (kilo>5) {
				valorA=kilo*6.8;
				
		switch (cartao) {
		case "S":descontoFinal =valorA*0.10; valorA=(valorA)-(descontoFinal) ;  valorFinal=valorA ;tipoPagamento = "Cartão Tabajara";break;
		case "N": valorFinal=valorA ; descontoFinal=0;tipoPagamento = "Dinheiro";break;
		default:System.out.println("Inválido "); 
		};break;
			}else {
				valorA=kilo*5.9;
				switch (cartao) {
				case "S":descontoFinal= valorA*0.10;  valorFinal=(valorA)-(descontoFinal) ;valorFinal=valorA; tipoPagamento = "Cartão Tabajara";break;
				case "N":valorFinal=valorA ; descontoFinal =0;tipoPagamento = "Dinheiro";break;
				default:System.out.println("Inválido "); 
				}
			};break;	
		case "P": 
			String tipoP = "Picanha";
			tipoFinal=tipoP;
			if (kilo>5) {
				valorP=kilo*7.8;
				
		switch (cartao) {
		case "S":descontoFinal =valorP*0.10; valorP=(valorP)-(descontoFinal) ;  valorFinal=valorP ;tipoPagamento = "Cartão Tabajara";break;
		case "N": valorFinal=valorP ; descontoFinal=0;tipoPagamento = "Dinheiro";break;
		default:System.out.println("Inválido "); 
		};break;
			}else {
				valorP=kilo*6.9;
				switch (cartao) {
				case "S":descontoFinal= valorP*0.10;  valorFinal=(valorP)-(descontoFinal) ;valorFinal=valorP;tipoPagamento = "Cartão Tabajara"; break;
				case "N":valorFinal=valorP ; descontoFinal =0;tipoPagamento = "Dinheiro";break;
				default:System.out.println("Inválido "); 
				}
			};break;			
		default: System.out.println("Final Inválido");	
		}
		
		System.out.println("################################# ############ ####################################");
		System.out.println("################################# ############ ####################################");
		System.out.println("################################# Cupom Fiscal ####################################");
		System.out.println("################################# ############ ####################################");
		System.out.println("################################# ############ ####################################");
		System.out.println("Pagamento em:  "+tipoPagamento);
		System.out.println("Tipo				Peso (Kg)		Desconto 		R$ ");
		System.out.println(tipoFinal+"				"+kilo+ "			"+descontoFinal+"			"+valorFinal);
		
		
	}
}
