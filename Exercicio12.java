package com.leandrocald.cursojava.aula15;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o Valor da sua hora? ");
		double hora = scan.nextDouble();
		
		System.out.println("Quantas horas nesse mês ? ");
		double horaMes = scan.nextDouble();
		
		double s = (hora * horaMes); 
		System.out.println("####### Salário Bruto #######			: "+ (s) );
		if (s<=900) {
			System.out.println("Isento de IR");
		}else if (s>900&&s<=1500) {
			System.out.println("(-)	IR		5 %			: "+ (s*0.05)   );
		}else if (s>1500&&s<=2500) {
			System.out.println("(-)	IR		10 %			: "+ (s*0.1)   );
		}else if (s>2500) {
			System.out.println("(-)	IR		20 %			: "+ (s*0.2)   );
		}
		
		System.out.println("(-)	INSS		10 %			: "+ (s*0.1)   );
		System.out.println("(-)	SINDICATO	3 %			: "+ (s*0.03)   );
		System.out.println("(+)	FGTS					: "+ (s*0.11)   );
		
		//total de descontos
		if (s<=900) {
			System.out.println("Total de Desconto				: "+ (s*0.13)   );
		}else if (s>900&&s<=1500) {
			System.out.println("Total de Desconto				: "+ (s*0.18)   );
		}else if (s>1500&&s<=2500) {
			System.out.println("Total de Desconto				: "+ (s*0.23)   );
		}else if (s>2500) {
			System.out.println("Total de Desconto				: "+ (s*0.33)   );
		}
		System.out.println("Salário Líquido					: "+ ( s-(s*0.33)+(s*0.11)  )   );
		
		
	}

}
