package com.keven.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double valorHora, salario;
		int horasTrabalhadas;
		
		System.out.print("Insira o valor da hora: ");
		valorHora = scan.nextDouble();
		
		System.out.print("Insira as horas trabalhadas: ");
		horasTrabalhadas = scan.nextInt();
		
		salario = valorHora * horasTrabalhadas;
		System.out.print("O seu salário este mês é " + salario);

	}

}
