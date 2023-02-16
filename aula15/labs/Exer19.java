package com.keven.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira o primeiro número: ");
		int num1 = scan.nextInt();
		
		System.out.print("Insira o segundo número: ");
		int num2 = scan.nextInt();
		
		System.out.print("Insira a operação a realizar: ");
		String operacao = scan.next();
		
		int resultado ;
		 
		switch(operacao) {		
		case "+": 
			resultado = num1 + num2;
			
			if(resultado % 2 == 0) {
				System.out.print("Número par e ");
			} else {
				System.out.print("Número ímpar e ");
			}
			
			if(resultado >= 0) {
				System.out.print("positivo. " + resultado);
			} else {
				System.out.print("negativo. " + resultado);
			}
			
		break;									
		case "-": 
			resultado = num1 - num2; 
			
			if(resultado % 2 == 0) {
				System.out.print("Número par e ");
			} else {
				System.out.print("Número ímpar e ");
			}
			
			if(resultado >= 0) {
				System.out.print("positivo. " + resultado);
			} else {
				System.out.print("negativo. " + resultado);
			}
			
		break;
		case "*": 
			resultado = num1 * num2; 
			
			if(resultado % 2 == 0) {
				System.out.print("Número par e ");
			} else {
				System.out.print("Número ímpar e ");
			}
			
			if(resultado >= 0) {
				System.out.print("positivo. " + resultado);
			} else {
				System.out.print("negativo. " + resultado);
			}
		
		break;
		case "/": 
			resultado = num1 / num2;
			
			if(resultado % 2 == 0) {
				System.out.print("Número par e ");
			} else {
				System.out.print("Número ímpar e ");
			}
			
			if(resultado >= 0) {
				System.out.print("positivo. " + resultado);
			} else {
				System.out.print("negativo. " + resultado);
			}
			
		break;	
		case "%": 
			resultado = num1 % num2;
			
			if(resultado % 2 == 0) {
				System.out.print("Número par e ");
			} else {
				System.out.print("Número ímpar e ");
			}
			
			if(resultado >= 0) {
				System.out.print("positivo. " + resultado);
			} else {
				System.out.print("negativo. " + resultado);
			}
			
			break;
		default: System.out.print("Operação inválida.");
		}
		
		
		

	}

}
