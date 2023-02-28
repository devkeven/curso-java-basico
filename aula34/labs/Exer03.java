package com.keven.cursojava.aula34.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int resultado;
		
		int num;
		
		do {
			System.out.println("Insira um número inteiro: ");
			num = scan.nextInt();
			
			if(num < 0) {
				System.out.println("Número inválido, insira novamente:");
			}else {
				System.out.println("O fatorial de " + num + " é " +Calculadora.fatorial(num));
			}
			
		}while(num<0);

	}

}
