package com.keven.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double valorHora, salarioBruto;
		int horasTrabalhadas;
		
		System.out.print("Insira o valor da hora: ");
		valorHora = scan.nextDouble();
		
		System.out.print("Insira as horas trabalhadas: ");
		horasTrabalhadas = scan.nextInt();
		
		salarioBruto = valorHora * horasTrabalhadas;
		
		
		int percentualIR = 0;
		
		if(salarioBruto <= 900) {
			
			percentualIR = 0;
			
		} else if(salarioBruto > 900 && salarioBruto <= 1500) {
			
			percentualIR = 5;
			
		} else if(salarioBruto > 1500 && salarioBruto <= 2500) {
			
			percentualIR = 10;
			
		} else if(salarioBruto > 2500) {
			
			percentualIR = 20;
		}
		
		
		double ir = (salarioBruto/100) * percentualIR;		
		double inss = (salarioBruto/100) * 10;	
		double fgts = (salarioBruto/100) * 11;
		double totalDescontos = inss + ir;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		//double sindicato = salarioBruto * 0.05;
		
		
				
		System.out.println("Salário Bruto: (" +  valorHora + " * " + horasTrabalhadas + ") : " + salarioBruto);
		System.out.println("(-) IR (" + percentualIR + "%) : " + ir);
		System.out.println("(-) INSS (10%) : " + inss);
		System.out.println("FGTS (11%) : " + fgts);
		System.out.println("Total de descontos : " + totalDescontos);
		System.out.println("Salario líquido : " + salarioLiquido);
		
		


	}

}
