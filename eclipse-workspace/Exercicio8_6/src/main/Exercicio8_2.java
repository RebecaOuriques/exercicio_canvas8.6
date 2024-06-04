package main;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8_2 {
	
	/*2)	Elabore um algoritmo em Java que leia 4 notas de um participante, em variáveis do tipo float
	 * 		 e exiba na tela a média final do participante. Veja o exemplo abaixo: */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
			float n1, n2, n3, n4, nFinal;
			String nome;
			
			System.out.print("Informe o nome do(a) aluno(a): ");
			nome = entrada.next();
			System.out.printf("Informe a primeira nota do(a) aluno(a) %s: " , nome);
			n1 = entrada.nextFloat();
			System.out.printf("Informe a primeira nota do(a) aluno(a) %s: " , nome);
			n2 = entrada.nextFloat();
			System.out.printf("Informe a primeira nota do(a) aluno(a) %s: " , nome);
			n3 = entrada.nextFloat();
			System.out.printf("Informe a primeira nota do(a) aluno(a) %s: " , nome);
			n4 = entrada.nextFloat();
			
			nFinal = (n1 + n2 + n3 + n4) / 4;
			
			System.out.printf("\nA media do(a) aluno(a)%s e: %.1f" , nome , nFinal);
			
			
		entrada.close();
		
		
	}

}
