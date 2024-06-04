package main;

import java.util.Scanner;

public class Exercicio8_3 {
	/*3)	Elabore um algoritmo em Java, que leia o Salário Bruto, o Adicional Noturno, as Horas Extras e 
	 * 		os Descontos de um Colaborador, em variáveis do tipo float e exiba na tela o Salário Líquido. */
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horasExtras,descontos, salarioLiquido;
		String colaborador;
		
		System.out.print("Informe o nome do(a) colaborador(a): ");
		colaborador = entrada.next();
		System.out.printf("Informe o salario do(a) colaborador(a) %s : ", colaborador);
		salarioBruto = entrada.nextFloat();
		System.out.printf("Informe o adicional noturno do(a) colaborador(a) %s : ", colaborador);
		adicionalNoturno = entrada.nextFloat();
		System.out.printf("Informe as horas extras do(a) colaborador(a) %s : ", colaborador);
		horasExtras = entrada.nextFloat();
		System.out.printf("Informe os descontos do(a) colaborador(a) %s : ", colaborador);
		descontos = entrada.nextFloat();
	
		salarioLiquido = salarioBruto + adicionalNoturno +(horasExtras * 5) - descontos ;
		System.out.println();
		System.out.printf("O salario liquido do(a) colaborador(a) %s e: %.2f", colaborador, salarioLiquido);
		
		entrada.close();
	}

}
