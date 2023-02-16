package com.keven.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double salario;
		double salarioAjust = 0;
		double valorAumento = 0;
		int percentual = 0;
		
		System.out.print("Insira o seu salário: ");
		salario = scan.nextDouble();
		
		
		if(salario <= 280) {
			
			salarioAjust = salario * 1.2;
			percentual = 20;
			valorAumento = salario * 0.2;
			
		} else if(salario > 280 && salario < 700) {
			
			salarioAjust = salario * 1.15;
			percentual = 15;
			valorAumento = salario * 0.15;
			
		} else if(salario >= 700 && salario < 1500) {
			
			salarioAjust = salario * 1.1;
			percentual = 10;
			valorAumento = salario * 0.1;
			
		} else if(salario >= 1500) {
			
			salarioAjust = salario * 1.05;
			percentual = 5;
			valorAumento = salario * 0.05;
			
		}//fim if
		
		System.out.println("Salario antes do reajuste: " + salario);
		System.out.println("Percentual do aumento: " + percentual + "%");
		System.out.println("Valor do aumento: " + valorAumento);
		System.out.println("Novo salario: " + salarioAjust);

	}

}
