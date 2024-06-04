package main;

import java.util.Scanner;

public class Exercicio8_1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float salario, abono, novoSalario;
	
		System.out.print("Informe o valor do salario R$: ");
		salario = entrada.nextFloat();
		System.out.print("Informe o valor do abono R$: ");
		abono = entrada.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("O novo salario e R$ %.2f" , novoSalario);
		
		
		entrada.close();
		
	}

}
