package com.keven.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double valorHora, salarioBruto;
		int horasTrabalhadas;
		
		System.out.print("Insira o valor da hora: ");
		valorHora = scan.nextDouble();
		
		System.out.print("Insira as horas trabalhadas: ");
		horasTrabalhadas = scan.nextInt();
		
		salarioBruto = valorHora * horasTrabalhadas;
		double inss = salarioBruto * 0.08;
		double sindicato = salarioBruto * 0.05;
		double impostoRenda = salarioBruto * 0.11;
		double totalDescontos = inss + sindicato + impostoRenda;
		
		double salarioLiquido = salarioBruto - totalDescontos;
		
		
		
		System.out.print("O seu salário bruto este mês é de " + salarioBruto + "€.");
		System.out.print("Pagou " + inss + "€ de INSS");
		System.out.print("Pagou " + sindicato + "€ de sindicato");
		System.out.print("Pagou " + impostoRenda + "€ de Imposto de Renda");
		System.out.print("No total pagou " + totalDescontos + "€ de descontos");
		System.out.print("O seu salário liquido este mês é de " + salarioLiquido + "€");

	}

}
