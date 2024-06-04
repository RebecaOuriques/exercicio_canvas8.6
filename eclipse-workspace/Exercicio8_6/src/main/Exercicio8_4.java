package main;

import java.util.Scanner;

public class Exercicio8_4 {
	/* 4)	Leia quatro valores float (n1, n2, n3, n4).
	 * 	 A seguir, calcule e mostre a diferença do produto entre o n1 e n2 pelo produto entre o n3 e o n4. */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float n1,n2,n3,n4,dif;
		
		System.out.print("Informe o primeiro valor: ");
		n1 = entrada.nextFloat();
		System.out.print("Informe o primeiro valor: ");
		n2 = entrada.nextFloat();
		System.out.print("Informe o primeiro valor: ");
		n3 = entrada.nextFloat();
		System.out.print("Informe o primeiro valor: ");
		n4 = entrada.nextFloat();
		 dif = (n1 * n2)-(n3 * n4);
		
		 System.out.println();
		System.out.println("A diferenca e: " + dif);
		entrada.close();
	}

}
