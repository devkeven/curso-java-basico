package com.keven.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
		
		int inserido;
		int soma = 0;
		double media;
		
		for(int i=1; i <= 5; i++) {
			
			System.out.print("Insira o numero "+ i + ": " );
			inserido = scan.nextInt();
			
			soma = soma + inserido;
						
						
		}
		
		System.out.println("A soma dos números é: " + soma);
		System.out.println("A média dos números é: " + (soma/5));

	}

}
